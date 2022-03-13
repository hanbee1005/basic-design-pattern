# Adapter - 바꿔서 재이용하기
'이미 제공되고 있는 것'과 '필요한 것' 사이의 차이를 없애주는 디자인 패턴으로 **Wrapper 패턴**이라고도 함.

### 종류
#### 클래스에 의한 Adapter 패턴 (상속을 사용한 Adapter 패턴)
![class-diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/hanbee1005/basic-design-pattern/main/resources/puml/chapter02_1.puml)

#### 인스턴스에 의한 Adapter 패턴 (위임을 사용한 Adapter 패턴)
![class-diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/hanbee1005/basic-design-pattern/main/resources/puml/chapter02_2.puml)

### 특징
- 기존 클래스를 개조해 빠르게 필요한 클래스를 만들 수 있습니다.
- 기존 클래스의 사양만 알면 기존 클래스를 전혀 수정하지 않고 목적한 인터페이스(API)를 맞출 수 있습니다.
- 구 버전과 신 버전을 공존시키고, 유지보수도 편하게 하기 위해 사용하기도 합니다.