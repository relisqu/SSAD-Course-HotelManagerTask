package com.company.staff.creators;

import com.company.staff.Staff;

/**
 * Represents a staff factory
 */
public class StaffCreator {
    /**
     * Creates (generally hires) a new staff
     * @return hired staff member
     */
    public Staff createStaff(){
        return new Staff();
    }
}
