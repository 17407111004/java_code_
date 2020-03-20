package word14.animal;

public class Bat extends Animal implements JFlying {
    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly(){
        System.out.println(this.name+"正在使用翅膀飞");
    }
}
