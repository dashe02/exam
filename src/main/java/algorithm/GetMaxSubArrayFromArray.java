package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 上午10:12
 * To change this template use File | Settings | File Templates.
 */
public class GetMaxSubArrayFromArray {
    /*
    * 从数组中找到一个子序列，其和在所有子序列中最大
    */
     public static void getMaxSubArraySumFromArray(int[] array){
             int sum,max;
             int start,cursor,end;
              start=cursor=end=0;
              sum=0;
              max=array[0];
              for(int index=0;index<array.length;index++){
                  sum+=array[index];
                  if(sum>=max){
                      max=sum;
                      end=index;
                      start=cursor;
                      if(sum<0){
                          sum=0;
                          end=index;
                          cursor=index+1;
                      }
                  }
                  else if(sum<0){
                      sum=0;
                      cursor=index+1;
                  }
              }
         System.out.println(max+","+start+","+end);
     }
    public static void main(String[] args){
           int[] array={-3,-2,-1,5,4,7};
            getMaxSubArraySumFromArray(array);
    }
}
