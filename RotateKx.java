public class RotateKx {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i: arr) {
            System.out.print(i+ " ");
        }

        rotate(arr,5);
        System.out.println();

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
    public static void reverse(int[] arr, int low, int high) {
        while(high>=low) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;

            high--;
            low++;
        }
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reverse(nums,0 ,n-1);
        reverse(nums,0, k-1);
        reverse(nums, k, n-1);
    }
}