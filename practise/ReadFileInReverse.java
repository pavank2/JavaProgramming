package practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileInReverse {

	public static void main(String[] args) throws IOException {

     File f = new File("C:\\Users\\PK\\OneDrive - Software AG\\Documents\\outputFile.txt");
     BufferedReader br = new BufferedReader(new FileReader(f));
     String st = null;
     ArrayList<String> l = new ArrayList<String>();
     while ((st=br.readLine())!= null)
    	 l.add(st);
     
     int i=l.size()-1;
     while (i>=0) {
    	 System.out.println(l.get(i));
    	 i--;
     }
     
	}

}
