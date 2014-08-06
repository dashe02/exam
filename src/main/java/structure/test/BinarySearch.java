package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-6-1
 * Time: 下午5:04
 * To change this template use File | Settings | File Templates.
 */
public class BinarySearch {

    public static int binarySearch(int[] desArray,int des){
        int low=0;
        int high=desArray.length-1;
        while(low<=high){
            int middle=(low+high)/2;
            if(des==desArray[middle]){
                return middle;
            }else if(des<desArray[middle]){
                high=middle-1;
            }else{
                low=middle+1;
            }
        }
       return -1;
    }
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
        int[] dataset=new int[]{1,3,5,7,8,9};
        System.out.println(binarySearch(dataset,3));
        System.out.println(binarySearch(dataset,3,0,dataset.length-1));
    }
}
