package Utility;

/**
 * 本类是数组工具类，完成输出数组内容，数组冒泡排序
 */

public class ArrayUtility {

    //输出int数组内容
    public static void IntOutPut(int[] a){
        for (int j:a) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //输出double数组内容
    public static void DoubleOutPut(double[] a){
        for (double j:a) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //输出字符串数组内容
    public static void StringOutPut(String[] a){
        for (String j:a) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //对int数组进行冒泡排序
    public static void BubbleSort(int[] a){
        int len=a.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                int temp;
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

}
