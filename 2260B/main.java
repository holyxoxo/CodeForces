import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt() ;
        while(t>0){
            t--;
            long x = sc.nextLong() ;
            long y = sc.nextLong( );
            long k = sc.nextLong() ;

            long ans = 0 ;
            long diff = y - x ;

            while(k>0 && x<=diff) {
                long mod = y % x ;
                ans+=mod ;
                x++;
                y++;
                k--;

            }

            ans += k * diff ;

            System.out.println(ans);
        }
        sc.close();
    }
}
