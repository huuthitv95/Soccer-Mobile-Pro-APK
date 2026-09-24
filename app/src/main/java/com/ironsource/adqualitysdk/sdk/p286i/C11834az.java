package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.az */
/* JADX INFO: loaded from: classes6.dex */
public final class C11834az {

    /* JADX INFO: renamed from: ｋ */
    private Map<String, C11837bb> f27449 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.az$b */
    public interface b extends InterfaceC12090q {
    }

    public C11834az() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.az$5, reason: invalid class name */
    final class AnonymousClass5 extends AbstractRunnableC12044it {

        /* JADX INFO: renamed from: ｋ */
        private /* synthetic */ String f27458;

        /* JADX INFO: renamed from: ﾒ */
        private /* synthetic */ C11837bb.b f27460;

        AnonymousClass5(String str, C11837bb.b bVar) {
            this.f27458 = str;
            this.f27460 = bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28224() {
            C11837bb c11837bbM28712 = C11834az.m28712(C11834az.this, this.f27458);
            if (c11837bbM28712 != null) {
                c11837bbM28712.m28738(this.f27460);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.az$4, reason: invalid class name */
    final class AnonymousClass4 extends AbstractRunnableC12044it {

        /* JADX INFO: renamed from: ﻐ */
        private /* synthetic */ String f27455;

        /* JADX INFO: renamed from: ﾇ */
        private /* synthetic */ C11837bb.a f27457;

        AnonymousClass4(String str, C11837bb.a aVar) {
            this.f27455 = str;
            this.f27457 = aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28224() {
            C11837bb c11837bbM28712 = C11834az.m28712(C11834az.this, this.f27455);
            if (c11837bbM28712 != null) {
                c11837bbM28712.m28739(this.f27457);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    final void m28714(String str) {
        this.f27449.put(str, new C11837bb(str));
    }

    /* JADX INFO: renamed from: ﾇ */
    public final synchronized boolean m28716() {
        Iterator it = new ArrayList(this.f27449.values()).iterator();
        while (it.hasNext()) {
            if (((C11837bb) it.next()).m28741()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ */
    final String m28715(String str) {
        Map<String, C11837bb> map = this.f27449;
        C11837bb c11837bb = map != null ? map.get(str) : null;
        if (c11837bb != null) {
            return c11837bb.m28737();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ C11837bb m28712(C11834az c11834az, String str) {
        Map<String, C11837bb> map = c11834az.f27449;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
