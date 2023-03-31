// Реализовать алгоритм сортировки списков компаратором.
// Пусть дан произвольный список целых чисел, удалить из него чётные числа
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
// Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
// Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
// Повторить пятый пункт но с LinkedList.
// Сравнить время работы пятого и шестого пунктов.


package hometask_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
public class hometak3 {
   
    public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();
    for (int j = 0; j < 10; j++) {
        list.add(new Random().nextInt(50));
    }
    System.out.println(list);
    list.sort(new Comparator<Integer>() {
        public int compare(Integer t0, Integer t1) {
            if (t0-t1 < 0) return 1;
            else if (t1-t0 < 0) return -1;
            return 0;
        }
    });
    
    System.out.println(list);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.addAll(list);
    for (int j = 0; j < list2.size(); j++) {
        if (list2.get(j) % 2 == 0) {
            list2.remove(j);
            j--;
        }
    }    

    System.out.println(list2);
    System.out.println("максимальное число: " + list.get(0));
    System.out.println("минимальное число: " + list.get(list.size()-1));
    
    double average = list.stream().mapToInt(a -> a).average().orElse(0);
    System.out.println("среднее: " + average);

    
     
    
    
    ArrayList<Integer> list_a = new ArrayList<>();
    ArrayList<Integer> list_b = new ArrayList<>();
    for (int j = 0; j < 10; j++) {
        list_a.add(new Random().nextInt(10));
        list_b.add(new Random().nextInt(10));
    }
    System.out.println(list_a);
    System.out.println(list_b);
    
    list_b.removeAll(list_a);
    
    list_a.addAll(0, list_b);
    System.out.println(list_a);

    


    long begin2 = System.currentTimeMillis();
    LinkedList<Integer> linkList = new LinkedList<>();
    for (int j = 0; j < 100000; j++) {
        linkList.add(0);
        } 
        //System.out.println(linkList);
    long end2 = System.currentTimeMillis();
    System.out.println("Время LinkedList:" + (end2 - begin2));

    
    
    long begin = System.currentTimeMillis();
    ArrayList<Integer> list_0 = new ArrayList<>();
        for (int j = 0; j < 100000; j++) {
            list_0.add(0);

        }
    
    long end = System.currentTimeMillis();
    System.out.println("Время ArrayList:" + (end - begin));
    }    


}
