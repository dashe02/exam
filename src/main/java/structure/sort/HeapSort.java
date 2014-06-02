package structure.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午10:50
 * To change this template use File | Settings | File Templates.
 */
public class HeapSort {
   public static void heapsort(int[] num,int n){
       //初建堆从n/2开始向根调整
       int i;
       for(i=n/2;i>=1;i--){
           adjustHeap(num,i,n);  //初建堆过程
       }
       for(i=n;i>1;i--){
           num[0]=num[i]; //将堆顶元素与第n,n-1,...2个元素相交换
           num[i]=num[1];
           num[1]=num[0]; //从num[1]到num[i-1]调整成新堆
           adjustHeap(num,1,i-1);
       }
   }
   public static void adjustHeap(int[] num,int s,int t){
       int i=s;
       int x=num[s];
       for(int j=2*i;j<=t;j=2*j){
           if(j<t&&num[j]<num[j+1])
               j=j+1;
           if(x>num[j])
               break;
           num[i]=num[j];
           i=j;
       }
        num[i]=x;
   }
    public static void main(String[] args){
        int[] a={0,5,40,32,2,2221};
        heapsort(a,5);
        for(int i=0;i<a.length-1;i++){
           System.out.println(a[i+1]);
        }
    }
}
