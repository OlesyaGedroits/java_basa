import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SeminarDwa {
    private static Logger logger = Logger.getLogger(SeminarDwa.class.getName());
    public static void main(String[] args) {
//         Задание №1
// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

// int n = 10;
// char c1 = 'x';
// char c2 = 'y';

// System.err.println(cheredovanie(n, c1, c2));
//     }

//     public static String cheredovanie(int n, char c1, char c2) {
//         String str = ""; //создаем строку
//         for (int i = 0; i < n/2; i++) {
//             str += Character.toString(c1)+Character.toString(c2); //сразу преобразуем сивол в строное выражение и складываем
//         }
//         return str;
//     }

//     public static String cheredovanie2 (int n, char c1, char c2) { //2ой метод, более быстрый со стрингбилдер
//         StringBuilder sb = new StringBuilder(n);
//         for (int i = 0; i < n/2; i++) {
//             sb.append(c1).append(c2); //апендом добавляем символ и тут не нужно преобразовывать, т.е. внутри апенда идет само преобразорвание
//         }
//         return sb.toString(); //стрингбилдер преобразовываем в строку
//     }


// Задание №2
// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. Результат: а4b3d2

//     String str = "aaaabbbcdd";
//     System.out.println(compreString(str));

// }

//     public static String compreString(String str){
//         StringBuilder sb = new StringBuilder();
//         char currentSymbol = str.charAt(0); //присваиваем для переменной для сравнения нулевой символ в строке
//         int count = 1; //счет начинаем с 1 т.к. уже нулевой элемент входит в счет
//         for (int i = 1; i < str.length(); i++) {
//             if (str.charAt(i)==currentSymbol){
//                 count++;
//             }
//             else {
//                 sb.append(currentSymbol).append(count);
//                 count=1;
//                 currentSymbol=str.charAt(i);
//             }
//         }
//         sb.append(currentSymbol).append(count);
//         return sb.toString();
    
//     }


//     Задание №3
// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает
// boolean значение).

//     System.out.println(isPalindrome("анна"));
// }

// public static boolean isPalindrome(String s) {
//     StringBuilder str = new StringBuilder();
//     for (int i = s.length()-1; i >=0; i--) {
//         str.append(s.charAt(i));
//     }
//     return s.equals(str.toString());
// }



// Задание №4
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

// int count = 100;
// String word = "TEST";
// String words = repeatWord(count, word);
// //System.out.println(words);
// writeToFile(words, "file.txt");
//     }

//     public static String repeatWord(int count, String word){
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < count; i++) {
//             sb.append(word).append(" ");
//         }
//         return sb.toString();
//     }

    // public static void writeToFile(String text, String fileName) {
    //     try (FileWriter fileWriter = new FileWriter(fileName)) {
    //         fileWriter.write(text);
    //         System.out.println("Данные успешно записаны в файл");
    //     } catch (Exception e) {
    //         System.out.println("Ощибка записи файла");
    //     }       
    // }
    // Задание №5
    // Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    // Напишите метод, который запишет массив, возвращенный предыдущим     методом в файл.
    // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

    initLoger();
    logger.info("Start programm");
    String[] contentFolder = getContentFolder(".");
    //System.out.println(Arrays.toString(contentFolder));
    writeToFile(contentFolder, "privet.txt");
        
    }

    public static String[] getContentFolder(String folder) {
        File file = new File(folder);
        return file.list();
    }

    public static void writeToFile(String[] arrayString, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (String str : arrayString) {
                fileWriter.write(str);
                fileWriter.write(System.lineSeparator());
            }            
            logger.info("Данные успешно записаны в файл");
        } catch (Exception e) {
            logger.info("Ошибка записи файла");
        }       
    }

    public static void initLoger() { //мпетод создает файл для записи лога
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter(); //задаетс формат текста в файле (не обязательно)
            fileHandler.setFormatter(formatter); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
