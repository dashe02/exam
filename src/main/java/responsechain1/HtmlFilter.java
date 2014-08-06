package responsechain1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午3:34
 * To change this template use File | Settings | File Templates.
 */
public class HtmlFilter implements Filter{

    public String doFilter(String msg){
        String result=msg.replace("<","[").replace(">","]");
        return result;
    }

}
