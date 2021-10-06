package com.company.staff;

import com.company.Human;

public class Staff {
    private StaffType type;
    private Human personalInformation;
    private boolean isAvailable;

    public void doJob() {
        System.out.println("I am doing my job\n");
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Human getPersonalInformation() {
        return personalInformation;
    }
}



