package src.designPatterns.factory;

import src.designPatterns.factory.components.button.Button;
import src.designPatterns.factory.components.dropdown.Dropdown;
import src.designPatterns.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
