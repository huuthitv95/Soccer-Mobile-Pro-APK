package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.AbstractC1617m1;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1781u;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.e */
/* JADX INFO: loaded from: classes3.dex */
public class C1741e implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a */
    private final C1748l f2947a;

    /* JADX INFO: renamed from: b */
    private final C1740d f2948b;

    /* JADX INFO: renamed from: c */
    private final List f2949c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: com.applovin.impl.sdk.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo4387a(AbstractC1736b abstractC1736b);
    }

    public C1741e(C1748l c1748l) {
        this.f2947a = c1748l;
        this.f2948b = new C1740d(c1748l);
    }

    /* JADX INFO: renamed from: a */
    private C1740d.a m4619a(AppLovinAdType appLovinAdType) {
        C1740d.a aVar;
        synchronized (this.f2949c) {
            Iterator it = this.f2949c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (C1740d.a) it.next();
                if (aVar.m4615f().equals(appLovinAdType) && !m4624a(aVar) && m4625b(aVar)) {
                    break;
                }
            }
            this.f2949c.remove(aVar);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    private void m4620a() {
        synchronized (this.f2949c) {
            this.f2948b.m4604a(new ArrayList(this.f2949c));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4621a(a aVar, AbstractC1736b abstractC1736b, C1740d.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f2947a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2947a.m4782Q().m5171a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.mo4387a(abstractC1736b);
        this.f2948b.m4606b(aVar2);
        this.f2947a.m4830g().m2525a(C1548f2.f1510X, abstractC1736b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4622a(a aVar, C1740d.a aVar2, C1781u c1781u, AbstractC1736b abstractC1736b, String str) {
        if (abstractC1736b == null || StringUtils.isValidString(str)) {
            m4623a(aVar, aVar2, c1781u, str);
        } else {
            m4621a(aVar, abstractC1736b, aVar2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4623a(a aVar, C1740d.a aVar2, C1781u c1781u, String str) {
        if (aVar == null) {
            return;
        }
        this.f2947a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2947a.m4782Q().m5171a("AdPersistenceManager", str);
        }
        aVar.mo4387a(null);
        this.f2948b.m4606b(aVar2);
        this.f2947a.m4830g().m2527a(C1548f2.f1512Y, c1781u, new AppLovinError(-1, str));
    }

    /* JADX INFO: renamed from: a */
    private boolean m4624a(C1740d.a aVar) {
        return SystemClock.elapsedRealtime() + ((Long) this.f2947a.m4801a(C1831z4.f3896c1)).longValue() >= aVar.m4612c();
    }

    /* JADX INFO: renamed from: b */
    private boolean m4625b(C1740d.a aVar) {
        long jM4611b = aVar.m4611b();
        return (jM4611b == 0 || jM4611b == C1748l.m4755o()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m4626c() {
        m4630e();
        m4620a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m4627c(C1740d.a aVar) {
        if (aVar == null) {
            this.f2947a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2947a.m4782Q().m5171a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f2949c.add(aVar);
        if (((Boolean) this.f2947a.m4801a(C1831z4.f3879a1)).booleanValue()) {
            m4632h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m4628d() {
        this.f2947a.m4851r0().m2214b(C1511b5.f1147E);
        this.f2948b.m4602a();
    }

    /* JADX INFO: renamed from: d */
    private void m4629d(C1740d.a aVar) {
        if (aVar != null && this.f2949c.remove(aVar)) {
            this.f2948b.m4606b(aVar);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m4630e() {
        String str = (String) this.f2947a.m4851r0().m2208a(C1511b5.f1147E);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            try {
                C1740d.a aVarM4609a = C1740d.a.m4609a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f2947a);
                if (aVarM4609a != null) {
                    if (m4624a(aVarM4609a)) {
                        long jM4612c = aVarM4609a.m4612c() - SystemClock.elapsedRealtime();
                        this.f2947a.m4830g().m2682d(C1548f2.f1514Z, CollectionUtils.map("details", "ttl = " + jM4612c + "ms"));
                    } else {
                        this.f2949c.add(0, aVarM4609a);
                    }
                }
            } catch (Throwable th) {
                this.f2947a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f2947a.m4782Q().m5172a("AdPersistenceManager", "Failed to deserialize persisted ad file path", th);
                }
                this.f2947a.m4764E().m4329a("AdPersistenceManager", "deserializePersistedAdFilePath", th);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m4631f() {
        this.f2947a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f2947a, "loadPersistedAdFilesQueueAndCleanupAsync", new Runnable() { // from class: com.applovin.impl.sdk.e$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4626c();
            }
        }), C1552f6.b.OTHER);
    }

    /* JADX INFO: renamed from: h */
    private void m4632h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f2949c) {
            Iterator it = this.f2949c.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((C1740d.a) it.next()).mo1889a());
                } catch (Throwable th) {
                    this.f2947a.m4782Q();
                    if (C1768p.m5160a()) {
                        this.f2947a.m4782Q().m5172a("AdPersistenceManager", "Failed to serialize persisted ad file path", th);
                    }
                    this.f2947a.m4764E().m4329a("AdPersistenceManager", "serializePersistedAdFilePath", th);
                }
            }
        }
        this.f2947a.m4851r0().m2215b(C1511b5.f1147E, new JSONArray((Collection) arrayList).toString());
    }

    /* JADX INFO: renamed from: a */
    public void m4633a(AbstractC1736b abstractC1736b) {
        if (abstractC1736b == null) {
            return;
        }
        m4629d(C1740d.a.m4607a(abstractC1736b));
    }

    /* JADX INFO: renamed from: a */
    public void m4634a(final C1781u c1781u, final a aVar) {
        if (aVar == null) {
            this.f2947a.m4782Q();
            if (C1768p.m5160a()) {
                this.f2947a.m4782Q().m5174b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            AbstractC1617m1.m3169a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (c1781u == null) {
            m4623a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f2947a.m4830g().m2527a(C1548f2.f1508W, c1781u, (AppLovinError) null);
        final C1740d.a aVarM4619a = m4619a(c1781u.m5266g());
        this.f2948b.m4603a(aVarM4619a, new C1740d.c() { // from class: com.applovin.impl.sdk.e$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.sdk.C1740d.c
            /* JADX INFO: renamed from: a */
            public final void mo4618a(AbstractC1736b abstractC1736b, String str) {
                this.f$0.m4622a(aVar, aVarM4619a, c1781u, abstractC1736b, str);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m4635b() {
        m4631f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    /* JADX INFO: renamed from: b */
    public void m4636b(AbstractC1736b abstractC1736b) {
        if (abstractC1736b == null) {
            return;
        }
        this.f2947a.m4830g().m2525a(C1548f2.f1502T, abstractC1736b);
        this.f2948b.m4605b(abstractC1736b, new C1740d.b() { // from class: com.applovin.impl.sdk.e$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.sdk.C1740d.b
            /* JADX INFO: renamed from: a */
            public final void mo4617a(C1740d.a aVar) {
                this.f$0.m4627c(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m4637g() {
        this.f2947a.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.f2947a, "resetManagerState", new Runnable() { // from class: com.applovin.impl.sdk.e$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4628d();
            }
        }), C1552f6.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        m4632h();
    }
}
