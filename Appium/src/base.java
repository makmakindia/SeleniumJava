import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsElement;

public class base {

	public static AndroidDriver<WindowsElement> Capabilities1() throws MalformedURLException {
		
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ArunDemo");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	
		AndroidDriver<WindowsElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
		
		
	
	}
	
	

}
