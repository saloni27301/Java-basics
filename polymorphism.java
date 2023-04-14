//this process is called dynaic method dispatch in java

class A{
    public void show(){
        System.out.println("In A ");
    }
    
}
class B extends A{
    public void show(){
        System.out.println("In B ");
    }
    
}



public class polymorphism {
    public static void main(String[] args){
        A obj=new A();
        obj.show();
        obj=new B();
        obj.show();
        //this is all called polymorphism same object shows  different behaviour
    }
}
