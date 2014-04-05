package org.homeunix.thecave.buddi.model.impl;


import org.homeunix.thecave.buddi.i18n.keys.TransactionDateFilterKeys;
import org.homeunix.thecave.buddi.model.Transaction;
import org.homeunix.thecave.buddi.model.impl.FilteredLists.TransactionListFilteredBySearch;

import java.util.Date;

import ca.digitalcave.moss.common.DateUtil;

/**
 * @see org.homeunix.thecave.buddi.i18n.keys.TransactionDateFilterKeys#TRANSACTION_FILTER_LAST_QUARTER
 */
public class TransactionFilterLastQuarter extends DateFilter {
	public TransactionDateFilterKeys getDateFilter() {
		return TransactionDateFilterKeys.TRANSACTION_FILTER_LAST_QUARTER;
	}

	public boolean acceptDate(Transaction t, Date today,
			TransactionListFilteredBySearch transactionListFilteredBySearch) {
		return DateUtil.isSameDay(
				DateUtil.getStartOfQuarter(DateUtil.addQuarters(today, -1)),
				DateUtil.getStartOfQuarter(t.getDate()));
	}
}