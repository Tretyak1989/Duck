/**
 * Created by Андрей on 22.11.2016.
 */
public class ICantFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("But I can't fly :(");
    }
}
