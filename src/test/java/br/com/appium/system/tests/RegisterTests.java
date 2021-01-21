package br.com.appium.system.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import br.com.appium.pages.LoginPage;
import br.com.appium.pages.RegisterPage;

public class RegisterTests extends BaseTest{

	private LoginPage loginScreen = null;
	private RegisterPage registerScreen = null;

	@Test
	public void user_confirm_wrong_password() {
		loginScreen = new LoginPage(driver);
		registerScreen = loginScreen.clickRegister();
		registerScreen.writeName("Gabriel");
		registerScreen.writePassword("123");
		registerScreen.writeConfirmPassword("321");
		registerScreen.clickRegister();
		assertEquals("Senhas não conferem", registerScreen.getMenssageError());
	}

	@Test
	public void user_confirm_register() {
		loginScreen = new LoginPage(driver);
		registerScreen = loginScreen.clickRegister();
		registerScreen.writeName("Gabriel");
		registerScreen.writePassword("123");
		registerScreen.writeConfirmPassword("123");
		loginScreen = registerScreen.clickRegister();
		assertTrue(loginScreen.verifyButtonLoginPresent());
	}
}
