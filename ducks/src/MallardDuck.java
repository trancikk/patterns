/**
 * Created by Trancikk on 13.07.2017.
 */
public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("mallard");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
