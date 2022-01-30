package ch11;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoSample {
	
	@Test
	public void testMockitoSample() {
	
//		List<String> mock = Mockito.mock(List.class);
//		
//		assertThat(mock.get(0), is(nullValue()));
//		assertThat(mock.contains("Hello"), is(false));
		
		User mock = Mockito.mock(User.class);
		assertThat(mock, is(nullValue()));
		
	}
	
	
	
}
