package CRUDFinancialProducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "card")
public class Card {
    @Id
    @Column(name = "id") @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "cvc")
    private Long cvc;
    @Column(name = "number")
    private Long number;
    @Column(name = "expiration_date")
    private Date expiration_date;
    @JoinColumn(name = "account_id") @ManyToOne
    private Account account;
}
