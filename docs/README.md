Coach 클래스로 코치 관리
못 먹는 메뉴 List<String> cantEat에다가 메뉴 저장하기

Category 클래스로 카테고리를 관리하기
List<String> menu에다가 다 넣어놓기

# 기능 구현 목록

## InputView(view)
- [x] 코치의 이름을 입력받기
  - [x] (예외) 코치는 2~5명, 이름은 2~4글자
- [x] 못 먹는 메뉴 0~2개 입력 받기
## OutputView(view)
- [x] 점심 메뉴 추천 시작 출력하기
- [ ] 메뉴 추천 결과 출력하기
- [x] 추천 완료 출력하기

## Coach (domain)
- [x] 코치의 이름을 String형의 필드로 가진다.
- [x] 메뉴들을 List<String> 형의 필드로 가진다.

## Categories (domain)
- [ ] 카테고리 종류들을 List<Category>형의 필드로 가진다.
