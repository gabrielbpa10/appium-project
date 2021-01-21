package br.com.appium.pages;

import org.openqa.selenium.By;

import br.com.appium.mybasepage.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class LoginPage extends BasePage {

	private static By buttonRegister = By.id("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
	private static By buttonLogin = By.id("br.com.alura.aluraesporte:id/login_botao_logar");
	private static By inputUser = By.id("br.com.alura.aluraesporte:id/input_usuario");
	private static By inputPassword = By.id("br.com.alura.aluraesporte:id/input_senha");
	
	public LoginPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	public RegisterPage clickRegister() {
		this.click(buttonRegister);
		return new RegisterPage(super.driver);
	}
	
	public boolean verifyButtonLoginPresent() {
		return this.verifyElementAbled(buttonLogin);
	}
	
	public void writeUser(String user) {
		this.writeText(inputUser, user);
	}
	
	public void writePassword(String password) {
		this.writeText(inputPassword, password);
	}
	
	public MenuPage clickLogin() {
		this.click(buttonLogin);
		return new MenuPage (super.driver);
	}
}
