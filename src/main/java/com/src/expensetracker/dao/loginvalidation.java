package com.src.expensetracker.dao;

import com.src.expensetracker.exceptions.UserNotFoundException;

public class loginvalidation {
    public boolean validate(String username, String password) throws UserNotFoundException {
        try{
            return true;
        }
        catch(Exception e){
            throw new UserNotFoundException("User not found");
        }
    }
}
