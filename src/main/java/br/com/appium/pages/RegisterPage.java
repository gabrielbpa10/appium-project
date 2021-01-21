package br.com.appium.pages;

import org.openqa.selenium.By;

import br.com.appium.mybasepage.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RegisterPage extends BasePage {

	private By inputName = By.id("br.com.alura.aluraesporte:id/input_nome");
	private By inputPassword = By.id("br.com.alura.aluraesporte:id/input_senha");
	private By inputConfirmPassword = By.id("br.com.alura.aluraesporte:id/input_confirmar_senha");
	private By buttonRegister = By.id("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
	private By msnError = By.id("br.com.alura.aluraesporte:id/erro_cadastro");
	
	public RegisterPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	public void writeName(String name) {
		this.writeText(inputName, name);
	}

	public void writePassword(String password) {
		this.writeText(inputPassword, password);
	}
	
	public void writeConfirmPassword(String confirmPassword) {
		this.writeText(inputConfirmPassword, confirmPassword);
	}
	
	public LoginPage clickRegister() {
		this.click(buttonRegister);
		return new LoginPage(super.driver);
	}
	
	public String getMenssageError() {
		return this.retornarTextScreen(msnError);
	}
}
