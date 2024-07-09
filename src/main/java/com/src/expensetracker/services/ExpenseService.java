package com.src.expensetracker.services;

public interface ExpenseService {
    void addExpense(float amount, String category, String date, String description);
    String[] getExpenses();
}
