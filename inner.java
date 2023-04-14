class A{
    int age;
    public void fly(){
        System.out.println("In system");
    }
     class B{
        public void show(){
            System.out.println("In Z System");
        }
}
}
public class inner {
    public static void main(String[] args){
        A obj=new A();
        obj.fly();
        A.B obj1= obj.new B();
        // A.B obj1=new A.B();use this if the inner class method is static
        obj1.show();
        
    }
}

