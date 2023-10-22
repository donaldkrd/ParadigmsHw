import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random rand = new Random();
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillList(list, 10);
        System.out.println("Рандомный список");
        System.out.println(list);
        System.out.println("Сортировка в императивным стиле");
        System.out.println(sortListImperative(list));
        System.out.println("Сортировка в декларативном стиле");
        System.out.println(sortListDeclarative(list));
    }
    /**
     * Сортировка выполнена в императивном стиле
     */
    public static List<Integer> sortListImperative(List<Integer> numbers) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                    flag = true;
                }
            }
        }
        return numbers;
    }
    /**
     * Сортировка в декларативном стиле
     */
    public static List sortListDeclarative(List numbers){
        Collections.sort(numbers);
        return numbers;
    }
    /**
     * Метод заполнения списка случайными числами
     */
    public static void fillList(List list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(0, 100));
        }
    }
}