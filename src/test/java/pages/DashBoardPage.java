package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardPage {
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement employeeListOption;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployeeOption;

    @FindBy(xpath = "//*[@class='menu']/ul/li")
    public List<WebElement> dashboardTabs;


    public DashBoardPage(){
        PageFactory.initElements(driver, this);
    }
}
