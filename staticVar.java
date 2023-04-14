class Mobile{
    String brand;//instance variable is the variable which is the class variable 
    int price;
    //when we want that the name should be commom for all the object there we use static 
    static String name;//static variable shares the same memory with all the object and it is called by using class name like mobile.name

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}


public class staticVar {
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        obj1.brand="apple";
        obj1.price=12220;
        Mobile.name="smartphone";
        Mobile obj2=new Mobile();
        obj2.brand="samsung";
        obj2.price=1234;
        Mobile.name="phone";

        Mobile.name="Myphone";
        obj1.show();
        obj2.show();

    }
}
