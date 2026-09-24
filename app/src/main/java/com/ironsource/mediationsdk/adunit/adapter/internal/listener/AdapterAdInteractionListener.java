package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onAdClosed();

    void onAdClosed(Map<String, Object> map);

    void onAdEnded();

    void onAdEnded(Map<String, Object> map);

    void onAdStarted();

    void onAdStarted(Map<String, Object> map);

    void onAdVisible();

    void onAdVisible(Map<String, Object> map);
}
