import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=new String[4];
        System.out.println("Enter Value of Array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.next();
            
        }
        arr[1]="saloni";
        System.out.println(Arrays.toString(arr));
    }
}
