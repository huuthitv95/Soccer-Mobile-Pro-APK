package com.tiktok.iap.billing.client;

import com.tiktok.iap.billing.GPBillVersions;

/* JADX INFO: loaded from: classes7.dex */
public interface IBillingProxy {
    GPBillVersions.GPBillingVer getVersion();

    void init();

    void queryPurchaseHistory();
}
