package exam1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-4
 * Time: 下午9:50
 * To change this template use File | Settings | File Templates.
 */
public class GetMax {
    public static int  maxNum(int[] a,int n){
        int sum=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(b<0)
                b=a[i];
            else
                b+=a[i];
            if(sum<b)
                sum=b;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] a={1,-2,3,10,-4,7,2,-5};
        System.out.println(maxNum(a,a.length));
    }
}
