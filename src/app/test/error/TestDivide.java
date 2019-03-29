package app.test.error;

public class TestDivide {
    public static void main(String[] args) {
        /*
        此处将会捕获异常，但没有处理，会自动向上throw
        * */

        int c = 0;
        try {
            c = divide(10,0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }

    public static int divide(int x,int y){
        //new ArithmeticException() 创建异常对象 并且打印抛出异常的轨迹
        throw new ArithmeticException("抛出异常");
    }
}
