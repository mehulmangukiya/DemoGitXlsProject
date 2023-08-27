package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		
		//copy log4j properties file into src folder.
		//Add jar file log4j
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("Hello");
		print.debug("We're writing into log file");
		print.debug("starting the test case xyz test");
	}

}
