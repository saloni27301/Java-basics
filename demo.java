public class demo {
    public static void main(String[] args){
    //     int n=6;
    // switch(n){
    //     case 1:
    //         System.out.println("Monday");
    //         break;
    //     case 2:
    //     System.out.println("Tuesday");
    //     break;
    //     case 3:
    //     System.out.println("Wednesday");
    //     break;
    //     case 4:
    //     System.out.println("Thursday");
    //     break;
    //     case 5:
    //     System.out.println("Friday");
    //     break;
    //     case 6:
    //     System.out.println("Saturday");
    //     break;
    //     case 7:
    //     System.out.println("Sunday");
    //     break;
    //     default:
    //     System.out.println("Enter a valid number");

    // }
    //     while(true){
    //         System.out.println("Hello Saloni");
    //     }
    // }

    // int x=8;
    // int y=1;
    // int z=2;
     
    // if(x>y && x>z){
    //     System.out.println(x);
    // }
    // else if(y>z){
    //     System.out.println(y);
    // }
    // else{
    //     System.out.println(z);
    // }

    // int i=1;
    // while(i<=4){
    //     System.out.println("Hello" + i);
    //     int j=1;
    //     while(j<=3){
    //         System.out.println("Saloni " + j);
    //         j++;
    //     }
    //     i++;
    // }
    // System.out.println("Bye " + i);

    // int i=5;
    // do{
    //     System.out.println("hi "+ i);
    //     i++;
    // }while(i<=4);


    for(int i=1;i<=4;i++){
        System.out.println("Day "+ i);
        for(int j=1;j<=9;j++){
            System.out.println(" " + (j+8)+"am" +"-"+(j+9)+"am");
            switch(j)
            {
                case 1:
                System.out.println("breakfast");
                break;
                case 2:
                System.out.println("Go temple");
                break;
                case 3:
                System.out.println("then Study java");
                break;
                case 4:
                System.out.println("do Lunch");
                break;
                default:
                System.out.println("enjoy");
            }
        }
    }
}

}
