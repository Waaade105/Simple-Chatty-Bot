import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [] array = new int[len];
        int minValue = Integer.MAX_VALUE;

        for (int nums : array){
            array[nums] = scanner.nextInt();
            if (array[nums] < minValue){
                minValue = array[nums];
            }
        }
        System.out.println(minValue);

    }
}