class Mobile{
    String brand;
    int price;
    static String name;


    
    public Mobile(){
        brand="";
        price=234;
        System.out.println("Constructor Called");
    }
    static{//Static Block will be called before the object called
        name="phone";
        System.out.println("Static block Called");
    }
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}



public class staticBlock {
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        obj1.show();

    }
}
