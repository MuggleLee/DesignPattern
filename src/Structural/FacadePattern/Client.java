package Structural.FacadePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/24 15:56
 */
public class Client {
    public static void main(String[] args) {
        BuyService client = new BuyService();
        client.service();
    }
}
