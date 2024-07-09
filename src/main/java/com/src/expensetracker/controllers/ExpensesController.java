package com.src.expensetracker.controllers;

import com.src.expensetracker.model.Expense;
import com.src.expensetracker.services.ExpenseImpl;

public class ExpensesController {
    ExpenseImpl ei=new ExpenseImpl();

    public void addExpense(float amount, String category, String date, String description) {
        ei.addExpense(amount, category, date, description);
    }
    public String[] getExpenses() {
        return ei.getExpenses();
    }
}
