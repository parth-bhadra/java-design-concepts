package src.designPatterns.factory;

import src.designPatterns.factory.components.button.Button;
import src.designPatterns.factory.components.button.IOSButton;
import src.designPatterns.factory.components.dropdown.Dropdown;
import src.designPatterns.factory.components.dropdown.IOSDropdown;
import src.designPatterns.factory.components.menu.IOSMenu;
import src.designPatterns.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
