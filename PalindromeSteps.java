public class PalindromeSteps {

    // Метод для проверки, является ли число палиндромом
    public static boolean isPalindrome(long number) {
        String str = Long.toString(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Основной метод для поиска палиндрома
    public static int findPalindrome(long number) {
        int steps = 0;
        while (steps < 20) {
            if (isPalindrome(number)) {
                return steps;  // Возвращаем количество шагов
            }
            long reversed = Long.parseLong(new StringBuilder(Long.toString(number)).reverse().toString());
            number += reversed;
            steps++;
        }
        System.err.println("Палиндром не найден за 20 шагов");
        return -1;
    }
}
