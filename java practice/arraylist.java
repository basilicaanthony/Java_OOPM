import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        // to add element
        al.add(2);
        System.out.println(al);

        // to add element in a particular index
        // ensure the index is valid (0 to size inclusive)
        al.add(0, 3); // adding at index 0, shifting existing elements to the right
        System.out.println(al);

        // adding all elements from another arrayList, it will add in the end
        al2.add(4);
        al.addAll(al2);
        System.out.println(al);

        // to retrieve an element
        System.out.println(al.get(1));

        // to update a value of the element based on index
        al.set(1, 12);
        System.out.println(al);

        // to see if element is present
        System.out.println(al.contains(12));

        // to traverse
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i)); // Corrected access syntax remmeber this is important
        }

        // to remove an element
        al.remove(1);
        System.out.println(al);

        // to remove a particular element, not index based
        al.remove(Integer.valueOf(4));
        System.out.println(al);
    }
}

/*
its similar to array but memory is allocated dynamically
the first element added the allocated memory size is 10 then the memory becomes size=n+n/2+1;
import java.util.ArrayList;
 */
