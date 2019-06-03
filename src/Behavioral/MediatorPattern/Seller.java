package Behavioral.MediatorPattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/25 16:16
 */
public class Seller implements IUser {

    private ChatRoom chatRoom = new ChatRoom();

    @Override
    public void sendMessage(String message) {
        try {
            chatRoom.sendMessage(this,message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void receiveMessage(String message) {
        if(message != null && message != ""){
            this.sendMessage("您好！如需帮助，请致电：1234567");
        }
    }
}
