public class Constructors {
    String name;
    int age;

    void display(String n,int a){
        this.name=n;
        this.age=a;
        System.out.println("the name and age is "+name+age);
    }
    Constructors(){   //default constructor
        System.out.println("this is a default constructor");
    }
    Constructors(String n, int a){
        this.name=n;
        this.age=a;
        System.out.println("the name and age is "+name+age);
    }

    Constructors(String n){
        this.name=n;
        System.out.println("this is a default constructor");
        System.out.println("the name is"+name);
    }

    public static void main(String[] args) {
        Constructors c1=new Constructors();//default constructor also no args construct
        Constructors c2=new Constructors("mary corleone",19); //parameterized constructor
        Constructors c3=new Constructors("vito aldolini");
        c1.display("anthony corleone",22);
        //c2.display("hey",30);

    }
}
/*if you remove the statement c2.display() the output will be "mar corleopne 19) but your writing
   the statement c2.display so the data is being which was initialized is being override by the new data
   which were giving now
   */