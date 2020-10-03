package cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

public class ImageFileProcessorFactory {
	@Produces
	@Alternative
	public ImageFileProcessor getImageFileProcessor() {
		return new ImageFileProcessor();
	}

}
