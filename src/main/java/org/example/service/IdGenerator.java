package org.example.service;

import org.springframework.stereotype.Component;


public class IdGenerator {
    private int sequence = 0;

    public int getSequence() {
        return sequence++;
    }
}
