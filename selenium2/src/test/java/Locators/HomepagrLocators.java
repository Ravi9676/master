package Locators;

import org.openqa.selenium.By;

public interface HomepagrLocators {
    By menxpath= By.xpath("//a[text()='Men' and@class='desktop-main']");
    By mentshirtsxpath=By.xpath("//a[@href='/men-tshirts']");
    By womenxpath=By.xpath("//a[text()='Women' and @class='desktop-main']");
    By womentshirtxpath=By.xpath("//a[@href=\'/myntra-fashion-store?f=Categories%3ATshirts%3A%3AGender%3Amen%20women%2Cwomen\']");
    By kidsxpath=By.xpath("//a[text()='Kids' and@class='desktop-main']");
    By kidsjeansxpath=By.xpath("//a[@href='/kids?f=Categories%3AJeans%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false']");
    By kidsboytshirtxpath=By.xpath("//a[@href='/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false']");
    By beautyxpath=By.xpath("//a[text()='Beauty' and@class='desktop-main']");
    By kajalxpath=By.xpath("//a[text()='Kajal']");
    By studioxpath=By.xpath("//a[text()='Studio']");
    By explorestudioxpath=By.xpath("//span[text()='EXPLORE STUDIO']");
    By homelivingxpath=By.xpath("//a[text()='Home & Living' and @class='desktop-main']");
    By festivedecorxpath=By.xpath("//a[text()='Festive Decor']");
}
