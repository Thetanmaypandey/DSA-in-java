public class MovingNonZeroes1 {
    MovingNonZeroes1()
    {
        System.out.println("the object of the public class has made successfully ");
        System.out.println();
        System.out.println();
    }
    void moveZeroesAtTheEnd(int arr[]){

        /*
         * start 
         * idx <-- 0
         * loop through the array with index i from 0 to arr.length -1:
         *    if arr[i] is not equals to 0:
         *      1) if i is not equals to idx :
         *              swap arr[i] with arr[idx]
         *      2) increment idx by one.
         * end of loop
         */
        int idx =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0)
            {
                if(i != idx){
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                }
                idx++;
            }
        }
    }
    public static void displayArray(int arr[]) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        MovingNonZeroes1 ob = new MovingNonZeroes1();
        int arr[] = {0,2,3,4,0,0,0,5,6,7};
        displayArray(arr);

        ob.moveZeroesAtTheEnd(arr);
        displayArray(arr);
        
    }
}
