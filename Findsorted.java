public class Findsorted {
    public static void main(String[] args) {
        int[] arr = {8,10,11,15,18,20};
        System.out.println("is arr sorted? "+ findsorted(arr));
    }
    public static boolean findsorted(int[] arr) {
        boolean ans = true;
        for(int i=1;i<arr.length; i++) {
            if(arr[i-1]>=arr[i]) {
                return false;
            }
        }
        return ans;
    }
}
