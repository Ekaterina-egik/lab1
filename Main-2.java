
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // вводим 4 натуральных числа
        int X = in.nextInt(); // вместимость контейнера
        int A = in.nextInt(); // мусорный пакет 
        int B = in.nextInt(); // мусорный пакет
        int C = in.nextInt(); // мусорный пакет

        // используем условный оператор для решения
        int zapolnennysorom = 0; // наполненность контейнера
        int bednyagi = 0;     // люди, которым пришлось шагать до следующей мусорки
        // проверяем текущий объем контейнера+новый мешок, если нам хватает объема контейнера, то человек выбрасывает мусор и к текущему объем добавляется новый мусор иначе человек уходит на другую мусорку,а мы увеличиваем наш счетчик на 1
        if (zapolnennysorom + A <= X) { 
            zapolnennysorom += A; // ура!!! выбросили мусор
        } else {
            bednyagi += 1;     // не повезло, пакет не поместился
        }

        // повторяем с оставшимися пакетами
        if (zapolnennysorom + B <= X) {
            zapolnennysorom += B; // ура!!! выбросили мусор
        } else {
            bednyagi += 1;     // не повезло, пакет не поместился
        }

        if (zapolnennysorom + C <= X) {
            zapolnennysorom += C; // ура!!! выбросили мусор
        } else {
            bednyagi += 1;     // не повезло, пакет не поместился
        }

        out.println(bednyagi);//выводим ответ на экран
    }
}
