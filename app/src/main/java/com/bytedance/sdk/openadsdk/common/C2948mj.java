package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2948mj extends Button {
    public C2948mj(Context context) {
        super(context);
        m11378ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m11378ri() {
        setId(com.bytedance.sdk.openadsdk.utils.slm.hws);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, C3583qd.m16589lr(context, 48.0f)));
        setBackground(C3586sf.m16645ri(context, "tt_browser_download_selector"));
        setText(C2729uq.m10311ri(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
