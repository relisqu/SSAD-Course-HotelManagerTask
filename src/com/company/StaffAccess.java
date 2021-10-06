package com.company;

import com.company.staff.Staff;

import java.util.ArrayList;

public interface StaffAccess {
    public ArrayList<Staff> getStaff();

    void updateStaff(Staff... updatedStaff);

    void deleteStaff(Staff... firedStaff);

    void createStaff(Staff... createdStaff);

}
