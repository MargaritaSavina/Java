

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

public class CreateHashSet {
    
    private HashSet<Integer> h  = new HashSet<>(); 
   
    private int size = 10;

    
    
    public CreateHashSet(){
        h.add(37);
        h.add(2);
        h.add(47);
        h. add(255);
        h.add(7);
    }

    public void addElem(int num) {
        this.h.add(num);
    }

    public HashSet<Integer> setHashSet() {
        return this.h;
    }

    public int getElem(int index) {
        int[] arr = this.h.stream().flatMapToInt(n -> IntStream.of(n)).toArray();
        if (index < arr.length) return arr[index];
        else throw new IndexOutOfBoundsException("Нет такого индекса");
    }

    public String toString() {
        String str = "Элементы HashSet: ";
        for (Integer i : h) {
            str += i;
            str += ", ";
        }
        return str;

    }



}
