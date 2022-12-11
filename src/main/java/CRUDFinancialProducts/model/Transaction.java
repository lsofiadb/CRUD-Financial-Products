package CRUDFinancialProducts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @Column(name = "id") @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "transactiondate")
    private Date date;
    @Column(name = "amount")
    private double amount;
    @JoinColumn(name = "root_account_id") @ManyToOne @Nullable
    private Account root_account;
    @JoinColumn(name = "destination_account_id") @ManyToOne @Nullable
    private Account destination_account;
    @JoinColumn(name = "category_id") @ManyToOne
    private Category category;
}
