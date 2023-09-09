package factory;

import factory.components.button.Button;
import factory.components.button.IOSButton;
import factory.components.dropdown.Dropdown;
import factory.components.dropdown.IOSDropdown;
import factory.components.menu.IOSMenu;
import factory.components.menu.Menu;

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
