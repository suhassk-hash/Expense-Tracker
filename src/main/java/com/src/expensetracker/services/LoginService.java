package com.src.expensetracker.services;

import com.src.expensetracker.dao.loginvalidation;
import com.src.expensetracker.exceptions.UserNotFoundException;

public class LoginService implements LoginInf{
    @Override
    public boolean login(String username, String password) throws UserNotFoundException {
        try{
            loginvalidation lv=new loginvalidation();
            return lv.validate(username, password);
        }
        catch(UserNotFoundException e){
            throw new UserNotFoundException("User not found");
        }
    }
}
