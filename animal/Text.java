package word14.animal;

import com.sun.security.auth.module.JndiLoginModule;

public class Text {
    public static void main(String[] args) {
        Frog frog =new Frog("小青蛙");
        walk(frog);
        Cat cat =new Cat("小猫");
        walk(cat);
        Jnsect insect= new Jnsect("小虫");
        walk(insect);
        fly(insect);
        Robot robot =new Robot();
        walk(robot);
    }
    public static void walk(JRunning animal){
        animal.run();
    }
    public static void fly(JFlying animal){
        animal.fly();
    }
}

