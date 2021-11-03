package com.company.staff.creators;

import com.company.Human;
import com.company.staff.Carpenter;
import com.company.staff.Staff;
import com.company.staff.StaffType;

/**
 * Factory of Carpenters
 */
public class CarpenterCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Carpenter
     *
     * @return new staff member
     */
    @Override
    public Staff createStaff(Human information, StaffType type) {
        return new Carpenter(information, type);
    }
}
