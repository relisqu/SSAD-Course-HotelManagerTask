package com.company.staff;

/**
 * Represents Security Guard staff member
 */
public class SecurityGuard extends Staff{
    /**
     * Performs the Security Guard required to do.
     */
    @Override
    public void doJob() {
        System.out.println("I am Security. Hey, where is your mask?!\n");
    }
}
