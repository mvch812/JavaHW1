//Написать программу вычисления n-ого треугольного числа. http://ru.wikipedia.org/wiki/Треугольное_число

import java.util.Scanner;

public class HomeWork1 {
    // static int triang_num (int n) {               //альтернативное решение через общую формулу

    //     return (n*(n+1))/2;
    // }
    static int triang_num (int n) {                  // решение через рекурсию
        if(n==1)return 1;
        return n + triang_num(n-1);
        }

    static int read_num (){
    Scanner iScanner = new Scanner(System.in);
   
    boolean flag = iScanner.hasNextInt();
    if (flag == true)  { 
    int i = iScanner.nextInt();      
    iScanner.close();
    return i;
    }else{
        
        iScanner.close();
        return 0;
        } 
    }
    public static void main(String[] args) {
        
        System.out.printf("Какое по порядку треугольное число хотите получить? Tn:");
        int k=read_num ();
       if (k==0){
        System.out.printf("Вы ввели не натуральное число!"); 
       }else{
        System.out.println(triang_num(k));
    }
    }
    
}
