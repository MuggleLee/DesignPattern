package Behavioral.MediatorPattern;

import java.util.Scanner;

/**
 * @author Muggle Lee
 * @Date: 2019/4/25 16:16
 */
public class Buyer implements IUser {

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
        if(message != "" && message != null){
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String str = sc.next();
                this.sendMessage(str);
            }
        }
    }
}

