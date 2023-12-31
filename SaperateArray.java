public class SaperateArray {
    public static void main(String args[]) {
        int[] arr = {0,0,1};

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        sortbits(arr);
        System.out.println();

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void sortbits(int[] arr) {
        int  i=0;
        int j = arr.length-1;
        while(i<j) {
            if(arr[i]==0) {
                i++;
            }

            if(arr[j]==1) {
                --j;
            }

            if(arr[i]==1 && arr[j]==0) {
                arr[i]=0;
                arr[j]=1;
                i++;
                --j;
            }
        }
    }
}