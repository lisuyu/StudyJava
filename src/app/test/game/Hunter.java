package app.test.game;

public class Hunter
{
    private String name;
    private int maxLife;
    private int curLife;
    private boolean isLive;
    private String weapon;

    private int attack;
    private int defend;

    private int level;
    private int exp;


    private int agile;

    private int hideRate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
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

    public Hunter(String name,String weapon){
        this.name = name;
        this.weapon = weapon;
        maxLife = 100;
        curLife = maxLife;
        isLive = true;

        attack = 45;
        defend = 8;

        level = 1;
        exp = 0;
        agile = 32;
        hideRate = 60;
    }

    public void fight(Enemy enemy){
        if (!isLive) {
            return;
        }
        if (!enemy.isLive()) {
            return;
        }
        System.out.println(name+"挥舞着"+
                weapon+"攻击"+enemy.getType());

        enemy.injured(this);

        if (!enemy.isLive()) {
            this.expAdd(enemy);
        }
    }



    public boolean hidde(){
        return GameUtil.isHide(this.agile,this.hideRate);
    }

    public int injured(Enemy enemy){
        //life-=20;
        if (hidde()) {
            System.out.println(name+"走位~走位~");
            show();
            return 0;
        }
        //»ñÈ¡¶ªÊ§µÄÉúÃü
        int lostLife= GameUtil.calLostLife(enemy.getAttack(),this.defend);
        curLife-=lostLife;
        System.out.println(name+"多捞啊！");
        show();
        if (curLife<=0) {
            dead();
        }
        return lostLife;
    }

    public void show(){
        System.out.println("name:"+name+",weapon:"+weapon+
                ",curlLife:"+curLife+",maxLife:"+maxLife   +",isLive:"+isLive+",attack:"+attack+
                ",defend:"+defend+",level:"+level+",exp:"+exp);
    }

    public void dead(){
        System.out.println(name+": 溜了溜了~");
        isLive=false;
    }

    //¾­ÑéÖµÔö¼Ó
    public void expAdd(Enemy enemy){
        this.exp+=enemy.getMaxLife();
        int needExp = 0;
        for (int i=1;i<=level;i++ ) {
            needExp+=i*50;
        }
        if (exp>=needExp) {
            this.upGrade();
        }
    }

    public void upGrade(){
        System.out.println("Éý¼¶£¡"+name+"Éý¼¶Íê³É");
        //¹¥»÷Á¦Ôö¼Ó4£¬·ÀÓùÁ¦Ôö¼Ó3£¬maxLifeÔö¼Ó£¬curLife=maxLife
        attack+=4;
        defend+=3;
        maxLife+=20;
        curLife = maxLife;
        level++;
        show();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
