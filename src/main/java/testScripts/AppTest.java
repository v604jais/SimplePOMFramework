package testScripts;

import org.junit.*;

public class AppTest {
    
    //Prepare 
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }
    
    //Prepare 
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
    
    //Execute
    @Test
    void testCalcOne() 
    {
        System.out.println("======TEST ONE EXECUTED=======");

        //Validate
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }
    
    //Execute
    @Test
    void testCalcTwo() 
    {
        System.out.println("======TEST TWO EXECUTED=======");

        //Validate
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }

    //Reset     
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }
     
    //Reset    
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}