package com.company.staff.creators;

import com.company.Human;
import com.company.staff.Staff;
import com.company.staff.StaffType;

/**
 * Represents a staff factory
 */
public abstract class StaffCreator {
    /**
     * Creates (generally hires) a new staff
     *
     * @return hired staff member
     */
    public abstract Staff createStaff(Human information, StaffType type);
}
