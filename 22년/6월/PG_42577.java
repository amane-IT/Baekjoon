import java.util.Arrays;

public class PG_42577 {

    public static void main(String[] args) {
        String[] book = {"119", "97674223", "1195524421"};
        System.out.println(solution(book));
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean result = true;

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {

                result = false;
                break;
            }
        }
        return result;
    }
}
