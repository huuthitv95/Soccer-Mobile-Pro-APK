package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C8309r;
import com.fyber.inneractive.sdk.model.vast.EnumC8311t;
import java.util.Comparator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.vast.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8230g implements Comparator {

    /* JADX INFO: renamed from: a */
    public final int f18350a;

    /* JADX INFO: renamed from: b */
    public final int f18351b;

    /* JADX INFO: renamed from: c */
    public final int f18352c;

    public C8230g(int i, int i2, int i3) {
        this.f18350a = i;
        this.f18351b = i2;
        this.f18352c = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        C8309r c8309r = (C8309r) obj;
        C8309r c8309r2 = (C8309r) obj2;
        int i = -1;
        if (!TextUtils.equals("VPAID", c8309r2.f18569f)) {
            if (!TextUtils.equals("VPAID", c8309r.f18569f)) {
                Integer num2 = c8309r.f18568e;
                int iIntValue = num2 == null ? 0 : num2.intValue();
                Integer num3 = c8309r2.f18568e;
                int iIntValue2 = num3 == null ? 0 : num3.intValue();
                int i2 = this.f18350a;
                if (iIntValue2 <= i2 || iIntValue > i2) {
                    if (iIntValue <= i2 || iIntValue2 > i2) {
                        EnumC8311t enumC8311tM20709a = EnumC8311t.m20709a(c8309r2.f18567d);
                        EnumC8311t enumC8311t = EnumC8311t.MEDIA_TYPE_MP4;
                        if (enumC8311tM20709a == enumC8311t) {
                            num = 3;
                        } else if (enumC8311tM20709a == EnumC8311t.MEDIA_TYPE_3GPP) {
                            num = 2;
                        } else {
                            num = enumC8311tM20709a == EnumC8311t.MEDIA_TYPE_WEBM ? 1 : -1;
                        }
                        EnumC8311t enumC8311tM20709a2 = EnumC8311t.m20709a(c8309r.f18567d);
                        if (enumC8311tM20709a2 == enumC8311t) {
                            i = 3;
                        } else if (enumC8311tM20709a2 == EnumC8311t.MEDIA_TYPE_3GPP) {
                            i = 2;
                        } else if (enumC8311tM20709a2 == EnumC8311t.MEDIA_TYPE_WEBM) {
                            i = 1;
                        }
                        int iCompareTo = num.compareTo(i);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                        if (iIntValue >= iIntValue2) {
                            if (iIntValue <= iIntValue2) {
                                Integer num4 = c8309r.f18565b;
                                int iIntValue3 = num4 == null ? 0 : num4.intValue();
                                Integer num5 = c8309r.f18566c;
                                int iIntValue4 = num5 == null ? 0 : num5.intValue();
                                Integer num6 = c8309r2.f18565b;
                                int iIntValue5 = num6 == null ? 0 : num6.intValue();
                                Integer num7 = c8309r2.f18566c;
                                int i3 = iIntValue3 * iIntValue4;
                                int iIntValue6 = iIntValue5 * (num7 == null ? 0 : num7.intValue());
                                int i4 = this.f18351b * this.f18352c;
                                int iAbs = Math.abs(i3 - i4);
                                int iAbs2 = Math.abs(iIntValue6 - i4);
                                if (iAbs >= iAbs2) {
                                    if (iAbs <= iAbs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
