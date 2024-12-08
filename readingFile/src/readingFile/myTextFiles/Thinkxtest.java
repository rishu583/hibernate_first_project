package readingFile.myTextFiles;

import java.io.FileInputStream;
import java.io.IOException;

public class Thinkxtest {

	public static void main(String[] args) throws IOException {
		
		
		// Create  a FileInputStream Object
		FileInputStream fin=null;
		int track;
		
		fin=new FileInputStream("configuration_for_spring_and_hibernate.txt");
		do {
			track=fin.read();
			System.out.print((char) track);
		}while(track!=-1);

	}

}
