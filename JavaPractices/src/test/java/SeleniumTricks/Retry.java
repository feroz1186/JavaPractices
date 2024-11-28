package SeleniumTricks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import jdk.internal.org.jline.utils.Log;

public class Retry implements IRetryAnalyzer{
int count=0;
int max=3;
public static Logger log = LogManager.getLogger(Retry.class);
	@Override
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess())
		{
			if(this.count < max)
			{
				Log.info("Retrying test : "+result.getName()+"with status : "+getResultStatus(result.getStatus())+"for the count "+this.count);
				this.count++;
				return true;
			}
		}
		return false;
	}
	
	public String getResultStatus(int code)
	{   String resultName = null;
		if(code==1)
			resultName= "SUCCESS";
		if(code==2)
			resultName= "FAILED";
		if(code==3)
			resultName= "Skipped";
		return resultName;
		
	}
	

}
