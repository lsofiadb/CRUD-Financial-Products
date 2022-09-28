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
    @Column(name = "number")
    private Long number;
    @Column(name = "password")
    private String password;
    @JoinColumn(name = "titular_id") @OneToOne
    private Person titular;
}
