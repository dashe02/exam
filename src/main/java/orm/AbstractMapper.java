package orm;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午7:44
 * To change this template use File | Settings | File Templates.
 */
public interface AbstractMapper<T> {

       void add(T t);

       int update(T t);

       int delete(T t);

       T get(T t);

       List<T> find(Map<String,Object> conditions);

}
