package com.company.administration;


import com.company.StaffAccess;
import com.company.staff.Staff;

import java.util.ArrayList;

/**
 * Represents Hotel Staff Manager.
 * He resolves all problems related to
 * insufficient staff members and requests
 * on a service.
 */
public class StaffManager {

    /**
     * Process a request on a room service.
     *
     * @param access     access to read and write staff information
     * @param roomNumber id information of a room requesting a service
     * @param message    additional information from a client
     * @param <S>        generic of a staff requested
     */
    public <S extends Staff> void makeOrder(Class<S> neededWorker, StaffAccess access, int roomNumber, String message) {
        access.getStaff().stream().filter(w -> w.getClass().equals(neededWorker)).findFirst().ifPresent(worker -> worker.doJob(roomNumber));
    }

    /**
     * Remove the worker from a staff list.
     *
     * @param access  access to read and edit staff information
     * @param workers workers to fire
     */
    public void fireStaff(StaffAccess access, Staff... workers) {
        access.deleteStaff(workers);
    }

    /**
     * Get a list of staff members
     *
     * @param access hotel staff information
     * @return list of staff members
     */
    public ArrayList<Staff> getStaffList(StaffAccess access) {
        return access.getStaff();
    }

    /**
     * Hire a worker into the staff.
     *
     * @param access  access to read and edit staff information
     * @param workers workers to hire
     */
    public void hireStaff(StaffAccess access, Staff... workers) {
        access.createStaff(workers);
    }
}
