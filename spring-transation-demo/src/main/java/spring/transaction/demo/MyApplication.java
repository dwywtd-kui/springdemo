package spring.transaction.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.transaction.demo.programmatic.AccountDao;

/**
 * @author hanliukui
 * @Date 2021/3/27 11:02
 */
public class MyApplication {

    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("application.xml");
        AccountDao dao = context.getBean(AccountDao.class);

    }
}
