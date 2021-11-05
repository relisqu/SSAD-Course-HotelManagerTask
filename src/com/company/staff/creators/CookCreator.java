package com.company.staff.creators;

import com.company.Human;
import com.company.staff.Cook;
import com.company.staff.Staff;
import com.company.staff.StaffType;

/**
 * Factory of Cooks
 */
public class CookCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Cook
     *
     * @return new staff member
     */
    @Override
    public Staff createStaff(Human information, StaffType type) {
        return new Cook(information, type);
    }
}
