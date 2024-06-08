public class privateFields {
    private String name;
    private int age;

    int getAge(){
        return this.age;
    }
    void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        privateFields pf=new privateFields();
        pf.setAge(20);
        int age= pf.getAge();
        System.out.println("the age of the person is "+age);
    }
}
/* same way you can do with string name
   this code is to teach how to do access private fields
   and also to learn accessor(getters) and mutators(setters)
 */
