package spring.jdbc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hanliukui
 * @Date 2021/3/27 11:59
 */
public class MyApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        UserDao userDao = context.getBean(UserDao.class);

        User user = new User();
        user.setId(2L);
        user.setName("张飞");
        user.setAge(233);
        user.setMobile("10016");
        userDao.add(user);
    }
}
