import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Print the original list
        System.out.println("Original ArrayList: " + list);

        // Remove the third element (index 2 since indexing starts from 0)
        if (list.size() > 2) {
            list.remove(2); // Index 2 refers to the third element
        }

        // Print the list after removal
        System.out.println("ArrayList after removing the third element: " + list);
    }
}
