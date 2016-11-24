/**
 * Created by Андрей on 22.11.2016.
 */
public class RedHeadDuck extends Duck {


    @Override
    public void Display() {
        System.out.println("I'm Red head duck, i have red head");
    }

    public RedHeadDuck(){
        setiFly(new FlyWithWings());
    }
}
