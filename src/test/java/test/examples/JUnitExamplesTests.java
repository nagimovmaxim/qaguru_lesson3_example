package test.examples;

import org.junit.jupiter.api.*;

public class JUnitExamplesTests {

    @BeforeAll
    static void startUp(){
       System.out.println("STARTUP");
   }

    @BeforeEach
   void startBrowser(){
       System.out.println("-Strart browser");
   }

    @Test
    void firstTest(){
        System.out.println("--firstTest");
    }

    @Test
    void secondTest(){
        System.out.println("--secondTest");
    }

    @AfterEach
    void stopBrowser(){
        System.out.println("-Stop browser");
    }

    @AfterAll
    static void tearDown(){
        System.out.println("STOPPED");
    }
}
