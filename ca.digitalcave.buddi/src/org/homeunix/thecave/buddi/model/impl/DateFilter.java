package org.homeunix.thecave.buddi.model.impl;


import org.homeunix.thecave.buddi.i18n.keys.TransactionDateFilterKeys;
import org.homeunix.thecave.buddi.model.Transaction;
import org.homeunix.thecave.buddi.model.impl.FilteredLists.TransactionListFilteredBySearch;

import java.util.Date;

public abstract class DateFilter {
	public abstract TransactionDateFilterKeys getDateFilter();

	public abstract boolean acceptDate(Transaction t, Date today,
			TransactionListFilteredBySearch transactionListFilteredBySearch);
}