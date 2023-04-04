// Ввод с консоли в формате Ф.И.О Возраст пол
// Выход из режима вода по горячей кнопке
// Вывод несортированного списка в формате Иванов И.И. 32M
// Два варианта продолжения, либо вывод списка сортированного по возрасту и полу либо завершение приложения.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;  
public class hometask_4 {
  




public static void main(String[] args) {
    
    LinkedList<String> document = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите запись в формате: Ф.И.О Возраст пол:");
    String d = scanner.nextLine();
    
    while (!(d.equals("1"))) {
        document.add(d);
        d = scanner.nextLine();
        System.out.println("Для выхода нажмите 1.");
           
    }
    
    System.out.println(document);
    
    
    PrintList(document);

    ArrayList<String> doc= new ArrayList<String>(document);
    //SortedAge(doc);
    SortedGender(doc);





}

public static void PrintList(LinkedList list) {

    ArrayList<String> lst = new ArrayList<String>(list); 
    for (int i = 0; i < lst.size(); i++) {
        String str = lst.get(i).toString();
        String[] arr = str.split(" ");
        System.out.println(arr[0] + " " + arr[1].charAt(0) + "."
        + arr[2].charAt(0) + "." + " " + arr[3] + " " + arr[4]);
    }

}

public static ArrayList<String> SortedAge (ArrayList<String> list) {

    ArrayList<String> lst = new ArrayList<String>(list);
    Comparator<ArrayList<String>> compAge = new Comparator<ArrayList<String>>() {
        public int compare(ArrayList<String> t1, ArrayList<String> t2) {
            return Integer.parseInt(t1.get(3)) - Integer.parseInt(t2.get(3));   
        }
    };
    
    //lst.sort(compAge);
    System.out.println(lst);  
    return lst;
}
    
    
   
    public static ArrayList<String> SortedGender (ArrayList<String> list) {

        ArrayList<String> lst = new ArrayList<String>(list);
        Comparator<ArrayList<String>> compAge = new Comparator<ArrayList<String>>() {
        public int compare(ArrayList<String> t1, ArrayList<String> t2) {
            if (t1.get(3).charAt(0) > t2.get(3).charAt(0))  return 1;
            if (t1.get(3).charAt(0) < t2.get(3).charAt(0))  return -1;
            return 0;
        }
        };
    
        lst.sort(compAge);
        System.out.println(lst);  
        return lst;
    }   
        



}





