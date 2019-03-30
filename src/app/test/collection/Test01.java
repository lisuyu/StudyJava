package app.test.collection;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List<String> songs = new ArrayList<String>();
        Set<String> books = new HashSet<String>();
        Collections.addAll(songs,"本草纲目","幻听");
        Collections.addAll(books,"《黎明之剑》");
        Collections.sort(songs);
        Collections.shuffle(songs);//随机
        Collections.reverse(songs);//反向
        Collections.swap(songs,0,1);//交换
        printList(songs);
        printList(books);
    }

    public static void printList(Collection<String> c){
        for (String str:c){
            System.out.println(str);
        }
    }
}
