public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i: arr) {
            System.out.print(i+ " ");
        }

        rotate(arr);
        System.out.println();

        for(int i: arr) {
            System.out.print(i+" ");
        }

    }
    public static void rotate(int[] arr) {
        int temp = arr[0];
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}