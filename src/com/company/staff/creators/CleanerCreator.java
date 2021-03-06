package com.company.staff.creators;

import com.company.Human;
import com.company.staff.Cleaner;
import com.company.staff.Staff;
import com.company.staff.StaffType;

/**
 * Factory of Cleaners
 */
public class CleanerCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Cleaner
     *
     * @return new staff member
     */
    @Override
    public Staff createStaff(Human information, StaffType type) {
        return new Cleaner(information, type);
    }
}
