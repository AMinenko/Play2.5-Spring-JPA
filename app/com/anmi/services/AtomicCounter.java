package com.anmi.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class AtomicCounter implements Counter {

    private final AtomicInteger atomicCounter = new AtomicInteger();

    @Override
    public int nextCount() {
       return atomicCounter.getAndIncrement();
    }

}
