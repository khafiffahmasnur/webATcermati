package steps;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.systeminfo.model.Size;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStep {
	
	WebDriver driver;
	String email = "#email";
	String sandi = "#password";
	String konfirmasiSandi ="#confirm-password";
	String namaDepan = "#first-name";
	String namaBelakang = "#last-name";
	String nomorTelepon = "#mobile-phone";
	String kabupatenKota = "#residence-city";
	String buttonDaftar = ".btn[type='submit']";
	String autoComplete = ".autocomplete-list";
	
	
	@Given("user navigation to {string}")
	public void user_navigation_to(String string) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}
	@And("user input email with {string}")
	public void user_input_email_with(String string) {
		driver.findElement(By.cssSelector(email)).sendKeys(string);
	}
	@And("user input kata sandi with {string}")
	public void user_input_kata_sandi_with(String string) {
	    driver.findElement(By.cssSelector(sandi)).sendKeys(string);
	}
	@And("user input konfirmasi kata sandi with {string}")
	public void user_input_konfirmasi_kata_sandi_with(String string) {
		driver.findElement(By.cssSelector(konfirmasiSandi)).sendKeys(string);
	}
	@And("user input nama depan with {string}")
	public void user_input_nama_depan_with(String string) {
		driver.findElement(By.cssSelector(namaDepan)).sendKeys(string);
	}
	@And("user input nama belakang with {string}")
	public void user_input_nama_belakang_with(String string) {
		driver.findElement(By.cssSelector(namaBelakang)).sendKeys(string);
	}
	@And("user input nomor telepon with {string}")
	public void user_input_nomor_telepon_with(String string) {
		driver.findElement(By.cssSelector(nomorTelepon)).sendKeys(string);
	}
	@When("user input kabupaten\\/kota with {string}")
	public void user_input_kabupaten_kota_with(String string) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.cssSelector(kabupatenKota)).sendKeys(string);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Then("user click button daftar akun")
	public void user_click_button_daftar_akun() throws InterruptedException {
		driver.findElement(By.cssSelector(autoComplete)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(buttonDaftar)).click();
		
	}

}