package time_Track;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.Time_TaskPage;

public class Acti_TimeTrack_051Test extends Base_Class{

	@Test
	public void sample() throws InterruptedException {
		ExcelUtil elib =new ExcelUtil();
		
		homePage.getTime_track().click();
		String expectedTimeTrack=elib.readStringDataFromExcel("Sheet1", 9, 1);
		Assert.assertEquals(driver.getCurrentUrl(),expectedTimeTrack,"Time-Track  page  is not displayed Succesfully");
		Reporter.log("Time-Track page  is  displayed Succesfully", true);
		
		String CustomerName=elib.readStringDataFromExcel("Sheet1", 1, 1);
		String ProjectName=elib.readStringDataFromExcel("Sheet1", 1, 2);
		String TaskName=elib.readStringDataFromExcel("Sheet1", 1, 3);


		Time_TaskPage Timetask= new Time_TaskPage(driver);
		Timetask.getAddTaskButton().click();
		Thread.sleep(3000);
		
		Timetask.getCustomer().click();
		Timetask.getNewCustomer().click();
		Timetask.getCustomerName().sendKeys(CustomerName);
		Timetask.getProjectName().sendKeys(ProjectName);
		Timetask.getTaskName().click();
		Timetask.getEnterTaskName().sendKeys(TaskName);
		Timetask.getCreateTasks().click();
		
		Reporter.log("Task created Succesfully", true);

	}

}
