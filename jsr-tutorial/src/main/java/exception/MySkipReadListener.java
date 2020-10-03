package main.java.exception;

import javax.batch.api.chunk.listener.SkipReadListener;

import jakarta.inject.Named;

@Named
public class MySkipReadListener implements SkipReadListener {
    @Override
    public void onSkipReadItem(Exception e) throws Exception {
    }
}
