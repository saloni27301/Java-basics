
abstract class A{//abstract class
    public abstract void show();
}



public class abstAnoy {
    public static void main(String[] args){
        A obj=new A(){
            public void show(){//Abstract and anoynoumous inner class.abstract method can also be use like this
                System.out.println("In Anoynomous inner class");
            }
        };
        obj.show();
    }
}