package codingbat.string1;

import org.junit.Test;

import static codingbat.string1.MakeAbba.makeAbba;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MakeAbbaTests {

    @Test
    public void shouldMakeAbba() {
        assertThat(makeAbba("Hi", "Bye"), is(equalTo("HiByeByeHi")));
        assertThat(makeAbba("Yo", "Alice"), is(equalTo("YoAliceAliceYo")));
        assertThat(makeAbba("What", "Up"), is(equalTo("WhatUpUpWhat")));
    }
}