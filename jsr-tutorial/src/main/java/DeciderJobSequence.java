package main.java;

import javax.batch.api.Decider;
import javax.batch.runtime.StepExecution;

import jakarta.inject.Named;

@Named
public class DeciderJobSequence implements Decider {
    @Override
    public String decide(StepExecution[] ses) throws Exception {
        return "nothing";
    }

}