package exception.userdefined;
class OutOfStockException extends Exception{
    OutOfStockException(String message)
    {
        super(message);
    }
}
public class ProductStockManagement {
    private String productName;
    private double price;
    private int quantity;
    private int avalibleStocks;

    ProductStockManagement(String productName, double price, int avalibleStocks) {
        this.productName = productName;
        this.price = price;
        this.avalibleStocks = avalibleStocks;
    }

    void purchaseProduct(int quantity) {
        try {
            if (quantity <= 0) {
                System.out.println("The Order is rejected...");
                return;
            }
            if (quantity > avalibleStocks) {
                throw new OutOfStockException("The stocks are underFlow...");
            }
            double purchased = 0.0;
            purchased = price * quantity;
            System.out.println(quantity + " Stocks are purchased for rupees " + purchased);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }

   public  static void main(String []args)
   {
       ProductStockManagement stockManagement = new ProductStockManagement("TATA",210,23);
       stockManagement.purchaseProduct(24);
   }
}
