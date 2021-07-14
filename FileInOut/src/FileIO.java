import java.io.*;
import javax.swing.JOptionPane;

public class FileIO {

	public static void main(String[] args) 
	{
		//Initialize Variables
		int linecount = 0;
		int charactercount = 0;
		String line;
		
		//Read in File name from the User
		String inName = JOptionPane.showInputDialog("Enter Input File Name:");
	    
		//Open the File
		try {
			
			BufferedReader inBuf = new BufferedReader(new FileReader("src/" + inName));
			
			//while not at the end of file
			while((line = inBuf.readLine()) != null)
			{
			//increment line count	
			linecount++;
			//line length returns number of characters
			charactercount += line.length();
			}
			//Close the file
			inBuf.close();
		}
		//Handle Exceptions
		catch (FileNotFoundException f) {
			JOptionPane.showMessageDialog(null, "File Cannot be Found. Details: \n" + f);
			}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, "An Error Occurred when trying to Open the File. Details: \n" + e);
			}
		
		//Display Results
		JOptionPane.showMessageDialog(null, "Number of Lines in Text =", inName, linecount);
		JOptionPane.showMessageDialog(null, "Number of Characters in Text =", inName, charactercount);
	 }
}
