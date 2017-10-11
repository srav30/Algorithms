import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCombine
{
    public static void main(String[] args)
    {
      IteratorCombine t = new IteratorCombine();

      List l = new ArrayList();
      List l2 = new ArrayList();
      l.add("MNO");
      l.add("XYZ");
      l2.add("PQR");
      l2.add("ZAB");

      Iterator<String> iter1 = l.iterator();
      Iterator<String> iter2 = l2.iterator();
      Iterator<String> citer = t.combine(iter1,iter2);

      while(citer.hasNext()){
        System.out.println(citer.next());
      }
    }

    public Iterator<String> combine(Iterator<String> iter1, Iterator<String> iter2){

      // New ArrayList to hold the sorted elements of combined iterator.
      List l = new ArrayList();

      // Using temp variables because iterators don't support peeking.
      String temp1=iter1.next();
      String temp2=iter2.next();

      // looping over iterators to merge
      while(temp1 !=null && temp2 != null){
        if(temp1.compareTo(temp2) >= 0){
          l.add(temp2);
          temp2 = iter2.hasNext() ? iter2.next() : null;
        }else{
          l.add(temp1);
          temp1 = iter1.hasNext() ? iter1.next() : null;
        }
      }

      // After one of the iterator ends, there would be one element left in either temp1 or temp2
      l.add(temp1 == null ? temp2 : temp1);

      // Left overs in either of the iterators
      while(iter1.hasNext()){
        l.add(iter1.next());
      };

      while(iter2.hasNext()){
        l.add(iter2.next());
      };

      return l.iterator();

    }

}
