import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class StepsToLogin {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println " Given statement "
		WebUI.openBrowser('')		
		WebUI.navigateToUrl(GlobalVariable.URL)

	}

	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username,String password) {
		println " when  statement "
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), username)		
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), password)
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		println " And for action "
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
		println " Then for results  "
		WebUI.verifyTextPresent('Dashboard', false)	
		WebUI.closeBrowser()
	}
}
