package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface AdapterAdViewListener extends AdapterAdListener {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onAdLeftApplication();

    void onAdLeftApplication(Map<String, Object> map);

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams);

    void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map);

    void onAdScreenDismissed();

    void onAdScreenDismissed(Map<String, Object> map);

    void onAdScreenPresented();

    void onAdScreenPresented(Map<String, Object> map);
}
