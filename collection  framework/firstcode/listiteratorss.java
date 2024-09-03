import java.util.*;

class Demo {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original list: " + list);

        // For printing using ListIterator
        ListIterator<Integer> litr = list.listIterator();

        // Print forward
        System.out.println("Forward Iteration:");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        // Print backward
        System.out.println("Backward Iteration:");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        // Check next index
        System.out.println("Next Index: " + litr.nextIndex());

        // Check previous index
        System.out.println("Previous Index: " + litr.previousIndex());

        // Add element
        litr.add(1000);
        System.out.println("List after adding 1000: " + list);

        // Move to the next element and add more elements
        while (litr.hasNext()) {
            litr.next();
            litr.add(1000);
        }
        System.out.println("List after adding 1000s: " + list);

        // Reset iterator to the beginning
        litr = list.listIterator();

        // Update an element using set
        while (litr.hasNext()) {
            Integer value = litr.next();
            if (value == 1000) {
                litr.set(67788);
            }
        }
        System.out.println("List after setting 67788 in place of 1000: " + list);

        // Reset iterator to the beginning for removal
        litr = list.listIterator();

        // Remove element
        while (litr.hasNext()) {
            Integer value = litr.next();
            if (value == 10) {
                litr.remove();
            }
        }
        System.out.println("List after removing elements equal to 10: " + list);
    }
}
