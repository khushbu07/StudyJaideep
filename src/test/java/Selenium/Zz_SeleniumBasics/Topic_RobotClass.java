package Selenium.Zz_SeleniumBasics;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/*
 * Likewise Actions Class, Robot Class is also used to perform mouse or keyboard operations.
 * But, it is used to perform such operations on Windows based pop-ups.
 */

public class Topic_RobotClass {

	public static void main(String[] args) throws Exception {

		//Copy the Image path using StringSelection & toolkit
		String imgPathTUBateria = "imagePath";
		StringSelection ss = new StringSelection(imgPathTUBateria);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Create Robot Class for Paste the Image Path on Windows popup
		Robot robot = new Robot();
		Thread.sleep(2000);
		
		// Press CTRL+V & Release CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		// Press Enter & Release ENTER
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		// Press arrow down key of keyboard
		robot.keyPress(KeyEvent.VK_DOWN);
		
		// Press & release Left click on mouse
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		// Move mouse - based on co-ordinates
		robot.mouseMove(30,100);
		
	}

}
