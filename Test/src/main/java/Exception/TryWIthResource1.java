package main.java.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWIthResource1 {
    public static void main(String[] args)
    {
    	
    	BufferedReader br = null;
        try
        {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("test.txt"));
            while ((sCurrentLine = br.readLine()) != null)
            {
                System.out.println(sCurrentLine);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (br != null)
                    br.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		/*
		 * try (BufferedReader br = new BufferedReader(new
		 * FileReader("C:\\temp\\test.txt"))) { String sCurrentLine; while
		 * ((sCurrentLine = br.readLine()) != null) { System.out.println(sCurrentLine);
		 * } } catch (IOException e) { e.printStackTrace(); }
		 */
    	
    	
    }
}