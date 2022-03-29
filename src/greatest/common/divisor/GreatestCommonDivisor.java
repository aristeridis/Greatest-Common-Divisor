/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greatest.common.divisor;
import java.util.*;

/**
 *
 * @author alexandrosaristeridis
 */
public class GreatestCommonDivisor {
    public Integer gcd(Integer p, Integer q) {
        int di = 1;
        int max=0;
        if(p>=q){
            max=p;
        }else{
            max=q;
        }
        for (int i = 1; i <=max; i++) {
            if (p%i==0 && q%i==0){
                di=i;
            }
        }
        return di;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GreatestCommonDivisor obj=new GreatestCommonDivisor();
        Scanner s = new Scanner(System.in);

        System.out.println("dose int1");

        int n=s.nextInt();
        System.out.println("dose int2");

        int k=s.nextInt();

        
        System.out.println(obj.gcd(n,k));
    }
    
}
