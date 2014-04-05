package org.homeunix.thecave.buddi.model.impl;


import org.homeunix.thecave.buddi.i18n.keys.TransactionDateFilterKeys;
import org.homeunix.thecave.buddi.model.Transaction;

import java.util.Date;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;
import org.homeunix.thecave.buddi.model.impl.FilteredLists.TransactionListFilteredBySearch;

/**
 * @see org.homeunix.thecave.buddi.i18n.keys.TransactionDateFilterKeys#TRANSACTION_FILTER_THIS_SEMI_MONTH
 */
public class TransactionFilterThisSemiMonth extends DateFilter {
	public TransactionDateFilterKeys getDateFilter() {
		return TransactionDateFilterKeys.TRANSACTION_FILTER_THIS_SEMI_MONTH;
	}

	public boolean acceptDate(Transaction t, Date today,
			TransactionListFilteredBySearch transactionListFilteredBySearch) {
		BudgetCategoryType semiMonth = new BudgetCategoryTypeSemiMonthly();
		return (semiMonth.getStartOfBudgetPeriod(new Date()).equals(semiMonth
				.getStartOfBudgetPeriod(t.getDate())));
	}
}