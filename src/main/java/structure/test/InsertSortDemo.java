package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午10:15
 * To change this template use File | Settings | File Templates.
 */
public class InsertSortDemo {
    public static void sort(int[] a){
        int sen,j;
        for(int i=1;i<a.length;i++){
            j=i-1;
            sen=a[i];
            while(j>=0&&sen<a[j]){
               a[j+1]=a[j];
                j--;
            }
            a[j+1]=sen;
        }
    }
     public static void main(String[] args){
         int[] a={1,8,2,0,4,7};
         sort(a);
         for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
         }
     }
}
