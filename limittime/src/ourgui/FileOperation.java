package ourgui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class FileOperation {
	public static String readFile(String x) {
        String pathname = x;
        String result="[\n";
        try (InputStreamReader ipr = new InputStreamReader(new FileInputStream(pathname),Charset.forName("UTF-8"));
        		BufferedReader br = new BufferedReader(ipr);
        ) {
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {
            	if(i!=0)
            		result=result+",\n";
            	i++;
            	result=result+workout(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        result=result+"\n]";
        return result;
    }
	public static void writeFile(String x,String x2) {
        try {
            File writeName = new File(x2);
            writeName.createNewFile(); 
            try (FileOutputStream writerStream = new FileOutputStream(writeName); 
            		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8")); ) 
            {
                writer.write(x);
                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static String workout(String line) {
		String reString="";
		
		return reString;
	}
}
