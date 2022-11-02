package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner sc=new Scanner(System.in);
    public boolean FirstName(String firstName){
        String firstNamePattern = "^[A-Z]{1}[a-z]{3,25}$";
        Pattern p = Pattern.compile(firstNamePattern);//. represents single character
        firstName= sc.next();
        Matcher m = p.matcher(firstName);
        return Pattern.compile(firstNamePattern).matcher(firstName).matches();
    }
    public boolean LastName(String lastName){
        String lastNamePattern = "^[A-Z]{1}[a-z]{4,25}$";
        Pattern p = Pattern.compile(lastNamePattern);//. represents single character
        Matcher m = p.matcher(lastName);
        return Pattern.compile(lastNamePattern).matcher(lastName).matches();
    }
    public boolean Email(String email){
        String emailPattern = "^[a-zA-Z0-9#%&*_-]+[@][a-zA-Z]+[.][a-z]{2,4}([.][a-zA-Z]{2})*$";
        Pattern p = Pattern.compile(emailPattern);//. represents single character
        Matcher m = p.matcher(email);
        return Pattern.compile(emailPattern).matcher(email).matches();
    }
    public boolean Mobile(String mobile){
        String mobileNumPattern = "^(91)( )[6-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(mobileNumPattern);//. represents single character
        Matcher m = p.matcher(mobile);
        return Pattern.compile(mobileNumPattern).matcher(mobile).matches();
    }
    public boolean Password(String password){
        String passwordPattern = "^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$";
        Pattern p = Pattern.compile(passwordPattern);//. represents single character
        Matcher m = p.matcher(password);
        return Pattern.compile(passwordPattern).matcher(password).matches();
    }

}
