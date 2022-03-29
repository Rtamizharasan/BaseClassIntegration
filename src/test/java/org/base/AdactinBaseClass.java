package org.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinBaseClass extends Base1 {
	public static void main(String[] args) throws IOException, InterruptedException {

		Base1 b = new Base1();
		b.launch("https://adactinhotelapp.com/");
		String value = b.getValueFromExcel(0, 1);
		WebElement element = b.findLocator("id", value);
		String user = b.getValueFromExcel(0, 0);
		b.typeText(element, user);
		System.out.println(user);

		String v = b.getValueFromExcel(1, 1);

		WebElement element1 = b.findLocator("id", v);
		String pass = b.getValueFromExcel(1, 0);
		b.typeText(element1, pass);
		System.out.println(pass);

		String lgn = b.getValueFromExcel(2, 1);
		WebElement element2 = b.findLocator("id", lgn);
		b.submit(element2);

		String location = b.getValueFromExcel(3, 1);
		WebElement element3 = b.findLocator("id", location);
		String mel = b.getValueFromExcel(3, 0);
		b.select(element3, "text", mel, 0);

		String h = b.getValueFromExcel(4, 1);
		WebElement element4 = b.findLocator("id", h);
		String sun = b.getValueFromExcel(4, 0);
		b.select(element4, "text", sun, 0);

		String rt = b.getValueFromExcel(5, 1);
		WebElement element5 = b.findLocator("id", rt);
		String sup = b.getValueFromExcel(5, 0);
		b.select(element5, "text", sup, 0);
		String rn = b.getValueFromExcel(6, 1);
		WebElement element6 = b.findLocator("id", rn);
		String ten = b.getValueFromExcel(6, 0);
		b.select(element6, "text", ten, 0);

		String ad = b.getValueFromExcel(7, 1);
		WebElement element7 = b.findLocator("id", ad);
		String fo = b.getValueFromExcel(7, 0);
		b.select(element7, "text", fo, 0);

		String cr = b.getValueFromExcel(8, 1);

		WebElement element8 = b.findLocator("id", cr);
		String four = b.getValueFromExcel(8, 0);
		b.select(element8, "text", four, 0);

		String sub = b.getValueFromExcel(9, 1);
		WebElement element9 = b.findLocator("id", sub);
		b.submit(element9);
		String rd = b.getValueFromExcel(10, 1);
		WebElement element10 = b.findLocator("id", rd);
		b.submit(element10);
		String c = b.getValueFromExcel(11, 1);
		WebElement element11 = b.findLocator("id", c);
		b.submit(element11);
		String fn = b.getValueFromExcel(12, 1);
		WebElement element12 = b.findLocator("id", fn);
		String tam = b.getValueFromExcel(12, 0);
		b.typeText(element12, tam);

		String ln = b.getValueFromExcel(13, 1);
		WebElement element13 = b.findLocator("id", ln);
		String r = b.getValueFromExcel(13, 0);
		b.typeText(element13, r);

		String address = b.getValueFromExcel(14, 1);
		WebElement element14 = b.findLocator("id", address);
		String avc = b.getValueFromExcel(14, 0);
		b.typeText(element14, avc);
		String cc = b.getValueFromExcel(15, 1);
		WebElement element15 = b.findLocator("id", cc);
		String cn = b.getValueFromExcel(15, 0);
		b.typeText(element15, cn);

		WebElement element16 = b.findLocator("id", "cc_type");
		String vi = b.getValueFromExcel(16, 0);
		b.select(element16, "text", vi, 0);
		WebElement element17 = b.findLocator("id", "cc_exp_month");
		String ag = b.getValueFromExcel(17, 0);
		b.select(element17, "text", ag, 0);
		Thread.sleep(3000);
		WebElement element18 = b.findLocator("xpath", "//*[@id=\"cc_exp_year\"]");
		b.select(element18, "text", "2022", 0);

		WebElement element19 = b.findLocator("id", "cc_cvv");
		String cvv = b.getValueFromExcel(19, 0);
		b.typeText(element19, cvv);
		WebElement element20 = b.findLocator("id", "book_now");
		b.submit(element20);

		Thread.sleep(7000);
		WebElement element21 = b.findLocator("id", "order_no");
		String attribute = b.getAttributeFromWebPage(element21, "value");
		System.out.println(attribute);
		String string = attribute.toString();
		b.writeCell(string, 0, 4);
	}

}
