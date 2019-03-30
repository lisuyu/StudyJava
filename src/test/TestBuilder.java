package test;

public class TestBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        for (int i=0;i<10;i++){
            sb.append(i);
        }
        System.out.println(sb.toString());

        String str1 = "abc";
        String str2 = "def";
        String str3 = "ghi";
        StringBuilder sb1 = new StringBuilder();

        //StringBuilder支持链式编程
        sb1.append(str1).append(str2).append(str3);
        System.out.println(sb1.toString());
        StringBuilder sb2 = sb1;
        System.out.println(sb2.toString());

        //获取某个位置的字符
        System.out.println(sb1.charAt(2));

        //大小写转换输出
        String str = sb1.toString();
        System.out.println(str.toUpperCase());
        String temp = str.toUpperCase();
        System.out.println(temp);
        System.out.println(temp.toLowerCase());

        //length取字符串长度
        //replace替换
        String temp1 = str.replace("abc","ABC");
        System.out.println(str.replace("abc","ABC"));

        //是否以此开头/结尾
        str.startsWith("abc");
        str.endsWith("def");//判断文件类型
    }
}
