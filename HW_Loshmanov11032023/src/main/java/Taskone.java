import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Taskone {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = inserNum(10);
        ArrayList<Integer> arrayList2 = inserNum(10);
        ArrayList<Integer> arrayList3 = addArrays(arrayList1, arrayList2);
        Collections.sort(arrayList3);
        for (Integer num:arrayList3
             ) {
            System.out.println(num.toString());
        }
    }
    public static ArrayList<Integer> inserNum(int num){
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num  ; i++) {
            arr.add(rand.nextInt(0,20));
            }
        return arr;
    }
    public static ArrayList<Integer> addArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(arr1);
        arr.addAll(arr2);
        return  arr;
    }
    public static void arrSort(ArrayList<Integer> arr){

    }
}

