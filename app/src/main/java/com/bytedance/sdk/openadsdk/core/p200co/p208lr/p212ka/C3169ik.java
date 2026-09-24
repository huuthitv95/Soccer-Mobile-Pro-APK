package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p212ka;

import android.content.Context;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3169ik extends AbstractViewOnTouchListenerC2318ik<C3171ri> {
    private int akr;

    /* JADX INFO: renamed from: de */
    private int f10422de;

    /* JADX INFO: renamed from: ri */
    private String f10423ri;
    private float xlq;

    /* JADX INFO: renamed from: zv */
    private float f10424zv;

    public C3169ik(Context context) {
        super(context);
        this.f10423ri = "line";
        this.akr = C2348ri.m8053ri("#FFD813");
        this.f10422de = C2348ri.m8053ri("rgba(0, 0, 0, 0.5)");
        this.f10424zv = C2347mj.m8043ri(this.f5888lr, 1.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public C3171ri mo7552ri() {
        C3171ri c3171ri = new C3171ri(this.f5888lr);
        c3171ri.m13224ri(this);
        return c3171ri;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        ((C3171ri) this.f5875fi).m13223ri(this.f10423ri).m13222ri(this.akr).m13220lr(this.f10422de).m13219lr(this.xlq).m13221ri(this.f10424zv);
    }

    /* JADX INFO: renamed from: ri */
    public void m13214ri(int i) {
        ((C3171ri) this.f5875fi).setProgress(i);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        str.hashCode();
        switch (str) {
            case "progressBackgroundColor":
                this.f10422de = C2348ri.m8053ri(str2);
                break;
            case "progressSize":
                this.f10424zv = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 1.0f));
                break;
            case "progressType":
                this.f10423ri = str2;
                break;
            case "progressColor":
                this.akr = C2348ri.m8053ri(str2);
                break;
            case "barRadius":
                if (C2343ik.m8029ri(str2, 0.0f) > 0.0f) {
                    this.xlq = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                    break;
                } else {
                    this.xlq = 0.0f;
                    break;
                }
                break;
        }
    }

    public void xha(int i) {
        ((C3171ri) this.f5875fi).setAnimationDuration(i);
    }
}
