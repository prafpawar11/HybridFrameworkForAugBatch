package com.UtilsLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.BaseLayer.baseClass;

public class pune extends baseClass implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {

	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigating to URL is ::" + url);

	}

	public void afterNavigateTo(String url, WebDriver driver) {

		System.out.println("After navigating to URL is ::" + url);

	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before trying to find " + by.toString());

	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {

		System.out.println("After finding the Element:: " + by.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {

		System.out.println("Trying to click on Element is ::" + element.toString());

	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on Element is ::" + element.toString());
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Before Changing the value of element is ::" + element.toString());

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

		System.out.println("After Changing the value of element is ::" + element.toString());

	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("Exception is occure");

		UtilsClass.TakeScreenShotAttheEnd();

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub

	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub

	}

	public void beforeGetText(WebElement element, WebDriver driver) {

		System.out.println("Before getting the element Text " + element.toString());

	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {

		System.out.println("After getting the element Text " + element.toString());

	}
}
