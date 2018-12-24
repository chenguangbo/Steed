package cn.baidu.proxy.CGLib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Created by zhiguofa on 2018/12/20.
 */
public class CGLibDynamicProxyHandler implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();
                            //被代理类的Class
    public Object getProxy(Class clazz) {
        //设置代理目标
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //创建代理对象并返回
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     *
     * @param o           目标类的实例
     * @param method      目标方法的反射对象
     * @param orgs        目标方法反射对象的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] orgs, MethodProxy methodProxy) throws Throwable {
        System.out.println("invokeSuper before");
        Object o1 = methodProxy.invokeSuper(o, orgs);
        System.out.println("invokeSuper after");
        return o1;
    }
}
