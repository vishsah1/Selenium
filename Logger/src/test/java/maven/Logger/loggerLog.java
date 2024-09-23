package maven.Logger;

import org.apache.logging.log4j.*;

public class loggerLog {
	
	private static Logger log = LogManager.getLogger(loggerLog.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Logger Java Class Message");
		log.info("info msg");
		log.debug("debug msg");
		log.atError();
		log.atWarn();
		
//		log.fatal("Fatal msg");
	}
}
