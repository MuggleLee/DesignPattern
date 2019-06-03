package Structural.AdapterPattern.Sample;

import Structural.FacadePattern.PayService;

/**
 * @author Muggle Lee
 * @Date: 2019/5/5 14:49
 */
public class PayTest {

    public final static String bankName = "bankA";

    public static void main(String[] args) throws Exception {
        IPay iPay = new PayAdapter();
        iPay.pay(bankName);
    }
}
