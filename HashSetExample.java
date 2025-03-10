import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // ✅ Create a HashSet with at least 10 elements of type String
        HashSet<String> fruits = new HashSet<>();

        // ✅ Add elements to HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grapes");
        fruits.add("Honeydew");
        fruits.add("Indian Fig");
        fruits.add("Jackfruit");

        System.out.println("Initial HashSet: " + fruits);

        // ✅ Add duplicate elements (HashSet doesn't allow duplicates)
        fruits.add("Apple");  // This will not be added
        System.out.println("\nAfter trying to add duplicate 'Apple': " + fruits);

        // ✅ Check if an element is in the HashSet
        System.out.println("\nDoes HashSet contain 'Banana'? " + fruits.contains("Banana"));

        // ✅ Remove an element from the HashSet
        fruits.remove("Cherry");
        System.out.println("\nAfter removing 'Cherry': " + fruits);

        // ✅ Iterate through HashSet using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ✅ Iterate using Enhanced for-loop
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ✅ Find the size of the HashSet
        System.out.println("\nSize of HashSet: " + fruits.size());

        // ✅ Check if the HashSet is empty
        System.out.println("\nIs HashSet empty? " + fruits.isEmpty());

        // ✅ Clear all elements from HashSet
        fruits.clear();
        System.out.println("\nAfter clearing HashSet: " + fruits);
    }
}
