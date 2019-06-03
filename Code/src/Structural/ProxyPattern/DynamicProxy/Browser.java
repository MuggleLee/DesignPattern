package Structural.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Muggle Lee
 * @Date: 2019/5/15 11:11
 */
public class Browser {
    public static void main(String[] args) {
        String request = "给我一个女朋友！";
        Server server = new Server();
        InvocationHandler invocationHandler = new HttpInvokeProxy(server);
        Class cls = server.getClass();
        IHttpInvoke httpInvoke = (IHttpInvoke) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),invocationHandler);
        httpInvoke.httpInvoke(request);
    }
}
