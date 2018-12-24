package cn.baidu.proxy.CGLib;

/**
 * Created by zhiguofa on 2018/12/20.
 */
public class Test {

    public static void main(String[] args) {

        CGLibDynamicProxyHandler proxy = new CGLibDynamicProxyHandler();
        Train train = (Train)proxy.getProxy(Train.class);
        train.run();
    }

}
