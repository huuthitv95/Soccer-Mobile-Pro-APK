package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface NetworkInitializationListener {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onInitFailed(int i, String str);

    void onInitFailed(int i, String str, Map<String, Object> map);

    void onInitSuccess();

    void onInitSuccess(Map<String, Object> map);
}
