/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        System.out.println("yo");
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        assertTrue("This should be true", true);
    }

    @Test public void testGivingIceCream(){
        Library potato = new Library(); // In a library (in java) our code all lives in classes - our code lives at src/main/java/gradle/test/Library.java in the Library class
        // `Library potato` is like `let potato`
        // `Library` is a full on type, when we create a class we are creating a type, all instances will be of that type


        // make sure that potato.giveIceCream("Garhett") == "Give Garhett chocolate cookie dough ice cream"
        assertEquals(potato.giveIceCream("Kamit"), "Give Kamit chocolate cookie dough ice cream");
        assertEquals(potato.giveIceCream("Garhett"), "Give Garhett chocolate cookie dough ice cream");
    }
}
