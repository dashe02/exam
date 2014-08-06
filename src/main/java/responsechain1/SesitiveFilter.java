package responsechain1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午3:35
 * To change this template use File | Settings | File Templates.
 */
public class SesitiveFilter implements Filter{

    @Override
    public String doFilter(String msg) {
        return msg.replaceAll("敏感","普通词汇");  //To change body of implemented methods use File | Settings | File Templates.
    }
}
