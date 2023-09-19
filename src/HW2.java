import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input n:");
        int n = s.nextInt();
        int first = 1;
        int sum;
        for (int i = 1; i <= n ; i++) {
            sum = first * i;
            System.out.println(first + "*" + n + "=" + sum);
        }
    }
}
// Домашнее задание выполнено в структурной парадигме, если не учитывать
//тот факт, что код написан на java, ООП язык, но в лекции про ООП,
//не говорилось так, что это мы упустим!
//Выбрал структурную парадигму так как задача простая. Дальнейшее ее испрользование
//не планируется и развитие тоже, так что упаковывать это в процедуры нет смысла!
//Метод мейн процедурой не является
//
//
//



