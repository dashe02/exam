package dataStructure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 下午8:57
 * To change this template use File | Settings | File Templates.
 */
public class JuZhenRever {
    public static void JuZhenRever(int[][] a){
        int[][] b=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
               b[j][i]=a[i][j];
           }
       }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.println(b[i][j]);
            }
        }
    }
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        JuZhenRever(a);
    }
}
