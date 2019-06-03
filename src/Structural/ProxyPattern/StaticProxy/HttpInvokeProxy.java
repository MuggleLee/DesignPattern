package Structural.ProxyPattern.StaticProxy;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

/**
 * @author Muggle Lee
 * @Date: 2019/5/15 11:12
 */
public class HttpInvokeProxy implements IHttpInvoke {

    private Logger logger = Logger.getLogger(String.valueOf(getClass()));

    private IHttpInvoke iHttpInvoke;

    public HttpInvokeProxy(IHttpInvoke iHttpInvoke) {
        this.iHttpInvoke = iHttpInvoke;
    }

    @Override
    public String invoke(String request) {
        String req = before(request);
        String response = iHttpInvoke.invoke(req);
        after(response);
        return response;
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
}
