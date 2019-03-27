package beta;

import org.apache.logging.log4j.*;
public class demo1 {
	
	private static Logger log=LogManager.getLogger(demo1.class.getName());

	public static void main(String[] args) {
		
		log.debug("Log Debug...beta1!");
		log.error("Log Debug...beta1!");
		log.info("Log Debug...beta1!");
		log.fatal("Log Debug...beta1!");

	}

}
