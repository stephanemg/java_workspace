package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import cdi.ImageFileProcessor;

public class SampleTest {
	@Mock
	ImageFileProcessor imageFileProcessor;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testFileApplication() {

		when(imageFileProcessor.editFile(anyString())).thenReturn("ok");
		assertEquals("ok", imageFileProcessor.editFile("test"));
	}

}
