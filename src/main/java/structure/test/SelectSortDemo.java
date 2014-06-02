package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-30
 * Time: 下午8:15
 * To change this template use File | Settings | File Templates.
 */
public class SelectSortDemo {
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
        int[] a={1,6,3,2,0,10};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
