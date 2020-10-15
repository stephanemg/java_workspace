package com.baeldung.batch.understanding;

import java.io.Serializable;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import javax.batch.api.chunk.AbstractItemReader;
import javax.batch.runtime.BatchStatus;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SimpleChunkItemReader extends AbstractItemReader {
    private StringTokenizer tokens;
    private Integer count=0;
    Logger logger = Logger.getLogger(SimpleChunkWriter.class.getName());
    
    @Inject
    JobContext jobContext;

    @Override
    public Integer readItem() throws Exception {
        if (tokens.hasMoreTokens()) {
            this.count++;
            String tempTokenize = tokens.nextToken();
            logger.info("Reader reads : " + tempTokenize);
            jobContext.setTransientUserData(count);
            return Integer.valueOf(tempTokenize);
        }
        return null;
    }

    @Override
    public void open(Serializable checkpoint) throws Exception {
        tokens = new StringTokenizer("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", ",");
    }

}
