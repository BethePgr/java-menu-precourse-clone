package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.constant.InputViewConstants;
import menu.domain.Categories;
import menu.util.InputValidator;

public class InputView {

    public static String getCoachNames() {
        try {
            System.out.println(InputViewConstants.GET_COACH_NAMES);
            return InputValidator.validateCoachNames(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCoachNames();
        }
    }

    public static String getCantEatMenu(Categories categories,String coachName) {
        try {
            System.out.println(coachName + InputViewConstants.GET_CANT_EAT_MENU);
            return InputValidator.validateCantEatMenu(categories,Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCantEatMenu(categories,coachName);
        }
    }

}
