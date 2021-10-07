package com.company.staff.creators;

import com.company.staff.Electrician;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

/**
 * Factory of Electricians
 */
public class ElectricianCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Electrician
     * @return new staff member
     */
    @Override
    public Staff createStaff() {
        return new Electrician();
    }
}
