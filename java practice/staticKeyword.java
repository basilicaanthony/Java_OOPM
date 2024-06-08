public class staticKeyword {
    static int count=10;        //static keyword
    int increament (){       //no need to give parameters as its static keyword and also global
        return ++count;
    }

    static int cube(int x){   //static method
        return x*x*x;
    }
    static {
        System.out.println("Static block is executed.");//static block its get executed first as it doesnt need any calling
                                                        //it gets executed before the main method all other static things
                                                        // after the main method
    }

    public static void main(String[] args) {
        staticKeyword sk1=new staticKeyword();
        System.out.println("first object "+sk1.increament());  //count will be 11
        staticKeyword sk2=new staticKeyword();
        System.out.println("second object "+sk2.increament());  //count will be 12 it will continue as it is static
        staticKeyword sk3=new staticKeyword();
        System.out.println("third object "+sk3.increament());  //count 13 even if this is another object as count
                                                            // is static and memory allocation is same for all objects
        System.out.println("this is static method the cube is "+staticKeyword.cube(4));//you can use class with dot operator also
        System.out.println("this is static method the cube is "+cube(4));//you dont need object as method is static
    }

}
