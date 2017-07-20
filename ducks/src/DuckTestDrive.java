public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("Turkey: \n");

        turkey.gobble();
        turkey.fly();

        System.out.println("Duck....\n");
        testDuck(duck);

        System.out.println("Adapter...\n");
        testDuck(turkeyAdapter);

        System.out.println("DuckAdapter \n");
        testTurkey(duckAdapter);
    }

    static void testDuck(Duck duck){
        duck.performQuack();
        duck.performFly();

    }

    static void testTurkey(Turkey turkey){
        turkey.fly();
        turkey.gobble();
    }
}
