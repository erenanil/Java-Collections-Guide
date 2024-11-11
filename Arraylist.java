import java.util.ArrayList;
import java.util.List;


public class Arraylist {
    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<String>();
        List<String> list = new ArrayList<>();

        
        //Add an element to the list
        list.add("Java");
        list.add("Python");
        list.add("C++");

        //Retrieve a specific element from the list
        //System.out.println(list.get(0));
        //System.out.println(list.get(4)); // gonna throw IndexOutOfBoundsException cuz we exceeded the size of the list

        /* 
        Printing all the elements with classic for loop.
        
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        */
        
        //Printing all the elements with for each loop.
        for (String a: list){
            System.out.println(a);
        }

    /*
        *Delete elements with index number and directly name.
        * list.remove(0);
        * list.remove("Python");
    */




    }
}
