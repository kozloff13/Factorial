/**
 * Нерекурсивный метод
 */

public class NoRecur {

    int factorial(int n) {
        int fact = 1;
        for (; n > 0; fact *= n--);
        return fact;
    }
}
