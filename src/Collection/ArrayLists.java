package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrayLists {

    public  void arrlist(){
        ArrayList arr = new ArrayList();
        arr.add("Subhash kumar dangi");
        arr.add("Subhash kumar dangi");
        arr.add("Subhash kumar dangi");
        arr.add("Subhash kumar dangi");
        arr.add("Subhash kumar dangi");
        arr.add("Subhash kumar dangi");
        arr.remove(5);
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i)+"\t"+i);
        }
    }
    public  void linklist(){
        LinkedList<String> linkedList = new LinkedList();
    linkedList.add("Subhash kumar dangi");
      linkedList.add("Subhash kumar dangi");
        linkedList.add("Subhash kumar dangi");
        linkedList.add("Subhash kumar dangi");
        linkedList.add("Subhash kumar dangi");
        linkedList.add("Subhash kumar dangi");
        linkedList.remove(5);
        for(int i =0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i)+"\t"+i);
        }
    }
    public  void HashSets(){
        HashSet<Integer> h = new HashSet<>();

        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(4);// duplicate, will be ignored
        h.add(5);
        h.add(55);
        int i = 0;
        for (Integer val : h) {
            System.out.println(val + "\t" + i);
            i++;
        }

       /* for(int i =0;i<h.size();i++){
            System.out.println( h.get(i)+"\t"+i);
        }*/
    }

    public static void main(String[] args) {

        ArrayLists l = new ArrayLists();
//        l.linklist();
        l.HashSets();
    }
}
