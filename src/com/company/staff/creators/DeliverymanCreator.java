package com.company.staff.creators;

import com.company.Human;
import com.company.staff.*;

/**
 * Factory of Deliverymans
 */
public class DeliverymanCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Deliveryman
     * @return new staff member
     */
    @Override
    public Staff createStaff(Human information, StaffType type){
        return new Deliveryman(information,type);
    }
}
