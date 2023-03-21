package hometask1;



/**1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 * hometask1
 */
import java.util.Random;
public class hometask1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(20000);
        System.out.println("i = " + i);
        int n = num_highest_Bit(i);
        System.out.println("Hомер старшего значащего бита = " + n);
        int m1[] = multiples_num(n=1000,i); //n=1000 - чтобы сократить размер массива и проверить как работает
        print_array(m1);

    }
        
    static int num_highest_Bit(int a) {
            int num_bit = 0;
            while (a !=1) {
                a>>=1;
                num_bit++;
            }
            return num_bit;
        }
    
    static int[] multiples_num(int n_num, int i_num)  {        
        int count = 0;
        int num = i_num;
        while (num <= Short.MAX_VALUE) {
            if (num % n_num == 0) {
                count++;
            }
            num++;    
            
        }
        int arr[] = new int[count];
        int i = 0;
        while (i_num <= Short.MAX_VALUE) {
            if (i_num % n_num == 0) {
                arr[i] = i_num;
                i++;
                }
            i_num++;    
        }      
        
        return arr;
    } 
    
    static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    static int[] un_multiples_num(int n_num, int i_num)  {        
        int count = 0;
        int num = i_num;
        while (num <= Short.MAX_VALUE) {
            if (num % n_num != 0) {
                count++;
            }
            num++;    
            
        }
        int arr[] = new int[count];
        int i = 0;
        while (i_num <= Short.MAX_VALUE) {
            if (i_num % n_num != 0) {
                arr[i] = i_num;
                i++;
                }
            i_num++;    
        }      
        
        return arr;
    } 
}