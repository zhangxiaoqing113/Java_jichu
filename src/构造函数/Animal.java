package 构造函数;

import java.util.ArrayList;

public class Animal {
     public Animal(){
         System.out.println("Animal 无参构造函数");
         System.out.println("class name: "+getClass().getSimpleName());
         System.out.println("Animal  list.size ="+ list.size());
     }
    private ArrayList<String> list=new ArrayList<>();

     public void addData(String s){
         list.add(s);
     }




    public void traversal(){
        for (String s : list) {
            System.out.println("s= "+s);
        }
    }
}
