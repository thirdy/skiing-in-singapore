package io.github.thirdy;

import org.immutables.value.Value;

@Value.Immutable
public interface Result {
    public int getLength();
    public int getDrop();
}
