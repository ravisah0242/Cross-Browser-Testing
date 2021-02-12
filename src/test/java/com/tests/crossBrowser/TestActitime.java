package com.tests.crossBrowser;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.crossBrowser.BaseTest;
import com.pages.crossBrowser.ActitimeLoginPage;

public class TestActitime  extends BaseTest
{
	@Test
	public void signupMath() throws IOException
	{
		ActitimeLoginPage login=new  ActitimeLoginPage(driver);
		login.loginMethod();
	}

}
