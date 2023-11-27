package Task04;
public class DoWhile {
    public static void main(String[] args) {
        int number = 1;
        do {
            System.out.print(number + " ");
            number *= 2;
        } while (number <= 512);
    }
}
