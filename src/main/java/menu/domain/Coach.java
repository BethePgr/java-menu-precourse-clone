package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;

public class Coach {

    private final String name;
    private List<String> cantEatMenu;
    private List<String> eatMenu;

    public Coach(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCantEatMenu(List<String> cantEatMenu){
        this.cantEatMenu = cantEatMenu;
    }
    public List<String> getCantEatMenu() {
        return cantEatMenu;
    }

    public void setEatMenu(List<String> eatMenu){
        this.eatMenu = eatMenu;
    }

    public List<String> getEatMenu(){
        return eatMenu;
    }
}
