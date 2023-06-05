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
- [x] 코치가 먹을 메뉴를 List<String> 형의 필드로 가진다.

## Coaches (domain)
- [x] 코치들을 List<Coach> 형의 필드로 가진다.
- [x] 정해진 카테고리에 대해서 코치에게 일주일치 메뉴를 추천한다.
  - [x] 코치가 못 먹는 메뉴는 추천하면 안 된다.
  - [x] 중복되는 메뉴를 추천하면 안 된다.
## Category (domain)
- [x] 카테고리 이름을 String 형의 필드로 가진다.
- [x] 메뉴들을 List<String> 형의 필드로 가진다.

## Categories (domain)
- [x] 카테고리 종류들을 List<Category>형의 필드로 가진다.
- [x] 랜덤으로 추천할 카테고리 5개를 반환한다.
  - [x] Randoms API 사용
  - [x] 같은 카테고리는 최대 두 번 까지만 가능

## MenuController (controller)
- [ ] 카테고리에 대한 정보들을 초기 설정한다.
- [ ] 메뉴 추천 프로그램을 시작한다.
## StringParser (util)
- [x] 입력으로 들어오는 String을 split하여 리스트로 변환한다.