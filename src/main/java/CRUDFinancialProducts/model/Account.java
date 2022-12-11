package CRUDFinancialProducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "accountnumber")
    private Long number;
    @Column(name = "password")
    private String password;
    @JoinColumn(name = "owner_id") @OneToOne
    private Person owner;
    @JoinColumn(name = "bank_id") @OneToOne
    private Bank bank;
    @Column(name = "insurance_category ")
    private String insurance_category;
}
