import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String firstString = console.nextLine();
        System.out.println("Введите вторую строку");
        String secondString = console.nextLine();
        secondTask(firstString, secondString);
        console.close();
    }
    
    public static void secondTask(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
