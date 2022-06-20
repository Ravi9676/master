package Locators;

import org.openqa.selenium.By;

public interface DragandDropLocators {
    By sourcexpath=By.xpath("//div[@id='draggable']");
    By destinationxpath=By.xpath("//div[@id='droppable']");
}
