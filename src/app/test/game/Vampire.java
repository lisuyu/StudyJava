package app.test.game;

public class Vampire extends Enemy
{

    private int getLifeRate;


    //´«ÈëÒ»¸öintµÄÖµ£¬´ú±í¸÷ÖÖ²»Í¬µÄmonster

    public int getGetLifeRate() {
        return getLifeRate;
    }


    public void setGetLifeRate(int getLifeRate) {
        this.getLifeRate = getLifeRate;
    }


    public Vampire(int vt){
        this.setHideRate(67);
        this.setLive(true);
        if (vt==1) {
            this.setType("阿大");
            this.setMaxLife(40);
            this.setAttack(15);
            this.setDefend(5);
            this.setAgile(20);
            getLifeRate = 45;
        }else if(vt==2){
            this.setType("阿二");
            this.setMaxLife(35);
            this.setAttack(27);
            this.setDefend(5);
            this.setAgile(35);
            getLifeRate = 66;
        }else if(vt==3){
            this.setType("阿三");
            this.setMaxLife(40);
            this.setAttack(10);
            this.setDefend(15);
            this.setAgile(16);
            getLifeRate = 80;
        }
        this.setCurLife(this.getMaxLife());
    }



    public void getLife(int damage){
        int addLife = damage*getLifeRate/100;
        System.out.println("品尝到了"+addLife+"滴血液");
        if (addLife+this.getCurLife()>=this.getMaxLife()) {
            this.setCurLife(this.getMaxLife()) ;
        }else{
            this.setCurLife(this.getCurLife()+addLife);
        }
        show();
    }



    public void kill(Hunter hunter){
        if (!this.isLive()) {
            return;
        }
        if (!hunter.isLive()) {
            return;
        }
        System.out.println("攻击"+hunter.getName());
        int lostLife = hunter.injured(this);
        getLife(lostLife);
    }
}
