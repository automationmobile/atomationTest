package implementations;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadImage {
	
		public static void setClipboardData(String string) {
	        //StringSelection is a class that can be used for copy and paste operations.
	           StringSelection stringSelection = new StringSelection(string);
	           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	           System.out.println(stringSelection);
	        }
	public static void upload(String fileLocation) {
	try {
	//Setting clipboard with file location
		StringSelection stringSelection = new StringSelection(fileLocation);
		System.out.println(stringSelection);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	//native key strokes for CTRL, V and ENTER keys
	Robot robot = new Robot();

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	} catch (Exception exp) {
	exp.printStackTrace();
	}
	}
	}



