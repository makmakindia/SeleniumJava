package alpa;

import org.apache.logging.log4j.*;
public class demo {
	
	private static Logger log=LogManager.getLogger(demo.class.getName());

	public static void main(String[] args) {
		
		log.debug("Log Debug...!");
		log.error("Log Debug...!");
		log.info("Log Debug...!");
		log.fatal("Log Debug...!");

	}

}
