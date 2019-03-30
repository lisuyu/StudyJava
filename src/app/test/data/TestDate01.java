package app.test.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate01 {
    public static void main(String[] args) {
        try {
            Date date = new Date();
            //定义一种日期的显示格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将日期对象格式化为一个字符串对象，按照SimpleDateFormat中设置的格式
            System.out.println(sdf.format(date));
            //创建一个日期的字符串
            String str = "1994-12-22 00:00:00";
            //将字符转换为日期，使用sdf中的格式，注意如果格式不符，会抛出异常
            System.out.println(sdf.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
