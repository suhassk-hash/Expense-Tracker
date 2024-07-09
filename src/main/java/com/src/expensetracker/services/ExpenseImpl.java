package com.src.expensetracker.services;

public class ExpenseImpl implements ExpenseService{
    @Override
    public void addExpense(float amount, String category, String date, String description) {
        // Add the expense to the database
    }

    @Override
    public String[] getExpenses() {
        return new String[] {"Rent", "Groceries", "Utilities", "Car Payment", "Gas", "Insurance", "Entertainment"};
    }
}
