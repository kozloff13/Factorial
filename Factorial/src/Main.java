/**
 * Вычисление факториала
 */

public class Main {

    public static void main(String[] args) {

        Recur recur = new Recur();
        System.out.println(recur.fact(10));

        NoRecur norec = new NoRecur();
        System.out.println(norec.factorial(10));
    }
}
