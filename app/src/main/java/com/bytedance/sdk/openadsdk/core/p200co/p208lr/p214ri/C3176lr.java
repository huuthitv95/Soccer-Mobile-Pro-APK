package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p214ri;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2271ri;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.sdk.openadsdk.core.p200co.C3158lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3176lr extends AbstractViewOnTouchListenerC2318ik<C3177ri> {
    private int akr;

    /* JADX INFO: renamed from: de */
    private int f10453de;

    /* JADX INFO: renamed from: eu */
    private C3158lr f10454eu;

    /* JADX INFO: renamed from: ri */
    private int f10455ri;
    private int xlq;

    /* JADX INFO: renamed from: zv */
    private int f10456zv;
    private float zxp;

    public C3176lr(Context context) {
        super(context);
        this.akr = -1;
        this.f10453de = -1;
        m13237ri(context);
    }

    /* JADX INFO: renamed from: ri */
    private void m13237ri(Context context) {
        this.f10454eu = new C3158lr(context, true);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public C3177ri mo7552ri() {
        C3177ri c3177ri = new C3177ri(this.f5888lr);
        c3177ri.m13259ri(this);
        return c3177ri;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        C2271ri c2271riM13256ri = ((C3177ri) this.f5875fi).m13256ri();
        if (c2271riM13256ri != null) {
            this.f10454eu.m13197ri(c2271riM13256ri);
            ((C3177ri) this.f5875fi).m13258ri(c2271riM13256ri);
        }
        ((C3177ri) this.f5875fi).m13257ri(this.f10455ri, this.akr, this.f10453de, this.f10456zv, this.xlq, this.zxp);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik, com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: ri */
    public void mo7738ri(Canvas canvas) {
        super.mo7738ri(canvas);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1762437773:
                if (str.equals("barWidth")) {
                    b = 0;
                }
                break;
            case -1693050582:
                if (str.equals("bottomBackgroundColor")) {
                    b = 1;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b = 2;
                }
                break;
            case -1230714651:
                if (str.equals("shadowOffsetX")) {
                    b = 3;
                }
                break;
            case -1230714650:
                if (str.equals("shadowOffsetY")) {
                    b = 4;
                }
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    b = 5;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b = 6;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b = 7;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b = 8;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b = 9;
                }
                break;
            case -879295043:
                if (str.equals("textDecoration")) {
                    b = 10;
                }
                break;
            case -857900864:
                if (str.equals("topBackgroundColor")) {
                    b = Ascii.f22503VT;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b = Ascii.f22492FF;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b = Ascii.f22490CR;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b = Ascii.f22500SO;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    b = Ascii.f22499SI;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b = Ascii.DLE;
                }
                break;
            case 390232059:
                if (str.equals("maxLines")) {
                    b = 17;
                }
                break;
            case 766009114:
                if (str.equals("barHeight")) {
                    b = Ascii.DC2;
                }
                break;
            case 1048459909:
                if (str.equals("barRadius")) {
                    b = 19;
                }
                break;
            case 1428051567:
                if (str.equals("downtime")) {
                    b = Ascii.DC4;
                }
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    b = Ascii.NAK;
                }
                break;
        }
        switch (b) {
            case 0:
                this.f10456zv = C3583qd.m16589lr(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 1:
                if (!TextUtils.isEmpty(str2)) {
                    this.f10453de = Color.parseColor(str2);
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 21:
                this.f10454eu.m13198ri(str, str2);
                break;
            case 11:
                if (!TextUtils.isEmpty(str2)) {
                    this.akr = Color.parseColor(str2);
                }
                break;
            case 18:
                this.xlq = C3583qd.m16589lr(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 19:
                this.zxp = C3583qd.m16589lr(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 20:
                this.f10455ri = C2343ik.m8030ri(str2, 0);
                break;
        }
    }
}
