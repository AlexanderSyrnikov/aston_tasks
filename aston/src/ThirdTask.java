import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        thirdTask(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
    public static void thirdTask(int[] a) {
        Arrays.stream(a)
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
