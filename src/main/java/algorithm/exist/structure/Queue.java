package algorithm.exist.structure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午8:40
 * To change this template use File | Settings | File Templates.
 */
public interface Queue<T> {

    boolean isEmpty();

    boolean isFull();

    T front();

    int size();

    T remove();

    void add(T t);
}
