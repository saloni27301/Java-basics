class Calc{//Super class
    public int add(int a ,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class Advcalc extends Calc{//Sub class
    public int multi(int a ,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }

}



public class inheritance {
    public static void main(String[] args){
        Advcalc obj=new Advcalc();
        int r1=obj.add(8, 9);
        int r2=obj.sub(8, 9);
        int r3=obj.multi(8, 9);
        int r4=obj.div(8, 9);
        System.out.println(r1+ " "+r2+" "+r3+" "+r4);
    }
}
