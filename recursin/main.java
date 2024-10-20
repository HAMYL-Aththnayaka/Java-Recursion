import java.util.*;
public class main{
    public static void  main(String [] args){
     Scanner read = new Scanner (System.in);
     System.out.println("Enter a number Of your Choice: ");    
        int svalue=read.nextInt();
        int result = sum(svalue);
        System.out.println(result);
    }


public static int sum(int k){
    if (k > 0){
        return k + sum(k - 1);
    }
    else{
        return 0;
    }
    }
}