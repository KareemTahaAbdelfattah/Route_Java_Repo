/** ========================================**
 ** @Author: Kareem Taha Abd El-Fattah
 ** @Category: Route Assessment
 ** @brief: Every Session Java Code Assessment
/** ========================================**/
package Day8;

public class InsufficientFundsException extends Exception {
    private double shortfall;

    public InsufficientFundsException(String message, double shortfall)
    {
        super(message);
        this.shortfall = shortfall;
    }

    public double getShortfall()
    {
        return shortfall;
    }
}
