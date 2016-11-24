/**
 * Created by Андрей on 22.11.2016.
 */
public class WildeDuck extends Duck {


    @Override
    public void Display() {
        System.out.println("I'm looks like wilde duck");
    }

    public WildeDuck(){
        setiFly(new FlyWithWings());
    }
}
