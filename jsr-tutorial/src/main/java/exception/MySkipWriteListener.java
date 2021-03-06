package main.java.exception;

import java.util.List;

import javax.batch.api.chunk.listener.SkipWriteListener;

import jakarta.inject.Named;

@Named
public class MySkipWriteListener implements SkipWriteListener {
    @Override
    public void onSkipWriteItem(List list, Exception e) throws Exception {
        list.remove(new MyOutputRecord(2));
    }
}
