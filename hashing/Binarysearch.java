package hashing;

import java.util.*;

public class Binarysearch {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,3,6,5);
        divideandconquer(list,6);
    }

    private static void divideandconquer(List<Integer> list, int i) {
        Collections.sort(list);
        int index = Arrays.binarySearch(list.toArray(),i);
        if(index < 0){
            System.out.println("not found");
        }else{
            System.out.println("elements found");
        }
    }
}
