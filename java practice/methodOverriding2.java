public class methodOverriding2 extends methodOverriding{

    String color="beige";// this is for super keyword example go to that code to understand more
    void animal(){
        System.out.println("this is the animal of the parent class");//this is for super keyword for method
    }
    int getSum(int a, int b){
        return 2*a+2*b;
    }
    methodOverriding2() {
        System.out.println("this is to test super keyword constructor");
    }

    public static void main(String[] args) {
        methodOverriding2 mo2= new methodOverriding2();
        System.out.println("the sum is "+mo2.getSum(2,3));
    }
}

/*
static method cant be overriden as they belong to the class and memory is given during compile time
while non-static methods can be overriden as hey belong to the instance and the memory is given during runtime
 */