package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenMaxFirst() {
        int result = SqMax.max(4, 2, 3, 1);
        assertThat(result, is(4));
    }
    @Test
    public void whenMaxSecond() {
        int result = SqMax.max(1, 4, 3, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenMaxThird() {
        int result = SqMax.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }
    @Test
    public void whenMaxFourth() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}
