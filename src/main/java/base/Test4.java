package base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 上午10:02
 * To change this template use File | Settings | File Templates.
 */
public class Test4 {
    public static void getTwoPeople(float[] f){
        int flag=0;
        if(filter(f)){
            flag=1;
        for(int i=0;i<f.length-1;i++){
            for(int j=0;j<f.length-i-1;j++){
                if(f[j]>f[j+1]){
                    float temp=f[j];
                    f[j]=f[j+1];
                    f[j+1]=temp;
                }
            }
        }
        }else{
        System.out.println("抱歉!身高应该在160-190之间");
        }
        if(flag==1){
        System.out.println(f[f.length-2]+","+f[f.length-1]);
        }
    }
    public static boolean filter(float[] f){
        boolean flag=false;
        int count=0;
        for(int i=0;i<f.length;i++){
            if(f[i]>160&&f[i]<190){
                count++;
            }
        }
        if(count==f.length){
            flag=true;
        }
        return  flag;
    }
    public static void main(String[] args){
          float [] f={150,189,167,172,188};
          getTwoPeople(f);
    }
}
