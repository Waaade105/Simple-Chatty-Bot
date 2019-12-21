import java.util.*;

public class Main {

    public static String[] reverse(String [] words) {
        String [] reverseOrder = new String[words.length];

        for(int i = 0 ; i < words.length/2 ; i++){
            String temp = words[i];
            words[i] = words[words.length-i-1];
            words[words.length-i-1] = temp;
        }
        return words;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));

//        Arrays.stream(reversed).forEach(s -> System.out.println(s + " "));
    }
}