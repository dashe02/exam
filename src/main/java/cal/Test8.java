package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 上午10:49
 * To change this template use File | Settings | File Templates.
 */
public class Test8 {
    public static void test(int[] array){
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
                cursor=index+1;
            }
        }
        System.out.println(max+","+start+","+end);
    }
    public static void main(String[] args){
          int[] array={1,4,5,-3,-6,0};
          test(array);
    }
}
