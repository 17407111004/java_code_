package word14.animal;

public class Bird extends Animal implements JFlying,JRunning {
    public Bird(String name) {
        super(name);
    }
    @Override
    public void fly(){
        System.out.println(this.name+"正在使用翅膀飞");
    }
    @Override
    public void run(){
        System.out.println(this.name+"正在使用两条腿跑");
    }
}
