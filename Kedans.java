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

    
