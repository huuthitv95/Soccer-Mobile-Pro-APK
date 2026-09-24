package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.k5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC1601k5 implements Runnable {

    /* JADX INFO: renamed from: a */
    protected final C1748l f1969a;

    /* JADX INFO: renamed from: b */
    protected final String f1970b;

    /* JADX INFO: renamed from: c */
    protected final C1768p f1971c;

    /* JADX INFO: renamed from: d */
    private final Context f1972d;

    /* JADX INFO: renamed from: e */
    private String f1973e;

    /* JADX INFO: renamed from: f */
    private boolean f1974f;

    public AbstractRunnableC1601k5(String str, C1748l c1748l) {
        this(str, c1748l, false, null);
    }

    public AbstractRunnableC1601k5(String str, C1748l c1748l, String str2) {
        this(str, c1748l, false, str2);
    }

    public AbstractRunnableC1601k5(String str, C1748l c1748l, boolean z) {
        this(str, c1748l, z, null);
    }

    public AbstractRunnableC1601k5(String str, C1748l c1748l, boolean z, String str2) {
        this.f1970b = str;
        this.f1969a = c1748l;
        this.f1971c = c1748l.m4782Q();
        this.f1972d = C1748l.m4756p();
        this.f1974f = z;
        this.f1973e = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3079a(Thread thread, long j) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f1973e)) {
            mapHashMap.put("details", this.f1973e);
        }
        this.f1969a.m4764E().m2678a(C1548f2.f1531f1, this.f1970b, mapHashMap);
        if (C1768p.m5160a()) {
            this.f1971c.m5178k(this.f1970b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds");
        }
    }

    /* JADX INFO: renamed from: a */
    public Context m3080a() {
        return this.f1972d;
    }

    /* JADX INFO: renamed from: a */
    public void m3081a(String str) {
        this.f1973e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m3082a(Throwable th) {
        Map map = CollectionUtils.map("source", this.f1970b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f1973e));
        this.f1969a.m4764E().m2682d(C1548f2.f1528e1, map);
    }

    /* JADX INFO: renamed from: a */
    public void m3083a(boolean z) {
        this.f1974f = z;
    }

    /* JADX INFO: renamed from: b */
    public C1748l m3084b() {
        return this.f1969a;
    }

    /* JADX INFO: renamed from: b */
    public ScheduledFuture m3085b(final Thread thread, final long j) {
        if (j <= 0) {
            return null;
        }
        return this.f1969a.m4853s0().m2610b(new C1788u6(this.f1969a, "timeout:" + this.f1970b, new Runnable() { // from class: com.applovin.impl.k5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3079a(thread, j);
            }
        }), C1552f6.b.TIMEOUT, j);
    }

    /* JADX INFO: renamed from: c */
    public String m3086c() {
        return this.f1970b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3087d() {
        return this.f1974f;
    }
}
