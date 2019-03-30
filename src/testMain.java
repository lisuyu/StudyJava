public class testMain {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String str:args){
            System.out.println(str);
        }
    }
}

//编译时
//javac testMain.java
//java testMain 参数一 参数二会被放在String[] args中