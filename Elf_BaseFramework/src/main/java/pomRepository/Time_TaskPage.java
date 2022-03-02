package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Time_TaskPage {
	
	public  Time_TaskPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='addTasksImg']") private WebElement addTaskButton;
	public WebElement getAddTaskButton() {
		return addTaskButton;
	}

	@FindBy(xpath="//tr[@class='selectCustomerRow']/..//div[contains(@class,'customerSelector customerOrProjectSelector')]")
	//@FindBy(xpath="(//div[@class='dropdownButton'])[5]")
	private WebElement customer;
	
	public WebElement getCustomer() {
		return customer;
	}
	@FindBy(xpath="//div[text()='- New Customer -']")
	private WebElement newCustomer;
	
	
	public WebElement getNewCustomer() {
		return newCustomer;
	}
	@FindBy(xpath="//input[contains(@class,'newCustomer newCustomerProjectField')]")
	private WebElement CustomerName;
	public WebElement getCustomerName() {
		return CustomerName;
	}
	@FindBy(xpath="//input[contains(@class,'newProject newCustomerProjectField')]")
	private WebElement ProjectName;
	public WebElement getProjectName() {
		return ProjectName;
	}
	//@FindBy(xpath="(//td[contains(@class,'nameCell first')])[1]")
	@FindBy(xpath="//input[@class=\"inputFieldWithPlaceholder\"]/../../../..//th[contains(text(),'Task Name')]")
	private WebElement TaskName;
	public WebElement getTaskName() {
		return TaskName;
	}
	
	@FindBy(xpath="(//td[contains(@class,'nameCell first')])[2]")
	private WebElement TaskName2;
	
	
	public WebElement getTaskName2() {
		return TaskName2;
	}
	@FindBy(xpath="(//td[contains(@class,'nameCell first')])[3]")
	private WebElement TaskName3;
	
	
	public WebElement getTaskName3() {
		return TaskName3;
	}
	@FindBy(xpath="(//input[contains(@class,'inputFieldWithPlaceholder')])[6]")
	private WebElement EnterTaskName;
	public WebElement getEnterTaskName() {
		return EnterTaskName;
	}
	
	@FindBy(xpath="(//input[contains(@class,'inputFieldWithPlaceholder')])[8]")
	private WebElement EnterTaskName2;
	
	
	public WebElement getEnterTaskName2() {
		return EnterTaskName2;
	}
	public WebElement getEnterTaskName3() {
		return EnterTaskName3;
	}
	@FindBy(xpath="(//input[contains(@class,'inputFieldWithPlaceholder')])[10]")
	private WebElement EnterTaskName3;
	
	@FindBy(xpath="//div[contains(@class,'commitButtonPlaceHolder')]")
	private WebElement CreateTasks;
	public WebElement getCreateTasks() {
		return CreateTasks;
	}
//	@FindBy(xpath="//div[text()='DesigningD']")
//	private WebElement TestingTask;
//	public WebElement getTestingTask() {
//		return TestingTask;
//	}
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement Actions;
	public WebElement getActions() {
		return Actions;
	}
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement Delete;
	
	public WebElement getDelete() {
		return Delete;
	}
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement DeletePermanently;
	
	public WebElement getDeletePermanently() {
		return DeletePermanently;
	}
	@FindBy(xpath="//div[text()='Copy properties from existing tasks']")
	private WebElement CopyProperties;
	public WebElement getCopyProperties() {
		return CopyProperties;
	}
	@FindBy(xpath="(//input[contains(@class,'inputFieldWithPlaceholder')])[7]")
	private WebElement Estimate;
	public WebElement getEstimate() {
		return Estimate;
	}
	@FindBy(xpath="(//table[contains(@class,'x-btn-wrap x-btn at-dropdown-list-btn dateButton descendantEventsEmitter ')])[1]")
	private WebElement Deadline;
	public WebElement getDeadline() {
		return Deadline;
	}
	@FindBy(xpath="//span[text()='4']")
	private WebElement Date;
	public WebElement getDate() {
		return Date;
	}
	@FindBy(xpath="(//div[@class='value ellipsis'])[2]")
	private WebElement Engineering;
	public WebElement getEngineering() {
		return Engineering;
	}
	@FindBy(xpath="(//div[text()='manufacturing'])[2]")
	private WebElement Manufacturing;
	public WebElement getManufacturing() {
		return Manufacturing;
	}
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancel;
	public WebElement getCancel() {
		return cancel;
	}
	@FindBy(xpath="(//div[@class='iScrollVerticalScrollbar iScrollLoneScrollbar'])[30]")
	private WebElement scroll;
	public WebElement getScroll() {
		return scroll;
	}
	
	}
	

