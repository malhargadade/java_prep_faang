public class Methods {

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



    //method overloading
     public int Add(int a) {
        int r = a;
        return r;
    }
    
    public static void main(String[] args) {

        Methods obj = new Methods();
        obj.sub(40, 10);
        boolean r = obj.cond(2);
        int result = obj.Add(10, 20);
        int r1= obj.Add(10);
        System.out.println("cond:" + r);
        System.out.println("addition:" + result);
        System.out.println(":method overloading value: " + r1);
        // System.out.println("addition:" +result1);
    }
}
