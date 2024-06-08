public class Encapsulation {
    private String Name;
    void setName(String name){
        Name=name;
    }
    String getName(){
        return Name;
    }

    public static void main(String[] args) {
        Encapsulation ec= new Encapsulation();
        ec.setName("beatch");
        System.out.println("the is how encapsulation works "+ec.getName());
    }
}
/*
its when you a class is encapsulated meaning you cant access the feilds or any information
you need get set methods but these methods give only the copy not the original data
 */