

interface Computer{
    public abstract void code();
}
class Desktop implements Computer{
    public void code(){
        System.out.println(" only Desktop");
    }
}


class Laptop implements Computer{
    public void code(){
        System.out.println("Only laptop");
    }
}

class Developer{
    public void devapp(Computer lap){
        lap.code();
        System.out.println("Coding.");
    }
}

public class learninterface {
    public static void main(String[] args){
        Computer desk=new Desktop();
        Computer lap=new Laptop();
        Developer dev=new Developer();
        dev.devapp(desk);
    }
}
