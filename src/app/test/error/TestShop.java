package app.test.error;

public class TestShop {
    public static void main(String[] args) {
        try {
            buyCloth(-26);
        } catch (ClothException e) {
            e.printStackTrace();
        }
    }

    public static void buyCloth(int size)throws ClothException{//非运行时刻异常
        if (size<0){
            throw new ClothException("Exception！");
        }
        System.out.println("buy the cloth"+size);
    }
}
