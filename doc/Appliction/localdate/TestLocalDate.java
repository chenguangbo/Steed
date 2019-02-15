package cn.baidu.localdata;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestLocalDate {

    //日期类
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TestLocalDate.class);
        logger.debug("main");
        LocalDate localDate = LocalDate.now();
        String s = localDate.toString();
        System.out.println("当前日期是 : " + s);
        //获取年份
        int year = localDate.getYear();
        System.out.println("当前年份 : " + year);
        //获取已经过去的天数
        int dayOfYear = localDate.getDayOfYear();
        System.out.println("今年已经过去 : " + dayOfYear + " 天");

        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println("今天是本月的第 : " + dayOfMonth + " 天");

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("今天是 : " + dayOfWeek.toString());

        boolean equals = localDate.equals(localDate);
        System.out.println(equals);

        // ===================================================================
        LocalDate ld2 = LocalDate.of(2018, 1, 1);

        System.out.println(ld2);
        System.out.println(localDate);

        //Period 计算两个日期之间的间隔
        Period between = Period.between(ld2, localDate);
        System.out.println(between);
        int years = between.getYears();
        int days = between.getDays();
        int months = between.getMonths();
        System.out.println("两个日期间隔 : " + years + " 年");
        System.out.println("两个日期间隔 : " + months + " 月");
        System.out.println("两个日期间隔 : " + days + " 天");//是日相减  不是真正的间隔天数


        LocalDate localDate1 = localDate.minusDays(12);
        System.out.println("减去指定天数获得日期 : " + localDate1);

        LocalDate localDate2 = localDate.minusMonths(20);
        System.out.println("减去指定月份过的日期 : " + localDate2);

        //大纪元日
        long l = localDate.minusDays(5).toEpochDay();
        System.out.println("大纪元日 : " + l);

        long l1 = LocalDate.of(2018, 01, 12).toEpochDay();
        System.out.println("大纪元日 : " + l1);
        //大纪元日相减的到  两个日期间隔天数
        System.out.println("大纪元日相减得到间隔天数 : " + (l - l1));

        //从字节序列中解析出日期
        LocalDate parse = LocalDate.parse("2019-06-01");
        System.out.println("解析得到的日期为 : " + parse);

        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        LocalDate ld3 = LocalDate.parse("2019-09-10", dtf);
        System.out.println("解析得到日期 : " + ld3);


        LocalDate localDate3 = localDate.plusDays(10);
        System.out.println("返回添加指定的天数的日期 : " + localDate3);

        LocalDate localDate4 = localDate.withYear(2000);
        System.out.println("更改年份后得到的日期 : " + localDate4);

        //如果在此日期支持该单位，则返回true，否则返回false。
        boolean supported = localDate.isSupported(ChronoUnit.MINUTES);
        System.out.println("此日期类型 : " + supported);


        //计算两天之间的差
        long daysDiff = ChronoUnit.DAYS.between(localDate, localDate1);
        System.out.println("两天之间的差在天数 : " + Math.abs(daysDiff));

    }

}
