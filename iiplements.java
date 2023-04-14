//Interface Bydefault have abstract method

interface A{
    //Bydefault the variable of interface is final and static 
    int age=10;//And beacuse the variable are static so we can call these variable by using interface name
    String Area="Mumbai";
    void show();
    void config();
}
//need to make concrete class for create an object
class B implements A{

    @Override
    public void config() {
        System.out.println("In config");
        
    }

    @Override
    public void show() {
        System.out.println("In Show");
        
    }
    
}

public class iiplements {
    public static void main(String[] args){
        A obj;
        obj=new B();
        obj.show();
        obj.config();

        System.out.println(A.Area);
}
}
