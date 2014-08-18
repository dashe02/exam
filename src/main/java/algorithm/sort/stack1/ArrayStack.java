package algorithm.sort.stack1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 下午9:38
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStack<T> implements IStack<T>{

    private T[] t=(T[])new Object[16];

    private int size;

    @Override
    public boolean isEmpty() {
        return size==0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int length() {
        return size;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean push(T data) {
        if(size>t.length){
            resize();
        }else{
            t[size++]=data;
        }
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }
    public void resize(){
        T[] temp=(T[])new Object[t.length*2];
        for(int i=0;i<t.length;i++){
            temp[i]=t[i];
            t[i]=null;
        }
        t=temp;
        temp=null;
    }
    @Override
    public T peek() {
        if(size==0){
            return null;
        }
        return t[size-1];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T pop() {
        if(size==0){
            return null;
        }else{
            T temp=t[size-1];
            size--;
            return temp;
        }
    }

    @Override
    public int search(T t) {
        for(int i=0;i<this.t.length;i++){
            if(this.t[i].equals(t)){
                return i+1;
            }
        }
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("{\n ArrayStack:\n[\n");
        for(int i=size-1;i>=0;i--){
            sb.append(t[i]+"\n");
        }
        sb.append("\n]\n}");
        return sb.toString();
    }
}
