/**
 * Created by Андрей on 22.11.2016.
 */
public abstract class Duck {

    private IFlyBehavior iFlyBeh;

    Duck(){

    }

    public void FlyAbil(){
        iFlyBeh.fly();
    }

    public Duck(IFlyBehavior iFlyBeh) {
        this.iFlyBeh = iFlyBeh;
    }

    public void swim(){
        System.out.println("I can swim :)");
    }

    public void move(){
        System.out.println("I can move :)");
    }

    public abstract void Display();

    public void setiFly(IFlyBehavior iFlyBeh) {
        this.iFlyBeh = iFlyBeh;
    }
}
