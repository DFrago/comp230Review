import java.io.*;

public class p1{
  public static void main(String[] args){
    try{
      BufferedReader reader=new BufferedReader(new FileReader("lyrics.txt"));
      String result="";
      String line;
      while((line=reader.readLine())!=null){
        result+=" "+line;
      }
      reader.close();
      System.out.println(result);
    }
    catch(IOException e){
      System.out.println(e.getMessage());
      System.exit(1);
    }
  }
}
