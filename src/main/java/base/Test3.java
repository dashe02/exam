package base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 上午9:28
 * To change this template use File | Settings | File Templates.
 */
public class Test3 {
    public static void getScore(float[] f){
        int count=0;
        float score=0;
        int flag=0;
        for(int i=0;i<f.length;i++){
            if(f[i]>60){
                count++;
                flag=1;
            }
            if(count==f.length&&flag==1){
                System.out.println("及格线为:60");
            }else{
                flag=0;
        for(int j=0;j<f.length-i-1;j++){
            if(f[j]<f[j+1]){
                float temp=f[j];
                f[j]=f[j+1];
                f[j+1]=temp;
            }
        }
        }
        }
        if(flag==0){
        System.out.println(filter(f[6]));
        }
    }
    public static float filter(float ff){
        int x=(int)ff/10;
        return x*10;
    }
    public static void main(String[] args){
         float[] f={88f,68f,90f,100f,50f,70f,70f,80f,98f,79f};
         getScore(f);
    }
}
