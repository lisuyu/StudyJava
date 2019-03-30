package test;

public class TestString02 {
    public static void main(String[] args) {
        String word = "Other man live to eat , while i eat to live";
        //通过" "将字符串拆分
        String[] strs = word.split(" ");
        for (String str:strs){
            System.out.println(str);
        }
        //trim，去除字符串前后的空格，中间的无法去除
    }
}
