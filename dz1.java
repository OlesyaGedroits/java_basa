import java.util.Scanner;
public class dz1 {
    public static void main(String[] args) {
        
// Задача 1:
// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// Напишите метод, который принимает число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.

    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("Введите число: ");
    //     String name = iScanner.nextLine();
    //     int n = Integer.parseInt(name);
    //     int sum = 0;
    //     if (n<1){
    //         System.out.print(-1);
    //     }
    //     else {
    //         sum = (1+n)*(1+n)/2-(1+n)/2;
    //     }
    //     System.out.println(sum);
    // }

    // public int countNTriangle(int n){ // метод для автотестов
    //       int sum = 0;
    //       if (n<1){
    //           sum = -1;
    //       }
    //       else {
    //           sum = (1+n)*(1+n)/2-(1+n)/2;
    //       }
    //   return sum;
    //   }


// Задача 2
// Напишите функцию printPrimeNums, которая выведет на экран все простые числа
// в промежутке от 1 до 1000, каждое на новой строке.
     
         
// for (int a = 2; a < 20; a++) {
//     int i=2;
//     boolean prostoe = true;
//     while (i<=a/2) {
//         if (a%i==0) {
//             prostoe = false;
//             break;
//         }
//         else i++;
//     }
//     if (prostoe) System.out.println(a);
// }
       

            // пример з автотестов
                // for (int i = 2; i <= 1000; i++) {

                //     boolean isPrime = true;

                //     // Проверка, является ли число i простым
                //     // Проход по циклу до корня числа,
                //     // т.к. дальше нет смысла искать, делителей нет.
                //     for (int j = 2; j <= Math.sqrt(i); j++) {
                //         if (i % j == 0) {
                //             isPrime = false;
                //             break;
                //         }
                //     }
                //     // Если число i простое, вывод его на экран
                //     if (isPrime)
                //         System.out.println(i);
                // }
                // }
                // }



// В методе calculate класса Calculator реализовать калькулятор,
// который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.
// В классе необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке
// "Некорректный оператор: 'оператор'".


public double calculate(char op, double a, double b) {

double result = 0.0;

      switch(op) {
          case '+':
              result = a + b;
              break;
          case '-':
              result = a - b;
              break;
          case '*':
              result = a * b;
              break;
          case '/':
              if (a != 0) {
                  result = (double) a / b;
              } else {
                  System.out.println("Ошибка - делить на ноль нельзя");
              }
              break;
          default:
              System.out.println("Error: Invalid operation");
      }

      return result;

  }
}
       
}
}
