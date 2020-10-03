package main.java;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.BatchStatus;

import jakarta.inject.Named;

@Named
public class SimpleBatchLet extends AbstractBatchlet {
    @Override
    public String process() throws Exception {
        return BatchStatus.FAILED.toString();
    }
}
