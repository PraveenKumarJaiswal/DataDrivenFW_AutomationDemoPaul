package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * Read config File Data.
 */
public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	/**
	 * Returns The Base URL form config file.
	 * 
	 * @return URL {@link String}.
	 */
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	/**
	 * Returns The UserName form config file .
	 * 
	 * @return UserName {@link String}
	 */
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}

	/**
	 * Returns The password form config file.
	 * 
	 * @return Password {@link String}
	 */
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	/**
	 * Returns the oganization form config file.
	 * 
	 * @return organization {@link String}
	 */
	public String getOrganization() {
		String password = pro.getProperty("organisation");
		return password;
	}

	/**
	 * Returns the Path of chrome driver form config file.
	 * 
	 * @return chromepath {@link String}
	 */
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	/**
	 * Returns the Path of IE driver form config file.
	 * 
	 * @return iepath {@link String}
	 */
	public String getIEPath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}

	/**
	 * Returns the Path of firefox driver form config file.
	 * 
	 * @return firefoxpath {@link String}
	 */
	public String getFirefoxPath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}

}
