class A{
    public void show(){
        System.out.println("In A class");
    }
}



public class anoynomousclass {
    public static void main(String[] args){
        A obj=new A(){
            public void show(){//This is the inner class without any class name is called anoynoumous inner class
                System.out.println("In Anoynomous inner class");
            }
        };
        obj.show();
    }
}
