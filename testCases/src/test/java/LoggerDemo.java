import org.apache.logging.log4j.*;
import org.apache.logging.*;

class LoggerDemo{
	
	private static Logger log;
	
	public static void main(String[] args) {
		
		log=  LogManager.getLogger("LoggerDemo");
		
		System.out.println("Hi");
		
		
		log.info("info");
	}
	
	
}