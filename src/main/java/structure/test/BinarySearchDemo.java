package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 下午5:25
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearchDemo {

    public static int binarySearch(int[] srcArray,int des){
         int low=0;
         int high=srcArray.length-1;
         while(low<=high){
             int middle=(low+high)/2;
             if(srcArray[middle]==des){
                 return middle;
             }else if(srcArray[middle]>des){
                 high=middle-1;
             }else{
                 low=middle+1;
             }
         }
        return -1;
    }

}
