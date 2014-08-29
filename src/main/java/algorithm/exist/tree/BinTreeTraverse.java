package algorithm.exist.tree;

import org.apache.commons.collections.list.NodeCachingLinkedList;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午8:12
 * To change this template use File | Settings | File Templates.
 */
public class BinTreeTraverse {
       private static int[] array={1,2,3,4,5,6,7,8,9};
       private static LinkedList<Node>list=null;

       private static class Node{
           private Node leftChild;
           private Node rightChild;
           private int  data;
           public Node(int newData){
               this.leftChild=null;
               this.rightChild=null;
               this.data=newData;
           }
       }
       public static void createBinTree(){
           list=new LinkedList<Node>();
           for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
               list.add(new Node(array[nodeIndex]));
           }
           for(int parentIndex=0;parentIndex<array.length/2-1;parentIndex++){
               list.get(parentIndex).leftChild=list.get(parentIndex*2+1);
               list.get(parentIndex).rightChild=list.get(parentIndex*2+2);
           }
           int lastParentIndex=array.length/2-1;
           list.get(lastParentIndex).leftChild=list.get(lastParentIndex*2+1);
           if(array.length/2==1){
               list.get(lastParentIndex).rightChild=list.get(lastParentIndex*2+2);
           }
       }
       public static void preOrderTraverse(Node node){
           if (node==null)
               return;
           System.out.println(node.data + " ");
           preOrderTraverse(node.leftChild);
           preOrderTraverse(node.rightChild);
       }
       public static void inOrderTraverse(Node node){
           if(node==null)
               return;
           inOrderTraverse(node.leftChild);
           System.out.println(node.data + " ");
           inOrderTraverse(node.rightChild);
       }
       public static void postOrderTraverse(Node node){
           if(node==null)
               return;
           postOrderTraverse(node.leftChild);
           postOrderTraverse(node.rightChild);
           System.out.println(node.data + " ");
       }
    public static void main(String[] args){
        BinTreeTraverse tree=new BinTreeTraverse();
        createBinTree();
        Node root=list.get(0);
        System.out.println("前序遍历:");
        preOrderTraverse(root);
        System.out.println();

        System.out.println("中序遍历:");
        inOrderTraverse(root);
        System.out.println();

        System.out.println("后序遍历:");
        postOrderTraverse(root);
        System.out.println();
    }
}
