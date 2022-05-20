package Labor.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddShiftPage extends BasePage{

	@FindBy(css="#check_approve_26506637")
	protected WebElement checkBoxPublish;

	@FindBy(css="#ok")
	protected WebElement proceedButton;

	@FindBy(css="#display_locations")
	protected WebElement schedulesDropdown;

	@FindBy(css=" div:nth-child(4) > div:nth-child(2)")
	protected WebElement departmentFOH;

	@FindBy(css="#nav_schedule")
	protected WebElement schedulesTab;

	@FindBy(css="#emp_100032841 > td:nth-child(5) > ul")
	protected WebElement employeeDayWed;

	@FindBy(css="#role_id")
	protected WebElement expandRoleDropdown;

	@FindBy(css="#role_id > option:nth-child(5)")
	protected WebElement selectRole;

	@FindBy(css="#shift_start")
	protected WebElement shiftStart;

	@FindBy(css="#shift_end")
	protected WebElement shiftEnd;

	@FindBy(css="ul > li:nth-child(41)")
	protected WebElement selectStartTime;

	@FindBy(css="div:nth-child(11) > ul > li:nth-child(77)")
	protected WebElement selectEndTime;

	@FindBy(css="#saveShiftAction")
	protected WebElement saveButton;



}
