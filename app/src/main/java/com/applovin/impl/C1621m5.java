package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.m5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1621m5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final List f2066g;

    /* JADX INFO: renamed from: h */
    private final Activity f2067h;

    public C1621m5(List list, Activity activity, C1748l c1748l) {
        super("TaskAutoInitAdapters", c1748l, true);
        this.f2066g = list;
        this.f2067h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3228a(C1619m3 c1619m3) {
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Auto-initing adapter: " + c1619m3);
        }
        this.f1969a.m4789U().m3505a(c1619m3, this.f2067h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2066g.size() > 0) {
            if (C1768p.m5160a()) {
                C1768p c1768p = this.f1971c;
                String str = this.f1970b;
                StringBuilder sb = new StringBuilder("Auto-initing ");
                sb.append(this.f2066g.size());
                sb.append(" adapters");
                sb.append(this.f1969a.m4857u0().m2928c() ? " in test mode" : "");
                sb.append("...");
                c1768p.m5171a(str, sb.toString());
            }
            if (TextUtils.isEmpty(this.f1969a.m4794X())) {
                this.f1969a.m4783Q0();
            } else if (!this.f1969a.m4772I0()) {
                C1768p.m5167h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f1969a.m4794X());
            }
            if (this.f2067h == null) {
                C1768p.m5167h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final C1619m3 c1619m3 : this.f2066g) {
                if (c1619m3.m3223s()) {
                    this.f1969a.m4853s0().m2608a(new Runnable() { // from class: com.applovin.impl.m5$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m3228a(c1619m3);
                        }
                    }, C1552f6.b.MEDIATION);
                } else {
                    this.f1969a.m4782Q();
                    if (C1768p.m5160a()) {
                        this.f1969a.m4782Q().m5171a(this.f1970b, "Skipping eager auto-init for adapter " + c1619m3);
                    }
                }
            }
        }
    }
}
