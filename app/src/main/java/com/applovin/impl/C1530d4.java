package com.applovin.impl;

import android.os.Process;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.C1748l;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.applovin.impl.d4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1530d4 {

    /* JADX INFO: renamed from: a */
    private final PriorityBlockingQueue f1330a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b */
    private final C1748l f1331b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.d4$b */
    /* JADX INFO: loaded from: classes9.dex */
    static class b extends Thread {

        /* JADX INFO: renamed from: a */
        private final BlockingQueue f1332a;

        /* JADX INFO: renamed from: b */
        private final C1748l f1333b;

        private b(BlockingQueue blockingQueue, int i, C1748l c1748l) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (c1748l == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f1332a = blockingQueue;
            this.f1333b = c1748l;
            setPriority(((Integer) c1748l.m4801a(C1831z4.f3814S)).intValue());
        }

        /* JADX INFO: renamed from: a */
        private HttpURLConnection m2357a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f1335a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f1336b);
            httpURLConnection.setConnectTimeout(cVar.f1339e);
            httpURLConnection.setReadTimeout(cVar.f1339e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f1337c.isEmpty()) {
                for (Map.Entry entry : cVar.f1337c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        /* JADX INFO: renamed from: a */
        private void m2358a() {
            m2360b((c) this.f1332a.take());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m2359a(c cVar, d dVar) {
            cVar.f1340f.accept(dVar);
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0129 */
        /* JADX WARN: Code duplicated, block: B:57:0x00ee A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #13 {all -> 0x019d, blocks: (B:55:0x00d6, B:57:0x00ee, B:80:0x012f), top: B:111:0x00d6 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0162  */
        /* JADX WARN: Code duplicated, block: B:96:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m2360b(final com.applovin.impl.C1530d4.c r20) {
            /*
                Method dump skipped, instruction units count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1530d4.b.m2360b(com.applovin.impl.d4$c):void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    m2358a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d4$c */
    public static class c implements Comparable {

        /* JADX INFO: renamed from: i */
        private static final AtomicInteger f1334i = new AtomicInteger();

        /* JADX INFO: renamed from: a */
        private final String f1335a;

        /* JADX INFO: renamed from: b */
        private final String f1336b;

        /* JADX INFO: renamed from: c */
        private final Map f1337c;

        /* JADX INFO: renamed from: d */
        private final byte[] f1338d;

        /* JADX INFO: renamed from: e */
        private final int f1339e;

        /* JADX INFO: renamed from: f */
        private final Consumer f1340f;

        /* JADX INFO: renamed from: g */
        private final Executor f1341g;

        /* JADX INFO: renamed from: h */
        private final int f1342h;

        /* JADX INFO: renamed from: com.applovin.impl.d4$c$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private String f1343a;

            /* JADX INFO: renamed from: b */
            private String f1344b;

            /* JADX INFO: renamed from: c */
            private Map f1345c = new HashMap();

            /* JADX INFO: renamed from: d */
            private byte[] f1346d;

            /* JADX INFO: renamed from: e */
            private int f1347e;

            /* JADX INFO: renamed from: f */
            private Consumer f1348f;

            /* JADX INFO: renamed from: g */
            private Executor f1349g;

            /* JADX INFO: renamed from: a */
            public a m2376a(int i) {
                this.f1347e = i;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2377a(Consumer consumer) {
                this.f1348f = consumer;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2378a(String str) {
                this.f1343a = str;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2379a(String str, String str2) {
                this.f1345c.put(str, str2);
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2380a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f1345c = map;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2381a(Executor executor) {
                this.f1349g = executor;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2382a(byte[] bArr) {
                this.f1346d = bArr;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public c m2383a() {
                return new c(this);
            }

            /* JADX INFO: renamed from: b */
            public a m2384b(String str) {
                this.f1344b = str;
                return this;
            }
        }

        private c(a aVar) {
            this.f1335a = aVar.f1343a;
            this.f1336b = aVar.f1344b;
            this.f1337c = aVar.f1345c != null ? aVar.f1345c : Collections.EMPTY_MAP;
            this.f1338d = aVar.f1346d;
            this.f1339e = aVar.f1347e;
            this.f1340f = aVar.f1348f;
            this.f1341g = aVar.f1349g;
            this.f1342h = f1334i.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f1342h - cVar.f1342h;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.d4$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private final int f1350a;

        /* JADX INFO: renamed from: b */
        private final byte[] f1351b;

        /* JADX INFO: renamed from: c */
        private final byte[] f1352c;

        /* JADX INFO: renamed from: d */
        private final long f1353d;

        /* JADX INFO: renamed from: e */
        private final Throwable f1354e;

        /* JADX INFO: renamed from: com.applovin.impl.d4$d$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private int f1355a;

            /* JADX INFO: renamed from: b */
            private byte[] f1356b;

            /* JADX INFO: renamed from: c */
            private byte[] f1357c;

            /* JADX INFO: renamed from: d */
            private long f1358d;

            /* JADX INFO: renamed from: e */
            private Throwable f1359e;

            /* JADX INFO: renamed from: a */
            public a m2396a(int i) {
                this.f1355a = i;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2397a(long j) {
                this.f1358d = j;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2398a(Throwable th) {
                this.f1359e = th;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m2399a(byte[] bArr) {
                this.f1356b = bArr;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public d m2400a() {
                return new d(this);
            }

            /* JADX INFO: renamed from: b */
            public a m2401b(byte[] bArr) {
                this.f1357c = bArr;
                return this;
            }
        }

        private d(a aVar) {
            this.f1350a = aVar.f1355a;
            this.f1351b = aVar.f1356b;
            this.f1352c = aVar.f1357c;
            this.f1353d = aVar.f1358d;
            this.f1354e = aVar.f1359e;
        }

        /* JADX INFO: renamed from: a */
        public static a m2385a() {
            return new a();
        }

        /* JADX INFO: renamed from: b */
        public int m2386b() {
            return this.f1350a;
        }

        /* JADX INFO: renamed from: c */
        public int m2387c() throws Throwable {
            Throwable th = this.f1354e;
            if (th == null) {
                return this.f1350a;
            }
            throw th;
        }

        /* JADX INFO: renamed from: d */
        public byte[] m2388d() throws Throwable {
            Throwable th = this.f1354e;
            if (th == null) {
                return this.f1351b;
            }
            throw th;
        }

        /* JADX INFO: renamed from: e */
        public long m2389e() {
            return this.f1353d;
        }

        /* JADX INFO: renamed from: f */
        public byte[] m2390f() {
            return this.f1352c;
        }
    }

    public C1530d4(C1748l c1748l) {
        this.f1331b = c1748l;
    }

    /* JADX INFO: renamed from: a */
    public void m2355a() {
        for (int i = 0; i < ((Integer) this.f1331b.m4801a(C1831z4.f3806R)).intValue(); i++) {
            new b(this.f1330a, i, this.f1331b).start();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2356a(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f1330a.add(cVar);
    }
}
