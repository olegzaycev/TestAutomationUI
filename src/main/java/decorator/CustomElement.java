package decorator;
import org.openqa.selenium.WebElement;

public class CustomElement {
    private WebElement webElement;

    public CustomElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebElement getWebElement() {
        return webElement;
    }

    public void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }
}
