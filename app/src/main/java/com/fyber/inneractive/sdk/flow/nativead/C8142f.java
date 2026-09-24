package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C8119f;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.EnumC8125i;
import com.fyber.inneractive.sdk.flow.RunnableC8081e;
import com.fyber.inneractive.sdk.flow.nativead.mainasset.C8150a;
import com.fyber.inneractive.sdk.flow.nativead.mainasset.InterfaceC8152c;
import com.fyber.inneractive.sdk.response.nativead.C9103i;
import com.fyber.inneractive.sdk.response.nativead.C9104j;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8142f implements InterfaceC8152c {

    /* JADX INFO: renamed from: m */
    public static final String f18112m = IAlog.m21942a(C8142f.class);

    /* JADX INFO: renamed from: n */
    public static final Object f18113n = new Object();

    /* JADX INFO: renamed from: c */
    public final C9103i f18116c;

    /* JADX INFO: renamed from: e */
    public C8219t0 f18118e;

    /* JADX INFO: renamed from: f */
    public C8140d f18119f;

    /* JADX INFO: renamed from: h */
    public final InneractiveAdRequest f18121h;

    /* JADX INFO: renamed from: i */
    public final C8006r f18122i;

    /* JADX INFO: renamed from: j */
    public final String f18123j;

    /* JADX INFO: renamed from: k */
    public final C9104j f18124k;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList f18114a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f18115b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final ArrayList f18117d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f18120g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    public final C8141e f18125l = new C8141e(this);

    public C8142f(C8006r c8006r, InneractiveAdRequest inneractiveAdRequest, C9104j c9104j, C9103i c9103i, C8140d c8140d, String str) {
        this.f18122i = c8006r;
        this.f18124k = c9104j;
        this.f18121h = inneractiveAdRequest;
        this.f18116c = c9103i;
        this.f18119f = c8140d;
        this.f18123j = str;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02e8 */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m20564a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.nativead.C8142f.m20564a():void");
    }

    /* JADX INFO: renamed from: a */
    public final void m20565a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.m21950f("%sonMainAssetLoadFailed: %s", f18112m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        for (InterfaceC8139c interfaceC8139c : this.f18114a) {
            if (interfaceC8139c.mo20562a()) {
                interfaceC8139c.destroy();
            }
        }
        String strDescription = inneractiveInfrastructureError.description();
        if (this.f18120g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, EnumC8125i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new C8150a(strDescription));
            C8140d c8140d = this.f18119f;
            c8140d.getClass();
            AbstractC9183r.f21477a.execute(new RunnableC8081e(new C8119f(c8140d.f18090b, c8140d.f18089a, "send_failed_native_creatives", c8140d.f18095g.m20435b()), inneractiveInfrastructureError2));
            c8140d.m20552b(inneractiveInfrastructureError2);
        }
    }
}
