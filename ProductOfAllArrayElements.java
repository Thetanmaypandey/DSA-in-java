public class ProductOfAllArrayElements {
    public static double productOfElements(int arr[])
    {
        double res =1;
        for(int ele : arr)
        {
            res *= ele;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,22,2,4,8};
        for(int ele : arr)
            System.out.print(ele +" ");
        System.out.println();
        double res = productOfElements(arr);
        System.out.println(res);
    }
}
