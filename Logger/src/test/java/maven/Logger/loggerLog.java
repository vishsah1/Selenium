package maven.Logger;

import org.apache.logging.log4j.*;

public class loggerLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log = LogManager.getLogger("loggerLog");
		System.out.println("Logger Java Class Message");
		
		log.info("info msg");
		log.debug("debug msg");
		log.atError();
		log.atWarn();
//		log.fatal("Fatal msg");
	}
}
