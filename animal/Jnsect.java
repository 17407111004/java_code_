package word14.animal;

public class Jnsect extends Animal implements JFlying,JRunning {
    public Jnsect(String name) {
        super(name);
    }
    @Override
    public void fly(){
        System.out.println(this.name+"正在使用翅膀飞");
    }
    @Override
    public void run(){
        System.out.println(this.name+"使用六条腿跑");
    }
}
