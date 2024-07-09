package com.src.expensetracker.services;

import com.src.expensetracker.exceptions.UserNotFoundException;

public interface LoginInf {
    public boolean login(String username, String password) throws UserNotFoundException;
}
