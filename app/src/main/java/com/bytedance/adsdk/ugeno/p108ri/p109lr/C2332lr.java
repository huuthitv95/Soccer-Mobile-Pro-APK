package com.bytedance.adsdk.ugeno.p108ri.p109lr;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p108ri.EnumC2326fi;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2332lr extends AbstractC2333ri {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.lr.lr$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f6035ri;

        static {
            int[] iArr = new int[EnumC2326fi.values().length];
            f6035ri = iArr;
            try {
                iArr[EnumC2326fi.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6035ri[EnumC2326fi.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6035ri[EnumC2326fi.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6035ri[EnumC2326fi.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6035ri[EnumC2326fi.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6035ri[EnumC2326fi.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6035ri[EnumC2326fi.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6035ri[EnumC2326fi.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6035ri[EnumC2326fi.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C2332lr(Context context, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, TreeMap<Float, String> treeMap) {
        super(context, abstractViewOnTouchListenerC2318ik, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: di */
    public TypeEvaluator mo7990di() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: lr */
    public void mo7991lr() {
        float fM7884vr;
        switch (AnonymousClass1.f6035ri[this.f6039ka.ordinal()]) {
            case 1:
                fM7884vr = this.xha.m7884vr();
                break;
            case 2:
                fM7884vr = this.xha.slm();
                break;
            case 3:
                fM7884vr = this.xha.m7832bu();
                break;
            case 4:
                fM7884vr = this.xha.m7855nr();
                break;
            case 5:
                fM7884vr = this.xha.tan();
                if (this.xha.m7879sf() != null) {
                    this.xha.m7879sf().setCameraDistance(10000.0f);
                }
                break;
            case 6:
                fM7884vr = this.xha.m7829ac();
                if (this.xha.m7879sf() != null) {
                    this.xha.m7879sf().setCameraDistance(10000.0f);
                }
                break;
            case 7:
                fM7884vr = this.xha.ihz();
                break;
            case 8:
                fM7884vr = this.xha.m7883uq();
                break;
            case 9:
                fM7884vr = this.xha.wjv();
                break;
            default:
                fM7884vr = 0.0f;
                break;
        }
        this.f6037fi.add(Keyframe.ofFloat(0.0f, fM7884vr));
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p109lr.AbstractC2333ri
    /* JADX INFO: renamed from: ri */
    public void mo7992ri(float f, String str) {
        this.f6037fi.add(Keyframe.ofFloat(f, (this.f6040lr.startsWith(EnumC2326fi.TRANSLATE.m7962ri()) || this.f6039ka == EnumC2326fi.BORDER_RADIUS) ? C2347mj.m8043ri(this.f6041ri, C2343ik.m8029ri(str, 0.0f)) : C2343ik.m8029ri(str, 0.0f)));
    }
}
