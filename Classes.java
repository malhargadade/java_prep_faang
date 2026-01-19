public class Classes {

    public int Add(int a, int b) {
        int r = a + b;
        return r;
    }

    public void sub(int a, int b) {

        // here local variable need to assign values this is not allowed in java to
        // declare variable inside method or a local varibale

        int r1 = a - b;
        System.out.println("hello substraction");
    }

    public boolean cond(int a) {
        // here this method returns the value as true or false, this method can be used
        // to validate any condit
        boolean r = a >= 10;
        return r;
    }

    public static void main(String[] args) {

        Classes obj = new Classes();
        obj.sub(40, 10);
        boolean r = obj.cond(2);
        int result = obj.Add(10, 20);
        System.out.println("cond:" + r);
        System.out.println("addition:" + result);
        // System.out.println("addition:" +result1);
    }
}
