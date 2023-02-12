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

### 