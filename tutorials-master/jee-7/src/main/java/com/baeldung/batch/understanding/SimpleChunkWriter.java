package com.baeldung.batch.understanding;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.batch.api.BatchProperty;
import javax.batch.api.chunk.AbstractItemWriter;
import javax.batch.runtime.context.JobContext;
import javax.batch.runtime.context.StepContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SimpleChunkWriter extends AbstractItemWriter {
	List<Integer> processed = new ArrayList<>();
	Logger logger = Logger.getLogger(SimpleChunkWriter.class.getName());
	@Inject
	@BatchProperty(name = "name")
	private String nameString;

	@Inject
	StepContext stepContext;
	private Properties stepProperties;
	@Inject
	JobContext jobContext;
	private Properties jobProperties;

	@Override
	public void writeItems(List<Object> items) throws Exception {
		logger.info("Writer / BatchProperty : " + nameString);
		stepProperties = stepContext.getProperties();
		logger.info("Writer / Step property : " + stepProperties.getProperty("stepProp1"));
		logger.info("Writer : elements count : " + items.size());
		logger.info("Writer elements : " + items.toString());
		items.stream().map(Integer.class::cast).forEach(this.processed::add);
	}
}
