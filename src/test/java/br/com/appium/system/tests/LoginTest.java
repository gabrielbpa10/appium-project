package br.com.appium.system.tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import br.com.appium.pages.LoginPage;
import br.com.appium.pages.MenuPage;
import br.com.appium.pages.RegisterPage;

public class LoginTest extends BaseTest {

	private LoginPage loginScreen = null;
	private MenuPage menuScreen = null;
	private RegisterPage registerScreen = null;
	
	@Test
	public void user_make_login() {
		loginScreen = new LoginPage(driver);
		registerScreen = loginScreen.clickRegister();
		registerScreen.writeName("Gabriel");
		registerScreen.writePassword("123");
		registerScreen.writeConfirmPassword("123");
		loginScreen = registerScreen.clickRegister();
		
		loginScreen.writeUser("Gabriel");
		loginScreen.writePassword("123");
		menuScreen = loginScreen.clickLogin();
		assertTrue(menuScreen.verifyTextMenu("Lista de produtos"));
	}
}
