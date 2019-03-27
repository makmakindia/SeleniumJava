package gama;

import org.apache.logging.log4j.*;
public class demo2 {
	
	private static Logger log=LogManager.getLogger(demo2.class.getName());

	public static void main(String[] args) {
		
		log.debug("Log Debug...gama!");
		log.error("Log Debug...gama!");
		log.info("Log Debug...gama!");
		log.fatal("Log Debug...gama!");

	}

}
