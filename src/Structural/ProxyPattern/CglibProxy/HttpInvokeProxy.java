package Structural.ProxyPattern.CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * @author Muggle Lee
 * @Date: 2019/5/15 11:12
 */
public class HttpInvokeProxy implements MethodInterceptor {

    private Logger logger = Logger.getLogger(String.valueOf(getClass()));

    private Object obj;

    public HttpInvokeProxy() {
    }

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

    public Object getProxy(){
        //1.工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(Server.class);
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类(代理对象)
        Object object = enhancer.create();
        return object;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before((String) objects[0]);
        Object obj = methodProxy.invokeSuper(o,objects);
        after((String) obj);
        return obj;
    }
}
