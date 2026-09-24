package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.m */
/* JADX INFO: compiled from: MBridgeTrackManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13826m {

    /* JADX INFO: renamed from: b */
    private static final ConcurrentHashMap<String, C13826m> f39418b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    private final C13824k f39419a;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.m$a */
    /* JADX INFO: compiled from: MBridgeTrackManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13878u.m41380a().m41384b();
                C13826m.this.f39419a.m41060p().m41370b();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "flush error", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.m$b */
    /* JADX INFO: compiled from: MBridgeTrackManager.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13818e f39421a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f39422b;

        b(C13818e c13818e, JSONObject jSONObject) {
            this.f39421a = c13818e;
            this.f39422b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13826m.this.f39419a.m41051g().mo41022a(this.f39421a);
                JSONObject jSONObject = this.f39422b;
                if (jSONObject != null) {
                    jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, C13826m.this.m41080d());
                    long[] jArrM41082e = C13826m.this.m41082e();
                    this.f39422b.put("track_time", jArrM41082e[0]);
                    this.f39422b.put("track_count", jArrM41082e[1]);
                    this.f39421a.m41006a(this.f39422b);
                }
                this.f39421a.m41009b(C13826m.this.f39419a.m41046b().f39645f);
                C13826m.this.f39419a.m41051g().mo41024b(this.f39421a);
            } catch (Exception e) {
                Log.d("TrackManager", "trackEvent error", e);
            }
        }
    }

    private C13826m(String str, Context context, C13881x c13881x) {
        C13824k c13824k = new C13824k(str, this);
        this.f39419a = c13824k;
        c13824k.m41041a(context);
        c13824k.m41042a(c13881x);
    }

    /* JADX INFO: renamed from: b */
    public static C13826m m41070b(String str, Context context, C13881x c13881x) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, C13826m> concurrentHashMap = f39418b;
        C13826m c13826m = concurrentHashMap.get(str);
        if (!C13882y.m41417b(c13826m)) {
            return c13826m;
        }
        C13826m c13826m2 = new C13826m(str, context, c13881x);
        concurrentHashMap.put(str, c13826m2);
        return c13826m2;
    }

    /* JADX INFO: renamed from: b */
    private boolean m41071b(C13818e c13818e) {
        if (C13882y.m41417b(c13818e) || TextUtils.isEmpty(c13818e.m41012g())) {
            return false;
        }
        return this.f39419a.m41045a(c13818e);
    }

    /* JADX INFO: renamed from: b */
    public static C13826m[] m41072b() {
        ConcurrentHashMap<String, C13826m> concurrentHashMap = f39418b;
        C13826m[] c13826mArr = new C13826m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, C13826m>> it = concurrentHashMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                c13826mArr[i] = it.next().getValue();
                i++;
            }
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "getAllTrackManager error", e);
            }
        }
        return c13826mArr;
    }

    /* JADX INFO: renamed from: a */
    public void m41073a() {
        try {
            this.f39419a.m41052h().m41040a(new a());
        } catch (Exception e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", "flush error", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41074a(String str, Context context, C13881x c13881x) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, C13826m> concurrentHashMap = f39418b;
        C13826m c13826m = concurrentHashMap.get(str);
        if (C13882y.m41417b(c13826m)) {
            concurrentHashMap.put(str, new C13826m(str, context, c13881x));
        } else {
            c13826m.f39419a.m41042a(c13881x);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41075a(JSONObject jSONObject) {
        this.f39419a.m41043a(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public boolean m41076a(C13818e c13818e) {
        try {
            return m41071b(c13818e);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m41077a(String str) {
        return m41076a(new C13818e(str));
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m41078c() {
        return this.f39419a.m41059o();
    }

    /* JADX INFO: renamed from: c */
    public void m41079c(C13818e c13818e) {
        m41081d(c13818e);
    }

    /* JADX INFO: renamed from: d */
    public String m41080d() {
        return this.f39419a.m41063s();
    }

    /* JADX INFO: renamed from: d */
    public void m41081d(C13818e c13818e) {
        if (this.f39419a.m41067w()) {
            if (C13814a.f39370a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (c13818e != null && m41071b(c13818e)) {
            JSONObject jSONObjectM41014i = c13818e.m41014i();
            if (jSONObjectM41014i != null && !jSONObjectM41014i.has("ts")) {
                try {
                    jSONObjectM41014i.put("ts", System.currentTimeMillis());
                } catch (Exception e) {
                    Log.e("TrackManager", "trackEvent error", e);
                }
            }
            try {
                this.f39419a.m41052h().m41040a(new b(c13818e, jSONObjectM41014i));
            } catch (Exception e2) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", "trackEvent error", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public long[] m41082e() {
        return this.f39419a.m41051g().mo41023a();
    }

    /* JADX INFO: renamed from: f */
    public String m41083f() {
        return this.f39419a.m41066v();
    }

    /* JADX INFO: renamed from: g */
    public boolean m41084g() {
        return !this.f39419a.m41067w();
    }

    /* JADX INFO: renamed from: h */
    public String m41085h() {
        if (!m41084g()) {
            return this.f39419a.m41068x();
        }
        if (C13814a.f39370a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return m41080d();
    }
}
