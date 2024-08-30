package array_list;

import java.util.ArrayList;

class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        System.out.println("List after adding elements: " + list);

        list.add(1, "New Element");
        System.out.println("List after adding element at index 1: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        System.out.println("Contains 'Element 2': " + list.contains("Element 2"));
        System.out.println("Contains 'Element 4': " + list.contains("Element 4"));

        System.out.println("Index of 'New Element': " + list.indexOf("New Element"));
        System.out.println("Index of 'Element 4': " + list.indexOf("Element 4"));

        System.out.println("Removed element: " + list.remove(1));
        System.out.println("List after removal: " + list);

        list.ensureCapacity(20);
        System.out.println("Capacity ensured. List size: " + list.size());

        list.clear();
        System.out.println("List after clear: " + list);
    }
}
