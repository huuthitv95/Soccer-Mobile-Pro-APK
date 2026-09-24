package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface AdapterAdListener {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onAdClicked();

    void onAdClicked(Map<String, Object> map);

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str);

    void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str, Map<String, Object> map);

    void onAdLoadSuccess();

    void onAdLoadSuccess(Map<String, Object> map);

    void onAdOpened();

    void onAdOpened(Map<String, Object> map);

    void onAdShowFailed(int i, String str);

    void onAdShowFailed(int i, String str, Map<String, Object> map);
}
