package base.blacket;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 上午11:08
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        String s="dfa(sdf)df[dfds(dfd)]";
        char[] ss=s.toCharArray();
        for(int i=0;i<ss.length;i++){
            System.out.println(ss[i]+"......");
        }
        /*char[] input={'[','(',')',']','{','(',')','}'};*/
        char[] input=s.toCharArray();
        char[] stack=new char[input.length];
        int topOfStack=-1;
        boolean result=true;
        for(int i=0;i<input.length;i++){
            switch (input[i]){
                case '[':
                case '{':
                case '(':
                    Stack.push(stack,++topOfStack,input[i]);
                    break;
                default:
                    if(topOfStack==-1){
                       result=false;
                        break;
                    }else{
                        char top=Stack.pop(stack,topOfStack--);
                        if((input[i]==')'&&top!='(')||(input[i]==']'&&top!='[')||(input[i]=='}'&&top!='{')){
                            result=false;
                        }
                          break;
                    }
            }
        }
        if(topOfStack>-1){
            System.out.println("false");
        }else if(result){
            System.out.println("true");
        }else if(!result){
            System.out.println("false");
        }
    }
}
