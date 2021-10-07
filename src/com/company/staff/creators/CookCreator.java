package com.company.staff.creators;

import com.company.staff.Cook;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

/**
 * Factory of Cooks
 */
public class CookCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Cook
     * @return new staff member
     */
    @Override
    public Staff createStaff() {
        return new Cook();
    }
}
