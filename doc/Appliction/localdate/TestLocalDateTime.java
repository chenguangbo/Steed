package cn.baidu.localdata;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Created by ${陈广波} on 2019/2/12.
 */
public class TestLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime ldt = LocalDateTime.of(2019, 06, 01, 12, 12, 12);
        System.out.println(ldt);

        LocalDateTime localDateTime = ldt.plusYears(20);
        System.out.println("在原有日期基础上加20年得到的日期是 : " + localDateTime);

        LocalDateTime ldt2 = ldt.minusYears(20);
        System.out.println("在原有日期基础上减20年得到的日期是 : " + ldt2);

        System.out.println("这个日期的年份 : " + ldt.getYear());
        System.out.println("这一天在这一年中的第几天 : " + ldt.getDayOfYear());
        System.out.println("这一天在这一月中的第几天 : " + ldt.getDayOfMonth());
        System.out.println("这一天在这一星期中的第几天" + ldt.getDayOfWeek());
        System.out.println("获取分钟数 : " + ldt.getMinute());
        System.out.println("获取月份 : " + ldt.getMonthValue());
        System.out.println("将时间转换成日期 : " + ldt.toLocalDate());
        System.out.println("使用这一年中的第32天做日期 : " + ldt.withDayOfYear(32));


    }

}
