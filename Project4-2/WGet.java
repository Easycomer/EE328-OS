/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;
/**
 *
 * @author williamwjs
 */

public class WGet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException { //Two command-line parameters: a URL and a filename 
        // TODO code application logic here
        URL url = new URL(args[0]); //Create a url point to the URL in args[0]
        //Assume that the data is binary
        URLConnection uc = url.openConnection(); //The connection from referenced remote object of URL
        InputStream in = uc.getInputStream(); //Open the input stream of connection
        //Assume that the data is byte
        //Reader in = new InputStreamReader(new BufferedInputStream(url.openStream())); //Open the input byte stream of connection
        try {
            File file = new File(args[1]); 
            if(file.exists()) { //Check if the file is existed whose name is from args[1]
                System.out.println("Don't just dump a stack trace!"); //If existing, exit
                return;
            }
            PrintStream out=new PrintStream(new FileOutputStream(args[1])); //Used for output stream of file, whose name is in args[1]
            System.setOut(out); //Redirect the system output to the file
            int c; //Store the ASCII
            while ((c = in.read()) != -1) { //Get the input from the URL
                System.out.print((char) c); //Output to the file
            }
            
            in.close(); //Close the input stream of URL
            out.close(); //Close the output stream of file
        } catch (Exception e1) { } //If any errors exist
    }
    
}
