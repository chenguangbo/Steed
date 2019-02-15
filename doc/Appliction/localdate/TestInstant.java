package cn.baidu.localdata;

import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/**
 * Created by ${陈广波} on 2019/2/12.
 */
public class TestInstant {

    public static void main(String[] args) throws InterruptedException {
        //时间戳
        Instant now = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));//默认UTC时区
        System.out.println("时间显示 : " + now);
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        System.out.println("秒数:" + now.getEpochSecond());
        System.out.println("毫秒数:" + now.toEpochMilli());

        Thread.sleep(1000);

        Instant now2 = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        //一个Duration实例是不可变的
        Duration between = Duration.between(now, now2);
        System.out.println("两个时间间隔 : " + between.getSeconds() + " 秒");
        System.out.println("两个时间间隔 : " + between.toMinutes() + " 分钟");

    }

}
