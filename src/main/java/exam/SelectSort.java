package exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 下午11:57
 * To change this template use File | Settings | File Templates.
 */
public class SelectSort {
    public static void selectSort(int[] source){
        for(int i=0;i<source.length;i++){
            for(int j=i+1;j<source.length;j++){
                if(source[i]>source[j]){
                    swap(source,i,j);
                }
            }
        }
    }
    private static void swap(int[] source,int x,int y){
        int temp=source[x];
        source[x]=source[y];
        source[y]=temp;
    }
    public static void main(String[] args){
        int[] a={4,2,1,6,0,-5,1,1};
        int i;
        selectSort(a);
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
