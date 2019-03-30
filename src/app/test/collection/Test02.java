package app.test.collection;
//对象排序
public class Test02 {
    public static void main(String[] args) {

    }

}

class Song implements Comparable{
    private int id;
    private String name;
    private String songer;

    @Override
    public int compareTo(Object o) {
        //会使用this来和o比较，如果返回值>1表示顺序排，返回值是<1表示倒叙排
        return 0;
    }
}
