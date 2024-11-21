import java.util.HashSet;
import java.util.Set;

public class SetsEN {
    public static void main(String[] args) {
        /*

        # Set Interface, HashSet, LinkedHashSet, and TreeSet

## Set Interface
- **Set** is a type of **Collection** in Java.
- **Does not allow duplicate elements.** (Each element is unique.)
- Does not guarantee the order of elements (exceptions: LinkedHashSet and TreeSet).
- Main implementations: **HashSet**, **LinkedHashSet**, **TreeSet**.

---

## HashSet
- Provides an **unordered collection** (does not maintain insertion order).
- Allows **one null value**.
- Stores elements using a **hashing algorithm**.
- **Performance:**
  - Search, add, and delete operations are typically **O(1)**.
- **Advantage:** Fast.
- **Disadvantage:** Does not maintain order.

---

## LinkedHashSet
- Similar to HashSet but maintains the **insertion order** of elements.
- Uses **more memory** because it stores a linked list structure along with the elements.
- **Performance:**
  - Search, add, and delete operations are typically **O(1)**.
- **Advantage:** Maintains order + fast operations.
- **Disadvantage:** Slightly slower than HashSet.

---

## TreeSet
- Orders elements according to their **natural ordering** (or a defined **Comparator**).
- **Does not allow duplicate elements.**
- **Does not accept null values.**
- Uses a **Balanced Tree (AVL or Red-Black Tree)**.
- **Performance:**
  - Search, add, and delete operations are **O(log n)**.
- **Advantage:** Provides sorted data.
- **Disadvantage:** Slower compared to HashSet and LinkedHashSet.

---

## Comparison Table

| Feature              | **HashSet**       | **LinkedHashSet**       | **TreeSet**       |
|-----------------------|-------------------|--------------------------|-------------------|
| **Order Guarantee**   | None              | Maintains insertion order| Natural order     |
| **Performance**       | O(1)              | O(1)                     | O(log n)          |
| **Null Support**      | One null allowed  | One null allowed         | No nulls          |
| **Use Case**          | Fast access       | Fast access + order      | Sorted data       |

---

## General Notes
1. While working with the **Set Interface**, remember that elements must be **unique**.
2. If:
   - You need **speed** → use `HashSet`
   - You need **order + speed** → use `LinkedHashSet`
   - You need a **sorted collection** → use `TreeSet`
3. Ensure the data type used defines the **`hashCode()` and `equals()`** methods correctly:
   - HashSet and LinkedHashSet rely on these methods.
   - TreeSet uses **Comparable** or **Comparator** for ordering.
   
   */
   // Some usage examples:
        /*
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        // The add method is the same for all Set types. Elements are added using the add method.
        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("Javascript");
        set1.add("Go");
        // ----
        set2.add("Java");
        set2.add("C++");
        set2.add("Python");
        set2.add("Javascript");
        set2.add("Go");
        // ----
        set3.add("Java");
        set3.add("C++");
        set3.add("Python");
        set3.add("Javascript");
        set3.add("Go");
        */

        // Displaying the elements in the set using a foreach loop:
        /* 
        System.out.println("*******HashSet*********");
        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println("********LinkedHashSet********");
        for (String s : set2) {
            System.out.println(s);
        }
        System.out.println("********TreeSet********");
        for (String s : set3) {
            System.out.println(s);
        }
        */

        // The contains method checks if a specified value exists in the set and returns a boolean value.
        // System.out.println(set1.contains("Php")); // Will return false.
        // System.out.println(set2.contains("Java")); // Will return true.

        // The isEmpty method checks if the set is empty and returns a boolean value.
        // System.out.println(set1.isEmpty()); // Will return false.

        // Removing an element from the set:
        /* 
        set1.remove("Java");
        for (String s : set1) {
            System.out.println(s);
        }
        */

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("C++");
        set1.add("Java");
        set1.add("Python");

        set2.add("Java");
        set2.add("Php");
        set2.add("Go");

        /*
         * The removeAll method helps us find the difference between sets.
         * We create a difference set and pass the set to compare to the constructor (line 147),
         * and then pass the set to compare against to the removeAll method (line 148).
         * Finally, we print the difference set to see which elements are different (line 149).
         */
        // Set<String> difference = new HashSet<>(set2);
        // System.out.println(difference.removeAll(set1));
        // System.out.println(difference);

        /*
         * The retainAll method helps us find the intersection of sets.
         * We create an intersection set and pass the set to compare to the constructor (line 157),
         * and then pass the set to compare against to the retainAll method (line 154).
         * Finally, we print the intersection set to see which elements intersect (line 155).
         */
        // Set<String> intersection = new HashSet<>(set2);
        // System.out.println(intersection.retainAll(set1));
        // System.out.println(intersection);
    

  }
}
