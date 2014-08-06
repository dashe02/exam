package calculator;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午7:31
 * To change this template use File | Settings | File Templates.
 */
public class GetMaxHuiWenSub {
    /*
    * 获取最大回文子串
    */
    public static int getMaxHuiWenSub(char[] s,int n){
          int i,j,max;
          if(s==null||n<1)
              return 0;
          max=0;
        for(i=0;i<n;++i)
        {
           for(j=0;(i-j>=0)&&(i+j<n);++j)
               if(s[i-j]!=s[i+j])
                   break;
               if(j*2+1>max)
                   max=j*2+1;
            for(j=0;(i-j>=0)&&(i+j+1<n);++j)
                if(s[i-j]!=s[i+j+1])
                    break;
                if(j*2+2>max)
                    max=j*2+2;
        }
                 return max;
    }
     public static void main(String[] args){
         char[] a={'1','2','2','1','2','3','2','1'};
         System.out.println(getMaxHuiWenSub(a,a.length));
     }

}
