import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Java Collection framework -- provides ready made data structures.
//Array--> Group of similar type of data stored in contiuous memory allocation
//int[] a=new int[10]
//6001--> 6003--> 6005--> 6010
//a[0]--> a[1]-->
//LinkedList--> Group of similar type of data stored but stored in non contiuous memory allocation
//dataNode| AddressNode--> data|AddressNode--> 
//List--> Ordered, allow duplicates
//Set--> No duplicates
//Map--> Key-Value Pairs
//List-->ArrayList and LinkedList 
// Iterable--> Collection--> List--> ArrayList
class ListDemo{
    public static void main(String...a){
        List<Integer> list =new ArrayList<>();// Reference is of 
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.print(list);
        list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print(list);
    }
}
//// Iterable--> Collection--> Set--> HashSet(fast, unordered) & LinkedHashSet(maintainsOrder) & TreeSet(sorted)
class SetDemo{
    public static void main(String...a){
        Set<Integer> integerSet=new HashSet<>();
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(2);
        System.out.print(integerSet);
    }
}

// Map(Key value)--> HashMap(fast) & LinkedHashMap(ordered) & TreeMa(sortedByKey)

class MapDemo{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Jan");
        map.put(2,"Feb");
        System.out.println(map);
    }
}

// Java Generics
//List list=new ArrayList<>();
//List<String> empName=new ArrayList<>();

class Box<T>{
    // Testing for Generics programing
    T value;
    void set(T value){
        this.value=value;
    }
    T get(){
        return value;
    }
}
class GenericDemo{
    public static void main(String args[]){

        // This is the main class to demonstrate the Generics
        Box<String> b=new Box();
        b.set("Demo");
        System.out.println(b.get());
    }
}