package demo.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-2
 * Time: 下午2:50
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {
    public static int binarySearch(int[] srcArray,int src){
        int low=0;
        int high=srcArray.length-1;
        while(low<=high){
            int middle=(low+high)/2;
            if(src==srcArray[middle]){
                return middle;
            }else if(src<srcArray[middle]){
                high=middle-1;
            }
            else {
                low=middle+1;
            }
        }
        return -1;
    }
      public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){
            int middleIndex=(beginIndex+endIndex)/2;
            if(data<dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
                return -1;
            }
            if(data<dataset[middleIndex]){
                return binarySearch(dataset,data,beginIndex,middleIndex-1);
            }else if(data>dataset[middleIndex]){
                return binarySearch(dataset,data,middleIndex+1,endIndex);
            }else{
                return middleIndex;
            }
      }
     public static void main(String[] args){
         int[] dataset=new int[]{1,3,5,6,8,9};
         System.out.println(binarySearch(dataset,6));
         System.out.println(binarySearch(dataset,6,0,dataset.length-1));
     }
}
