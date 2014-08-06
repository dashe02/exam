package responsechain1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 */
public class MsgProcessor {
    /*
    * 多个过滤器组合到一起之后就会形成过滤器链
    * 好处是过滤规则的排序
    * 先后顺序的原因,新旧规则可以灵活的替换更新
    *责任链模式
    */
    private AbstractFilterChain chain;

    public AbstractFilterChain getChain() {
        return chain;
    }

    public void setChain(AbstractFilterChain chain) {
        this.chain = chain;
    }

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process(){
        return chain.doFilter(msg);
    }
}
