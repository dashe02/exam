package algorithm.exist.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午6:51
 * To change this template use File | Settings | File Templates.
 */
public class Bubble {
     public static void bubble(int[] a){
         boolean flag=false;
          for(int i=0;i<a.length-1;i++){
              flag=true;
              for(int j=0;j<a.length-i-1;j++){
                  if(a[j+1]<a[j]){
                      //swap(a[j],a[j+1]);
                      int temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
                      flag=false;
                  }
              }
              if(flag){
                  break;
              }
          }
     }
    public static void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;
    }
}
