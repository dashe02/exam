package demo.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 上午11:48
 * To change this template use File | Settings | File Templates.
 */
public class SelectSort {
    public static void selectSort(int[] a){
       int position;
       int len=a.length;
       for(int i=0;i<len;i++){
           position=i;
           for(int j=i+1;j<len;j++){
               if(a[position]>a[j]){
                   position=j;
               }
           }
           int temp=a[i];
           a[i]=a[position];
           a[position]=temp;
       }
    }
    public static void main(String[] args){
        int[] a={1,4,2,8,0,10};
        selectSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
