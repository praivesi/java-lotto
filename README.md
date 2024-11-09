# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## 기능 요구사항
로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급한다.
로또 한 장의 가격은 1,000원이다.

## 구현 해야 할 목록
- 구입 금액을 물어보는 질문을 출력한다.
- 구입 금액을 입력받아 저장한다.
- 구입 금액에 맞는 로또 번호를 생성한다.
- 생성한 로또 번호 목록을 출력한다.
- 지난주 로또 당첨 번호를 물어보는 질문을 출력한다.
- 지난주 로또 당첨 번호를 입력받아 저장한다.
- 생성된 각 로또 번호별로 지난주 로또 당첨 번호와 일치하는 개수를 계산한다.
- 각 일치 개수를 바탕으로 수익률을 계산한다.
- 당첨 통계를 출력한다.

## 구현 완료된 목록