/*import java.util.*;
public class Kedans {
    public static void kadensAlgo(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0; i<numbers.length; i++){
            curSum+=numbers[i];
            if(curSum<0){
                curSum=0;
            }
            maxSum=Math.max(maxSum,curSum);
        }
        System.out.print("maxsum is "+maxSum);
    }
    public static void main(String args[]){
        int numbers[]={-2,-1,4,-1,-2,1,5,-3};
        kadensAlgo(numbers);
    }
} */

import java.util.*;
public class Kedans {
    public static int kadensAlgo(int numbers[]){
        int cs=numbers[0];
        int ms=numbers[0];
        for(int i=1; i<numbers.length; i++){
            cs=Math.max(numbers[i],cs+numbers[i]);
            ms=Math.max(ms,cs);
        }
        return ms;
    }
    public static void main (String args[]){
        int numbers[]={7,-4,-1};
        System.out.print(kadensAlgo(numbers));
    }
}    
    