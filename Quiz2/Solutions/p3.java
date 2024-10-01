import java.io.*;

public class p3{

  public static int getRandomNumber(int min, int max){
    return (int)((Math.random()*(max-min))+min);
  }

  public static void initFile(){
    try{
      ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("test.bin"));
      output.writeInt(getRandomNumber(1,10));
      output.close();
    }
    catch(IOException e){
      System.out.println(e.getMessage());
      System.exit(1);
    }
  }

  public static int readFromFile(String fileName)throws IllegalArgumentException{
    int result=0;
    try{
      ObjectInputStream input=new ObjectInputStream(new FileInputStream(fileName));
      try{
        result=input.readInt(); 
      }
      catch(EOFException e){}
      finally{
        if(input!=null){
          try{
            input.close();
          }
          catch(IOException e){
            System.out.println("Error Closing");
          }
        }
      }
    }
    catch(IOException e){
      System.out.println(e.getMessage());
      System.exit(1);
    }
    if(result<1 || result>10)throw new IllegalArgumentException();
    return result;
  }

  public static void main(String[] args){
    initFile(); 
    int result=0;
    try{
      result=readFromFile("test.bin");
    }
    catch(IllegalArgumentException e){
      System.out.println("value out of range");
    }
    System.out.println("The Retrieved Value is: "+result);
  }

}
