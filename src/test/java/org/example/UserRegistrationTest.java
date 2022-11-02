package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    UserRegistration test=new UserRegistration();
    @Test
    void isValidFirstName() {
        assertEquals(true,test.FirstName("Aoshin"));
    }

    @Test
    void isValidLastName() {
        assertEquals(true,test.FirstName("Manjuran"));
    }

    @Test
    void isValidEmail() {
        assertEquals(true,test.FirstName("aoshin123@gmail.com"));
    }

    @Test
    void isValidMobile() {
        assertEquals(true,test.FirstName("91 9876541238"));
    }

    @Test
    void isValidPassword() {
        assertEquals(true,test.FirstName("#123Aoshin"));
    }
}