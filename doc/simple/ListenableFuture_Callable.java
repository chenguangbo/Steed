package cn.baidu.com;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class ListenableFuture_Callable {

    private static ListeningExecutorService executorService = null;

    public static void main(String[] args) throws Exception {
        executorService = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(3));

        ListenableFuture<?> submit = executorService.submit(() -> new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("this is inner class! ");
                return "1234";
            }
        }.call());
        System.out.println(submit.get());
    }

}
