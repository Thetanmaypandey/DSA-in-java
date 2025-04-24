import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        HashSet<Integer> union = new HashSet<>();
        int arr[] = { 1, 2, 3, 4 };
        int arr1[] = { 2, 3, 4, 5, 6, 7 };

        for (int ele : arr)
            union.add(ele);
        for (int ele : arr1)
            union.add(ele);
        for (int ele : union)
            System.out.print(ele + " ");

    }
}
