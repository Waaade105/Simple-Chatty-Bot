import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            number = scanner.nextInt();
//            sum += number;
            if (sum < 1000) {
                sum += number;
//                System.out.println("sum = " + sum);

            }
//            if (number == 0) {
//                break;
//            }

        } while ( number != 0);
//        System.out.println(sum - 1000);


        if (sum >= 1000) {
            System.out.println(sum - 1000);
        }else {
            System.out.println(sum);
        }
    }
}





// || sum >= 0