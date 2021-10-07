package com.company.staff.creators;

import com.company.Human;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;
import com.company.staff.StaffType;

/**
 * Factory of Security Guards
 */
public class SecurityGuardCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Security Guard
     * @return new staff member
     */
    @Override
    public Staff createStaff(Human information, StaffType type){
        return new SecurityGuard(information,type);
    }
}
