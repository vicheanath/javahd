package PreMasterJava;

public class AllPossibilities {

    // static method
    public static int isAllPossibilities(int[] a) {
        int l = a.length;
        if (a.length == 0)
            return 0;
        for (int ki : a)
            if (ki < 0 || ki >= l)
                return 0;
        for (int i = 0; i < l; i++) {
            // multiplying all elements of the array with negative number
            a[Math.abs(i)] *= -1;
        }
        // if the array is AllPossibilities
        // the number of occurrence of zero should be exactly once
        int zeroCount = 0;
        for (int i = 0; i < l; i++) {

            if (a[i] > 0)
                return 0;
            if (a[i] == 0)
                zeroCount++;
            if (zeroCount > 1)
                return 0;
        }

        return 1;

    }

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        System.out.println(isAllPossibilities(new int[] { 1, 2, 0, 3 }));
        System.out.println(isAllPossibilities(new int[] { 3, 2, 1, 0 }));
        System.out.println(isAllPossibilities(new int[] { 1, 2, 4, 3 }));
        System.out.println(isAllPossibilities(new int[] { 0, 2, 3 }));
        System.out.println(isAllPossibilities(new int[] { 0 }));
        System.out.println(isAllPossibilities(new int[] {}));

    }

}