package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2476qt;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.google.common.base.Ascii;
import com.ironsource.C11366Bc;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C2456qt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    public static xha m8449ri(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar, C2476qt c2476qt, C2500aw c2500aw) {
        if (context == null || abstractC2412fi == null || xhaVar == null) {
            return null;
        }
        String strM8707kt = xhaVar.m8707kt();
        String strM8877ay = c2500aw.m8877ay();
        strM8707kt.hashCode();
        byte b = -1;
        switch (strM8707kt.hashCode()) {
            case 48:
                if (strM8707kt.equals("0")) {
                    b = 0;
                }
                break;
            case 49:
                if (strM8707kt.equals("1")) {
                    b = 1;
                }
                break;
            case 50:
                if (strM8707kt.equals("2")) {
                    b = 2;
                }
                break;
            case 53:
                if (strM8707kt.equals(CampaignEx.CLICKMODE_ON)) {
                    b = 3;
                }
                break;
            case 54:
                if (strM8707kt.equals("6")) {
                    b = 4;
                }
                break;
            case 55:
                if (strM8707kt.equals(C11366Bc.f23952e)) {
                    b = 5;
                }
                break;
            case 56:
                if (strM8707kt.equals("8")) {
                    b = 6;
                }
                break;
            case 57:
                if (strM8707kt.equals("9")) {
                    b = 7;
                }
                break;
            case 1567:
                if (strM8707kt.equals("10")) {
                    b = 8;
                }
                break;
            case 1568:
                if (strM8707kt.equals("11")) {
                    b = 9;
                }
                break;
            case 1569:
                if (strM8707kt.equals("12")) {
                    b = 10;
                }
                break;
            case 1570:
                if (strM8707kt.equals("13")) {
                    b = Ascii.f22503VT;
                }
                break;
            case 1571:
                if (strM8707kt.equals("14")) {
                    b = Ascii.f22492FF;
                }
                break;
            case 1573:
                if (strM8707kt.equals("16")) {
                    b = Ascii.f22490CR;
                }
                break;
            case 1574:
                if (strM8707kt.equals("17")) {
                    b = Ascii.f22500SO;
                }
                break;
            case 1575:
                if (strM8707kt.equals("18")) {
                    b = Ascii.f22499SI;
                }
                break;
            case 1598:
                if (strM8707kt.equals("20")) {
                    b = Ascii.DLE;
                }
                break;
            case 1600:
                if (strM8707kt.equals("22")) {
                    b = 17;
                }
                break;
            case 1601:
                if (strM8707kt.equals("23")) {
                    b = Ascii.DC2;
                }
                break;
            case 1602:
                if (strM8707kt.equals("24")) {
                    b = 19;
                }
                break;
            case 1603:
                if (strM8707kt.equals("25")) {
                    b = Ascii.DC4;
                }
                break;
            case 1607:
                if (strM8707kt.equals("29")) {
                    b = Ascii.NAK;
                }
                break;
        }
        switch (b) {
            case 0:
                return new C2447fi(context, abstractC2412fi, xhaVar);
            case 1:
                return new C2448ik(context, abstractC2412fi, xhaVar);
            case 2:
                return new C2453lr(context, abstractC2412fi, xhaVar);
            case 3:
                return xhaVar.zyn() == 1 ? new C2444bu(context, abstractC2412fi, xhaVar, xhaVar.m8710nd()) : new slm(context, abstractC2412fi, xhaVar);
            case 4:
            case 9:
                return new bgr(context, abstractC2412fi, xhaVar);
            case 5:
            case 12:
                return new C2445co(context, abstractC2412fi, xhaVar);
            case 6:
                return new C2443aw(context, abstractC2412fi, xhaVar);
            case 7:
            case 13:
                return new C2468vr(context, abstractC2412fi, xhaVar, strM8707kt, c2476qt.m8653ri(), c2476qt.m8649lr(), c2476qt.m8647ka(), c2476qt.xha());
            case 8:
                return new C2452ka(context, abstractC2412fi, xhaVar);
            case 10:
                return new slm(context, abstractC2412fi, xhaVar);
            case 11:
                return new C2444bu(context, abstractC2412fi, xhaVar);
            case 14:
            case 15:
                return new tan(context, abstractC2412fi, xhaVar, strM8707kt, c2476qt);
            case 16:
                if (C2490ka.m8810lr()) {
                    return new C2466sf(context, abstractC2412fi, xhaVar, strM8877ay + "static/lotties/glass-swipe/glass-swipe.json", "20");
                }
                return new C2466sf(context, abstractC2412fi, xhaVar, TextUtils.isEmpty(strM8877ay) ? null : strM8877ay + "brush_mask.json", "20");
            case 17:
                if (!C2490ka.m8810lr()) {
                    return new C2455nr(context, abstractC2412fi, xhaVar);
                }
                return new C2466sf(context, abstractC2412fi, xhaVar, strM8877ay + "static/lotties/202327swiper-up-star/index.json", "22");
            case 18:
                if (!C2490ka.m8810lr()) {
                    return null;
                }
                return new C2466sf(context, abstractC2412fi, xhaVar, strM8877ay + "static/lotties/202327swiper-up-star/click.json", "23");
            case 19:
                if (C2490ka.m8810lr()) {
                    return new C2457ri(context, abstractC2412fi, xhaVar);
                }
                return new C2466sf(context, abstractC2412fi, xhaVar, TextUtils.isEmpty(strM8877ay) ? null : strM8877ay + "swiper_up_star.json", "24");
            case 20:
                if (!C2490ka.m8810lr()) {
                    return null;
                }
                return new C2466sf(context, abstractC2412fi, xhaVar, strM8877ay + "static/lotties/gesture-slide.json", "25");
            case 21:
                return new C2446di(context, abstractC2412fi, xhaVar, c2476qt.m8653ri(), c2476qt.m8649lr(), c2476qt.m8647ka(), c2476qt.xha());
            default:
                return null;
        }
    }
}
