class calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
public class demo1 {
        public static void main(String[] args){
            int num1=9;
            int num2=8;
            calculator c1=new calculator();
            int result = c1.add(num1,num2);
            System.out.println(result);
            // System.out.println(num1+num2);
        }
        
    }
    

