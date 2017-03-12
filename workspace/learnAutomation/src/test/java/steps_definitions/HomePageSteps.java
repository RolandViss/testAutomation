package steps_definitions;

import org.openqa.selenium.support.PageFactory;

//import config.Configuration;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_objects.HomePage;
import utilities.MyDriver;

public class HomePageSteps {
	MyDriver driver = new MyDriver();
	HomePage homePage = new HomePage();

	public HomePageSteps() {
		PageFactory.initElements(this.driver, this.homePage);
	}

	@When("^I navigate to the Home page$")
	public void i_navigate_to_the_Home_page() throws Throwable {
		System.out.println("step 1");
		//Configuration.Url.app_url
		driver.navigate().to("https://www.google.ru");
		separateLineForFun();
	}

	@Then("^I see search feald$")
	public void i_see_search_feald() throws Throwable {
		System.out.println("step 2");
		separateLineForFun();
	}

	@When("^I text iin search filed$")
	public void i_text_iin_search_filed() throws Throwable {
		System.out.println("step 3");
		separateLineForFun();
	}

	@Then("^I see results$")
	public void i_see_results() throws Throwable {
		System.out.println("step 4");
		separateLineForFun();
		
	}
	
	private void separateLineForFun(){
		System.out.println("----------------");
	}

}
