/*
5)this keyword can be used to reuse constructor
6)this keyword can be used to print reference id of the object
 */
public class thisKeyword2 {
    String name;
    int age;
    int std;
    String college;

    void m(){
        System.out.println(this);//prints the reference id of the object
    }

    public thisKeyword2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public thisKeyword2(String name, int age, int std, String college) {
        this(name, age); // Call the other constructor first
        this.std = std;
        this.college = college;
    }

    public static void main(String[] args) {
        thisKeyword2 tk2=new thisKeyword2("hey",12);
        System.out.println(tk2);
        tk2.m();
    }
}
