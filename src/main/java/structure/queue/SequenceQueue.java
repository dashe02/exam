package structure.queue;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午2:32
 * To change this template use File | Settings | File Templates.
 */
public class SequenceQueue<T> {
     private int DEFAULT_SIZE=10;
     //保存数组的长度
     private int capacity;
     //定义一个数组用于保存顺序队列的元素
     private Object[] elementData;
     //保存顺序队列中元素的当前个数
     private int front=0;
     private int rear=0;
     //以默认数组长度创建空顺序队列
     public SequenceQueue()
     {
         capacity=DEFAULT_SIZE;
         elementData=new Object[capacity];
     }
     //以一个初始化元素来创建
     public SequenceQueue(T element)
     {
       this();
       elementData[0]=element;
       rear++;
     }
    //以一个指定长度的数组来创建队列
     public SequenceQueue(T element,int initSize){
         this.capacity=initSize;
         elementData=new Object[capacity];
         elementData[0]=element;
         rear++;
     }
       //获取顺序队列的大小
       public int length(){
           return rear-front;
       }
      //插入队列
       public void add(T element)
       {
           if(rear>capacity-1)
           {
               throw new IndexOutOfBoundsException("队列已满的异常");
           }
           elementData[rear++]=element;
       }
         //移除队列
        public T remove(){
            if(empty())
            {
                throw  new IndexOutOfBoundsException("空队列异常");
            }
            T oldValue=(T)elementData[front];
            elementData[front++]=null;
            return oldValue;
        }
         //返回队列顶元素，但不能删除队列顶元素
         public T element()
         {
             if(empty())
             {
                 throw new IndexOutOfBoundsException("空队列异常");
             }
             return (T)elementData[front];
         }
         //判断顺序队列是否为空队列
          public boolean empty(){
              return rear==front;
          }
          //清空顺序队列
          public void clear(){
              Arrays.fill(elementData,null);
              front=0;
              rear=0;
          }
          public String toString(){
              if(empty())
              {
                  return "[]";
              }
              else
              {
                  StringBuilder sb=new StringBuilder("[");
                  for(int i=front;i<rear;i++)
                  {
                      sb.append(elementData[i].toString()+",");
                  }
                  int len=sb.length();
                  return sb.delete(len-2,len).append("]").toString();
              }
          }
}
