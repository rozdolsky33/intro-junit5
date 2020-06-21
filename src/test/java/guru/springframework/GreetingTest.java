package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only called Once");
    }

    private Greeting greeting;


    @BeforeEach
    void setUp(){
        System.out.println("In Before Each....");
        greeting = new Greeting();

    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void teatDown(){
        System.out.println("In After Each.......");
    }

    @AfterAll
    public static void afterAllCall(){
        System.out.println("After All ##### I am called once");
    }
}