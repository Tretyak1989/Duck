/**
 * Created by Андрей on 24.11.2016.
 */
public class GumDuck extends Duck {
    @Override
    public void Display() {
        System.out.println("I'm gum duck");
    }

    public GumDuck(){
        setiFly(new ICantFly());
    }
}
