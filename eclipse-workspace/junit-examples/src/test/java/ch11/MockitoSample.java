package ch11;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoSample {
	
	@Test
	public void testMockitoSample() {
	
		//初め動かなくて、VM引数試して、動かなくて、消して再度試したら成功した。。
		List<String> mock = Mockito.mock(List.class);
		assertThat(mock.get(0), is(nullValue()));
		assertThat(mock.contains("Hello"), is(false));
		
	}
	
	
	
}
