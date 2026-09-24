package com.bytedance.adsdk.ugeno.jbs.p096fi;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2348ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.fi.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2272lr extends AbstractViewOnTouchListenerC2318ik<C2273ri> {
    private int akr;

    /* JADX INFO: renamed from: de */
    private float f5713de;

    /* JADX INFO: renamed from: ri */
    private int f5714ri;
    private float xlq;

    /* JADX INFO: renamed from: zv */
    private float f5715zv;
    private static final int zxp = Color.parseColor("#FFC642");

    /* JADX INFO: renamed from: eu */
    private static final int f5712eu = Color.parseColor("#e3e3e4");

    public C2272lr(Context context) {
        super(context);
        this.f5714ri = zxp;
        this.akr = f5712eu;
        this.f5713de = 4.0f;
        this.f5715zv = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public C2273ri mo7552ri() {
        C2273ri c2273ri = new C2273ri(this.f5888lr);
        c2273ri.m7677ri(this);
        return c2273ri;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        if (hcw()) {
            ((C2273ri) this.f5875fi).m7676ri(this.f5713de, this.f5714ri, this.akr, this.f5715zv, (int) this.xlq);
        } else {
            ((C2273ri) this.f5875fi).m7676ri(this.f5713de, this.f5714ri, this.akr, this.f5715zv, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        str.hashCode();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.f5714ri = C2348ri.m8053ri(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.akr = C2348ri.m8055ri(str2, f5712eu);
                break;
            case "gap":
                this.xlq = C2343ik.m8029ri(str2, 0.0f);
                break;
            case "size":
                this.f5715zv = C2343ik.m8029ri(str2, 20.0f);
                break;
            case "score":
                this.f5713de = C2343ik.m8029ri(str2, 4.0f);
                break;
        }
    }
}
