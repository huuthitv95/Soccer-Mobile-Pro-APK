package com.fyber.inneractive.sdk.network.timeouts.content;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7983k;
import com.fyber.inneractive.sdk.network.timeouts.AbstractC8418a;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.timeouts.content.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8419a extends AbstractC8418a {

    /* JADX INFO: renamed from: h */
    public final int f18733h;

    public C8419a(String str, String str2, int i, boolean z, String str3, C8006r c8006r) {
        int iIntValue;
        char c;
        C7983k c7983k = (C7983k) c8006r.m20432a(C7983k.class);
        this.f18733h = 0;
        Boolean boolMo20420c = c7983k.mo20420c("reverse_retries");
        this.f18732g = boolMo20420c != null ? boolMo20420c.booleanValue() : true;
        if (z) {
            iIntValue = c7983k.m20424b(str, str3);
        } else if (TextUtils.isEmpty(str3)) {
            String str4 = str + "_global_timeout";
            int i2 = C7983k.m20422d(str) ? 30000 : 10000;
            Integer numMo20416a = c7983k.mo20416a(str4);
            iIntValue = numMo20416a != null ? numMo20416a.intValue() : i2;
        } else {
            iIntValue = c7983k.m20425c(str, str3);
        }
        if (iIntValue > i) {
            c = 1;
            if (TextUtils.isEmpty(str3)) {
                Integer numMo20416a2 = c7983k.mo20416a(C7983k.m20421a(str, str2, "retry_interval"));
                this.f18730e = numMo20416a2 != null ? numMo20416a2.intValue() : 100;
                Integer numMo20416a3 = c7983k.mo20416a(C7983k.m20421a("timeout", "threshold"));
                this.f18731f = numMo20416a3 != null ? numMo20416a3.intValue() : 300;
                String strM20421a = C7983k.m20421a(str, str2, "ilat");
                int i3 = C7983k.m20422d(str) ? 20000 : 10000;
                Integer numMo20416a4 = c7983k.mo20416a(strM20421a);
                this.f18729d = numMo20416a4 != null ? numMo20416a4.intValue() : i3;
            } else {
                String strM20421a2 = C7983k.m20421a(str, str2, "retry_interval", C7983k.m20423e(str3));
                Integer numMo20416a5 = c7983k.mo20416a(C7983k.m20421a("retry_interval", "all_mediators"));
                int iIntValue2 = numMo20416a5 != null ? numMo20416a5.intValue() : 100;
                Integer numMo20416a6 = c7983k.mo20416a(strM20421a2);
                this.f18730e = numMo20416a6 != null ? numMo20416a6.intValue() : iIntValue2;
                String strM20421a3 = C7983k.m20421a("timeout", "threshold", C7983k.m20423e(str3));
                Integer numMo20416a7 = c7983k.mo20416a(C7983k.m20421a("timeout", "threshold", "all_mediators"));
                int iIntValue3 = numMo20416a7 != null ? numMo20416a7.intValue() : 300;
                Integer numMo20416a8 = c7983k.mo20416a(strM20421a3);
                this.f18731f = numMo20416a8 != null ? numMo20416a8.intValue() : iIntValue3;
                String strM20421a4 = C7983k.m20421a(str, str2, "ilat", C7983k.m20423e(str3));
                String strM20421a5 = C7983k.m20421a(str, str2, "ilat", "all_mediators");
                int iIntValue4 = C7983k.m20422d(str) ? 20000 : 10000;
                Integer numMo20416a9 = c7983k.mo20416a(strM20421a5);
                iIntValue4 = numMo20416a9 != null ? numMo20416a9.intValue() : iIntValue4;
                Integer numMo20416a10 = c7983k.mo20416a(strM20421a4);
                this.f18729d = numMo20416a10 != null ? numMo20416a10.intValue() : iIntValue4;
            }
        } else {
            c = 1;
        }
        int i4 = iIntValue - (this.f18731f + i);
        String strM21942a = IAlog.m21942a(C8419a.class);
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        Integer numValueOf3 = Integer.valueOf(i4);
        Object[] objArr = new Object[4];
        objArr[0] = strM21942a;
        objArr[c] = numValueOf;
        objArr[2] = numValueOf2;
        objArr[3] = numValueOf3;
        IAlog.m21945a("%s : LoadAdContentTimeout resolveLoadAdTimeout : usedTime: %d, global timeout: %d, timeout: %d", objArr);
        this.f18728c = Math.max(i4, 0);
        int iM20797a = m20797a();
        this.f18726a = iM20797a;
        if (iM20797a == 0) {
            this.f18729d = this.f18728c;
        }
        String strM21943a = IAlog.m21943a(this);
        Integer numValueOf4 = Integer.valueOf(this.f18726a);
        Object[] objArr2 = new Object[3];
        objArr2[0] = strM21943a;
        objArr2[c] = numValueOf4;
        objArr2[2] = 0;
        IAlog.m21945a("%s : LoadAdContentTimeout onFixedLoadAdTimeoutUpdated : Calculated: %d attempts with LeftoverTime: %d", objArr2);
        int i5 = this.f18726a;
        if (i5 > 0) {
            int i6 = this.f18728c;
            int i7 = this.f18731f;
            int i8 = this.f18730e;
            for (int i9 = 0; i9 <= i5; i9++) {
                i6 -= (this.f18727b * i9) + this.f18729d;
            }
            this.f18733h = Math.max(0, i6 - ((i8 * i5) + (i7 * i5)));
        }
    }
}
