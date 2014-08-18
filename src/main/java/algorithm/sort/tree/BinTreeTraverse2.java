package algorithm.sort.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午4:51
 * To change this template use File | Settings | File Templates.
 */
public class BinTreeTraverse2 {
    private int[] array={1,2,3,4,5,6,7,8,9};
    private static List<Node> nodeList=null;

    private static class Node{
        Node leftChild;
        Node rightChild;
        int  data;

        Node(int newData){
         leftChild=null;
         rightChild=null;
         data=newData;
        }
    }
    public void createBinTree(){
        nodeList=new LinkedList<Node>();
        for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
            nodeList.add(new Node(array[nodeIndex]));
        }
        for(int parentIndex=0;parentIndex<array.length/2-1;parentIndex++){
            nodeList.get(parentIndex).leftChild=nodeList.get(parentIndex*2+1);
            nodeList.get(parentIndex).rightChild=nodeList.get(parentIndex*2+2);
        }
        int lastParentIndex=array.length/2-1;
        nodeList.get(lastParentIndex).leftChild=nodeList.get(lastParentIndex*2+1);
        if(array.length%2==1){
        nodeList.get(lastParentIndex).rightChild=nodeList.get(lastParentIndex*2+2);
        }
    }
      //先序遍历
      public static void preOrderTraverse(Node node){
           if(node==null)
               return;
           System.out.println(node.data + " ");
           preOrderTraverse(node.leftChild);
           preOrderTraverse(node.rightChild);
      }
       //中序遍历
       public static void inOrderTraverse(Node node){
           if(node==null)
               return;
           inOrderTraverse(node.leftChild);
           System.out.println(node.data + " ");
           inOrderTraverse(node.rightChild);
       }
       //后序遍历
       public static void postOrderTraverse(Node node){
           if(node==null)
               return;
          postOrderTraverse(node.leftChild);
          postOrderTraverse(node.rightChild);
          System.out.println(node.data + " ");
       }
       public static void main(String[] args){
           BinTreeTraverse2 binTreeTraverse2=new BinTreeTraverse2();
           binTreeTraverse2.createBinTree();
           Node root=nodeList.get(0);
           System.out.println("先序遍历:");
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
