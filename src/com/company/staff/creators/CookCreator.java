package com.company.staff.creators;

import com.company.Human;
import com.company.staff.*;

/**
 * Factory of Cooks
 */
public class CookCreator extends StaffCreator {
    /**
     * Create (generally hire) a new Cook
     * @return new staff member
     */
    @Override
    public Staff createStaff(Human information, StaffType type){
        return new Cook(information,type);
    }
}
