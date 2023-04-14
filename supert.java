class a{
    public a(){
        System.out.println("In A");
    }
    public a(int a){
        
        System.out.println("In a int");
    }
}

class B extends a{
    public B(){
        super(1);
        System.out.println("In B");
    }
    public B(int a){
        // super(1);//super is bydefault present in any constructor of java,we can also customised super by passing argument in that.
        this();//we cannt use super and this together.
        System.out.println("In B int");
    }
}

public class supert {
    public static void main(String[] args){
        B b=new B(1);
    }
}
