package algorithm.sort.find;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-18
 * Time: 上午10:34
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {

      public static int binarySearch(int[] srcArray,int des){
             int low=0;
             int high=srcArray.length-1;
             while (low<=high){
                 int middle=(low+high)/2;
                 if(des==srcArray[middle]){
                     return middle;
                 }else if(des<srcArray[middle]){
                     high=middle-1;
                 }else{
                     low=middle+1;
                 }
             }
          return -1;
      }
    public static void main(String[] args){
        int[] srcArray={1,3,4,6,8,9};
        System.out.println(binarySearch(srcArray,3));
    }
}
