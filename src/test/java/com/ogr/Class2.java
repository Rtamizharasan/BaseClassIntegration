package com.ogr;

import java.io.IOException;

import org.base.Base1;
import org.openqa.selenium.WebElement;

import com.ogg.Class1;

public class Class2 extends Base1 {
	
public static void main(String[] args) throws IOException {
	launch("https://blazedemo.com/");
	Class1 class1 = new Class1();
	WebElement depart = class1.getDepart();
	String text = class1.getValueFromExcel(0, 0);
	System.out.println(text);
String depar = class1.getValueFromExcel(0, 1);
class1.select(depart, text, depar, 0);
WebElement arrival = class1.getArrival();
String ariv = class1.getValueFromExcel(1, 1);
select(arrival, text, ariv, 0);

WebElement findFligh = class1.getFindFligh();
findFligh.click();

WebElement chooseThisFlight = class1.getChooseThisFlight();
chooseThisFlight.click();

WebElement name = class1.getName();
String name1 = class1.getValueFromExcel(2, 1);
name.sendKeys(name1);

WebElement address = class1.getAddress();
String add = class1.getValueFromExcel(3, 1);
address.sendKeys(add);

WebElement city = class1.getCity();
String cit = class1.getValueFromExcel(4, 1);
city.sendKeys(cit);

WebElement state = class1.getState();
String stat = class1.getValueFromExcel(5, 1);
state.sendKeys(stat);

WebElement zipCode = class1.getZipCode();
String zip = class1.getValueFromExcel(6, 1);
zipCode.sendKeys(zip);

WebElement creditCard = class1.getCreditCard();
String credit = class1.getValueFromExcel(7, 1);
creditCard.sendKeys(credit);

WebElement month = class1.getMonth();
String month1 = class1.getValueFromExcel(8, 1);
month.sendKeys(month1);

WebElement year = class1.getYear();
String cityea = class1.getValueFromExcel(9, 1);
year.sendKeys(cityea);

WebElement nameOnCard = class1.getNameOnCard();
String name2 = class1.getValueFromExcel(10, 1);
nameOnCard.sendKeys(name2);

WebElement chkbox = class1.getChkbox();
chkbox.click();

WebElement purchase = class1.getPurchase();
purchase.click();

WebElement printId = class1.getPrintId();
String text1 = printId.getText();
System.out.println(text1);
String writeCell = class1.writeCell(text1, 1, 6);

}	

}
