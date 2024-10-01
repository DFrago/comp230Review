import java.io.*;
import java.util.Scanner;

public class p2{
  public static void initFile(){
    try{
      PrintWriter writer=new PrintWriter(new FileOutputStream("macas.txt"));
      writer.println("Should I get a cheeseburger or a hamburger?");
      writer.close();
    }
    catch(IOException e){
      System.out.println(e.getMessage());
      System.exit(1);
    }
  }
  public static void main(String[] args){
    initFile();
    Scanner kb=new Scanner(System.in);
    String response;
    String result;
    while(true){
      System.out.println("Should I order the cheeseburger or hamburger?");
      response=kb.nextLine();
      if(response.equals("cheeseburger")||response.equals("hamburger")){
        result=response;
        break;
      }
    }
    kb.close(); 
    try{
      PrintWriter writer=new PrintWriter(new FileOutputStream("macas.txt",true));
      writer.printf("I think I will have the %s.\n",response);
      writer.close();
    }
    catch(IOException e){
      System.out.println(e.getMessage());
      System.exit(1);
    }
  }
}
