package com.ironsource.mediationsdk.bidding;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface BiddingDataCallback {
    void onFailure(String str);

    void onSuccess(Map<String, Object> map);
}
