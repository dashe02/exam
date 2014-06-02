package structure.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午8:08
 * To change this template use File | Settings | File Templates.
 */
public class SelectSort {
    public static void sort(int[] a){
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
          int[] a={4,7,2,1,0,10,8};
          sort(a);
          for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
          }
    }
}
