package dailyTest.firstDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-7
 * Time: 上午9:08
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
                 int temp=a[i];
                 a[i]=a[position];
                 a[position]=temp;
            }
        }
    }
    public static void main(String[] args){
        int[] a={1,3,7,4,9,0};
        selectSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
