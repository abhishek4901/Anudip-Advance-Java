/*Collection is a interface , Collecction is a framwork.
collection is the collection og objects
  but collections is collection class is sort and syncronyce 
for collection we use java.util.*package



Genrics.. by using genric we  can  to define the which type data we store in collections.
Denoted by (<>) brackets.
Syntax .. 
List l1 = new List();
List<String> l1 = new List<String>();
how to iterate(menas acces every element) collection
1. by using iterator  interface
2. using for each loop

"collection questions "
'''list - Arraylist ,linkedlist
Set - Hashmap, Treeset , LinkedHashSet
Map - hashmap , LinkedlistMap,  treeMap, SortedMap
Queue - priority queue
1. what is list(linkedlist, arraylist, hashmap, )
2. what is  different in all '''


list .. list me bhi  contiguous data store  and no fix but array ka size fix hota
for each loops me only ek ek increment hoig and forword chalegi but backword nhi chlegi
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Usecollection{
    public static void main(String[] args) {
        List<String> l1 = new ArrayList <String>();// use array or stack , linked 
        l1.add("Saurabh");
        l1.add("Sabhinay");
        l1.add("Sahu ji ");
        l1.add(" chhava ");
        for (String s:l1 ) {
            System.out.println(s);
            
        }
    }
}