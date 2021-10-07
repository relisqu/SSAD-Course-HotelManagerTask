package com.company.staff.creators;

import com.company.Human;
import com.company.staff.Electrician;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;
import com.company.staff.StaffType;

/**
 * Factory of Electricians
 */
public class ElectricianCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Electrician
     * @return new staff member
     */
    @Override
    public Staff createStaff(Human information, StaffType type){
        return new Electrician(information,type);
    }
}
