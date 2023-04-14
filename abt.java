abstract class Car{//Abstract class:cannot make object of abstract class
    public abstract void drive();
    public void show(){
        System.out.println("In car");
    }
}
class Fortuner extends Car{//concrete class
    public  void drive(){
        System.out.println("In Fortuner");
    }
}
public class abt {
    public static void main(String[] args){
        Car obj=new Fortuner();
        obj.drive();
        obj.show();
    }
}
