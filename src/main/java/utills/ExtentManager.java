package utills;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	/** The extent object. */
	static ExtentReports extent;

	/**
	 * Gets the reporter for Extent Reports.
	 *
	 * @return the reporter
	 */
	public static synchronized ExtentReports getReporter() {
		if (extent == null) {
			extent = new ExtentReports(System.getProperty("user.dir") + "/Output/ExtentReportResults.html", true); // new ExtentReports(filePath, true) do not append
			// extent.x("",23); // Use only on MongoDB , previously extent.x() default
			// localhost and port
			extent.loadConfig(new File("config/extent-config.xml"));
			System.out.println("Extent Initialized");
		}
		return extent;
	}
}
