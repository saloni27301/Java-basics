class Human{
    private String name;
    private int age;
    
    //Default Constructor
    public Human(){//This is Constructor ,it has same name as of class name and it will auotmatically called whenever the object is created of tha class
        name="saloni";
        age=22;
        System.out.println("This is Constructor");
    }
    
    public Human(String name, int age) {//Parametised Constructor
        this.name = name;
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
        this.age=109;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}




public class constructor {
    
        public static void main(String[] args){
            Human obj=new Human();
            Human obj1=new Human("supriya",12);
            Human obj2 =new Human("jiya");
            System.out.println(obj1==obj2);
            System.out.println(obj.getAge()+" "+obj.getName());
            System.out.println(obj1.getAge()+" "+obj1.getName());
            System.out.println(obj2.getAge()+" "+obj2.getName());
            obj.setName("piya");
            obj.setAge(234);
            
            System.out.println(obj.getAge()+" "+obj.getName());
        }
    
}
