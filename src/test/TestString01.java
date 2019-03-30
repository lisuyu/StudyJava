package test;

public class TestString01 {
    public static void main(String[] args) {
        String str1 = new String("123");
        String str2 = new String("123");
        System.out.println(str1==str2);//使用new，创建新的对象，所使用的内存不同
        System.out.println(str1.equals(str2));

        String str3 = "123";
        String str4 = "123";
        System.out.println(str3==str4);//指向同一块内存
        System.out.println(str3.equals(str4));

        String str = "";
        for (int i=0;i<100;i++){
            str+=i;
        }
        System.out.println(str);
    }
}