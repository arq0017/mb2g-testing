package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldJunitTest {

    @Test
    void getHello() {
        JavaHelloWorld obj = new JavaHelloWorld();
        assert("Hello World".equals(obj.getHello()));
    }
}