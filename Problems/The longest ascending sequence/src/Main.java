import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int counter = 1; // bo pierwsza cyfra jaka wpisze musi nalezec juz do sekwencji
        int seqLength = 0;
//        arr[0] = scanner.nextInt();

        if (len == 1) {
            System.out.println(1);
        } else {

            for (int i = 0; i < len ; i++) {
                arr[i] = scanner.nextInt();
                if (i == 0) {
                    continue;
                }
//            System.out.println("array " + i + "-1" + " = " + arr[i-1]);
                if (arr[i - 1] < arr[i]) {
                    counter++;
                } else if (arr[i - 1] >= arr[i]) {
                    if (counter > seqLength) {
                        seqLength = counter;
                    }
                    counter = 1;
                    continue;
                }

            }


//        System.out.println(counter);
            if (seqLength > counter) {
                System.out.println(seqLength);
            }else {
                System.out.println(counter);
            }

        }
    }
}