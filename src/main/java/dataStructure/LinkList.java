package dataStructure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-5
 * Time: 上午9:25
 * To change this template use File | Settings | File Templates.
 */
class Link<E>{
    public E data;

    public Link<E> next;

    public Link(E data){
        this.data=data;
    }
}
class MyLinkList<E>{
     public Link<E> first;

     public int size;

     public MyLinkList(){
         first =null;
         size=0;
     }
    //在表头插入新的数据
     public void insertFirst(E value){
         Link<E> link=new Link<E>(value);
         link.next=first;
         first=link;
         size++;
     }
     //判断链表是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //删除表头
    public Link<E> deleteFirst(){
        Link<E> temp=first;
        first=first.next;
        size--;
        return temp;
    }
    //输出链表中的所有数据
    public void display(){
        Link<E> curr=first;
        while(curr!=null){
            System.out.println(curr.data+"");
            curr=curr.next;
        }
        System.out.println();
    }
    //返回链表中数据项的个数
    public int size(){
        return size;
    }
    //获取从头到尾的第i个数据项
    public Link<E> get(int i){
        if(i>size()-1||i<0)
            try{
                throw new IndexOutOfBoundsException();
            }catch(Exception e){
                e.printStackTrace();
            }
            Link<E> curr=first;
            for(int n=0;n<size;n++){
                if(n==i)
                    return curr;
                else
                    curr=curr.next;
            }
        return null;
    }
    public void remove(int i){
        if(i==0)
            deleteFirst();
        else if(i==size()-1)
            get(i-1).next=null;
        else {
            get(i-1).next=get(i+1);
        }
        size--;
    }
}
public class LinkList {
     public static void main(String[] args){
         MyLinkList<Long> ll=new MyLinkList<Long>();
         for(int i=0;i<10;i++){
             Long value=(long)(Math.random()*100);
             ll.insertFirst(value);
         }
         ll.display();
         while(!ll.isEmpty()){
             ll.deleteFirst();
             ll.display();
         }
         System.out.println("OK");
     }
}
