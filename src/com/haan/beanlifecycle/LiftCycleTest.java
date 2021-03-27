package com.haan.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/5/23
 */
public class LiftCycleTest implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    private String message;

    public LiftCycleTest() {
        System.out.println("实例化LiftCycleTest...");
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("设置LiftCycleTest的message属性..." + message);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean(LiftCycleTest)的bean Id=" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.toString());
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化bean之前...");
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean的全部属性设置成功...");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化bean之后...");
        return null;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean被摧毁了");
    }

    public void customerInit() {
        System.out.println("定制初始化方法执行了...");
    }

    public void customerDestroy() {
        System.out.println("定制bean摧毁方法执行了...");
    }
}

// <bean class="com.haan.beanlifecycle.LiftCycleTest" id="liftCycleTest" init-method="customerInit" destroy-method="customerDestroy">
//        <property name="message" value="testssssssss"/>
//    </bean>