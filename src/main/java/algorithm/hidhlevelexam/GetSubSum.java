package algorithm.hidhlevelexam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 上午10:53
 * To change this template use File | Settings | File Templates.
 */
public class GetSubSum {
    public static String getSubSum(int[] array){
        int max,sum=0;
        int start,cursor,end;
        start=cursor=end=0;
        max=array[0];
        for(int index=0;index<array.length;index++){
             sum+=array[index];
            if(sum>max){
                max=sum;
                end=index;
                start=cursor;
                if(sum<0){
                    sum=0;
                    end=index;
                    start=index+1;
                }
            }else if(sum<0){
                  sum=0;
                  end=start+1;
            }
        }
        return max+","+start+","+end;
    }
    public static void main(String[] args){
    int[] a={1,4,-9,0,5,7};
    System.out.println(getSubSum(a));
    }
}
