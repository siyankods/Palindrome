public class PalindromeSteps {

    // Метод для проверки, является ли число палиндромом
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Основной метод для поиска палиндрома
    public static int findPalindrome(int number) {
        int steps = 0;
        while (steps < 20) {
            if (isPalindrome(number)) {
                return steps;  // Возвращаем количество шагов
            }
            int reversed = Integer.parseInt(new StringBuilder(Integer.toString(number)).reverse().toString());
            number = number + reversed;
            steps++;
        }
        System.err.println("Palindrome not found within 20 steps");
        return -1;  // Если палиндром не найден за 20 шагов
    }
}
