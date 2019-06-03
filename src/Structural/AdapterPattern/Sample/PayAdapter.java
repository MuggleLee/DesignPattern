package Structural.AdapterPattern.Sample;

/**
 * @author Muggle Lee
 * @Date: 2019/5/5 14:01
 */
public class PayAdapter implements IPay {
    private BankA bankA = new BankA();
    private BankB bankB = new BankB();

    @Override
    public String pay(String bankName) throws Exception {
        if ("bankA".equals(bankName) && "200".equals(bankA.DeductMoney())) {
            System.out.println("银行A：扣款成功！");
            return "200";
        } else if ("bankB".equals(bankName) && "200".equals(bankB.DeductMoney())) {
            System.out.println("银行B：扣款成功！");
            return "200";
        } else {
            throw new Exception("支付失败！请重试！");
        }
    }
}
