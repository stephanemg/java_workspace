package com.baeldung.batch.understanding.exception;

import javax.batch.api.chunk.listener.RetryReadListener;

import jakarta.inject.Named;

@Named
public class MyRetryReadListener implements RetryReadListener {
    @Override
    public void onRetryReadException(Exception ex) throws Exception {
    }
}
