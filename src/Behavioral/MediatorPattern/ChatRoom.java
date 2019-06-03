package Behavioral.MediatorPattern;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Muggle Lee
 * @Date: 2019/4/25 16:17
 */
public class ChatRoom {

    public static IUser buyer = new Buyer();
    public static IUser seller = new Seller();
    private SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void sendMessage(IUser user, String message) throws Exception {
        if (user.getClass().getSimpleName().equals("Buyer")) {
            System.out.println(date.format(new Date()) + "  " + "Buyer: " + message);
            seller.receiveMessage(message);
        } else if (user.getClass().getSimpleName().equals("Seller")) {
            System.out.println(date.format(new Date()) + "  " + "Seller: " + message);
            buyer.receiveMessage(message);
        } else {
            throw new Exception();
        }
    }
}
