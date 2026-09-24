package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.common.C2947lr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.fi */
/* JADX INFO: loaded from: classes3.dex */
class C2988fi {

    /* JADX INFO: renamed from: ri */
    private static volatile C2988fi f9163ri;

    /* JADX INFO: renamed from: lr */
    private final Context f9164lr;

    private C2988fi(Context context) {
        this.f9164lr = context == null ? C3299nr.m14642ri() : context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ri */
    public static C2988fi m11683ri(Context context) {
        if (f9163ri == null) {
            synchronized (C2988fi.class) {
                if (f9163ri == null) {
                    f9163ri = new C2988fi(context);
                }
            }
        }
        return f9163ri;
    }

    /* JADX INFO: renamed from: ri */
    public String m11684ri(String str, boolean z) {
        C2947lr c2947lrM11358ri = C2947lr.m11358ri("sp_full_screen_video_new");
        String strM11365ri = c2947lrM11358ri.m11365ri(str, 10500000L);
        if (z && !TextUtils.isEmpty(strM11365ri) && c2947lrM11358ri.m11363ka(str)) {
            return null;
        }
        return strM11365ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m11685ri() {
        C2947lr.m11358ri("sp_full_screen_video_new").m11366ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m11686ri(AdSlot adSlot, C3289ri c3289ri) {
        if (c3289ri == null || c3289ri.m14248di() == null || !c3289ri.m14248di().m14367bl()) {
            C2947lr.m11358ri("sp_full_screen_video_new").m11367ri(adSlot, c3289ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11687ri(String str) {
        C2947lr.m11358ri("sp_full_screen_video_new").m11362ik(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m11688ri(String str, wjv wjvVar) {
        C2947lr.m11358ri("sp_full_screen_video_new").m11368ri(str, wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11689ri(C3289ri c3289ri) {
        return C2947lr.m11358ri("sp_full_screen_video_new").m11369ri(c3289ri, true);
    }
}
