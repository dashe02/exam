package org.java.test.Composite;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午2:20
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static String indentChar="\t";
    public static void main(String[] args){
        new Client().test();
    }
    public void test(){
        Folder root=new Folder("树根");
        Folder b1_1=new Folder("1_枝1");
        Folder b1_2=new Folder("1_枝2");
        Folder b1_3=new Folder("1_枝3");
        File l1_1=new File("1_叶1");
        File l1_2=new File("1_叶2");
        File l1_3=new File("1_叶3");
        Folder b2_1=new Folder("2_枝1");
        Folder b2_2=new Folder("2_枝2");
        File l2_1=new File("2_叶1");
        root.add(b1_1);
        root.add(b1_2);
        root.add(l1_1);
        root.add(l1_2);
        b1_2.add(b2_1);
        b1_2.add(b2_2);
        b1_2.add(l2_1);
        root.add(l1_3);
        root.add(b1_3);
        outTree(root);
    }
     public void outTree(Folder folder){
         System.out.println(folder.getName());
         iterateTree(folder);
     }
      public void iterateTree(Folder folder){
          Vector<IFile> clist=folder.getAllComponent();
          for(Iterator<IFile> it=clist.iterator();it.hasNext();){
              IFile em=it.next();
              if(em instanceof Folder){
                  Folder cm=(Folder)em;
                  System.out.println(getIndents(em.getDeep()) + cm.getName());
                  iterateTree(cm);
              }else{
                  System.out.println(getIndents(em.getDeep()) + ((File) em).getName());
              }
          }
      }
      public static String getIndents(int x){
          StringBuilder sb=new StringBuilder();
          for(int i=0;i<x;i++){
              sb.append(indentChar);
          }
          return sb.toString();
      }
}