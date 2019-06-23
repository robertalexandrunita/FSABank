package com.github.robertnita.bankapplication.controllers;

import com.github.robertnita.bankapplication.util.Auth;
import com.github.robertnita.bankapplication.models.Staff;
import com.github.robertnita.bankapplication.respositories.impl.StaffRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Robert Nita
 */
public class StaffController {

    private static StaffController staffCtrl;
    private final StaffRepository staffRepository;
    private List<Staff> staffs;

    private StaffController() {
        this.staffRepository = new StaffRepository();
    }

    /**
     * Makes the authentication by a given account number and a password
     *
     * @param accountNumber The account number of an user
     * @param password The password of an user
     * @return - Whether an staff exists in the database
     */
    public boolean login(String accountNumber, String password) {
        staffs = staffRepository.all();
        for (int i = 0; i < staffs.size(); i++) {
            Staff tempStaff = staffs.get(i);

            if (tempStaff.getAccountNumber().equals(accountNumber)
                    && tempStaff.getPassword().equals(password)) {
                Auth.setAccountNumber(accountNumber);
                Auth.setName(tempStaff.getName());
                Auth.setType("staff");
                return true;
            }
        }
        return false;
    }

    public void store(Staff staff) {
        staffRepository.store(staff);
    }

    public ArrayList<Staff> getStaffs() {
        return staffRepository.all();
    }

    public Staff findById(int id) {
        return staffRepository.find(id);
    }

    public void update(Staff staff) {
        staffRepository.update(staff);
    }

    public void destroy(Staff staff) {
        staffRepository.destroy(staff);
    }

    public static StaffController getInstance() {
        if (staffCtrl == null) {
            staffCtrl = new StaffController();
        }
        return staffCtrl;
    }
}
