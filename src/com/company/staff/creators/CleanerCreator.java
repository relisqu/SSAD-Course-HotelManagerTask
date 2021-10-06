package com.company.staff.creators;

import com.company.staff.Cleaner;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

public class CleanerCreator extends StaffCreator {
    @Override
    public Staff createStaff() {
        return new Cleaner();
    }
}
