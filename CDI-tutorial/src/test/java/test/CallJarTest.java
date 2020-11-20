package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.stephanemg.IType;
import com.stephanemg.TypeImpl;

import cdi.ImageFileProcessor;

public class CallJarTest {
	@Mock
	ImageFileProcessor imageFileProcessor;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testFileApplication() {
		TypeImpl type = new TypeImpl();
		assertEquals("I'm a type", type.printType());
	}

}
