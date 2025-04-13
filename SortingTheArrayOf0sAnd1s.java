public class SortingTheArrayOf0sAnd1s {
    public static void main(String[] args) {
        int arr[] = { 1,1,0,0,1,1,0,0,1,0,1,0 };
        int n = arr.length;// finding the size of the array

        System.out.println("Your unsorted Array is : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int i = 0, j = n - 1;// two pointers
        while (i < j) {
            if (arr[i] == 0)
                i++;
            else if (arr[j] == 1)
                j--;
            else {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }

        }
        System.out.println("Your sorted Array is : ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
