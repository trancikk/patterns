/**
 * Created by Trancikk on 13.07.2017.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("no sound");
    }
}
