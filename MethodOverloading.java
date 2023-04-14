class calculator{
    int num=10;
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a){
        return a*a*a;
    }
}


public class MethodOverloading {
    public static void main(String[] args){
        calculator obj=new calculator();
        calculator obj1=new calculator();//Both are different object pointing to the same class
        obj.num=24;
        System.out.println(obj.num);
        System.out.println(obj1.num);
        // int result=obj.add(4);
        // System.out.println(result);
    }
}
