package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.LibGlobal;
import com.pojo.DetailsPage;
import com.pojo.HotelPage;
import com.pojo.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition extends LibGlobal {

	@Given("User is on the adactin login page")
	public void user_is_on_the_adactin_login_page() {
		getDriver();
		loadUrl("http://adactinhotelapp.com/index.php", driver);
		maximize(driver);
	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String username, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);
	}

	@When("User should enter the Room Details{string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_enter_the_Room_Details_and(String location, String hotel, String roomType, String noOfRooms,
			String CheckInDate, String CheckOutDate, String adults, String child) {
		HotelPage hotelPage = new HotelPage();
		hotelPage.hotel(location, hotel, roomType, noOfRooms, CheckInDate, CheckOutDate, adults, child);
	}

	@When("user should click the search button")
	public void user_should_click_the_search_button() {
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		toClick(btnSubmit);
	}

	@When("user should select the room by clicking radio button and click continue")
	public void user_should_select_the_room_by_clicking_radio_button_and_click_continue() {
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		toClick(btnRadio);
		WebElement btnContinue = driver.findElement(By.id("continue"));
		toClick(btnContinue);
	}

	@When("user should enter the payment details{string},{string},{string}")
	public void user_should_enter_the_payment_details(String firstName, String lastName, String address,
			io.cucumber.datatable.DataTable dataTable) {
		DetailsPage detailsPage = new DetailsPage();

		List<Map<String, String>> maps = dataTable.asMaps();
		Map<String, String> m = maps.get(2);
		String cNumber = m.get("cardNumber");
		System.out.println(cNumber);

		String cType = m.get("cardType");
		System.out.println(cType);

		String mnth = m.get("month");
		System.out.println(mnth);

		String yr = m.get("year");
		System.out.println(yr);

		String cvvnum = m.get("cvvNumber");
		System.out.println(cvvnum);

		detailsPage.details(firstName, lastName, address, cNumber, cType, mnth, yr, cvvnum);

	}

	@When("user should click the book now button")
	public void user_should_click_the_book_now_button() throws InterruptedException {
		WebElement btnBook = driver.findElement(By.id("book_now"));
		toClick(btnBook);
		Thread.sleep(10000);

	}

	@When("get order id in console")
	public void get_order_id_in_console() {
		WebElement txtOrderId = driver.findElement(By.id("order_no"));
		String text = txtOrderId.getAttribute("value");
		System.out.println("\n Order id is " + text);

	}

	@Then("user should click the my itenerary button")
	public void user_should_click_the_my_itenerary_button() {
		WebElement btnIteranary = driver.findElement(By.id("my_itinerary"));
		toClick(btnIteranary);
		quit(driver);

	}

}
