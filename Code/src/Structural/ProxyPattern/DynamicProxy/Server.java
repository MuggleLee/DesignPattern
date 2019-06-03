package Structural.ProxyPattern.DynamicProxy;

import java.util.logging.Logger;

/**
 * @author Muggle Lee
 * @Date: 2019/5/15 11:12
 */
public class Server implements IHttpInvoke {

    Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Override
    public String httpInvoke(String request) {
        String response = "没有的，不存在的!";
        return response;
    }
}
