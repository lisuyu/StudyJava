package app.test.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate02 {
    public static void main(String[] args) {
        try {
            Date d = new Date();
            //通过1970-1-1 00：00：00来计算到今天的毫秒数
            long times = d.getTime();
            System.out.println(d.getTime());
            String olp = "2020-8-8";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            long endTime = sdf.parse(olp).getTime();

            long st = endTime-times;
            System.out.println(st/(1000*60*60*24));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}


//定义时间，开始时间，结束时间，在此之间随机生成时间

/*
* String startDate = "1994-09-15";
*
* String endDate = "2019-03-30";
*
* */