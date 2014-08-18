package algorithm.sort.queue1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 下午9:52
 * To change this template use File | Settings | File Templates.
 */
public interface Queue<T> {

     void add(T t);

     T remove();

     int size();

     boolean isEmpty();

     boolean isFull();

     T front();

}
