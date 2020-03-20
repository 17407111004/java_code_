package word14.animal;

public class Cat extends Animal implements JRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run(){
        System.out.println(this.name+"使用四条腿跑");
    }
}
