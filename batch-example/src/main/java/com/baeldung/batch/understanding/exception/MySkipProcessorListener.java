package com.baeldung.batch.understanding.exception;

import javax.batch.api.chunk.listener.SkipProcessListener;

import jakarta.inject.Named;

@Named
public class MySkipProcessorListener implements SkipProcessListener {
    @Override
    public void onSkipProcessItem(Object t, Exception e) throws Exception {
    }
}
