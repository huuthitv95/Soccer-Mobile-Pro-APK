package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.common.C2947lr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class bgr {

    /* JADX INFO: renamed from: ri */
    private static final ConcurrentHashMap<EnumC2984ri, bgr> f9106ri = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ik */
    private final EnumC2984ri f9107ik;

    /* JADX INFO: renamed from: lr */
    private final Context f9108lr;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.bgr$ri */
    public enum EnumC2984ri {
        REWARD_VIDEO("sp_reward_video", "sp_reward_video_new", "reward_video_cache"),
        FULL_SCREEN_VIDEO("sp_full_screen_video", "sp_full_screen_video_new", "full_screen_video_cache");


        /* JADX INFO: renamed from: fi */
        final String f9112fi;

        /* JADX INFO: renamed from: ik */
        final String f9113ik;

        /* JADX INFO: renamed from: ka */
        final String f9114ka;

        EnumC2984ri(String str, String str2, String str3) {
            this.f9113ik = str;
            this.f9114ka = str2;
            this.f9112fi = str3;
        }
    }

    private bgr(Context context, EnumC2984ri enumC2984ri) {
        this.f9108lr = context == null ? C3299nr.m14642ri() : context.getApplicationContext();
        this.f9107ik = enumC2984ri;
    }

    /* JADX INFO: renamed from: ri */
    public static bgr m11631ri(Context context, EnumC2984ri enumC2984ri) {
        ConcurrentHashMap<EnumC2984ri, bgr> concurrentHashMap = f9106ri;
        if (!concurrentHashMap.containsKey(enumC2984ri)) {
            synchronized (bgr.class) {
                if (!concurrentHashMap.containsKey(enumC2984ri)) {
                    concurrentHashMap.put(enumC2984ri, new bgr(context, enumC2984ri));
                }
            }
        }
        return concurrentHashMap.get(enumC2984ri);
    }

    /* JADX INFO: renamed from: ri */
    public String m11632ri(String str, boolean z) {
        C2947lr c2947lrM11358ri = C2947lr.m11358ri(this.f9107ik.f9114ka);
        String strM11365ri = c2947lrM11358ri.m11365ri(str, 10500000L);
        if (z && !TextUtils.isEmpty(strM11365ri) && c2947lrM11358ri.m11363ka(str)) {
            return null;
        }
        return strM11365ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m11633ri() {
        C2947lr.m11358ri(this.f9107ik.f9114ka).m11366ri();
    }

    /* JADX INFO: renamed from: ri */
    public void m11634ri(AdSlot adSlot, C3289ri c3289ri) {
        if (c3289ri == null || c3289ri.m14248di() == null || !c3289ri.m14248di().m14367bl()) {
            C2947lr.m11358ri(this.f9107ik.f9114ka).m11367ri(adSlot, c3289ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11635ri(String str) {
        C2947lr.m11358ri(this.f9107ik.f9114ka).m11362ik(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m11636ri(String str, wjv wjvVar) {
        C2947lr.m11358ri(this.f9107ik.f9114ka).m11368ri(str, wjvVar);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11637ri(C3289ri c3289ri) {
        return C2947lr.m11358ri(this.f9107ik.f9114ka).m11369ri(c3289ri, true);
    }
}
