package com.apm.insight.runtime.p023a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.apm.insight.C1390e;
import com.apm.insight.p022l.C1426b;
import com.hbisoft.hbrecorder.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.runtime.a.b */
/* JADX INFO: compiled from: ActivityDataManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1449b {

    /* JADX INFO: renamed from: a */
    private static boolean f792a = true;

    /* JADX INFO: renamed from: b */
    private static boolean f793b = false;

    /* JADX INFO: renamed from: c */
    private static boolean f794c = false;

    /* JADX INFO: renamed from: d */
    private static int f795d = 1;

    /* JADX INFO: renamed from: e */
    private static boolean f796e = false;

    /* JADX INFO: renamed from: f */
    private static long f797f = -1;

    /* JADX INFO: renamed from: z */
    private static volatile C1449b f798z;

    /* JADX INFO: renamed from: B */
    private int f800B;

    /* JADX INFO: renamed from: g */
    private Application f801g;

    /* JADX INFO: renamed from: h */
    private Context f802h;

    /* JADX INFO: renamed from: n */
    private String f808n;

    /* JADX INFO: renamed from: o */
    private long f809o;

    /* JADX INFO: renamed from: p */
    private String f810p;

    /* JADX INFO: renamed from: q */
    private long f811q;

    /* JADX INFO: renamed from: r */
    private String f812r;

    /* JADX INFO: renamed from: s */
    private long f813s;

    /* JADX INFO: renamed from: t */
    private String f814t;

    /* JADX INFO: renamed from: u */
    private long f815u;

    /* JADX INFO: renamed from: v */
    private String f816v;

    /* JADX INFO: renamed from: w */
    private long f817w;

    /* JADX INFO: renamed from: i */
    private List<String> f803i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private List<Long> f804j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private List<String> f805k = new ArrayList();

    /* JADX INFO: renamed from: l */
    private List<Long> f806l = new ArrayList();

    /* JADX INFO: renamed from: m */
    private LinkedList<a> f807m = new LinkedList<>();

    /* JADX INFO: renamed from: x */
    private boolean f818x = false;

    /* JADX INFO: renamed from: y */
    private long f819y = -1;

    /* JADX INFO: renamed from: A */
    private int f799A = 50;

    /* JADX INFO: renamed from: com.apm.insight.runtime.a.b$a */
    /* JADX INFO: compiled from: ActivityDataManager.java */
    static class a {

        /* JADX INFO: renamed from: a */
        String f821a;

        /* JADX INFO: renamed from: b */
        String f822b;

        /* JADX INFO: renamed from: c */
        long f823c;

        a(String str, String str2, long j) {
            this.f822b = str2;
            this.f823c = j;
            this.f821a = str;
        }

        public final String toString() {
            return C1426b.m1299a().format(new Date(this.f823c)) + " : " + this.f821a + ' ' + this.f822b;
        }
    }

    private C1449b(Application application) {
        this.f802h = application;
        this.f801g = application;
        try {
            if (this.f801g != null) {
                this.f801g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        C1449b.this.f808n = activity.getClass().getName();
                        C1449b.this.f809o = System.currentTimeMillis();
                        boolean unused = C1449b.f793b = bundle != null;
                        boolean unused2 = C1449b.f794c = true;
                        C1449b.this.f803i.add(C1449b.this.f808n);
                        C1449b.this.f804j.add(Long.valueOf(C1449b.this.f809o));
                        C1449b c1449b = C1449b.this;
                        C1449b.m1553a(c1449b, c1449b.f808n, C1449b.this.f809o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = C1449b.this.f803i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < C1449b.this.f803i.size()) {
                            C1449b.this.f803i.remove(iIndexOf);
                            C1449b.this.f804j.remove(iIndexOf);
                        }
                        C1449b.this.f805k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C1449b.this.f806l.add(Long.valueOf(jCurrentTimeMillis));
                        C1449b.m1553a(C1449b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        C1449b.this.f814t = activity.getClass().getName();
                        C1449b.this.f815u = System.currentTimeMillis();
                        C1449b.m1581l(C1449b.this);
                        if (C1449b.this.f800B == 0) {
                            C1449b.this.f818x = false;
                            boolean unused = C1449b.f794c = false;
                            C1449b.this.f819y = SystemClock.uptimeMillis();
                        } else if (C1449b.this.f800B < 0) {
                            C1449b.m1585n(C1449b.this);
                            C1449b.this.f818x = false;
                            boolean unused2 = C1449b.f794c = false;
                            C1449b.this.f819y = SystemClock.uptimeMillis();
                        }
                        C1449b c1449b = C1449b.this;
                        C1449b.m1553a(c1449b, c1449b.f814t, C1449b.this.f815u, "onPause");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        C1449b.this.f812r = activity.getClass().getName();
                        C1449b.this.f813s = System.currentTimeMillis();
                        C1449b.m1574g(C1449b.this);
                        if (!C1449b.this.f818x) {
                            if (C1449b.f792a) {
                                C1449b.m1580k();
                                int unused = C1449b.f795d = 1;
                                long unused2 = C1449b.f797f = C1449b.this.f813s;
                            }
                            if (!C1449b.this.f812r.equals(C1449b.this.f814t)) {
                                return;
                            }
                            if (C1449b.f794c && !C1449b.f793b) {
                                int unused3 = C1449b.f795d = 4;
                                long unused4 = C1449b.f797f = C1449b.this.f813s;
                                return;
                            } else if (!C1449b.f794c) {
                                int unused5 = C1449b.f795d = 3;
                                long unused6 = C1449b.f797f = C1449b.this.f813s;
                                return;
                            }
                        }
                        C1449b.this.f818x = true;
                        C1449b c1449b = C1449b.this;
                        C1449b.m1553a(c1449b, c1449b.f812r, C1449b.this.f813s, "onResume");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        C1449b.this.f810p = activity.getClass().getName();
                        C1449b.this.f811q = System.currentTimeMillis();
                        C1449b c1449b = C1449b.this;
                        C1449b.m1553a(c1449b, c1449b.f810p, C1449b.this.f811q, Constants.ON_START_KEY);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        C1449b.this.f816v = activity.getClass().getName();
                        C1449b.this.f817w = System.currentTimeMillis();
                        C1449b c1449b = C1449b.this;
                        C1449b.m1553a(c1449b, c1449b.f816v, C1449b.this.f817w, "onStop");
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m1551a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m1552a() {
        f796e = true;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m1553a(C1449b c1449b, String str, long j, String str2) {
        a aVar;
        if (C1390e.m1048w()) {
            try {
                if (c1449b.f807m.size() >= c1449b.f799A) {
                    aVar = c1449b.f807m.poll();
                    if (aVar != null) {
                        c1449b.f807m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j);
                    c1449b.f807m.add(aVar);
                }
                aVar.f822b = str2;
                aVar.f821a = str;
                aVar.f823c = j;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1556b() {
        int i = f795d;
        if (i == 1) {
            return f796e ? 2 : 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static long m1561c() {
        return f797f;
    }

    /* JADX INFO: renamed from: d */
    public static C1449b m1566d() {
        if (f798z == null) {
            synchronized (C1449b.class) {
                if (f798z == null) {
                    f798z = new C1449b(C1390e.m1033h());
                }
            }
        }
        return f798z;
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ int m1574g(C1449b c1449b) {
        int i = c1449b.f800B;
        c1449b.f800B = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ boolean m1580k() {
        f792a = false;
        return false;
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ int m1581l(C1449b c1449b) {
        int i = c1449b.f800B;
        c1449b.f800B = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ int m1585n(C1449b c1449b) {
        c1449b.f800B = 0;
        return 0;
    }

    /* JADX INFO: renamed from: n */
    private JSONArray m1586n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f803i;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f803i.size(); i++) {
                try {
                    jSONArray.put(m1551a(this.f803i.get(i), this.f804j.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: o */
    private JSONArray m1588o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f805k;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.f805k.size(); i++) {
                try {
                    jSONArray.put(m1551a(this.f805k.get(i), this.f806l.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: e */
    public final long m1593e() {
        return SystemClock.uptimeMillis() - this.f819y;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1594f() {
        return this.f818x;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m1595g() {
        JSONObject jSONObject = new JSONObject();
        if (C1390e.m1048w()) {
            try {
                jSONObject.put("last_create_activity", m1551a(this.f808n, this.f809o));
                jSONObject.put("last_start_activity", m1551a(this.f810p, this.f811q));
                jSONObject.put("last_resume_activity", m1551a(this.f812r, this.f813s));
                jSONObject.put("last_pause_activity", m1551a(this.f814t, this.f815u));
                jSONObject.put("last_stop_activity", m1551a(this.f816v, this.f817w));
                jSONObject.put("alive_activities", m1586n());
                jSONObject.put("finish_activities", m1588o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public final String m1596h() {
        return String.valueOf(this.f812r);
    }

    /* JADX INFO: renamed from: i */
    public final JSONArray m1597i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f807m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }
}
