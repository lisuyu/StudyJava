package app.test.game;

public class Monster extends Enemy
{
    public Monster(int mt){
        this.setLive(true);
        this.setHideRate(67);
        if (mt==1) {
            this.setType("阿一");
            this.setMaxLife(40);
            this.setAttack(15);
            this.setDefend(5);
            this.setAgile(20);
        }else if(mt==2){
            this.setType("阿二");
            this.setMaxLife(35);
            this.setAttack(27);
            this.setDefend(5);
            this.setAgile(35);
        }else if(mt==3){
            this.setType("阿三");
            this.setMaxLife(40);
            this.setAttack(10);
            this.setDefend(15);
            this.setAgile(16);
        }else if(mt==4){
            this.setType("阿斯");
            this.setMaxLife(60);
            this.setAttack(30);
            this.setDefend(10);
            this.setAgile(30);
        }
        this.setCurLife(this.getMaxLife());
    }

    public void kill(Hunter hunter){
        if (!this.isLive()) {
            return;
        }
        if (!hunter.isLive()) {
            return;
        }
        System.out.println("攻击"+hunter.getName());
        hunter.injured(this);
    }
}
