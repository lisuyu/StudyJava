package app.test.game;

public class SnakeKiller extends Enemy {
    public SnakeKiller() {
        this.setType("57");
        this.setMaxLife(33);
        this.setCurLife(this.getMaxLife());
        this.setAttack(33);
        this.setDefend(10);
        this.setHideRate(50);
        this.setLive(true);
        this.setAgile(34);


    }

    @Override
    public void kill(Hunter hunter) {
        if(!this.isLive())
            return;
        if(!hunter.isLive())
            return;
        System.out.println("˻˻˻~");
        hunter.injured(this);
    }
}