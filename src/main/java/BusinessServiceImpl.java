import java.math.BigDecimal;

//Inheritance with interfaces
public class BusinessServiceImpl implements BusinessService {

    @Override
    public String sell(Product product){
        return null;
    }

    @Override
    public String hireStaff(User user){
        String role = "MANAGER";
        User manager = new User(role);
        if (manager.getRole().equals("MANAGER")) {
            user.setRole("CASHIER");
        }
        return null;
    }

    @Override
    public String purchaseProduct(Product product, BigDecimal money){
        Transaction transaction;
        return null;
    }

}
