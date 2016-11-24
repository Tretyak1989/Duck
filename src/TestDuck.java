/**
 * Created by Андрей on 22.11.2016.
 */
public class TestDuck {
    public static void main(String[] args) {
        Duck toyDuck = new ToyDuck();
        toyDuck.Display();
        toyDuck.FlyAbil();
        toyDuck.move();
        toyDuck.swim();
        System.out.println();

        Duck wildDuck = new WildeDuck();
        wildDuck.Display();
        wildDuck.move();
        wildDuck.FlyAbil();
        wildDuck.swim();
        System.out.println();

        Duck gumDuck = new GumDuck();
        gumDuck.Display();
        gumDuck.swim();
        gumDuck.FlyAbil();
        gumDuck.move();
        System.out.println();

        Duck redHead = new RedHeadDuck();
        redHead.Display();
        redHead.move();
        redHead.FlyAbil();
        redHead.swim();



    }
}
