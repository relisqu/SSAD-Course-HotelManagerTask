package com.company.staff.creators;

import com.company.staff.Electrician;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

public class ElectricianCreator extends StaffCreator {
    @Override
    public Staff createStaff() {
        return new Electrician();
    }
}
