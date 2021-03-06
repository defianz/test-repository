# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


## 구현할 기능 목록

- [ ] MVC 패턴 기반 구현을 위한 컨트롤러 생성
  
  > 시작, 게임 전, 게임 중, 게임 후 구분
- [ ] 3자리수 객체 생성
  
  > 각 자리 필드 및 HashMap을 통한 값, 위치 저장
- [ ] 컴퓨터의 3개의 숫자 생성 서비스 구현
- [ ] 사용자의 3개의 숫자 입력 서비스 구현
  
  > 입력값에 대한 validation 구현

  >>3글자를 입력 받았는가

  >>1-9 숫자만 입력 받았는가
  
  >> 오류 시 [ERROR] 출력
- [ ] 컴퓨타 숫자와 사용자 숫자 비교 서비스 구현
  
  > Strike 계산

  > Ball 계산

  > Strike와 Ball, 낫싱 출력
- [ ] 게임 종료 후, 새로 시작 및 종료 선택하는 서비스 구현
  
  > 입력값이 1,2 아닐 경우 에러 메시지 출력

  > 입력값에 따른 결과 처리
- [ ] 게임 컨트롤러에서 다시 시작 할 수도 있는 순환 로직 구현
