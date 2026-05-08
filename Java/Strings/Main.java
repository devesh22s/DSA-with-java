package Java.Strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String pool -> it is a seperate memory structure inside the heap.

        //  String name = "Devesh"; // string is immutable 
        //  System.out.println(name);
        //  name = "Rahul";  // here we can't change the name object , but instead it we have create new object with thename rahul
        //  System.out.println(name);


        // ************************************************************************************
        // //  String comparision
        // // 1. == operator
        // String a = "Hello";
        // String b = "Hello";
        // System.out.println(a == b);

        // // 2. for values -> equals
        // System.out.println(a.equals(b));

        // ----------------------------------------------------------------------------------

        //  creating a different object with the same value -> it is only possible by new keyword
        // when we use new keyword the object will be created in heap memory not in string pool

        // String a = new String("ram");
        // String b = new String("ram");
        // System.out.println(a.equals(b));
        // System.out.println(a == b);


        // ----------------------------------------------------------------------------------
        // java root class object methods
        // all non-primitive datatype create objects and stores in heap memory

        // Integer num = new Integer(56);
        // System.out.println(num.toString());
        // System.out.println(num);

        // for non primitive datatype printing -> obj.toString()


        // ---------------------------------------------------------------------------------

        // pretty printing
        // float a = 123.1274f;
        // // System.out.printf("Formatted number is %.2f", a);
        // // System.out.printf("pie: %.3f", Math.PI);

        // System.out.printf("Hello my name is %s and I am %s", "Devesh", "cool");
         
        // %c  → Character
        // %d  → Decimal Integer
        // %e  → Scientific notation number
        // %f  → Floating point number
        // %i  → Integer
        // %o  → Octal number (base 8)
        // %s  → String
        // %u  → Unsigned integer
        // %x  → Hexadecimal number (base 16)
        // %t  → Date / Time
        // %n  → New line



        // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        // // operators 
        // System.out.println('a'+'b');
        // System.out.println("a"+"b");
        // System.out.println((char)('a'+3));
        // System.out.println("a"+3);
        // this is same step as after a few steps: "a"+"1"
        // integer will be converted to Integer that will call toString()

        // the operator  + is only work when one value is String




        // #########################################################################################3
        // ** Performance **

        // String series = "";
        // for(int i =0; i<26; i++){
        //     char ch = (char)('a'+i);
        //     // System.out.println(ch);
        //     series = series +ch;   // here new objects are created every time so complexicity is O(N^2)
        // }
        // System.out.println(series);

        // so we use String builder in which one object is created and changes made in the same object


        // String Builder -->

        // StringBuilder builder = new StringBuilder();
        // for(int i =0; i<26; i++){
        //     char ch= (char)('a'+i);
        //     builder.append(ch);
        // }
        // System.out.println(builder);


        // #########################################################################

        // String Methods ->
        String name = " Devesh Kumar ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('v'));
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
    
}
