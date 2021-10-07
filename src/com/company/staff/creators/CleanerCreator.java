package com.company.staff.creators;

import com.company.staff.Cleaner;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

/**
 * Factory of Cleaners
 */
public class CleanerCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Cleaner
     * @return new staff member
     */
    @Override
    public Staff createStaff() {
        return new Cleaner();
    }
}
