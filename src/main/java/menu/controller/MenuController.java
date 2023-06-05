package menu.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import menu.domain.Categories;
import menu.domain.Category;
import menu.domain.Coach;
import menu.domain.Coaches;
import menu.util.StringParser;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    Categories categories;
    Coaches coaches;

    public MenuController(){
        categories = new Categories(categoriesInit());
        coaches =  new Coaches();
    }

    public void run(){
        OutputView.printStartMessage();

        List<String> coachNames = StringParser.getSplitList(InputView.getCoachNames());
        Coaches coaches = new Coaches();
        coachNames.stream().forEach(name -> coaches.add(new Coach(name)));
        coaches.getCoaches().stream().forEach(coach ->{
            List<String> cantEatMenu = StringParser.getSplitList(InputView.getCantEatMenu(coach.getName()));
            coach.setCantEatMenu(cantEatMenu);
        });
        List<Category> recommendedCategories = categories.getRecommendedCategories();
        recommendedCategories.stream().forEach(category -> {
            coaches.getCoaches().stream().forEach(coach -> coach.addEatMenu(category));
        });
        OutputView.printEndMessage();
    }

    private void init() {
        List<Category> categories = categoriesInit();
    }

    private List<Category> categoriesInit() {
        List<String> japanese = Arrays.asList("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스",
            "라멘", "오코노미야끼");
        List<String> korean = Arrays.asList("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이",
            "제육볶음");
        List<String> chinese = Arrays.asList("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육",
            "토마토 달걀볶음", "고추잡채");
        List<String> asian = Arrays.asList("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미",
            "월남쌈", "분짜");
        List<String> western = Arrays.asList("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티",
            "피자", "파니니");
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("일식", japanese));
        categories.add(new Category("한식", korean));
        categories.add(new Category("중식", chinese));
        categories.add(new Category("아시안", asian));
        categories.add(new Category("양식", western));
        return categories;
    }
}
