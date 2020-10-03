package main.java.exception;

import javax.batch.api.chunk.listener.RetryProcessListener;

import jakarta.inject.Named;

@Named
public class MyRetryProcessorListener implements RetryProcessListener {
    @Override
    public void onRetryProcessException(Object item, Exception ex) throws Exception {
    }
}
