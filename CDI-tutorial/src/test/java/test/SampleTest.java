package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import cdi.ImageFileProcessor;

public class SampleTest {
	
	
	

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testFileApplication() {
		 Weld weld = new Weld();
	     WeldContainer container = weld.initialize();
	     ImageFileProcessor imageFileProcessor = container.instance().select(ImageFileProcessor.class).get();
		//when(imageFileProcessor.editFile(anyString())).thenReturn("ok");
		assertNotNull(imageFileProcessor.editFile("test"));
	}

}
