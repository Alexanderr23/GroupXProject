package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="middleName")
    public WebElement middleName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    @FindBy(id="photofile")
    public WebElement photograph;

    @FindBy(id="chkLogin")
    public WebElement checkBox;

    @FindBy(id="user_name")
    public WebElement usernameEmployee;

    @FindBy(id="user_password")
    public WebElement passwordEmployee;

    @FindBy(id="re_password")
    public WebElement confirmPasswordEmployee;

    @FindBy(xpath = "//input[@name='employeeId']")
    public WebElement userID;





 //   public AddEmployeePage(){
  //      PageFactory.initElements(driver, this);

 //   }

}
