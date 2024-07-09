package com.src.expensetracker.controllers;

import com.src.expensetracker.exceptions.UserNotFoundException;
import com.src.expensetracker.services.LoginService;

public class LoginController {
    public boolean login(String Username,String Password) throws UserNotFoundException {
     LoginService ls=new LoginService();
     return ls.login(Username,Password);
    }
}
