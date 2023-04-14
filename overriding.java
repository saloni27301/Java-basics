class Calc{//Super class
    public int add(int a ,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class Advcalc extends Calc{//Sub class
    public int add(int a ,int b){//this is overriding 
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }

}



public class overriding {
    public static void main(String[] args){
        Advcalc obj=new Advcalc();
        
        System.out.println(obj.add(9,9));
    }
}
