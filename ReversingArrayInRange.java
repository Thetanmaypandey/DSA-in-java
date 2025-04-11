public class ReversingArrayInRange {
    public static void reverseArrayInRange(int[] arr,int start ,int last )
    {
        int n = arr.length;
       
        while(start <= last)// the reversal logic with the while loop 
        {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp ; 
            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.print("The Array before Reversal : ");
        for (int ele : arr) {
            System.out.print(ele+" ");
        } System.out.println();

        reverseArrayInRange(arr,3,6);

        System.out.print("The Array after Reversal : ");
        for (int ele : arr) {
            System.out.print(ele+" ");
        } System.out.println();
    }
}
