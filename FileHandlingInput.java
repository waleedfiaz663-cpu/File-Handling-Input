package file.handling.input;

import java.io.*;

public class FileHandlingInput {

   
    public static void main(String[] args) {
        
        
        try{
            
            FileInputStream fis = new FileInputStream("C:/Users/Administrator/OneDrive/Desktop/Sample.txt");
            
            int i;
            
            while((i=fis.read())!=-1){
                
                System.out.println((char)i);
                
                fis.close();
               
            }
        }
        
        
        
        catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
       
    }
    
}
        
    

