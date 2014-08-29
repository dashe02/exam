package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午8:36
 * To change this template use File | Settings | File Templates.
 */
public class GetMaxSub {
    public static void getMaxSub(int[] array){
        int max,sum=0;
        int start,cursor,end;
        start=cursor=end=0;
        max=array[0];
        for(int index=0;index<array.length;index++){
            sum+=array[index];
            if(max<sum){
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
        System.out.println(max+","+start+","+end);
    }
    public static void main(String[] args){
        /*int[] array={1,4,6,0,-3,-5};*/
        int[] array={1,4,-9,0,5,7};
        getMaxSub(array);
        StringBuilder sb=new StringBuilder();
        sb.reverse();

    }
}
