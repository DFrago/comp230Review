interface Phone{
  //Returns the avaliable messages
  //@param messages
  String[] getMessages();

  //Sends a text message
  void sendText(String message);

  //Returns the owners name
  //@param ownersName
  String getOwnersName();

  //Returns the current battery life
  //@param batteryLife
  int checkBatteryLife();
}
class Iphone implements Phone{
  String[] messages;
  int batteryLife ;
  String ownersName;
    
  //Default Constructor
  public Iphone(){
    this.messages=new String[1];
    this.batteryLife=0;
    this.ownersName="default";
  }
  //non-default constructor
  public Iphone(int batteryLife,String ownersName){
    this.messages=new String[1];
    this.batteryLife=batteryLife;
    this.ownersName=ownersName;
  } 
  public String[] getMessages(){
    return messages;
  }
  public void sendText(String message){
    System.out.println(message);
  }
  public String getOwnersName(){
    return ownersName;
  }
  public int checkBatteryLife(){
    return batteryLife;
  }
}
class Samsung implements Phone{
  String[] messages;
  int batteryLife ;
  String ownersName;
    
  //non-default constructor
  public Samsung(int batteryLife,String ownersName){
    this.messages=new String[1];
    this.batteryLife=batteryLife;
    this.ownersName=ownersName;
  } 
  public String[] getMessages(){
    return messages;
  }
  public void sendText(String message){
    System.out.println(message);
  }
  public String getOwnersName(){
    return ownersName;
  }
  public int checkBatteryLife(){
    return batteryLife;
  }
}
public class p4{
  public static void main(String[] args){
    
    //You definately do not need an array or for loop
    //I just wanted to use the for item iteration
    Phone[] phones=new Phone[2];
    phones[0]=new Iphone(100,"Elbron");
    phones[1]=new Samsung(75,"Anthony");

    for(Phone phone: phones){
      System.out.printf(
        "%s has a %s which is at %d%% battery life.\n",
        phone.getOwnersName(),
        phone.getClass().getTypeName(),
        phone.checkBatteryLife()
      );
    }
  }
}
