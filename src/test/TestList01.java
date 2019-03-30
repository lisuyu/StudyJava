package test;

public class TestList01 {
    public static void main(String[] args) {
        //希望获取文件名后缀
        String str = "asdffffff.sadfasdfasdf.txt";
        //截取子串开始包含，结束不包含
        System.out.println(str.substring(0,2));
        //获取字符串位置.如果字符串不同放回-1,从前取
        System.out.println(str.indexOf("."));
        System.out.println(str.substring(str.indexOf(".")));
        //从后取
        System.out.println(str.lastIndexOf("."));
        System.out.println(str.substring(str.lastIndexOf(".")));

        System.out.println(getFileType(str));
    }

    public static String getFileType(String str){
        return str.substring(str.lastIndexOf("."));
    }
}
