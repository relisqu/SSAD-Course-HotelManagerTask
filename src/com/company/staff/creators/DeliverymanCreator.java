package com.company.staff.creators;

import com.company.staff.Deliveryman;
import com.company.staff.SecurityGuard;
import com.company.staff.Staff;

/**
 * Factory of Deliverymans
 */
public class DeliverymanCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Deliveryman
     * @return new staff member
     */
    @Override
    public Staff createStaff() {
        return new Deliveryman();
    }
}
