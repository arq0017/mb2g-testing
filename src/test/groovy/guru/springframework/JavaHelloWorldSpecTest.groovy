package guru.springframework

import org.junit.Test
import spock.lang.Specification

class JavaHelloWorldSpecTest extends Specification {
    @Test
    def "GetHello"() {
        when:
        def foo = "123"
        then:
        true
    }
}
