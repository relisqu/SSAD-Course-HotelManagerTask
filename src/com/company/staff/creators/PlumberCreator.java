package com.company.staff.creators;

import com.company.Human;
import com.company.staff.Plumber;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;
import com.company.staff.StaffType;

/**
 * Factory of Plumbers
 */
public class PlumberCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Plumber
     * @return new staff member
     */
    @Override
    public Staff createStaff(Human information, StaffType type){
        return new Plumber(information,type);
    }
}
