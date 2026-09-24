package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.applovin.impl.c1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1517c1 {

    /* JADX INFO: renamed from: a */
    private final C1768p f1231a;

    /* JADX INFO: renamed from: b */
    private final Handler f1232b;

    /* JADX INFO: renamed from: c */
    private final Set f1233c = new HashSet();

    /* JADX INFO: renamed from: d */
    private final AtomicInteger f1234d = new AtomicInteger();

    /* JADX INFO: renamed from: com.applovin.impl.c1$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo2092a();

        /* JADX INFO: renamed from: b */
        boolean mo2093b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.c1$c */
    static class c {

        /* JADX INFO: renamed from: a */
        private final String f1235a;

        /* JADX INFO: renamed from: b */
        private final b f1236b;

        /* JADX INFO: renamed from: c */
        private final long f1237c;

        private c(String str, long j, b bVar) {
            this.f1235a = str;
            this.f1237c = j;
            this.f1236b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public b m2155a() {
            return this.f1236b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public long m2157b() {
            return this.f1237c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public String m2160c() {
            return this.f1235a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f1235a;
            String str2 = ((c) obj).f1235a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            return str2 == null;
        }

        public int hashCode() {
            String str = this.f1235a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f1235a + "', countdownStepMillis=" + this.f1237c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public C1517c1(Handler handler, C1748l c1748l) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f1232b = handler;
        this.f1231a = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    private void m2149a(final c cVar, final int i) {
        this.f1232b.postDelayed(new Runnable() { // from class: com.applovin.impl.c1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2150b(cVar, i);
            }
        }, cVar.m2157b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m2150b(c cVar, int i) {
        b bVarM2155a = cVar.m2155a();
        if (!bVarM2155a.mo2093b()) {
            if (C1768p.m5160a()) {
                this.f1231a.m5171a("CountdownManager", "Ending countdown for " + cVar.m2160c());
                return;
            }
            return;
        }
        if (this.f1234d.get() != i) {
            if (C1768p.m5160a()) {
                this.f1231a.m5178k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.m2160c());
                return;
            }
            return;
        }
        try {
            bVarM2155a.mo2092a();
            m2149a(cVar, i);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1231a.m5172a("CountdownManager", "Encountered error on countdown step for: " + cVar.m2160c(), th);
            }
            m2151a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2151a() {
        if (C1768p.m5160a()) {
            this.f1231a.m5171a("CountdownManager", "Removing all countdowns...");
        }
        m2154c();
        this.f1233c.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m2152a(String str, long j, b bVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        }
        if (this.f1232b == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (C1768p.m5160a()) {
            this.f1231a.m5171a("CountdownManager", "Adding countdown: " + str);
        }
        this.f1233c.add(new c(str, j, bVar));
    }

    /* JADX INFO: renamed from: b */
    public void m2153b() {
        HashSet<c> hashSet = new HashSet(this.f1233c);
        if (C1768p.m5160a()) {
            this.f1231a.m5171a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f1234d.incrementAndGet();
        for (c cVar : hashSet) {
            if (C1768p.m5160a()) {
                this.f1231a.m5171a("CountdownManager", "Starting countdown: " + cVar.m2160c() + " for generation " + iIncrementAndGet + "...");
            }
            m2149a(cVar, iIncrementAndGet);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2154c() {
        if (C1768p.m5160a()) {
            this.f1231a.m5171a("CountdownManager", "Stopping countdowns...");
        }
        this.f1234d.incrementAndGet();
        this.f1232b.removeCallbacksAndMessages(null);
    }
}
