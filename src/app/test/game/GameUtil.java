package app.test.game;

public class GameUtil{
    static int lostBasicLife = 7;


    public static int calLostLife(int attack,int defend){
        int rel = 0;
        int lostLife = attack-defend;
        if (lostLife<=0) {
            rel = lostBasicLife;
        }else{
            rel = (lostLife+lostBasicLife);
        }
        return rel;
    }

    public static int randomRange(int start,int end){
        return (int)(Math.random()*(end-start)+start);
    }

    public static boolean isHide(int agile,int hideRate){
        int sucRate = (agile*hideRate)/100;
        int ran = randomRange(1,101);
        if (ran<sucRate) {
            return true;
        }
        return false;
    }
}
