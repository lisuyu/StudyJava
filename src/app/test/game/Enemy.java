package app.test.game;

public abstract class Enemy
{
    private String type;
    private int maxLife;
    private int curLife;
    private boolean isLive;

    private int attack;
    private int defend;
    private int agile;
    private int hideRate;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getCurLife() {
        return curLife;
    }

    public void setCurLife(int curLife) {
        this.curLife = curLife;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getAgile() {
        return agile;
    }

    public void setAgile(int agile) {
        this.agile = agile;
    }

    public int getHideRate() {
        return hideRate;
    }

    public void setHideRate(int hideRate) {
        this.hideRate = hideRate;
    }

    public boolean hidde(){
        return GameUtil.isHide(agile,hideRate);
    }

    public void injured(Hunter hunter){
        if (hidde()) {
            System.out.println("miss!miss!miss!");
        }else{
            System.out.println(type+"si~~");
            curLife-=GameUtil.calLostLife(hunter.getAttack(),this.defend);
        }
        show();
        if (curLife<=0) {
            dead(hunter);
            return;
        }
        kill(hunter);
        System.out.println("----------------------------------");
    }

    public abstract void kill(Hunter hunter);

    public void show(){
        System.out.println("type:"+type+",maxLife:"+maxLife+
                ",curLife:"+curLife+",isLive:"+isLive+",attack:"+attack+
                ",defend:"+defend);
    }

    public void dead(Hunter hunter){
        System.out.println(" e!!!");
        System.out.println("------------------------");
        isLive = false;
    }
}
