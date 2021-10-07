package com.company;

import com.company.staff.Staff;

import java.util.ArrayList;

/**
 * Access modifier for our database.
 * Represents access to hotel staff information.
 */
public interface StaffAccess {

    /**
     * Get information of currently available staff
     * @return available hotel staff
     */
    ArrayList<Staff> getStaff();

    /**
     * Update staff information
     * @param updatedStaff new staff information
     */
    void updateStaff(Staff... updatedStaff);

    /**
     * Remove hotel staff
     * @param firedStaff staff to be fired
     */
    void deleteStaff(Staff... firedStaff);

    /**
     * Find new staff members
     * @param createdStaff staff to be hired
     */
    void createStaff(Staff... createdStaff);

}
