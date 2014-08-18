package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午9:58
 * To change this template use File | Settings | File Templates.
 */
public class JudgeIsHouXu {
     //判断整数序列是否为BST的后序遍历结果
   public static void main(String[] args){
       int[] array={6,9,8,12,20,15};
       System.out.println();
   }
   private static boolean isAfterResult(int[] array,int start,int stop){
       if(null==array){
           throw new NullPointerException();
       }
       //先判断start和stop是否越界
       if(start<0||start>array.length||stop<0||stop>array.length){
           throw new ArrayIndexOutOfBoundsException();
       }
       int  count=stop-start+1;
       if(count<3){
           return true;
       }else if(count==3){
        if(array[stop]>=array[start]&&array[stop]<=array[start+1]){
            return true;
        }else{
            return false;
        }
       }else{
           int index=-1;
           for(int i=start;i<stop;i++){
               if(array[i]>=array[stop])
               {
                   index=i;
                   break;
               }
           }
           if(index==-1||index==0)
           {
               return isAfterResult(array, start, stop-1);
           }else{
               return isAfterResult(array, start, index-1)&&isAfterResult(array, start, stop-1);
           }
       }
   }



}
