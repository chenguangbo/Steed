package cn.baidu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhiguofa on 2018/12/20.
 */
public class JDKDynamicProxyHandler implements InvocationHandler {

    private Object target;

    public JDKDynamicProxyHandler(Object target){
        this.target = target;
    }

    /**
     *
     * @param proxy   被代理的对象
     * @param method  被代理的方法
     * @param args    被代理的方法参数
     * @return         方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("running before");
        Object invoke = method.invoke(target, args);
        System.out.println("running after");
        return invoke;
    }
}
