package co.com.choucair.pratice.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LeasingProductPage extends PageObject {
 public static final Target BTN_REQUEST_PRODUCT=Target.the("Select Button Request Product").located(By.xpath("//a[@id='header-solicitud-productos']"));
 public static final Target LINK_LEASING_HOUSING = Target.the("Ingress housing leasing").located(By.xpath("//a[contains(text(),'Ha')]"));
}
