package algorithm.sort.stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:17
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStack<T> implements IStack<T> {
    private T[] t=(T[])new Object[16];
    private int size=0;
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
        T[] temp=(T[])new Object[2*t.length];
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
        }else {
            return t[size-1];
        }
    }

    @Override
    public T pop() {
        if(size==0){
            return  null;
        }else {
         T temp=t[size-1];
         t[size-1]=null;
         size--;
         return temp;  //To change body of implemented methods use File | Settings | File Templates.
        }
        }

    @Override
    public boolean isEmpty() {
        return size==0;  //To change body of implemented methods use File | Settings | File Templates.
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
        sb.append("{ArrayStack:\n[\n");
        for(int i=size-1;i>=0;i--){
            sb.append(t[i]+"\n");
        }
        sb.append("]\n}");
        return sb.toString();
    }
}
