/*
1) super keyword is used to refer to immediate parent class
2) super keyword is used to invoke immediate parent class method
3) super keyword is used to refer to immediate parent class constructor
 */
public class superKeyword extends methodOverriding2 {
    String color ="blue";
    String color2=super.color;// use1

    void animal(){
        System.out.println("this is the animal of the child class");//use2
        super.animal();//use2
    }

    superKeyword(){
        super();      //super() should always be in the first line
        System.out.println("this is the child class constructor");  //use3

    }

    public static void main(String[] args) {
        superKeyword sk1= new superKeyword();//use3
        System.out.println("the color of this class is "+sk1.color);
        System.out.println("the color of the immediate parent class is "+sk1.color2);//use1
        System.out.println("the super keyword is in the method of the child class");
        sk1.animal();//use2

    }

}
