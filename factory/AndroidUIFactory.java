package factory;

import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.dropdown.AndroidDropdown;
import factory.components.dropdown.Dropdown;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
