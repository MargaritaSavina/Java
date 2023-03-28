// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

package hometask_2;
import java.util.Scanner;

public class hometask_2 {
    
    public static void main(String[] args) {
        String text = "roigjro gj rtkgjnrot rtgoj";   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для поиска:");
        String textFind = scanner.nextLine();

        Find(text,textFind);

        Rotation();
        
        StrCalc();
        
        Insert_str();


    }
    public static void Find(String txt, String str) {
        int value = txt.indexOf(str);
    System.out.println(value);
    }

    public static void Rotation() {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1:");
        String str1 = scanner.nextLine();
        System.out.println("Введите строку 2:");
        String str2 = scanner.nextLine();
        str2 = new StringBuilder(str2).reverse().toString();
        System.out.println(str1.equals(str2));
    }
    
    public static void StrCalc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int str1 = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Введите число 2:");
        int str2 = Integer.parseInt(scanner.nextLine()) ;
        StringBuilder result = new StringBuilder();
        
        result.append(str1).append(" + ").append(str2).append(" = ").append(str1 + str2).append("   ")
        .append(str1).append(" - ").append(str2).append(" = ").append(str1 - str2).append("   ")
        .append(str1).append(" * ").append(str2).append(" = ").append(str1 * str2);
        System.out.println(result);
    }
      
    
    public static void Insert_str() {
        StringBuilder str = new StringBuilder("2 + 3 = 5");
        System.out.println(str);
        
         int value = str.indexOf("=");
        str.deleteCharAt(value);
        str.insert(value, "равно");
        
        System.out.println(str);
    }
        
    

    
         
    
    
}

