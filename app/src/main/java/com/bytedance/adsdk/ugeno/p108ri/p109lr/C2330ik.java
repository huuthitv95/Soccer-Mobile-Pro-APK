package com.bytedance.adsdk.ugeno.p108ri.p109lr;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p108ri.EnumC2326fi;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.lr.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2330ik extends AbstractC2333ri {
    public C2330ik(Context context, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, TreeMap<Float, String> treeMap) {
        super(context, abstractViewOnTouchListenerC2318ik, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: di */
    public TypeEvaluator mo7990di() {
        return this.f6039ka == EnumC2326fi.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: lr */
    public void mo7991lr() {
        if (this.f6039ka == EnumC2326fi.BACKGROUND_COLOR) {
            this.f6037fi.add(Keyframe.ofInt(0.0f, this.xha.srn()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: ri */
    public void mo7992ri(float f, String str) {
        this.f6037fi.add(this.f6039ka == EnumC2326fi.BACKGROUND_COLOR ? Keyframe.ofInt(f, C2348ri.m8053ri(str)) : Keyframe.ofInt(f, C2343ik.m8030ri(str, 0)));
    }
}
