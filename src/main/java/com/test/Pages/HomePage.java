package com.test.Pages;

import com.test.BasePage;
import com.test.SeleniumHelper;

public class HomePage extends BasePage {

    //Objects Definition//
    public static String MyInitialsObject = ".uni-avatar__initials";
    public static String HomeTitle = "Home - Hudl";
    //End of Objects Definition//

    public static void iAmInHomePage() {
        SeleniumHelper.waitForObjectToAppear(MyInitialsObject);
        SeleniumHelper.assertTrueDisplayingPage(HomeTitle);
    }
}
