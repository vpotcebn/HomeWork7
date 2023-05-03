package com.pocvlad.tests;

import com.pocvlad.pages.RegistrationPage;
import org.junit.jupiter.api.Test;



public class RegistrationFormTest extends TestBase{
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        String firstName = "Alex";
        String lastName = "Under";
        String email = "alexunder@gmail.com";
        String gender = "Male";
        String phoneNumber = "7910281369";

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
                .setBirthDate("11", "2", "1990")
                .setSubjects("Maths")
                .setHobbies("Reading")
                .setPicture("11.png")
                .setAddress("125  Ariznona phd")
                .setState("NCR")
                .setCity("Delhi")
                .submit()
                .verifyResultsModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phoneNumber)
                .verifyResult("Date of Birth", "11 March,1990")
                .verifyResult("Subjects", "Maths")
                .verifyResult("Hobbies", "Reading")
                .verifyResult("Address", "125 Ariznona phd")
                .verifyResult("State and City", "NCR Delhi");
    }
}