public class Constructors2 {
    String name;
    int age;

    Constructors2(String n,int a){
        this.name=n;
        this.age=a;
    }
    Constructors2(Constructors2 c2){
        this.name=c2.name;
        this.age=c2.age;
    }

    public static void main(String[] args) {
        Constructors2 c4=new Constructors2("vincent van gogh",35);
        Constructors2 c3= new Constructors2(c4);
        System.out.println("the name and age of constructor 1 is"+c4.name+c4.age);
        System.out.println("the name and age of constructor 2 is"+c3.name+c3.age);

    }
}
/*
here we are talking about copy constructor
 */
