public class Morre_voting {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,2,2,2,3,4,5,6,7,1,1,1,1,1,1};
        int major = findmajor(arr);
        System.out.println("Major element is  :"+major);
    }
    public static int find_candidate (int[] arr) {
        int index =0;
        int count = 0;
        for(int i=0; i< arr.length; i++) {
            if (arr[i] == arr[index]) {
                count++;
            }
            else count--;
            if (count==0) {
                index = i;
                count = 1;
            }
        }
        return index;
    }

    public static int findmajor(int[] arr) {
        int index = find_candidate(arr);
        int n = arr.length;
        int count =0;
        for (int j : arr) {
            if (arr[index] == j) {
                count++;
            }
        }
        if(count > n/2) {
            return arr[index];
        }
        return -1;
    }
}
