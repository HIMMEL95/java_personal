## SOLID 원칙의 약자
- S : 단일 책임 원칙 (single responsibility principle, SRP) 
- O : 개방-폐쇄 원칙 (open-closed principle, OCP)
- L : 리스코프 치환 원칙 (Liskov substitution principle, LSP)
- I : 인터페이스 분리 원칙 (interface segregation principle, ISP)
- D : 의존관계 역전 원칙 (dependency inversion principle, DIP)

### S란 무엇인가?
- **단일 책임 원칙**을 의미한다.
- '하나의 객ㅊ페가 하나의 책임만 져야 한다'는 의미
- 클래스를 단 한 가지 목표만 가지고 작성해야 한다는 것을 의미한다.
- 애플리케이션 모듈 전반에서 높은 유지보수성과 가시성 제어 기능을 유지하는 원칙

#### 단일 책임 원칙을 따르지 않는 경우
- 한 가지가 아닌 여러 가지 일을 하므로 단일 책임 원칙을 따르지 않는다. 일반적으로 클래스가 수행하는 일을 표현하기 위해 '또한'이라는 단어를 사용해야 한다면 단일 책임 원칙이 깨진 것이라고 할 수 있다.

### O란 무엇인가?
- **개방-폐쇄 원칙**을 의미한다.
- '소프트웨어 컴포넌트는 확장에 관해 열려 있어야 하고 수정에 관해서는 닫혀 있어야 한다'는 의미
- 다른 개발자가 작업을 수행하기 위해 반드시 수정해야 하는 제약 사항을 클래스에 포함해서는 안 된다는 사실을 의미. 다른 개발자가 클래스를 확장하기만 하면 원하는 작업을 할 수 있도록 해야 한다.
- 다양하고 직관적이며 유해하지 않은 방식으로 소프트웨어 확장성을 유지하는 원칙

### L이란 무엇인가?
- **리스코프 치환 원칙**을 의미
- '파생 타입은 반드시 기본 타입을 완벽하게 대체할 수 있어야 한다'는 의미
- '서브클래스의 객체는 슈퍼클래스의 객체와 반드시 같은 방식으로 동작해야 한다'는 사실을 의미
- 타입 변환 후에 뒤따라오는 런타임 타입 식병에 유용한 원칙