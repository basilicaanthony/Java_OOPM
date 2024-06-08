public class Main{
    public static void main(String[] args) {
        initializeObject2 o1 = new initializeObject2();
        o1.insert(21,"vasco da gama");
        o1.display();
        new initializeObject2().insert(20,"don corleone");//anonymous object
        initializeObject2 o2 = new initializeObject2(),o3= new initializeObject2();//multiple object at the same time
    }
}
/*you cant dereference it meaning you cant chain methods on the anonymous object as insert return type is
void */
