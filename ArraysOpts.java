public class ArraysOpts {


    public int arrr1(int arrx[], int b) {
        int arr_val = arrx[0];

        return arr_val + b;

    }


    
    public static void main(String[] args) {

        // typ1
        int[] arr = new int[3];

        // typ2
        int arr1[] = { 10, 20 };

        // typ3
        int arr2[] = new int[] { 2, 3, 4 };

        System.out.println("f_value " + arr[0]);

        // access array in forloop (print)
        for (int in = 0; in < arr2.length; in++) {
            System.out.print(" | arr value " + in + ": " + arr2[in]);
        }

        // Arrat as reference
        ArraysOpts objArraysOpts = new ArraysOpts();
        int[] a = new int[2];
        a[0] = 10;
        int result = objArraysOpts.arrr1(a, 2);
        System.out.println("\narr_ref" + result);
    }
}
