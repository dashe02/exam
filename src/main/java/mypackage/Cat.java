package mypackage;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-23
 * Time: 下午9:58
 * To change this template use File | Settings | File Templates.
 */
public class Cat implements Serializable {
      private String name;

      public Cat(){
          this.name="new cat";
      }
      public String getName(){
          return this.name;
      }
      public void setName(String name){
          this.name=name;
      }
      public static void main(String[] args){
          Cat cat=new Cat();
          try{
          FileOutputStream  fos=new FileOutputStream("E://catDemo.out");
          ObjectOutputStream oos=new ObjectOutputStream(fos);
          System.out.println("1>" + cat.getName());
          cat.setName("My Cat");
          oos.writeObject(cat);
          oos.close();
          }catch(Exception e){
              e.printStackTrace();
          }
          try{
              FileInputStream fis=new FileInputStream("E://catDemo.out");
              ObjectInputStream ois=new ObjectInputStream(fis);
              cat=(Cat)ois.readObject();
              System.out.println("2>"+cat.getName());
              ois.close();
          }catch(Exception e){
              e.printStackTrace();
          }
      }
}
