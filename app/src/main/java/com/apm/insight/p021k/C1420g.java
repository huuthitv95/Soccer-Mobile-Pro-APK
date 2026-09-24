package com.apm.insight.p021k;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.apm.insight.C1373a;
import com.apm.insight.C1388d;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.C1396b;
import com.apm.insight.entity.C1397c;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1470l;
import com.apm.insight.runtime.C1471m;
import com.apm.insight.runtime.C1474p;
import com.apm.insight.runtime.p023a.C1453f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

/* JADX INFO: renamed from: com.apm.insight.k.g */
/* JADX INFO: compiled from: EventUploadQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1420g {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentHashMap<Object, ConcurrentLinkedQueue<C1397c>> f688a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private static final HashMap<Object, HashMap<String, ConcurrentLinkedQueue<C1397c>>> f689b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private static volatile C1420g f690c;

    /* JADX INFO: renamed from: e */
    private volatile boolean f692e = false;

    /* JADX INFO: renamed from: f */
    private Runnable f693f = new Runnable() { // from class: com.apm.insight.k.g.1
        @Override // java.lang.Runnable
        public final void run() {
            if (Npth.isStopUpload()) {
                return;
            }
            if (!C1420g.f689b.isEmpty() && C1470l.m1690e()) {
                C1420g.m1263f();
            }
            C1420g.this.m1266c();
            C1420g.this.f691d.m1736a(C1420g.this.f693f, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        }
    };

    /* JADX INFO: renamed from: d */
    private final C1474p f691d = C1471m.m1704a();

    private C1420g() {
    }

    /* JADX INFO: renamed from: a */
    public static C1420g m1254a() {
        if (f690c == null) {
            synchronized (C1420g.class) {
                if (f690c == null) {
                    f690c = new C1420g();
                }
            }
        }
        return f690c;
    }

    /* JADX INFO: renamed from: a */
    public static void m1256a(C1397c c1397c) {
        m1257a(C1388d.m995a(), c1397c);
    }

    /* JADX INFO: renamed from: a */
    public static void m1257a(final Object obj, final C1397c c1397c) {
        String string;
        Handler handlerM1734a = C1471m.m1704a().m1734a();
        if (handlerM1734a == null || handlerM1734a.getLooper() != Looper.myLooper()) {
            C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.k.g.2
                @Override // java.lang.Runnable
                public final void run() {
                    C1420g.m1257a(obj, c1397c);
                }
            });
            return;
        }
        if (obj == null) {
            obj = C1388d.m995a();
        }
        if (!C1470l.m1690e()) {
            C1373a.m863a("EventUploadQueue", "enqueue before init.");
            m1260c(obj, c1397c);
            return;
        }
        if (!C1447a.m1532a(obj)) {
            C1414a.m1195b();
        }
        m1263f();
        try {
            string = c1397c.m1102c().getString("log_type");
        } catch (JSONException e) {
            e.printStackTrace();
            string = null;
        }
        if (TextUtils.isEmpty(string) || !C1447a.m1535b(obj)) {
            C1373a.m863a("EventUploadQueue", "logType " + string + " not sampled");
            return;
        }
        C1373a.m863a("EventUploadQueue", "logType " + string + " enqueued");
        m1259b(obj, c1397c);
    }

    /* JADX INFO: renamed from: b */
    private static void m1259b(Object obj, C1397c c1397c) {
        ConcurrentHashMap<Object, ConcurrentLinkedQueue<C1397c>> concurrentHashMap;
        ConcurrentLinkedQueue<C1397c> concurrentLinkedQueue;
        synchronized (obj) {
            concurrentHashMap = f688a;
            concurrentLinkedQueue = concurrentHashMap.get(obj);
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                concurrentHashMap.put(obj, concurrentLinkedQueue);
            }
        }
        concurrentLinkedQueue.add(c1397c);
        int size = concurrentHashMap.size();
        boolean z = size >= 30;
        C1373a.m873b((Object) "[enqueue] size=".concat(String.valueOf(size)));
        if (z) {
            m1264g();
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m1260c(Object obj, C1397c c1397c) {
        ConcurrentLinkedQueue<C1397c> concurrentLinkedQueue;
        try {
            String string = c1397c.m1102c().getString("log_type");
            HashMap<Object, HashMap<String, ConcurrentLinkedQueue<C1397c>>> map = f689b;
            synchronized (map) {
                HashMap<String, ConcurrentLinkedQueue<C1397c>> map2 = map.get(string);
                if (map2 == null) {
                    map2 = new HashMap<>();
                    map.put(obj, map2);
                }
                concurrentLinkedQueue = map2.get(string);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                    map2.put(string, concurrentLinkedQueue);
                }
            }
            concurrentLinkedQueue.add(c1397c);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m1263f() {
        HashMap map;
        HashMap<Object, HashMap<String, ConcurrentLinkedQueue<C1397c>>> map2 = f689b;
        synchronized (map2) {
            map = new HashMap(map2);
            map2.clear();
        }
        if (!C1447a.m1531a()) {
            C1373a.m863a("EventUploadQueue", "ApmConfig not inited, clear cache.");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                String str = (String) entry2.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry2.getValue();
                if (concurrentLinkedQueue == null || (C1447a.m1531a() && !C1447a.m1535b(entry.getKey()))) {
                    C1373a.m863a("EventUploadQueue", "logType " + str + " not sampled");
                } else {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            C1397c c1397c = (C1397c) concurrentLinkedQueue.poll();
                            if (c1397c == null) {
                                break;
                            } else {
                                m1259b(entry.getKey(), c1397c);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m1264g() {
        if (!C1470l.m1690e() || Npth.isStopUpload()) {
            return;
        }
        try {
            C1471m.m1704a().m1735a(new Runnable() { // from class: com.apm.insight.k.g.3
                @Override // java.lang.Runnable
                public final void run() {
                    C1420g.m1254a().m1266c();
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1265b() {
        if (f688a.isEmpty()) {
            this.f691d.m1736a(this.f693f, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        } else {
            this.f691d.m1735a(this.f693f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1266c() {
        synchronized (this.f691d) {
            if (this.f692e) {
                return;
            }
            this.f692e = true;
            LinkedList linkedList = new LinkedList();
            for (Map.Entry<Object, ConcurrentLinkedQueue<C1397c>> entry : f688a.entrySet()) {
                ConcurrentLinkedQueue<C1397c> value = entry.getValue();
                Object key = entry.getKey();
                while (!value.isEmpty()) {
                    for (int i = 0; i < 30; i++) {
                        try {
                            if (value.isEmpty()) {
                                break;
                            }
                            linkedList.add(value.poll());
                        } catch (Throwable th) {
                            C1373a.m874b(th);
                        }
                    }
                    if (linkedList.isEmpty()) {
                        break;
                    }
                    C1395a c1395aM1611a = C1453f.m1608a().m1611a(linkedList, C1396b.m1107a(key));
                    if (c1395aM1611a != null) {
                        C1373a.m861a((Object) "upload events");
                        C1417d.m1226a().m1230b(c1395aM1611a.m1102c());
                    }
                    linkedList.clear();
                }
            }
            this.f692e = false;
        }
    }
}
