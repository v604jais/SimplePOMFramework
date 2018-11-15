package utills;

import com.relevantcodes.extentreports.LogStatus;

 

public class Log {
	public static void info(String infoMsg)
	{
		//Log.info(infoMsg); 
		
		// include non null check for getTest()
		ExtentTestManager.getTest().log(LogStatus.INFO,infoMsg);
		
	}
	
	public static void groupPass(String testName)
	{
	//	Log.info("========== Passed: "+testName+" =========="); 
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"========== Passed: "+testName+" ==========");
	}
	
	/**
	 * 
	 * 
	 * @param skipMsg
	 */
	public static void skip(String skipMsg) // Please Note : This method is to be called from TestScripts only followed by script exit. 
	{
	//	Log.info(skipMsg);
		
		try
		{
			if(ExtentTestManager.getTest()==null) {System.err.println("Warning : Test not initialised"); return;}
			
			ExtentTestManager.getTest().log(LogStatus.SKIP,skipMsg);	
		}
		catch(Exception e)
		{
			System.err.println("Unable to log skip message to Extent  \n"+e.toString());e.printStackTrace();
		}			
	}
}
