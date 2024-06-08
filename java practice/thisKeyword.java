/*
1) this keyword can be used to refer current class instance variable
2) this keyword is used to invoke current class methods
3) this keyword is used to call default constructor from parameterized constructor
4) this keyword is used to call parameterized constructor from default constructor

 */

public class thisKeyword {
    String name;
    //use 1
    void setName(String name){
        this.name=name;
    }
    //use 2
    void a(){
        System.out.println("this is a");
    }
    void b(){
        System.out.println("this is b");
        this.a();  //use 2 you dont have to write this the compiler interprets it even if you write a().
    }
    thisKeyword(){
        System.out.println("this is the default constructor");//use3
    }

    thisKeyword(String name){
        this();      //remember this should always be the first statement
        System.out.println("this is parameterized with one parameter");//use 3

    }
    thisKeyword(String name ,int age){
        this("daughter");   //use4
    }
    public static void main(String[] args) {
        thisKeyword tk1=new thisKeyword("hello");//use 3
        thisKeyword tk2=new thisKeyword("son",21);//use4
        tk1.setName("jojo siwa");//use1
        System.out.println("the name is "+tk1.name);//use1
        tk1.b();   //use2

    }
}
