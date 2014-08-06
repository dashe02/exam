package responsechain1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-1
 * Time: 下午3:37
 * To change this template use File | Settings | File Templates.
 * 负责了处理敏感词汇的过滤器 实现了Filter接口
 * 实现了Filter接口的主要原因是:将自身也设计成一个Filter,容易构建一个chain
 */
public abstract class AbstractFilterChain implements Filter{
      public List<Filter> filters=new ArrayList<Filter>();
      public abstract String doFilters(String msg);
      public abstract AbstractFilterChain addAbstractFilterChain(Filter filter);
}
