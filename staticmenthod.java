class Mobile{
    String brand;
    int price;
    static String name;


    
    public Mobile(){
        brand="priya";
        price=234;

    }
    static{//Static Block
        name="phone";
        System.out.println("Static block Called");
    }
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
    public  static void show1(Mobile obj){
        System.out.println(obj.brand+" "+obj.price+" "+name);
    }
}
public class staticmenthod {
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        Mobile.show1(obj1);
    }
}
