# 프록시 패턴 (Proxy Pattern)

## 프록시 패턴의 정의

- 어떤 객체에 대한 접근을 제어하기 위한 용도로 대리인이나 대변인에 해당하는 객체를 제공하는 패턴
- 프록시 패턴을 이용하면 원격 객체, 생성하기 힘든 개체, 보안이 중요한 객체와 같은 다른 객체에 대한 접근을 제어하는 대변자 객체를 만들 수 있다.
- 접근 제어 방법에 따른 여러 변경 패턴들이 존재한다.
    - `원격 프록시`는 클라이언트와 원격 객체 사이의 데이터 전달을 관리.
    - `가상 프록시`는 인스턴스를 만드는 데 많은 비용이 드는 객체에 대한 접근을 제어.
    - `보호 프록시`는 호출하는 쪽의 권한에 따라서 객체에 있는 메소드에 대한 접근을 제어
- 흐름 제어만 해야하며, 결과값에 대한 수정이 이루어져서는 안된다.

![image](https://user-images.githubusercontent.com/50647845/159726201-a9facb5f-087e-4ae9-892c-154b4b20598f.png)

- Proxy와 RealSubject 모두 Subject 인터페이스를 구현한다.
    - 두 객체에서 똑같은 인터페이스를 구현하기 때문에 RealSubject가 들어가야 할 자리에 Proxy를 대신 집어넣을 수 있다.
- 실질적인 작업은 RealSubject 객체에서 처리된다.
    - Proxy는 대변인 역할을 하면서 RealSubject에 대한 접근을 제어한다.
    - Proxy에는 RealSubject의 레퍼런스가 들어있으며, RealSubject의 생성 및 제거에 대한 역할을 책임지기도 한다.
- Client는 Proxy를 통해서 RealSubject와 데이터를 주고 받는다.
- Proxy는 RealSubject의 접근 제어역할도 수행한다.

## 프록시 간단 예제

```java
public interface Image {
    void show();
}
```

```java
public class RealImage implements Image {
    private String name;

    // 생성자
    public RealImage(String name) {
        this.name = name;
        loadFromDisk(name); // 이거 오래 걸리는 작업이라면??
    }

    private void loadFromDisk(String name) {
        System.out.println("Loading " + name);
    }

    @Override
    public void show() {
        System.out.println("show " + name);
    }
}
```

```java
public class ProxyImage implements Image {
    private RealImage realImage;
    private String name;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void show() { // 필요한 작업에서 실제 객체 생성
        if (realImage == null) {
            realImage = new RealImage(name);
        }
        realImage.show();
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("ProxyImage1.png");//여기서 생서했으면 초반 작업이 오래걸림.
        Image image2 = new ProxyImage("ProxyImage2.png");

        image1.show();//필요할 때 그때 만들기
        image2.show();
    }
}
```

## 프록시 패턴의 장단점

### 장점

- 사이즈가 큰 객체가 로딩되기 전에 프록시를 통한 참조가 가능하다.
- 실제 개체의 public, protected 메소드들을 숨기고 인터페이스를 통해 노출시킬 수 있다.
- 로컬에 있지 않고 떨어져 있는 객체를 사용할 수 있다.
- 원래 객체의 접근에 대해서 사전 처리를 할 수 있다.

### 단점

- 객체를 생성할 때 한 단계를 거치므로, 빈번한 객체 생성시 성능 저하가 발생할 수 있다.
- 프록시 내부에서 객체 생성을 위해 스레드가 생성, 동기화 구현되어야 한는 경우 성능이 저하될 수 있다.
- 로직이 난해해져 가독성이 떨어질 수 있다.

## 원격 프록시 예제

![image](https://user-images.githubusercontent.com/50647845/159756020-2f188666-2de9-483d-82eb-8a6eac2aef44.png)

- 모든 State 객체에는 뽑기 기계의 메소드를 호출하거나 상태를 변경할 때 사용하기 위한 뽑기 기계에 대한 레퍼런스가 들어가 있으나, State 객체가 전송될 때 뽑기 기계도 전부 직렬화시켜 같이 보내는 것은 바람직하지 않음
- ex) Google Docs

## 가상 프록시 예제

![image](https://user-images.githubusercontent.com/50647845/159747187-8dd4e578-3fa8-497c-bcc3-200aae6e9965.png)

- 생성하는 데 많은 비용이 필요한 객체를 대신하는 역할로 쓰인다.
- ex) Icon용 데이터를 네트워크를 통해서 가져와야 하기에 시간이 많이 걸리는 상황
- 객체가 필요하게 되기 전까지 객체의 생성을 미룰 수 있게 하며, 객체 생선 전, 또는 객체 생성 도중에 객체를 대신하기도 한다.
- 객체 생성이 완료되면 RealSubject에 요청을 직접 전달한다.

## 보호 프록시 예제

![image](https://user-images.githubusercontent.com/50647845/159746866-50ae1fae-4a24-4049-be90-1f64aaaaf33b.png)

- 접근 권한을 바탕으로 객체에 대한 접근을 제어하는 역할로 쓰인다.
- java.lang.refect 패키지에 프록시 기능이 내장되어 있다.
  - 해당 패키지를 이용하면 한 이상의 인터페이스를 구현하고 메소드 호출을 지정해준 클래스에 전달할 수 있는 프록시 클래스를 만들 수 있다.
- 실제 프록시 클래스는 실행중에 생성되기 때문에 이러한 기술을 동적 프록시라고 부른다.
- InvocationHandler는 프록시에 대해서 호출되는 모든 메소드에 대해 응답하는 역할을 수행하며, Proxy에서 메소드 호출을 받으면 InvocationHandler에 진짜로 수행해야 하는 작업을
  부탁한다.

## 기타 프록시

- 방화벽 프록시
    - 일련의 네트워크 자원에 대한 접근을 제어함으로써 주 객체를 "나쁜" 클라이언트들로부터 보호한다.
    - ex) 기업용 방화벽 시스템에서 자주 목격된다.
- 스마트 레퍼런스 프록시(Smart Reference Proxy)
    - 주 객체가 참조될 때마다 추가 행동을 제공
    - ex) 객체에 대한 레퍼런스 개수를 세는 등의 업무 수행
- 캐싱 프록시(Caching Proxy)
    - 비용이 많이 드는 작업의 결과를 임시로 저장한다.
    - 여러 클라이언트에서 결과를 공유하게 해 줌으로써 계산 시간 또는 네트워크 지연을 줄여주는 효과가 있다.
    - ex) 웹 서버 프록시 또는 컨텐츠 관리 및 퍼블리싱 시스템에서 종종볼 수 있다.
- 동기화 프록시(Synchronization Proxy)
    - 여러 스레드에서 주 객체에 접근하는 경우 안전하게 작업을 처리할 수 있게 한다.
    - ex) 분산 환경에서 일련의 객체에 대한 동기화된 접근을 제어해주는 자바 스페이스에서 사용된다.
- 복잡도 숨김 프록시(Complexity Hiding Proxy)
    - 복잡한 클래스들의 집합에 대한 접근을 제어하고, 그 복잡도를 숨긴다.
    - 퍼사드 프록시(Facade Proxy)라고 부르기도 한다.
    - 퍼사드 패턴과 차이점은 프록시에서 접근을 제어하지만 퍼사드 패턴에서는 대체 인터페이스만 제공한다는 점이다.
- 지연 복사 프록시(Copy-On-Write Proxy)
    - 클라이언트에서 필요로 할 떄까지 객체가 복사되는 것을 지연시킴으로써 객체의 복사를 제어한다.
    - 변형된 가상 프록시로 볼 수 있다.
    - ex) 자바5 CopyOnWriteArrayList에서 사용된다.

## 프록시 패턴 vs 데코레이터 패턴

- 프록시 패턴의 구조는 데코레이터 패턴의 구조하고 비슷하지만, 용도가 다르다는 차이가 있다.
- 데코레이터 패턴에서는 객체에 행동을 추가하지만 프록시 패턴에서는 접근을 제어한다.

### 참고자료

- [헤드 퍼스트 디자인 패턴](https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=290892473)
- [프록시 패턴(Proxy Pattern)에 대하여](https://coding-factory.tistory.com/711)