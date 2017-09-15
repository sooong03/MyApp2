package kr.anima.xd.s.myapp2.share;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alfo6-10 on 9/15/2017.
 */

public class Content {

    String Goal;
    String Project;
    String Schedule;
    String Task;
    String Tracker;
    String ElementOfLife;

    class Elements extends ArrayList<String> {
        String name;
        final String a="a";
    }

    class Goal{
        String TitleOfGoal;
        List<String> Elements=new ArrayList<>();
        Elements elements=new Elements();

//        public Goal() {
//            Elements.add("a");
//            Elements.add("b");
//            Elements.add("c");
//            Elements.add("d");
//            Elements.add("e");
//            Elements.add("f");
//            Elements.add("g");
//            Elements.add("h");
//            Elements.add("i");
//        }

        public Goal(String title){
            TitleOfGoal=title;
        }


    } // class goal

 class Project extends Goal{

     String nameOfProject;

     public Project(String title, String name) {
         super(title);
         nameOfProject=name;
     }
 } // class project

 class Contents extends Project{

     final int Type_Schedule=0;
     final int Type_Task=1;

     private String nameOfContent;
     private boolean hasTracker=false;
     private int type;


     public Contents(String title, String name, String nameOfContent, int type, boolean hasTracker) {
         super(title, name);

         this.nameOfContent=nameOfContent;
         this.type=type;
         this.hasTracker=hasTracker;
         switch (type){
             case Type_Task:
                 task();
                 break;
             case Type_Schedule:
                 schedule();
                 break;
         }

     }

     private void schedule(){
         long dateOfStart;
         long dateOfEnd;
         long timeOfStart;
         long timeOfEnd;

     }

     private void task(){
         long date;

     }

     private void tracker(){
         int ruleOfRepeat;
     }

 } // contents

}


