package String;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOperator {
    public static void main(String[] args) {
        System.out.println("a"+"b");
        System.out.println(1+1);
        System.out.println("a"+3);
//        this is same as after a few steps: "a" + "1"
//         integer will be converted to Integer that will call toString()

        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println('a'+'b');
        System.out.println("A"+ new ArrayList<>());
        System.out.println("A"+ Arrays.toString(new int[]{1,2,3}));
//        int ans  = new Integer(56);
//        System.out.println(new ArrayList<>() + new Integer(56));
//        System.out.println(new ArrayList<>() + Arrays.toString(new int[]{4,5,6}) );
        System.out.println(new ArrayList<>() + " " + new int[]{1,2,3});


    }
}
