import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // ✅ Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // ✅ Add 10 elements to ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dates");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        // ✅ Add an element to the ArrayList
        list.add("Kiwi");
        System.out.println("After adding Kiwi: " + list);

        // ✅ Iterate through the ArrayList using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ✅ Add an element at a specific index
        list.add(2, "Blueberry");
        System.out.println("\nAfter adding Blueberry at index 2: " + list);

        // ✅ Remove an element from the ArrayList
        list.remove("Dates");
        System.out.println("\nAfter removing 'Dates': " + list);

        // ✅ Remove an element at a specific index
        list.remove(4);
        System.out.println("\nAfter removing element at index 4: " + list);

        // ✅ Update an element at a specific index
        list.set(3, "Dragonfruit");
        System.out.println("\nAfter updating index 3 with Dragonfruit: " + list);

        // ✅ Check if an element is present at a particular index
        System.out.println("\nElement at index 5: " + list.get(5));

        // ✅ Find the size of the ArrayList
        System.out.println("\nSize of ArrayList: " + list.size());

        // ✅ Check if a given element is present in the ArrayList
        boolean containsMango = list.contains("Mango");
        System.out.println("\nIs 'Mango' present? " + containsMango);

        // ✅ Remove all elements from the ArrayList
        list.clear();
        System.out.println("\nAfter clearing all elements: " + list);
    }
}
