package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleServiceTest {
    private SimpleService service= new SimpleService();

    @Test
    void helloService() {
         String response = service.helloService("World");
         assertEquals("Hello World", response);
    }
}