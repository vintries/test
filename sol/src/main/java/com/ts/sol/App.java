package com.ts.sol;

import java.io.IOException;

public class App 
{
	private static final String FILE_NAME = "file.name";
	
    public static void main( String[] args ) throws IOException
    {
    	System.out.println( "Starting app..." );
    	Terminal terminal = new Terminal(new FileBasedSolution(getFile()));
    	terminal.start();
    }

	private static String getFile() {
		if(System.getProperty(FILE_NAME) == null) {
			System.out.println("File name not found, returning default file -> ProgrammingAssignment.csv");
			return "ProgrammingAssignment.csv";
		}
		return System.getProperty(FILE_NAME);
	}
}
