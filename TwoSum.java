public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1,6,9,3,8,2,4};
        int n = arr.length;
        int target = 15;

        for(int i = 0; i<n ; i++)
        {
            boolean flag = false;
            for(int j = i+1; j<n; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    System.out.println(i +" " + j);
                    flag = true;
                    break;
                }
            }
            if(flag) break ;
        }
    }
}
