import java.math.BigDecimal;
import java.util.List;

public class TransactionHistory {
    private BigDecimal balances;
    //Aggregation TODO:PROPER PHRASING
    private List<Transaction> transactions;

    private BigDecimal totalTransactionValue;
    private Long noOfTransactions;
}
