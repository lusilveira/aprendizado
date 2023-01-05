package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class TestLogin {
    @Test
    public void testLogin(){
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.blazedemo.com/login");

        WebElement textoEmail = driver.findElement(By.id("email"));
        textoEmail.sendKeys("lucianasilveir@gmail.com" );
        WebElement textoSenha = driver.findElement(By.id("password"));
        textoSenha.sendKeys("NSbnpGccSNtjB2G");
        driver.findElement(By.tagName("button"));
        List<WebElement> listaBotoes = driver.findElements(By.tagName("button"));

        for(WebElement botao : listaBotoes) {
            if (botao.getAttribute("type").equals("sumit")) {
                botao.submit();
            }

        }
    }
}
