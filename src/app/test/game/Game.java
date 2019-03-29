package app.test.game;

import java.util.ArrayList;
import java.util.List;

public class Game{
    Hunter hunter;

    List<Enemy> enemies;

    public Game(String name,String weapon){
        hunter = new Hunter(name,weapon);
        enemies = new ArrayList<Enemy>();
        enemies.add(new Monster(1));
        enemies.add(new Monster(1));
        enemies.add(new Monster(2));
        enemies.add(new Monster(3));
        enemies.add(new Monster(4));
        enemies.add(new Vampire(1));
        enemies.add(new Vampire(2));
        enemies.add(new Vampire(3));
        enemies.add(new SnakeKiller());
    }

    public void start(){
        while(true){
            int ran = GameUtil.randomRange(1,enemies.size());


            if (!hunter.isLive()) {
                break;
            }

            if (enemies.size()<=0){
                break;
            }

            Enemy enemy = enemies.get(ran);
            hunter.fight(enemy);
            if (!enemy.isLive()){
                enemies.remove(ran);
            }
            try{
                System.out.println("||||||||||||||||||||Finding the enemy!||||||||||||||||||||");
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
        end();
    }

    public void end(){
        if (hunter.isLive()) {
            System.out.println("level up!");
        }else{
            System.out.println("DEAD!");
        }
    }
}
