package Labor.tests.helpers;

import Labor.tests.pages.AddShiftPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class AddShiftHelper extends AddShiftPage {


    public void checkDepartmentCondition() {
        schedulesTab.click();
        schedulesDropdown.click();
        WebElement checkBox = driver.findElement(By.cssSelector("div > div:nth-child(4) > div:nth-child(2) > label > input[type=checkbox]"));
        String requiredDepartment = String.valueOf(checkBox.getAttribute("checked"));
        if (requiredDepartment.contains("true")) {
            schedulesTab.click();
            return;
        } else {
            departmentFOH.click();
            schedulesTab.click();
        }
    }

    public void checkScheduleCondition(String publish) throws InterruptedException {
        Thread.sleep(10000);
        WebElement checkBox = driver.findElement(By.cssSelector("#msg_pub_26506637"));
        System.out.println(checkBox);
        String currentCondition = checkBox.getText();
        System.out.println("current condition " + currentCondition);
        if (currentCondition.equalsIgnoreCase(publish)) {
            System.out.println("specified mode `" + currentCondition + "` is already selected!");
            return;
        } else {
            checkBoxPublish.click();
            proceedButton.click();

            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert data: " + alertText);
            alert.accept();
        }
    }

    public void addingShift() {
        WebElement moveToRow = driver.findElement(By.cssSelector("#emp_100008150"));
        new Actions(driver)
                .moveToElement(moveToRow)
                .build()
                .perform();
        employeeDayWed.click();
        expandRoleDropdown.click();
        selectRole.click();
        shiftStart.click();
        WebElement moveToStartTime = driver.findElement(By.cssSelector("ul > li:nth-child(41)"));
        new Actions(driver)
                .moveToElement(moveToStartTime)
                .build()
                .perform();
        selectStartTime.click();
        shiftEnd.click();
        WebElement moveToEndTime = driver.findElement(By.cssSelector("div:nth-child(11) > ul > li:nth-child(69)"));
        new Actions(driver)
                .moveToElement(moveToEndTime)
                .build()
                .perform();
        selectEndTime.click();
        saveButton.click();
    }
}