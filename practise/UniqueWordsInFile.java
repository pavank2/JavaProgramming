package practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map.Entry;

public class UniqueWordsInFile {

	public static void main(String[] args) {
	
	try {
		FileInputStream fis = new FileInputStream ("C:\\Users\\PK\\OneDrive - Software AG\\Documents\\fileToRead.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		String currentLine = br.readLine();
		
//		
//		File file = new File("C:\\Users\\PK\\OneDrive - Software AG\\Documents\\outputFile.txt");
//		FileOutputStream fos = new FileOutputStream(file);
//		PrintStream ps = new PrintStream(fos);
//		System.setOut(ps);
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		while (currentLine!=null) {
			
			String a[] = currentLine.split(" .");
			
			for (int i=0;i<a.length;i++) {
				
				if (hm.containsKey(a[i])) {
			
					hm.put(a[i],hm.get(a[i])+1);
				}
				else
					hm.put(a[i],1);
			}
			
			currentLine = br.readLine();
		}
		
		for(Entry<String, Integer> entry: hm.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Key:"+key+",value:"+value);
			
		}
		br.close();
	}
    catch(Exception e) {
    	System.out.println(e);
    }
	}

}
