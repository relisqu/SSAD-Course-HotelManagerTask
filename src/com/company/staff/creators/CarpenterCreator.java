package com.company.staff.creators;

import com.company.staff.Carpenter;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

public class CarpenterCreator extends StaffCreator{
    @Override
    public Staff createStaff() {
        return new Carpenter();
    }
}
