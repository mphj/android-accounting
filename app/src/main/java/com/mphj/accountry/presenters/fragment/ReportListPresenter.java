package com.mphj.accountry.presenters.fragment;

import com.mphj.accountry.presenters.BasePresenter;

/**
 * Created by mphj on 11/20/17.
 */

public interface ReportListPresenter extends BasePresenter {
    void loadList();
    void loadList(long fromDate, long toDate);
    void exportV1(long fromDate, long toDate);
}
