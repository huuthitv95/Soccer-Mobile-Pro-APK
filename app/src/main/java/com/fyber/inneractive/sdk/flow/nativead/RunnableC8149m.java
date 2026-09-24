package com.fyber.inneractive.sdk.flow.nativead;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;
import com.fyber.inneractive.sdk.network.C8435z0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.m */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8149m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8145i f18142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f18143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC9150g f18144c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C8158p f18145d;

    public RunnableC8149m(C8158p c8158p, C8145i c8145i, boolean z, EnumC9150g enumC9150g) {
        this.f18145d = c8158p;
        this.f18142a = c8145i;
        this.f18143b = z;
        this.f18144c = enumC9150g;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7941o c8157o;
        C8158p c8158p = this.f18145d;
        C8145i c8145i = this.f18142a;
        boolean z = this.f18143b;
        EnumC9150g enumC9150g = this.f18144c;
        c8158p.getClass();
        String str = c8145i.f18135a;
        String str2 = c8145i.f18136b;
        if (!AbstractC9195v.m22030a(str)) {
            if (AbstractC9195v.m22030a(str2)) {
                c8157o = new C8157o(c8158p, c8145i, enumC9150g);
                str = str2;
            } else {
                C8146j c8146j = (C8146j) c8158p.f18169a;
                C8145i c8145i2 = c8146j.f18139a;
                if (c8145i2 == null || c8145i2.equals(c8145i)) {
                    IAlog.m21945a("%s : No valid link object, origin: %s", C8146j.f18138d, enumC9150g);
                } else {
                    C8158p c8158p2 = c8146j.f18141c;
                    C8145i c8145i3 = c8146j.f18139a;
                    c8158p2.getClass();
                    AbstractC9183r.f21477a.execute(new RunnableC8149m(c8158p2, c8145i3, true, enumC9150g));
                }
            }
            C8158p c8158p3 = this.f18145d;
            C8145i c8145i4 = this.f18142a;
            c8158p3.getClass();
            for (String str3 : c8145i4.f18137c) {
                if (!TextUtils.isEmpty(str3)) {
                    C8435z0.m20813b(str3);
                }
            }
        }
        c8157o = new C8156n(c8158p, c8145i, str2, enumC9150g);
        InterfaceC8147k interfaceC8147k = ((C8146j) c8158p.f18169a).f18140b;
        if (interfaceC8147k != null) {
            interfaceC8147k.mo20568a(str, z, enumC9150g, c8157o);
        }
        C8158p c8158p4 = this.f18145d;
        C8145i c8145i5 = this.f18142a;
        c8158p4.getClass();
        while (r0.hasNext()) {
            if (!TextUtils.isEmpty(str3)) {
                C8435z0.m20813b(str3);
            }
        }
    }
}
