package CompleteProject.ACompleteProject;

import org.testng.annotations.Test;

import Utility.LaunchChrome;

public class callingBrowser {
	
	
	
	
@Test
public void callBrowser() {
	try {
		LaunchChrome ch = new LaunchChrome();
		LaunchChrome.launchChromeBrowser();
		ch.maximiseWindow();
		ch.mandatorySleep();
		LaunchChrome.manageImplicitWait();
		ch.manageExplicitWait();
		ch.quitBrowser();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
