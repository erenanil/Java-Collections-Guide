import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
// Note: You can easily run the examples by removing the text inside "/* */".
public class MapEN {

    public static void printMapWithStringKeys(Map<String, Integer> map){
        map.put("C++", 10);
        map.put("Java", 5);
        map.put("Python",1);
        map.put("Php",2);
        map.put("C", 100);

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("Key : "+entry.getKey() + " Value : "+ entry.getValue());
        }

        //provides a set of keys
        //System.out.println(map.keySet());
        

    }

    public static void printMapWithIntegerKeys(Map<Integer, String> map){
        map.put(10, "C++");
        map.put(5, "Java");
        map.put(1, "Python");
        map.put(2, "Php");
        map.put(100, "C");

        
        
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key : "+entry.getKey() + " Value : "+ entry.getValue());
        }

        //we can see only keys
        //System.out.println(map.keySet());

        
        //different alternative uses
        /*
        for (Integer key: map.keySet()){
            System.out.println("Key : " + key + " Value: " + map.get(key));
        }
        */

        /*
        Collection<String> values = map.values();
        for ( String s: values){
            System.out.println("values : "+s);
        }
        */

    }
    public static void main(String[] args) {
/*
// 1. Map Interface:
//    - Map is used to store key-value pairs.
//    - Each key is unique, but values can be duplicated.
//    - Main methods:
//        - put(key, value): Adds a key-value pair.
//        - get(key): Returns the value associated with the key.
//        - remove(key): Removes the key-value pair.
//        - containsKey(key): Checks if the key exists.
//        - containsValue(value): Checks if the value exists.
//        - keySet(): Returns all the keys.
//        - values(): Returns all the values.
//    - Since Map is an interface, it cannot be instantiated directly; it is used through HashMap, LinkedHashMap, or TreeMap.

// 2. HashMap:
//    - A concrete implementation of the Map interface.
//    - Features:
//        - Keys and values are stored unordered (no insertion order is maintained).
//        - Fast because it uses a hash table.
//        - Allows one null key and multiple null values.
//    - Usage Examples:
//        - Mapping database IDs to records.
//        - Storing user credentials.
//    - Example:
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Anil", 30);
        map.put("Eda", 25);
        System.out.println(map.get("Anil")); // Output: 30

// 3. LinkedHashMap:
//    - A subclass of HashMap but maintains insertion order.
//    - Features:
//        - Requires more memory (uses a doubly-linked list).
//        - Provides order advantage over HashMap.
//        - Allows one null key and multiple null values.
//    - Usage Examples:
//        - Storing user transaction history in order.
//    - Example:
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Anil", 30);
        map.put("Eda", 25);
        System.out.println(map); // Output: {Anil=30, Eda=25}

// 4. TreeMap:
//    - A sorted implementation of the Map interface (natural order or Comparator-defined order).
//    - Features:
//        - Keys are stored in sorted order.
//        - Slower compared to HashMap or LinkedHashMap (uses a tree - Red-Black Tree).
//        - Does not allow null keys but allows null values.
//    - Usage Examples:
//        - Situations requiring alphabetical sorting (e.g., a phone directory).
//    - Example:
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Anil", 30);
        map.put("Eda", 25);
        System.out.println(map); // Output: {Anil=30, Eda=25}
*/
        Map<Integer, String> hashMap= new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap= new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap= new TreeMap<Integer, String>();
        
        Map<String, Integer> hashMap2= new HashMap<String, Integer>();
        Map<String, Integer> linkedHashMap2= new LinkedHashMap<String, Integer>();
        Map<String, Integer> treeMap2= new TreeMap<String, Integer>();

        //Integer keys
        System.out.println("******HashMapINT*******");
        printMapWithIntegerKeys(hashMap);
        System.out.println("******LinkedHashMapINT*********");
        printMapWithIntegerKeys(linkedHashMap);
        System.out.println("********TreeMapINT*******");
        printMapWithIntegerKeys(treeMap);
        
  
        //String keys
        System.out.println("******HashMapSTR*******");
        printMapWithStringKeys(hashMap2);
        System.out.println("******LinkedHashMapSTR*********");
        printMapWithStringKeys(linkedHashMap2);
        System.out.println("********TreeMapSTR*******");
        printMapWithStringKeys(treeMap2);
 

    }
}
