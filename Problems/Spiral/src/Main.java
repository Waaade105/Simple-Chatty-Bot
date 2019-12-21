import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[][] dimArr = new int[5][];
        dimArr[0] = new int[]{1, 2, 3, 4, 5,1,2};
        dimArr[1] = new int[]{0, 2, 10, 4, 0};
        dimArr[2] = new int[]{1, 29, 33, 2, 5};
        dimArr[3] = new int[]{101, 29, 33, 4, 5};
        dimArr[4] = new int[]{108, 9, 68, 4, 5};

        int l = dimArr.length;
        System.out.println(l);
        System.out.println(dimArr[0].length);
        for (int i = 0; i < dimArr.length; i++) {
            System.out.println(Arrays.toString(dimArr[i]));
        }



        int [][] arr2 = new int[3][8];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        arr2[0][7] = 2;
        arr2[1][1] = 8;
        arr2[2][0] = 5;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}