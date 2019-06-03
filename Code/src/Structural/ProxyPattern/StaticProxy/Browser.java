package Structural.ProxyPattern.StaticProxy;

/**
 * @author Muggle Lee
 * @Date: 2019/5/15 11:11
 */
public class Browser {
    public static void main(String[] args) {
        String request = "给我一个女朋友！";
        IHttpInvoke httpInvokeProxy = new HttpInvokeProxy(new Server());
        httpInvokeProxy.invoke(request);
    }
}
