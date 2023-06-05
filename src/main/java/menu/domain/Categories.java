package menu.domain;

import static menu.constant.ExceptionConstants.EXIST_ERROR;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Categories {

    private final List<Category> categories;

    public Categories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Category> getRecommendedCategories() {
        List<Category> recommendedCategories = new ArrayList<>();
        while (recommendedCategories.size() != 5) {
            Category category = categories.get(Randoms.pickNumberInRange(1, 5) - 1);
            if (getCount(recommendedCategories, category) == 2) {
                continue;
            }
            recommendedCategories.add(category);
        }
        return recommendedCategories;
    }


    private int getCount(List<Category> recommendedCategories, Category category) {
        return (int) recommendedCategories.stream()
            .filter(cate -> cate.getName().equals(category.getName()))
            .count();
    }

    public void validateExistMenu(String menu) throws IllegalArgumentException{
        boolean flag = true;
        for (Category category : categories) {
            if(category.isExistMenu(menu)){
                flag = false;
            }
        }
        if(flag){
            throw new IllegalArgumentException(EXIST_ERROR);
        }
    }
}
