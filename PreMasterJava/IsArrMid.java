package PreMasterJava;

public class IsArrMid {

    public static int solve(int[] arr) {
        int l = arr.length;
        if (l == 0)
            return 0;
        if (l == 1)
            return 1;
        if (l % 2 == 0)
            return 0;
        int mid = l / 2;
        int midVal = arr[mid];
        for (int i = 0; i < l; i++) {
            if (i == mid)
                continue;
            if (arr[i] >= midVal)
                return 0;
        }
        return 1;
    }   

    public static void main(String args[]) {
        int[] case1 = { 1, 2, 3, 4, 5 }; // 0 (the middle element 3 is not strictly less than all other elements)
        int[] case2 = { 3, 2, 1, 4, 5 }; // 1 (the middle element 1 is strictly less than all other elements)
        int[] case3 = { 3, 2, 1, 4, 1 }; // 0 (the middle element 1 is not strictly less than all other elements)
        int[] case4 = { 1, 2, 3, 4 }; // 0 (no middle element)
        int[] case5 = {}; // 0 (no middle element)
        int[] case6 = { 10 };//
        System.out.println(solve(case1));
        System.out.println(solve(case2));
        System.out.println(solve(case3));
        System.out.println(solve(case4));
        System.out.println(solve(case5));
        System.out.println(solve(case6));
        
    }
}
