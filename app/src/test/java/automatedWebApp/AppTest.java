/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package automatedWebApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void isResultCorrect() {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(0);
        arrList.add(2);
        arrList.add(4);
        arrList.add(9);

        Number number = Long.valueOf(1500);
        

        assertEquals("Result is:"+Double.valueOf(13500), App.computeResults(arrList,Long.valueOf(1500),4,"Result is:"));
        assertEquals("Result is:"+Double.valueOf(65), App.computeResults(arrList,Byte.valueOf((byte) 5),3,"Result is:"));

    }




}
