package time_Track;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import genericLibrary.PropertyFileReader;
import pomRepository.Time_TaskPage;

public class Acti_TimeTrack_057Test extends Base_Class{

	@Test
	public void Acti_TimeTrack_057() throws InterruptedException {
		homePage.getTime_track().click();	
		ExcelUtil elib =new ExcelUtil();
		String CustomerName=elib.readStringDataFromExcel("Sheet1", 5, 1);
		String ProjectName=elib.readStringDataFromExcel("Sheet1", 5, 2);
		String TaskName=elib.readStringDataFromExcel("Sheet1", 5, 3);
		readFromPropertyFile = new PropertyFileReader();
		String estimate = readFromPropertyFile.getValueProperty("estimate");


		Time_TaskPage Timetask= new Time_TaskPage(driver);
		Timetask.getAddTaskButton().click();
		Thread.sleep(3000);
		Timetask.getCustomer().click();
		Timetask.getNewCustomer().click();
		Timetask.getCustomerName().sendKeys(CustomerName);
		Timetask.getProjectName().sendKeys(ProjectName);
		Timetask.getTaskName().click();
		Timetask.getEnterTaskName().sendKeys(TaskName);
		Timetask.getEstimate().sendKeys(estimate);
		Timetask.getDeadline().click();
		Timetask.getDate().click();
		Timetask.getEngineering().click();
		Timetask.getManufacturing().click();
		Timetask.getCancel().click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
		

}
