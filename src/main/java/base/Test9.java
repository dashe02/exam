package base;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-3
 * Time: 下午3:02
 * To change this template use File | Settings | File Templates.
 */
public class Test9 {
    public static void transfer(String s){
        StringBuilder sb=new StringBuilder();
        int count=0;
        if(s.contains("One")){
          sb.append("1");
        }
        if(s.contains("Two")){
          sb.append("2");
        }
        if(s.contains("Three")){
          sb.append("3");
        }
        if(s.contains("four")){
          sb.append("4");
        }
        if(s.contains("five")){
          sb.append("5");
        }
        if(s.contains("six")){
          sb.append("6");
        }
        if(s.contains("seven")){
            sb.append("7");
        }
        if(s.contains("eight")){
            sb.append("8");
        }
        if(s.contains("nine")){
            sb.append("9");
        }
        if(s.contains("ten")){
            sb.append("10");
        }
        if(s.contains("Double")){

        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        String s="OneDoubleTwo";
        transfer(s);
    }
}
