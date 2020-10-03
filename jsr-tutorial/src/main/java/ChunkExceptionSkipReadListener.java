package main.java;

import javax.batch.api.chunk.listener.SkipReadListener;

import jakarta.inject.Named;

@Named
public class ChunkExceptionSkipReadListener implements SkipReadListener {
    @Override
    public void onSkipReadItem(Exception e) throws Exception {
    }
}