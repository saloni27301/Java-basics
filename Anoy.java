class a{
    public a(){
        System.out.println("in a");
    }
    public void show(){
        System.out.println("Anoynomous");
    }
}

public class Anoy {
    public static void main(String[] args){
        new a().show();//anoynomous object (we can use this object only once beacuse we are not referring this object to any variable like obj)
        new a();//evertime we try to reuse this object it will create itself again

    }
}
