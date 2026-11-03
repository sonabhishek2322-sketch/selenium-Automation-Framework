package com.demowebshop.genericutilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
	Select select;
	//Selection
	public void selectAnOption(WebElement selectElement,String value) {
		select  = new Select(selectElement);
		select.selectByValue(value);	
	}
	public void selectAnOption(WebElement selectElement,int index) {
		select  = new Select(selectElement);
		select.selectByIndex(index);
    }
	public void selectAnOption(String visibletext,WebElement selectElement) {
		select  = new Select(selectElement);
		select.deSelectByContainsVisibleText(visibletext);
	}
	//DeSelection
		public void deselectAnOption(WebElement selectElement,String value) {
			select  = new Select(selectElement);
			select.deselectByValue(value);	
		}
		public void deselectAnOption(WebElement selectElement,int index) {
			select  = new Select(selectElement);
			select.deselectByIndex(index);
	    }
		public void deselectAnOption(String visibletext,WebElement selectElement) {
			select  = new Select(selectElement);
			select.deSelectByContainsVisibleText(visibletext);
		}
}