public class DBConnector {

    private static DBConnector instance = null;

     private DBConnector(){

     }
    public static DBConnector getInstance(){
           if(instance==null){
               instance = new DBConnector();
           }
           return  instance ;
    }

    public void display(){
         System.out.println("you have written singleton design pattern");
    }
}
