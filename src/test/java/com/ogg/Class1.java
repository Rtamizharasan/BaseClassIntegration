package com.ogg;

import org.base.Base1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Class1 extends Base1 {
	public Class1() {
PageFactory.initElements(driver, this);

	}
@FindBy(xpath="/html/body/div[3]/form/select[1]")
private WebElement depart;
public WebElement getDepart() {
	
	return depart;
}

@FindBy(name="toPort")
private WebElement arrival;
public WebElement getArrival() {
	return arrival;
}

@FindBy(xpath="/html/body/div[3]/form/div/input")
private WebElement findFligh;
public WebElement getFindFligh() {
	return findFligh;
}

@FindBy(xpath="/html/body/div[2]/table/tbody/tr[4]/td[1]/input")
private WebElement chooseThisFlight;
public WebElement getChooseThisFlight() {
	return chooseThisFlight;
}
@FindBy(id="inputName")
private WebElement name;
public WebElement getName() {
	return name;
}

@FindBy(id="address")
private WebElement address;
public WebElement getAddress() {
	return address;
}

@FindBy(id="city")
private WebElement city;
public WebElement getCity() {
	return city;
}
@FindBy(id="state")
private WebElement state;
public WebElement getState() {
	return state;
}
@FindBy(id="zipCode")
private WebElement zipCode;
public WebElement getZipCode() {
	return zipCode;
}

@FindBy(id="creditCardNumber")
private WebElement creditCard;
public WebElement getCreditCard() {
	return creditCard;
}
@FindBy(id="creditCardMonth")
private WebElement month;
public WebElement getMonth() {
	return month;
}
@FindBy(id="creditCardYear")
private WebElement year;
public WebElement getYear() {
	return year;
}

@FindBy(id="nameOnCard")
private WebElement nameOnCard;
public WebElement getNameOnCard() {
	return nameOnCard;
}
@FindBy(id="rememberMe")
private WebElement Chkbox;
public WebElement getChkbox() {
	return Chkbox;
}
@FindBy(xpath="/html/body/div[2]/form/div[11]/div/input")
private WebElement purchase;
public WebElement getPurchase() {
	return purchase;
}

@FindBy(xpath="/html/body/div[2]/div/table/tbody/tr[1]/td[2]")
private WebElement printId;
public WebElement getPrintId() {
	return printId;
}

	}
	
