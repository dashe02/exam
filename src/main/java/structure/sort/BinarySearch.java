package structure.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 下午4:46
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {
    /*二分查找又称折半查找,它是一种效率较高的查找方法
      要求1.必须采用顺序存储结构,2.必须按关键字大小有序排列
    */
    /*
    二分查找算法
    des 查找元素
    srcArray有序数组
    return des的数组下标,没找到返回-1;
     */
    public static int binarySearch(int[] srcArray,int des){
       int low=0;
       int high=srcArray.length-1;
        int middle=(low+high)/2;
       while(low<=high){
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
     /*
     二分查找特定整数在整数数组中的位置
      */
      public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){
          int midIndex=(beginIndex+endIndex)/2;
          if(data<dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
              return -1;
          }
          if(data<dataset[midIndex]){
               return binarySearch(dataset,data,beginIndex,midIndex-1);
          }else if(data>dataset[midIndex]){
              return binarySearch(dataset,data,midIndex+1,endIndex);
          }else{
              return midIndex;
          }
      }
    public static void main(String[] args){
        int[] src=new int[] {1,3,5,7,8,9};
        System.out.println(binarySearch(src,3));
        System.out.println(binarySearch(src,3,0,src.length-1));
    }
}
