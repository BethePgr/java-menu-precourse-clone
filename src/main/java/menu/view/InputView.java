package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Categories;
import menu.util.InputValidator;

public class InputView {

    public static String getCoachNames() {
        try {
            System.out.println("코치의 이름을 입력해 주세요. (,로 구분)");
            return InputValidator.validateCoachNames(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCoachNames();
        }
    }

    public static String getCantEatMenu(Categories categories,String coachName) {
        try {
            System.out.println(coachName + "(이)가 못 먹는 메뉴를 입력해 주세요.");
            return InputValidator.validateCantEatMenu(categories,Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCantEatMenu(categories,coachName);
        }
    }

}
