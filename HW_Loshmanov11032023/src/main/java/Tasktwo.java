import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tasktwo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,5,9));
        Iterator<Integer> iter = arr.iterator();
        int listlen = 0;
        while (iter.hasNext()) {
            listlen++;
            iter.next();
        }
        listlen=listlen/2;
        int temp=0;
        Iterator<Integer> iter2 = arr.iterator();

        while (iter2.hasNext()){
            int targ = iter2.next();
            if(listlen==temp){
                System.out.println(targ);
                break;
            }
            temp++;
           
        }
    }
}
