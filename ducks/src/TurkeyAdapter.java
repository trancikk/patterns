public class TurkeyAdapter extends Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void display() {
        System.out.println("i am a Turkey");
    }

    public void performQuack(){
        turkey.gobble();
    }

    public void performFly(){
        for (int i=0; i<5; i++){
            turkey.fly();
        }
    }

}
