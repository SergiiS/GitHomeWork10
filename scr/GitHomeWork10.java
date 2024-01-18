
public class GitHomeWork10 {
    public static void main(String[] args) {

        int count = 0, value = 0;
        while (count < 100) {
            String s = String.valueOf(++value);
            if ((s.contains("4") || s.contains("9"))) continue;
            System.out.println(value);
            count++;
        }
        System.out.println("Усього шатлів: " + count + " штук");
    }
}