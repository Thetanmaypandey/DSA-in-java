public class ReversingArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        System.out.print("The Array before Reversal : ");
        for (int ele : arr) {
            System.out.print(ele+" ");
        } System.out.println();
        System.out.print("The Array after Reversal : ");

        int i = 0;
        int j = n-1;
        while(i <= j)// the reversal logic with the while loop 
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ; 
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }System.out.println();

        // the reversal same logic with for loop

        for(int first = 0 , second = n-1;  first <= second ; first++,second--)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        System.out.print("The Array after again Reversal : ");

        for (int ele : arr) {
            System.out.print(ele+" ");
        }System.out.println();

    }
}
