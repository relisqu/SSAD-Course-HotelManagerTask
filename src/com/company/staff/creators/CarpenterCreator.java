package com.company.staff.creators;

import com.company.staff.Carpenter;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

/**
 * Factory of Carpenters
 */
public class CarpenterCreator extends StaffCreator{
    /**
     * Create (generally hire) a new Carpenter
     * @return new staff member
     */
    @Override
    public Staff createStaff() {
        return new Carpenter();
    }
}
