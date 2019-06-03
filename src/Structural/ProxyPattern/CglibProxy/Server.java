package Structural.ProxyPattern.CglibProxy;

import java.util.logging.Logger;

/**
 * @author Muggle Lee
 * @Date: 2019/5/15 11:12
 */
public class Server{

    Logger logger = Logger.getLogger(String.valueOf(getClass()));

    public String receiveRequest(String request) {
        String response = "没有的，不存在的!";
        return response;
    }
}
