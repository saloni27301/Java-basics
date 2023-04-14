public class string {
    public static void main(String[] args){
        String name=new String("Saloni");
        System.out.println("Hello "+name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat("Gupta"));
        //String is Immutable means a String cannt be change
        String n1="Samya";
        System.out.println(n1);
        n1=n1+" mandaya";//this n1 String is immutable it just points to the differnet object address
        System.out.println(n1);
        //Both str1 and str2 points to same object address thats why both are equal
        String str1="Neha";
        String str2="Neha";
        System.out.println(str1==str2);
        //But we Change the String by using the StringBuffer or String Builder Both are similiar to each other

        //StringBuffer will give you a Buffer size of capacity of 16 even if the string is empty


        StringBuffer str=new StringBuffer("haryug ");
        System.out.println(str.capacity());
        System.out.println(str.length());
        System.out.println(str.append("prem"));
        // System.out.println(str.delete(0, 3));
        str1=str.toString();
       
        System.out.println(str1.substring(4));
        //difference between stringBuffer and Stringbuilder is that
        //StringBuffer is thread Safe and StringBuilder is not 
    }
}
