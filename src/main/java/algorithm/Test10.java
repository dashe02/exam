package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-14
 * Time: 下午7:48
 * To change this template use File | Settings | File Templates.
 */
public class Test10 {
    public static void bubbleSort(int[] a){
        boolean flag=false;
        int temp;
        for(int i=0;i<a.length-1;i++){
            flag=true;
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=false;
                }
            }
        }
    }
    public static void main(String[] args){
         int[] a={1,4,6,8,0,2};
         bubbleSort(a);
         for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
         }
    }
}
