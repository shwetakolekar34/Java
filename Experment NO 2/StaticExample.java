class StaticDemo{
static int count=0;
 static{
 System.out.println("Static block executed!");
 count=10;
 }
 StaticDemo(){
 count++;
 }
 static void displayCount(){
 System.out.println("Count:"+count);
 }
 }
 public class StaticExample{
 public static void main(String[] args){
 System.out.println("Main method  started!");
  StaticDemo.displayCount();
   StaticDemo obj1=new StaticDemo();
    StaticDemo obj2=new StaticDemo();
   StaticDemo.displayCount();
   }
   }