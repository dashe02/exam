package structure.sorttest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-31
 * Time: 上午10:56
 * To change this template use File | Settings | File Templates.
 */
public class SelectSort {
    public static void selectSort(int[] a){
           int len=a.length;
           int position;
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
        int[] a={1,7,2,6,0,10};
        selectSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
