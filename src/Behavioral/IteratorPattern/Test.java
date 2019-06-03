package Behavioral.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Muggle Lee
 * @Date: 2019/5/20 17:47
 */
public class Test {
    public static void main(String[] args) {
        Operation company = new Company();
        company.add("广州");
        company.add("北京");
        company.add("上海");
        company.add("杭州");
        MyIterator companyIterator = company.createIterator();
        while (companyIterator.hasNext()) {
            String obj = (String) companyIterator.next();
            System.out.println(obj);
        }
        System.out.println("************** 华丽的分割线 **************");
        Operation management = new Management();
        management.add("市场部");
        management.add("销售部");
        management.add("人事部");
        management.add("技术部");
        MyIterator managementIterator = management.createIterator();
        while (managementIterator.hasNext()) {
            String obj = (String) managementIterator.next();
            System.out.println(obj);
        }
    }
}
