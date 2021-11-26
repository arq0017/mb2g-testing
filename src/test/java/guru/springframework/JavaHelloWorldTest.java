package guru.springframework;

// CLASS ENDING WITH TEST AS TEST CLASS

public class JavaHelloWorldTest {
    // METHOD NEEDS TO START WITH TEST
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert ("Hello Worlds".equals(javaHelloWorld.getHello()));
    }

}