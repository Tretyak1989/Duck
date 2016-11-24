/**
 * Created by Андрей on 22.11.2016.
 */
public class ToyDuck extends Duck {


    @Override
    public void Display() {
        System.out.println("I'm toy duck");
    }

    public ToyDuck(){
        setiFly(new FlyWhithEngine());
    }
}
