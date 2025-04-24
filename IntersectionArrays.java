import java.util.HashSet;

public class IntersectionArrays {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        int arr[] = { 1, 2, 3, 4 };
        int arr1[] = { 2, 3, 4, 5, 6, 7 };

        for (int ele : arr)
            set.add(ele);

        for (int ele : arr1)
            if(set.contains(ele))
                intersection.add(ele);

        for (int ele : intersection) {
            System.out.print(ele + " ");
        }
        
            

    }
}
