class Variable {
    public static void main(String[] args) {
        // Create Varriable non value
        int number1;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        // Create Variable value
        int number = 10;
        float count = 20.5f;
        char c = 'A';
        boolean s = true;

        // Create Variables
        int a = 0, b = 1, d = 2;

        //Show
        a=50;
        System.out.println("ค่า "+a);

        //Cost
        final int num = 10 ;
        //num= 50; cannot assign a value to final variable num
        System.out.println("ค่าคงที่ "+num);

        //Global and Local
        //Global
        int e1 = 11 ;
        {
            //Local
            int e2 = 12;
            System.out.println(e1);//Yes
            System.out.println(e2);//Yes
        }
        System.out.println(e1);//Yes
        //System.out.println(e2);No

        //Type Max - min
        //Type.[MAX&MIN]_VALUE Ex.
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        //Type Casting
        int numint = 10;
        double numdouble = 10;
        System.out.println("Integer : "+numint);//10
        System.out.println("Double : "+numdouble);//10.0
        //int to double
        //double variable = varable[Type int]
        //double to int
        //int variable = (int)variable[Type double]
        //String to double
        //double variable = Double.pareDouble(variable[Type str])
        //int to String
        //String variable = String.valueof(variable[Type int])

        //Check type
        //Class Object
        Integer nums = 1;
        //variable instanceof Class
        boolean result = nums instanceof Integer;
        System.out.println("Check Type : "+result);
    }
}
