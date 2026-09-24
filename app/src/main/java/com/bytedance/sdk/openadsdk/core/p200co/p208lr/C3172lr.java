package com.bytedance.sdk.openadsdk.core.p200co.p208lr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2271ri;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3172lr extends C2270lr {

    /* JADX INFO: renamed from: de */
    private String f10439de;

    /* JADX INFO: renamed from: zv */
    private String f10440zv;

    public C3172lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr
    /* JADX INFO: renamed from: aw */
    public void mo7668aw(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, AbstractJsonLexerKt.NULL)) {
            str = "";
        }
        if (TextUtils.isEmpty(this.f10440zv) || TextUtils.equals(this.f10440zv, AbstractJsonLexerKt.NULL)) {
            this.f10440zv = "";
        }
        if (TextUtils.isEmpty(this.f10439de) || TextUtils.equals(this.f10439de, AbstractJsonLexerKt.NULL)) {
            this.f10439de = "";
        }
        this.f5703ri = this.f10439de + str + this.f10440zv;
        ((C2271ri) this.f5875fi).setText(this.f5703ri);
        try {
            float f = this.f5893oh ? this.igq : this.f5902su;
            float f2 = this.f5913xd ? this.f5918zf : this.f5902su;
            float fMeasureText = ((C2271ri) this.f5875fi).getPaint().measureText(this.f5703ri);
            if (fMeasureText >= 0.0f) {
                m7840fi((int) (f + fMeasureText + f2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        if (TextUtils.isEmpty(this.f10440zv) || TextUtils.equals(this.f10440zv, AbstractJsonLexerKt.NULL)) {
            this.f10440zv = "";
        }
        if (TextUtils.isEmpty(this.f10439de) || TextUtils.equals(this.f10439de, AbstractJsonLexerKt.NULL)) {
            this.f10439de = "";
        }
        this.f5703ri = this.f10439de + this.f10440zv;
        ((C2271ri) this.f5875fi).setText(this.f5703ri);
        ((C2271ri) this.f5875fi).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        str.hashCode();
        if (str.equals("before")) {
            this.f10439de = str2;
        } else if (str.equals("after")) {
            this.f10440zv = str2;
        }
    }
}
