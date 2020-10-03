package main.java.exception;

import java.util.List;

import javax.batch.api.chunk.listener.RetryWriteListener;

import jakarta.inject.Named;

@Named
public class MyRetryWriteListener implements RetryWriteListener {
    @Override
    public void onRetryWriteException(List<Object> items, Exception ex) throws Exception {
    }
}
