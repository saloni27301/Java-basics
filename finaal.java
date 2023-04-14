final class Calc{//if we make our class final then the final class can not be bale to
    // make its subclass means to none will be able to take data from class calc

    final public void show(){
        System.out.println("In A");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
// class advncalc extends Calc{

// }


public class finaal {
    public static void main(String[] args){
        final int a=10;//if we make our variable as final then no one can change the value of final
        // System.out.println(a);
        Calc obj=new Calc();
        obj.add(8,9);
    }
}
