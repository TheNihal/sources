import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListing {
    public static void main(String[] args) {

        // ArrayList<Integer> list = new ArrayList<Integer>(); --> THIS IS ALSO VALID 
        ArrayList<Integer> list1 = new ArrayList<>(); 
        ArrayList<Integer> list2 = new ArrayList<>(); 
        ArrayList<Integer> list3 = new ArrayList<>(); 
        System.out.print("ArrayList size before adding element >> "+list1.size()+"\t"+list2.size()+"\t"+list3.size());
        
        /**
         * Adding elements
         */
        
         //* add(Integer e)
        list1.add(10);
        list1.add(20);
        list1.add(40);
        list1.add(30);
        list1.add(50);

        //* add(Index i, Integer e)
        list2.add(0,10);
        list2.add(1,20);
        list2.add(2,40);
        list2.add(3,30);
        list2.add(4,50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);


        list3.add(10);
        list3.add(20);
        list3.add(2,40);
        list3.add(3,30);
        list3.add(4,50);


        /**
         * Printing list
         */
        
         // Novice method
        System.out.println("\n\nArrayList 1: ");
        System.out.print(list1+"\t");
        System.out.println("\nArrayList size after adding elements >> "+list1.size());
        
        // Using For-Each Loop
        System.out.println("\nArrayList 2: ");
        for (int i : list2){
            System.out.print(i+"\t");
        }
        System.out.println("\nArrayList size after adding elements >> "+list2.size());
        

        // Using Iterator
        System.out.println("\nArrayList 3: ");
        Iterator itr = list3.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"\t");
        }
        System.out.println("\nArrayList size after adding elements >> "+list3.size());

        /**
         * Removing Elements
         */
        list1.remove(0);
        list2.remove(4);
        list3.remove(2);

        System.out.print("\n\n"+list1+"\t");
        System.out.println("\nArrayList size after removing elements >> "+list1.size());
        
        // Using For-Each Loop
        System.out.println("\nArrayList 2: ");
        for (int i : list2){
            System.out.print(i+"\t");
        }
        System.out.println("\nArrayList size after removing elements >> "+list2.size());
        

        // Using Iterator
        System.out.println("\nArrayList 3: ");
        Iterator itr2 = list3.iterator();
        while(itr2.hasNext()){
            System.out.print(itr2.next()+"\t");
        }
        
        /**
         * Clear method
         */
        list1.clear();
        System.out.println("\n\nArrayList 1: ");
        System.out.println("ArrayList size after clearing elements >> "+list1.size());
        

        /**
         * Check whether empty or not
         * returns a booelean value
         * isEmpty
         */
        System.out.println("\nChecking whether ArrayList is empty or not: ");
        boolean b = list1.isEmpty();
        System.out.print("List1 > "+b);
        System.out.println("\nList2 > "+list2.isEmpty());
        System.out.println("List3 > "+list3.isEmpty());


        /**
         * Checking whether certain value is present in the list 
         * returns a  boolean value
         * contains
         */
        System.out.println("\nChecking whether 100 is in the ArrayList:");
        System.out.println("100 in List1 > "+list1.contains(100));
        System.out.println("100 in List2 > "+list2.contains(100));
        System.out.println("100 in List3 > "+list3.contains(100));


        /**
         * Index of elements
         * indexOf
         */
        System.out.println("\nChecking index of 30 in the ArrayList:");
        System.out.println("Index of 30 in List1 > "+list1.indexOf(30));
        System.out.println("Index of 30 in List2 > "+list2.indexOf(30));
        System.out.println("Index of 30 in List3 > "+list3.indexOf(30));

        /**
         * Set & Get
         * name.set(Index i, Integer e)
         * name.get(Index i)
         * Set is used for replacing an *existing element in any arraylist.
         * Get is used for getting the element of certain arrays
         */

         /**
          * Adding elements from an ArrayList to another ArrayList
          * addAll
          */
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();
        ArrayList<String> list6 = new ArrayList<>();

        // Adding elements
        list4.add("Fahim");
        list4.add("Abrar");
        list4.add("Saikat");

        list5.add(0,"Junaeed");
        list5.add(1,"Muhammad");
        list5.add(2,"Turin");

        // Printing
        System.out.println("\nList4 >> "+list4);
        System.out.println("List5 >> "+list5);
        
        // Adding elements to another arraylist
        list6.addAll(list4);
        System.out.println("\nList6 >> "+list6);

        /**
         * Checking whether an ArrayList is equals to another ArrayList
         * equals
         */
        System.out.println("\nList4 = List5 >> "+list4.equals(list5));
        System.out.println("List4 = List6 >> "+list4.equals(list6));

    }
}
