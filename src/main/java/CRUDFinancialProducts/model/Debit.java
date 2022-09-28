package CRUDFinancialProducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "debit")
public class Debit {
    @Id
    @Column(name = "id") @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "balance")
    private double balance;
    @JoinColumn(name = "card_id") @OneToOne
    private Card card;
}
