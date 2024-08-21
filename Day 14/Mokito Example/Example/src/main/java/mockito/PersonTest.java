	    /*
	     * If we want to test the "Service" class, we will need an instance of it.
	     * This is referred to as our "Object Under Test".
	     *
	     * We have to tell Mockito that there is a relationship between our mock(s)
	     * and our object under test.
	     * As such, we can use the @InjectMocks annotation.
	     */

		
		

	    /*
	     * The first step to mocking is determining what exactly needs to be mocked.
	     * In general, we want to mock our object under test's dependencies. In this
	     * case, our object under test only has one dependency: a dependency of type
	     * Repository. Note that Mockito can inject this mock for us if we instruct
	     * it to.
	     */

	    
	    
	        /*
	         * Before we call the sort() method, perhaps we should define some dummy
	         * data (stub) that will be returned when findAll is called. We can do
	         * this using the "Mockito" utility which allows for easy stubbing and
	         * behavior verification (verifying that the code behaves as expected meaning
	         * that methods are called when they should be or the number of times that they
	         * should be).
	         */
	
package mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @InjectMocks
    private PersonService service;

    @Mock
    private PersonRepo repository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void unitTestSort() {
        // Stub the findAll method to return a specific list
        Mockito.when(this.repository.findAll()).thenReturn(
                Arrays.asList("christina", "mark", "adam", "alec"));

        // Call the sort method in the service
        List<String> sortedNames = this.service.sort();

        // Verify that findAll was called exactly once
        Mockito.verify(this.repository, times(1)).findAll();

        // Verify the output of the sort method
        assertEquals(Arrays.asList("adam", "alec", "christina", "mark"), sortedNames);

        System.out.println(sortedNames);
    }
}

