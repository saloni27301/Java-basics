class Human{
    private String name;//Instant Variable 
    private int age;
    //Encapsulation means that the data member and member are wrapped inside a class just like the humaan stored all information inside his brain
    //and that data cannot be accessed by everyone 
    public String getName() {//Getter is used to get th data
        return name;
    }
    public void setName(String name) {//Setter is used to set the data
        this.name = name;
    }
    // this keyword is basically used to differentite between the instant variable and local variable
    //this refer to the current object who is calling the setAge() method
    public int getAge() {
        return age;
    }
    public void setAge(int age) {//In method age and name are local variable
        this.age = age;
    }


    // public int getage(){
    //     return age;
    // }
    // public String getname(){
    //     return name;
    // }
    // public void setage(){
    //     age=12;
    // }
    // public void setname(){
    //     name="pretti";
    // }
}



public class Encapsulation {
    public static void main(String[] args){
        Human obj=new Human();
        obj.setName("piya");
        obj.setAge(234);
        
        System.out.println(obj.getAge()+" "+obj.getName());
    }
}
