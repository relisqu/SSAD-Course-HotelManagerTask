package com.company.staff.creators;

import com.company.staff.Plumber;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

public class PlumberCreator extends StaffCreator {
    @Override
    public Staff createStaff() {
        return new Plumber();
    }
}
