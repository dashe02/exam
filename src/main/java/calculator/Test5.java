package calculator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午7:12
 * To change this template use File | Settings | File Templates.
 */
public class Test5 {
        public static int getMax(int[] a,int n){
            int b=0;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                if(b<0)
                    b=a[i] ;
                else
                    b+=a[i];
                if(sum<b)
                   sum=b;
            }
            return sum;
        }
    public static void main(String[] args){
        int[] a={1,-2,3,10,-4,7,2,-5};
        System.out.println(getMax(a,a.length));
    }
}
