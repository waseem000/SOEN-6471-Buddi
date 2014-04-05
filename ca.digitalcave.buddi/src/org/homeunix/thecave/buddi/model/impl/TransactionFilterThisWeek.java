package org.homeunix.thecave.buddi.model.impl;


import org.homeunix.thecave.buddi.i18n.keys.TransactionDateFilterKeys;
import org.homeunix.thecave.buddi.model.Transaction;
import org.homeunix.thecave.buddi.model.impl.FilteredLists.TransactionListFilteredBySearch;

import java.util.Date;

import ca.digitalcave.moss.common.DateUtil;

/**
 * @see org.homeunix.thecave.buddi.i18n.keys.TransactionDateFilterKeys#TRANSACTION_FILTER_THIS_WEEK
 */
public class TransactionFilterThisWeek extends DateFilter {
	public TransactionDateFilterKeys getDateFilter() {
		return TransactionDateFilterKeys.TRANSACTION_FILTER_THIS_WEEK;
	}

	public boolean acceptDate(Transaction t, Date today,
			TransactionListFilteredBySearch transactionListFilteredBySearch) {
		return DateUtil.isSameWeek(today, t.getDate());
	}
}