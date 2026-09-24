package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.network.b */
/* JADX INFO: loaded from: classes3.dex */
public class C1763b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a */
    private final C1748l f3193a;

    /* JADX INFO: renamed from: b */
    private final C1768p f3194b;

    /* JADX INFO: renamed from: c */
    private final int f3195c;

    /* JADX INFO: renamed from: d */
    private final C1764c f3196d;

    /* JADX INFO: renamed from: e */
    private final Object f3197e = new Object();

    /* JADX INFO: renamed from: f */
    private final List f3198f;

    /* JADX INFO: renamed from: g */
    private final Set f3199g;

    /* JADX INFO: renamed from: h */
    private final List f3200h;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.b$a */
    class a implements AppLovinPostbackListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1765d f3201a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AppLovinPostbackListener f3202b;

        a(C1765d c1765d, AppLovinPostbackListener appLovinPostbackListener) {
            this.f3201a = c1765d;
            this.f3202b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            C1768p unused = C1763b.this.f3194b;
            if (C1768p.m5160a()) {
                C1763b.this.f3194b.m5175d("PersistentPostbackManager", "Failed to submit postback: " + this.f3201a + " with error code: " + i + "; will retry later...");
            }
            C1763b.this.m5066d(this.f3201a);
            AbstractC1793v2.m5396a(this.f3202b, str, i);
            if (this.f3201a.m5078c() == 1) {
                C1763b.this.f3193a.m4764E().m4330a("dispatchPostback", str, i, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            C1763b.this.m5056a(this.f3201a);
            C1768p unused = C1763b.this.f3194b;
            if (C1768p.m5160a()) {
                C1763b.this.f3194b.m5171a("PersistentPostbackManager", "Successfully submit postback: " + this.f3201a);
            }
            C1763b.this.m5064c();
            AbstractC1793v2.m5395a(this.f3202b, str);
        }
    }

    public C1763b(C1748l c1748l) {
        ArrayList arrayList = new ArrayList();
        this.f3198f = arrayList;
        this.f3199g = new HashSet();
        this.f3200h = new ArrayList();
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3193a = c1748l;
        this.f3194b = c1748l.m4782Q();
        int iIntValue = ((Integer) c1748l.m4801a(C1831z4.f3761L2)).intValue();
        this.f3195c = iIntValue;
        if (!((Boolean) c1748l.m4801a(C1831z4.f3785O2)).booleanValue()) {
            this.f3196d = null;
            return;
        }
        C1764c c1764c = new C1764c(this, c1748l);
        this.f3196d = c1764c;
        arrayList.addAll(c1764c.m5075a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m5056a(C1765d c1765d) {
        synchronized (this.f3197e) {
            this.f3199g.remove(c1765d);
            this.f3198f.remove(c1765d);
        }
        if (C1768p.m5160a()) {
            this.f3194b.m5171a("PersistentPostbackManager", "Dequeued postback: " + c1765d);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5057a(C1765d c1765d, AppLovinPostbackListener appLovinPostbackListener) {
        if (C1768p.m5160a()) {
            this.f3194b.m5171a("PersistentPostbackManager", "Preparing to submit postback: " + c1765d);
        }
        if (this.f3193a.m4769G0() && !c1765d.m5088m()) {
            if (C1768p.m5160a()) {
                this.f3194b.m5171a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(c1765d.m5086k())) {
            if (C1768p.m5160a()) {
                this.f3194b.m5174b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f3197e) {
            if (this.f3199g.contains(c1765d)) {
                if (C1768p.m5160a()) {
                    this.f3194b.m5171a("PersistentPostbackManager", "Skipping in progress postback: " + c1765d.m5086k());
                }
                return;
            }
            c1765d.m5087l();
            Integer num = (Integer) this.f3193a.m4801a(C1831z4.f3753K2);
            if (c1765d.m5078c() > num.intValue()) {
                if (C1768p.m5160a()) {
                    this.f3194b.m5178k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + c1765d);
                }
                m5056a(c1765d);
                return;
            }
            synchronized (this.f3197e) {
                this.f3199g.add(c1765d);
            }
            C1766e c1766eM5127b = C1766e.m5118b(this.f3193a).mo5045b(c1765d.m5086k()).mo5039a(c1765d.m5079d()).mo5046b(c1765d.m5084i()).mo5049c(c1765d.m5083h()).mo5040a(c1765d.m5082g()).mo5041a(c1765d.m5085j() != null ? new JSONObject(c1765d.m5085j()) : null).mo5047b(c1765d.m5090o()).mo5042a(c1765d.m5089n()).mo5037a(c1765d.m5081f()).m5138h(c1765d.m5091p()).m5133e(c1765d.m5080e()).mo5043a();
            if (C1768p.m5160a()) {
                this.f3194b.m5171a("PersistentPostbackManager", "Submitting postback: " + c1765d);
            }
            this.f3193a.m4835i0().dispatchPostbackRequest(c1766eM5127b, new a(c1765d, appLovinPostbackListener));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5058a(Runnable runnable, boolean z, boolean z2) {
        if (!z) {
            runnable.run();
        } else {
            this.f3193a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f3193a, z2, "runPostbackTask", runnable), C1552f6.b.OTHER);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5061b(C1765d c1765d) {
        m5057a(c1765d, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m5062b(C1765d c1765d, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f3197e) {
            m5065c(c1765d);
            m5057a(c1765d, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m5064c() {
        synchronized (this.f3197e) {
            Iterator it = this.f3200h.iterator();
            while (it.hasNext()) {
                m5061b((C1765d) it.next());
            }
            this.f3200h.clear();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5065c(C1765d c1765d) {
        synchronized (this.f3197e) {
            while (this.f3198f.size() > this.f3195c) {
                this.f3198f.remove(0);
            }
            this.f3198f.add(c1765d);
        }
        if (C1768p.m5160a()) {
            this.f3194b.m5171a("PersistentPostbackManager", "Enqueued postback: " + c1765d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m5066d(C1765d c1765d) {
        synchronized (this.f3197e) {
            this.f3199g.remove(c1765d);
            this.f3200h.add(c1765d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m5067e() {
        synchronized (this.f3197e) {
            Iterator it = new ArrayList(this.f3198f).iterator();
            while (it.hasNext()) {
                m5061b((C1765d) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5068a() {
        synchronized (this.f3197e) {
            this.f3198f.clear();
            this.f3200h.clear();
        }
        this.f3193a.m4853s0().m2604a((AbstractRunnableC1601k5) this.f3196d, C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: a */
    public void m5069a(C1765d c1765d, boolean z) {
        m5070a(c1765d, z, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: renamed from: a */
    public void m5070a(final C1765d c1765d, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(c1765d.m5086k())) {
            if (C1768p.m5160a()) {
                this.f3194b.m5174b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z) {
                c1765d.m5077a();
            }
            m5058a(new Runnable() { // from class: com.applovin.impl.sdk.network.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m5062b(c1765d, appLovinPostbackListener);
                }
            }, AbstractC1701q7.m4113i(), c1765d.m5088m());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5071b() {
        m5058a(new Runnable() { // from class: com.applovin.impl.sdk.network.b$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5067e();
            }
        }, true, false);
    }

    /* JADX INFO: renamed from: d */
    protected List m5072d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f3197e) {
            if (((Boolean) this.f3193a.m4801a(C1831z4.f3777N2)).booleanValue()) {
                arrayList.ensureCapacity(this.f3200h.size());
                arrayList.addAll(this.f3200h);
            } else {
                arrayList.ensureCapacity(this.f3198f.size());
                arrayList.addAll(this.f3198f);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public void m5073e(C1765d c1765d) {
        m5069a(c1765d, true);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f3193a.m4853s0().m2604a((AbstractRunnableC1601k5) this.f3196d, C1552f6.b.OTHER);
    }
}
