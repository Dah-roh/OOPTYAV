import java.math.BigDecimal;

public interface BusinessService {
    String sell(Product product);

    String hireStaff(User user);

    String purchaseProduct(Product product, BigDecimal money);

}
