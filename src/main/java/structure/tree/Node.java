package structure.tree;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class Node<T> {
    private T data;
    private int parent;

    public Node(){

    }
    public Node(T data){
        this.data=data;
    }
    public Node(T data,int parent){
        this.data=data;
        this.parent=parent;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }
}
