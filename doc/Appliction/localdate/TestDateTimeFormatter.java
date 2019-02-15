package cn.baidu.localdata;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class TestDateTimeFormatter {

    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter r = DateTimeFormatter.ISO_DATE;
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String format = now.format(r);
        System.out.println("默认格式化类型 : " + format);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format1 = now.format(formatter);
        System.out.println("自定义格式化类型 : " + format1);

        System.out.println("--------------------------------------------------");
        LocalDateTime now2 = LocalDateTime.now(ZoneId.of("Asia/Shanghai")); //亚洲上海
        LocalDateTime now3 = LocalDateTime.now(ZoneId.of("Europe/Tallinn"));//欧洲 爱沙尼亚共和国首都  塔林
        System.out.println("代时区的时间 : " + now2);
        System.out.println("代时区的时间 : " + now3);


        TimeUnit seconds = TimeUnit.SECONDS;
        seconds.sleep(2);

        TestDateTimeFormatter testDateTimeFormatter = new TestDateTimeFormatter();
        Thread thread = new Thread(testDateTimeFormatter::m1);
        thread.start();

    }

    public int m1(){
        System.out.println("21231");
        return  1;
    }


}
