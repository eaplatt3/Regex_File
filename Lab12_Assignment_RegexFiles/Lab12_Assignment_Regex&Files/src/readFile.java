import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readFile {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		int ctr = 0;
		int ctr1 = 0;
		int ctr2 = 0;
		
		File inFile = new File("stdData.csv");
		
		Scanner scanIn = new Scanner(inFile);

		while(scanIn.hasNext()) {
			String str = scanIn.next();
			String pattern = "Sen";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(str);
			
			String pattern1 = "std";
			Pattern p1 = Pattern.compile(pattern1);
			Matcher m1 = p1.matcher(str);
			
			String pattern2 = "[0.0-9.9]+";
			Pattern p2 = Pattern.compile(pattern2);
			Matcher m2 = p2.matcher(str);
			
			while(m.find()) {
				ctr++;
				
			}
			
			while(m1.find()) {
				ctr1++;
				
			}
			
			while(m2.find()) {
				ctr2++;
				
			}
			
			//System.out.println(str);
			
		}
		System.out.println("There are " + ctr + " Different Tests in the File");
		System.out.println("There is " + ctr1 + " Tests For Each test_Class");
		System.out.println(ctr2);
		
		scanIn.close();

	}

}
