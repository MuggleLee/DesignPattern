package Structural.ProxyPattern.DynamicProxy;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * @author Muggle Lee
 * @Date: 2019/5/15 11:12
 */
public class HttpInvokeProxy implements InvocationHandler {

    private Logger logger = Logger.getLogger(String.valueOf(getClass()));

    private Object obj;

    public HttpInvokeProxy(Object obj) {
        this.obj = obj;
    }

    public String before(String request){
        logger.info("请求数据：" + request);
        byte[] req = request.getBytes();
        String requestData = null;
        try {
            requestData = new String(req,"GBK");
            logger.info("转码成功，返回请求数据");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return requestData;
    }

    public void after(String response){
        logger.info("响应数据: " + response);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before((String) args[0]);
        Object object = method.invoke(obj,args);
        after((String) object);
        return object;
    }
}
