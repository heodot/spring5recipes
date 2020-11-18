package io.dk.component;

public interface SequenceDao {

    Sequence getSequence(String sequenceId);

    int getNextValue(String sequenceId);
}
