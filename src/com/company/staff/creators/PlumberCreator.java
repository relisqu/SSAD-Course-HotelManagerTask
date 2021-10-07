package com.company.staff.creators;

import com.company.staff.Plumber;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

/**
 * Factory of Plumbers
 */
public class PlumberCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Plumber
     * @return new staff member
     */
    @Override
    public Staff createStaff() {
        return new Plumber();
    }
}
