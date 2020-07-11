package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax5To4Then5() {
        int result = Max.max(5, 4);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax1To2To3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax6To2To4Then6() {
        int result = Max.max(6, 2, 4);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax10To11To3To7Then11() {
        int result = Max.max(10, 11, 3, 7);
        assertThat(result, is(11));
    }
}
