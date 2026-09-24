package com.bytedance.adsdk.ugeno.jbs.p097ik;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.jbs.p098ka.C2275ik;
import com.bytedance.adsdk.ugeno.jbs.p098ka.C2277ri;
import com.bytedance.adsdk.ugeno.xha.C2348ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2274ri extends C2275ik {
    private int xlq;

    public AbstractC2274ri(Context context) {
        super(context);
        this.xlq = ViewCompat.MEASURED_STATE_MASK;
    }

    /* JADX INFO: renamed from: vr */
    private String m7678vr(String str) {
        String strMo7679aw = mo7679aw(str);
        return TextUtils.isEmpty(strMo7679aw) ? "" : "local://".concat(String.valueOf(strMo7679aw));
    }

    /* JADX INFO: renamed from: aw */
    public abstract String mo7679aw(String str);

    @Override // com.bytedance.adsdk.ugeno.jbs.p098ka.C2275ik
    /* JADX INFO: renamed from: ik */
    protected String mo7680ik() {
        return "drawable";
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.p098ka.C2275ik, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        this.f5725ri = m7678vr(this.f5725ri);
        super.mo7550lr();
        ((C2277ri) this.f5875fi).setColorFilter(this.xlq);
        ((C2277ri) this.f5875fi).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.p098ka.C2275ik, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        str.hashCode();
        if (str.equals("textColor")) {
            this.xlq = C2348ri.m8053ri(str2);
        }
    }
}
