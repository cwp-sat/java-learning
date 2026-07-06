package learning;

import java.util.Arrays;

public class BasicArrayOperations {
    public static void main(String[] args) {
//        int[] arr1 = {1,7,3,-2,5};
//        int[] arr2 = new int[5];
//        arr2[0] = 10;
//        arr2[1] = 20;
//        for (int i=0;i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }
//        System.out.println(Arrays.toString(arr2));
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr3 = Arrays.copyOf(arr1,2);
//        int[] arr4 = Arrays.copyOfRange(arr1,1,3);
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));
        int[][] arr5={
                {1,2,3},
                {4,5,6}
        };
        int[][] arr6=new int[3][3];
        arr6[0][2]=100;
        arr6[1][2]=200;
        for(int i=0;i<arr5.length;i++){
            for (int j=0;j<arr5[i].length;j++){
                System.out.print(arr5[i][j]+" ");
            }
        }
        for(int i=0;i<arr6.length;i++){
            for (int j=0;j<arr6[i].length;j++){
                System.out.println(arr6[i][j]);
            }
        }

    }
}
