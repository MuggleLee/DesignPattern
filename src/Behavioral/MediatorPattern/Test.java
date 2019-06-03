package Behavioral.MediatorPattern;

import java.util.Scanner;

/**
 * @author Muggle Lee
 * @Date: 2019/4/25 17:19
 */
public class Test {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            chatRoom.buyer.sendMessage(str);
        }
    }
}
