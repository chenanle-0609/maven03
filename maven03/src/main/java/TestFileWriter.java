import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TestFileWriter {
     public static void main(String[] args) {
    	 ArrayList<String> list = new ArrayList<String>();
    	 try {
			list = readF1("/usr/cal/test.txt");
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		} catch (IOException e) {
						e.printStackTrace();
		}
     }
     public static final ArrayList<String> readF1(String filePath) throws IOException {      
    	 ArrayList<String> list = new ArrayList<String>();
    	 BufferedReader br = new BufferedReader(new InputStreamReader(
         new FileInputStream(filePath)));
         for (String line = br.readLine(); line != null; line = br.readLine()) {
              list.add(line); 
        }
         br.close();
         return list;
     }
     }
     

