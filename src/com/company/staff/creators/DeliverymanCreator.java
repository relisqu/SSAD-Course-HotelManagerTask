package com.company.staff.creators;

import com.company.staff.Deliveryman;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

public class DeliverymanCreator extends StaffCreator {
    @Override
    public Staff createStaff() {
        return new Deliveryman();
    }
}
