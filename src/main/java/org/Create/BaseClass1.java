package org.Create;



	import java.awt.AWTException
	;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.List;
	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass1 {
		// WebDriver Methods
		public static EdgeDriver driver;

		public static void launchBrowser() {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		

		public static void launchUrl(String url) {
			driver.get(url);
		}

		public static void maxi() {
			driver.manage().window().maximize();
		}

		public static String Pagetitle() {
			String title = driver.getTitle();
			return title;
			// System.out.println(title);
		}

		public static String PageUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
			// System.out.println(currentUrl);
		}
		
		

		public static void crunt_tab() {
			driver.close();
		}

		public static void all_tab() {
			driver.quit();
		}
		

		// WebElement Methods
		public static void click(WebElement e) {
			e.click();
		}

		public static void value(WebElement e, String v) {
			e.sendKeys(v);
		}

		public static void clear(WebElement e) {
			e.clear();
		}
		

		public static void text(WebElement e) {
			String text = e.getText();
			System.out.println(text);
		}
		

		public static void tagName(WebElement e) {
			String tagName = e.getTagName();
			System.out.println(tagName);

		}
		public static void PassText(String v , WebElement e ) {
			String PassText = e.getText();
			System.out.println(PassText);
		}

		public static void atb_Name(WebElement e, String att) {
			String attribute = e.getAttribute(att);
			System.out.println(attribute);
		}

		// Select Methods

		public static void select_index(WebElement e, int i, String v) {
			Select s = new Select(e);
			s.selectByIndex(i);
			s.selectByValue(v);
			s.selectByVisibleText(v);
			s.deselectByIndex(i);
			s.deselectByValue(v);
			s.deselectByVisibleText(v);
		}

		public static void options(WebElement e) {
			Select s = new Select(e);
			List<WebElement> all_opt = s.getAllSelectedOptions();
			for (WebElement opt : all_opt) {
				System.out.println(opt.getText());
			}
		}

		public static void de_options(WebElement e) {
			Select s = new Select(e);
			s.deselectAll();
		}

		// Actions
		public static void moveTo(WebDriver d, WebElement e) {
			Actions a = new Actions(d);
			a.moveToElement(e).build().perform();
		}

		public static void click(WebDriver d, WebElement e) {
			Actions a = new Actions(d);
			a.click(e).build().perform();
		}

		public static void right_Click(WebDriver d, WebElement e) {
			Actions a = new Actions(d);
			a.contextClick(e).build().perform();
		}

		public static void double_click(WebDriver d, WebElement e) {
			Actions a = new Actions(d);
			a.doubleClick(e).build().perform();
		}

		// Robot
		public static void tab() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}

		public static void up() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);

		}

		public static void down() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		public static void right() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		}

		public static void left() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		}

		public static void enter() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		// JavascriptExecutor
		public static void js_click(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", e);

		}

		public static void scroll_page(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoview()", e);
		}

		// TakeScreenshot
		public static void screenshot(String path) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyFile(source, dest);
		}

		// write data to excel file
		public static void CreateNewExcelfile() throws IOException {
			File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenInm\\Excel\\newExcel.xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet newSheet = w.createSheet("Sheet1");
			Row newRow = newSheet.createRow(0);
			Cell newCell = newRow.createCell(0);
			newCell.setCellValue("");
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);

		}

	}


