class Laptop{
    String model;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    

    // public boolean equals(Laptop that){
    //     if(this.model.equals(that.model) && (this.price==that.price)){
    //         return true;
    //     }
    //     return false;
    // }

}



public class objectclass {
    public static void main(String[] args){
        Laptop obj=new Laptop();
        obj.model="Samasung";
        obj.price=1837;
        Laptop obj1=new Laptop();
        obj1.model="Samasung";
        obj1.price=1837;
        System.out.println(obj.equals(obj1));
    }
}
