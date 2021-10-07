package com.company.staff;

/**
 * Represents Plumber staff member
 */
public class Plumber extends Staff{
    /**
     * Performs the Plumber required to do.
     */
    @Override
    public void doJob() {
        System.out.println("I am Plumber. I came to clean your pipes\n");
    }
}
