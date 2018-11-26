package implementations;

import genericinterface.GenericActions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public abstract class OCR_Methods implements GenericActions
{
	public static final String Read_File = null;

	public static String crackImage(WebDriver driver, String input_File, String output_File, String ocrFilePath) throws IOException
	{
		String imageText = null;
		String input_file = input_File;
		String output_file = output_File;
		String tesseract_install_path = ocrFilePath;
		String[] command =
		{ "cmd", };
		Process p;
		try
		{
			p = Runtime.getRuntime().exec(command);
			new Thread(new SyncPipe(driver, p.getErrorStream(), System.err)).start();
			new Thread(new SyncPipe(driver, p.getInputStream(), System.out)).start();
			PrintWriter stdin = new PrintWriter(p.getOutputStream());
			stdin.println("\"" + tesseract_install_path + "\" \"" + input_file + "\" \"" + output_file + "\" -l eng");
			stdin.close();
			p.waitFor();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			imageText = OCR_Methods.readFile(driver, output_file + ".txt");
			/* System.out.println(imageText); */
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return imageText;
	}

	public static String readFile(WebDriver driver, String file_name)
	{
		BufferedReader br = null;
		String read_string = "";
		try
		{
			String sCurrentLine;
			br = new BufferedReader(new FileReader(file_name));
			while ((sCurrentLine = br.readLine()) != null)
			{
				read_string = read_string + sCurrentLine;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{
				if (br != null)
					br.close();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return read_string;
	}

	// Read text From WebPage Image
	public static String readStringFromWebpageImage(WebDriver driver, String ele, String FilePath, String ocrFilePath) throws IOException
	{
		WebElement element = driver.findElement(By.xpath(ele));
		String time = ReusableMethodsImplementation.DateNtime(driver);
		Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, element);
		String inputFilePath = FilePath + time + ".png";
		File file = new File(inputFilePath);
		ImageIO.write(screenshot.getImage(), "PNG", file);
		String outputFilePath = FilePath + time + "";
		System.out.println("Text Convertion is done");
		String imageText = OCR_Methods.crackImage(driver, inputFilePath, outputFilePath, ocrFilePath);
		return imageText;
	}
}
