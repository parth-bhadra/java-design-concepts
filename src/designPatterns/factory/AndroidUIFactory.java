package src.designPatterns.factory;

import src.designPatterns.factory.components.button.AndroidButton;
import src.designPatterns.factory.components.button.Button;
import src.designPatterns.factory.components.dropdown.AndroidDropdown;
import src.designPatterns.factory.components.dropdown.Dropdown;
import src.designPatterns.factory.components.menu.AndroidMenu;
import src.designPatterns.factory.components.menu.Menu;

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
