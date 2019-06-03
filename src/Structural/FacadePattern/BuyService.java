package Structural.FacadePattern;

/**
 * @author Muggle Lee
 * @Date: 2019/4/24 16:04
 */
public class BuyService{

    private OrderService orderService = new OrderService();

    private LogisticsService logisticsService = new LogisticsService();

    private PayService payService = new PayService();

    public void service() {
        orderService.service();
        payService.service();
        logisticsService.service();
    }
}
