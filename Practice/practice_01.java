package Practice;

import java.util.ArrayList;

public class practice_01 {

    public static void voidSum(int x,int y){
        int z= x+y;
        System.out.println("The result of void sum is is "+ z);

    }//end of the void Sum

    public static int returnSum(int x, int y){

        int z= x+y;
        System.out.println("The result of return Sum is "+ z);
        return z;

    }

    public static void main(String[] args) {
        practice_01.voidSum(2,3);
       int a=  practice_01.returnSum(2,3);
        System.out.println(a+200);
    }

}//end of the java class
