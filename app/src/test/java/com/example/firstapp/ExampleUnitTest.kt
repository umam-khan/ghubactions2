package com.example.firstapp

import org.junit.Test
import org.junit.Assert.*

class GreetingTest {
    @Test
    fun testGreetingText() {
        val name = "Arun"
        val greetingText = Greeting(name)
        assertEquals("Hello, my name is $name!", greetingText)
    }
}
