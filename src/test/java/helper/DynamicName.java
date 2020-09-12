package helper;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 
 * Gives Dynamic Name using current time and date.
 *
 */
public class DynamicName {

	
	/**
	 * Returns Time stamp Based on date and time. 
	 * 
	 * @return TimeStamp {@link String}
	 */
	public String getName() {

		String timeStamp = new SimpleDateFormat("_MM_dd_yy_HH_mm_ss").format(new Date());// time stamp
		return timeStamp;
	}
/**
 * Returns Random String
 * 
 * @return random {@link String}
 */
	public static String randomString() {

		String random = RandomStringUtils.randomAlphabetic(8);
		System.out.println(random);
		return random;

	}

}
