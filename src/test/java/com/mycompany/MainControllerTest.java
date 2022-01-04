package com.mycompany;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {

    @Test
    void showHomePage() {
        MainController M = new MainController();
        assertEquals("index", M.showHomePage());
    }
}