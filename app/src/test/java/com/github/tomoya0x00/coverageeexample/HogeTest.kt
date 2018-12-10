package com.github.tomoya0x00.coverageeexample

import org.junit.Test

class HogeTest {

    @Test
    fun hogeTest() {
        assert(hoge(3) == "many")
        assert(hoge(2) == "two")
        assert(hoge(1) == "one")
        assert(hoge(0) == "zero")
    }
}