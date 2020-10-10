
package com.baeldung.batch.understanding.exception;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;

import jakarta.inject.Named;

@Named
public class MyItemWriter extends AbstractItemWriter {
    private static int retries = 0;

    @Override
    public void writeItems(List list) {
        if (retries <= 3 && list.contains(new MyOutputRecord(8))) {
            retries++;
            throw new UnsupportedOperationException();
        }
    }
}
