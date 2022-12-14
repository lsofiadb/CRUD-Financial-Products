package CRUDFinancialProducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "credit")
public class Credit {
    @Id
    @Column(name = "uniqueid") @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "quota")
    private double quota;
    @Column(name = "debt")
    private double debt;
    @JoinColumn(name = "card_id") @OneToOne
    private Card card;
    @Column(name = "credit_type")
    private String crediyType;
    @Column(name = "card_type")
    private String cardType;

}