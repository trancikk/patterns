/**
 * Created by Trancikk on 13.07.2017.
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
