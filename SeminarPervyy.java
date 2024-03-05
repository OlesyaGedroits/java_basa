import java.util.Calendar;
import java.time.LocalDateTime;
import java.util.Scanner;

public class SeminarPervyy {
    // public class main{
    // public static void main(String[] args) {
    // int[] nums = {3, 2, 2, 3};
    // int val = 3;
    // int start = 0;
    // int end = nums.length - 1;

    // while (start < end) {
    // if (nums[start] == val) {
    // int temp = nums[start];
    // nums[start] = nums[end];
    // nums[end] = temp;
    // end--;
    // } else {
    // start++;
    // }
    // }

    // // Выводим измененный массив nums
    // for (int i = 0; i < nums.length; i++) {
    // System.out.print(nums[i] + " ");
    // }
    // }

// Задача 0:
// Настроить проект, вывести в консоль “Hello world!”.
// Вывести в консоль системные дату и время.

    // public static void main(String[] args) {
    //     System.out.println("Hello, World!");
    //     System.out.println(LocalDateTime.now());

    // }



//     Задание №1
// Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”


    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner (System.in, "ibm866");
    //     System.out.println("Введите ваш имя: ");
    //     String name = scanner.nextLine();
    //     scanner.close();
    //     System.out.println("Привет, " + name);

    // }



//     Задание №2
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
    // public static void main(String[] args) {

    //     int[] array = {1,1,1,1,0,1,1,1};
    //     int maxCount = getMaxOnes(array);
    //     System.out.println(maxCount);
    // }

    // private static int getMaxOnes(int[] array) {
    //     int count = 0;
    //     int maxCount = 0;
    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i]==1){
    //             count++;
    //             if (count>maxCount){
    //                 maxCount=count;
    //             }
    //        // maxCount = count>maxCount? count: maxCount; //литеральное выражение вместо предыдущего ифа. читать как макскоунт равен (при условии коунт больше макскаунт) каунту. двоеточие - это иначе, иначе макскаунт равен макскаунту
    //         }
    //         else{
    //             count=0;   
    //         }
    //     }
    //     return maxCount;
    // }


    // Задание №3
    // Дан массив nums = [3,2,2,3] и число val = 3.
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    // Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

    public static void main(String[] args) {

        // int [] nums = {3,2,2,3};
        // int val = 3;
        // int start = 0;
        // int end = nums.length -1;

        // while (nums[end]==val) {
        //     end--;            
        // }
        // while (start<end) {
        //     if (nums[start] == val){
        //         int temp = nums[start];
        //         nums[start]=nums[end];
        //         nums[end]=temp;
        //         end--;
        //     }
        //     else{
        //         start++;
        //     }
        // }

        // //вывод ассива
        // for (int num : nums) {
        //     System.out.print(num+", ");
        // }


//         Задание №4
// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

        String[] strs = {"flower", "flow", "flight"};
        String result = getPrefix(strs);
        System.out.print(result);
    }

    private static String getPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix=prefix.substring(0, prefix.length()-1);
                if( prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

}

