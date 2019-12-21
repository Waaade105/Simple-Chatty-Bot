import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] charTable = input.toCharArray();
//        boolean isTrue = false;
        int counterAscending =0;
        int counterDescending =0;

//        table[0] = 5;
//        System.out.println(table.length);

        for (int i = 0; i < charTable.length-1; i++) {

            // ascending order
            if ((charTable[i] <= charTable[i + 1]) && (charTable[i+1] != '0')) {
                counterAscending++;
                // descending order
            }
            if ((charTable[i] >= charTable[i + 1]) && (charTable[i+1] != '0')) {
                counterDescending++;
            }
//            System.out.println("chartable [i+1] " + charTable[i+1]);
        }
        if (counterAscending == charTable.length-2 || counterDescending == charTable.length-2){
            System.out.println("true");
//                System.out.println(charTable.length);

        }else{
            System.out.println("false");
//                System.out.println(charTable.length);
        }
    }
}