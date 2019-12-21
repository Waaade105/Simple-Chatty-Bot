import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int len = scanner.nextInt();
//        int[] array = new int[len];
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        boolean isTrue = true;
//        for (int nums : array) {
//            if (array[nums] == n && array[nums + 1] == m || array[nums + 1] == n && array[nums] == m) {
//                isTrue = false;
//            }else{
//                isTrue = true;
//            }
//        }
//        System.out.println(isTrue);



        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i =0 ; i < len ; i++){
            array[i] = scanner.nextInt();
        }
//        for(int nums: array){
//            array[nums] = scanner.nextInt();
//        }
//        System.out.println("give two numbers");
        int m = scanner.nextInt();
//        scanner.nextLine();
        int n = scanner.nextInt();
//        scanner.nextLine();

        boolean isTrue = true;
        for (int i=0 ; i < array.length-1; i++) {
            if (array[i] == n && array[i + 1] == m || array[i + 1] == n && array[i] == m) {
                isTrue = false;
                break;
            }else{
                isTrue = true;
            }
        }
//        for (int nums: array) {
//            if (array[nums] == n && array[nums + 1] == m || array[nums + 1] == n && array[nums] == m) {
//                isTrue = false;
//            }else{
//                isTrue = true;
//            }
//        }
        System.out.println(isTrue);

    }
}