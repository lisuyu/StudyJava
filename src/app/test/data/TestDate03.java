package app.test.data;

import java.util.Random;

public class TestDate03 {

    public static final int[] bigMonth = {1,3,5,7,8,10,12};
    public static final int[] smallMonth = {4,6,9,11};
    public static void main(String[] args) {
        String startDate = "1994-09-15";
        String endDate = "2019-03-30";
        for (int i = 0;i<30;i++) {
            Random rd = new Random();
            int temp = 2019-1994;
            int year =  1994+rd.nextInt(temp);
            int month = 1+rd.nextInt(12);

            int dayRange = -1;
            if ((year%4==0&&year%100!=0)||year%400==0){
                dayRange = 29;
            }else{
                dayRange = getDays(month);
            }

            int day = 1+rd.nextInt(dayRange);

            String result = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
            System.out.println(result);
        }
    }


    public static int getDays(int month){
        if (isArrays(month,bigMonth)){
            return 31;
        }if (isArrays(month,smallMonth)){
            return 30;
        }else{
            return 28;
        }
    }

    public static boolean isArrays(int temp,int[] temps){
        boolean flag = false;
        for (int i=0;i<temps.length;i++){
            if (temp==temps[i])
                flag = true;
        }
        return flag;
    }
}
