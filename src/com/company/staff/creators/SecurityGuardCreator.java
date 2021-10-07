package com.company.staff.creators;

import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

/**
 * Factory of Security Guards
 */
public class SecurityGuardCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Security Guard
     * @return new staff member
     */
    @Override
    public Staff createStaff() {
        return new SecurityGuard();
    }
}
