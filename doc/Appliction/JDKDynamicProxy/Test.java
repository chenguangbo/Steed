package cn.baidu.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by zhiguofa on 2018/12/20.
 */
public class Test {

    public static void main(String[] args) {
        //JDK的动态代理
        Car car = new Car();
        JDKDynamicProxyHandler jdkDynamicProxyHandler = new JDKDynamicProxyHandler(car);
        Class aClass = car.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
                                                   //被代理累的类加载器    被代理类实现的接口    代理处理器
        MoveAble o = (MoveAble) Proxy.newProxyInstance(classLoader, aClass.getInterfaces(), jdkDynamicProxyHandler);
        o.run();

    }


}
