public class methodOverloading {
    int sum(int a , int b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        methodOverloading mo1= new methodOverloading();
        System.out.println("the sum of the first method is "+mo1.sum(2,3));
        System.out.println("the sum of the second method with the same name is "+mo1.sum(2,3,4));

    }

}
/*
this is for method overloading remmber you can change the number of arguments change the datatype of argument
but you cant just change the return type to keep it as method overloading
 */