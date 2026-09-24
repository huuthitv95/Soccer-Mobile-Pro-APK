package com.apm.insight.p011b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.C1474p;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.b.g */
/* JADX INFO: compiled from: LooperDispatchMonitor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1382g {

    /* JADX INFO: renamed from: r */
    private static int f427r = 2;

    /* JADX INFO: renamed from: a */
    private c f428a;

    /* JADX INFO: renamed from: b */
    private int f429b;

    /* JADX INFO: renamed from: c */
    private volatile int f430c;

    /* JADX INFO: renamed from: d */
    private int f431d;

    /* JADX INFO: renamed from: e */
    private int f432e;

    /* JADX INFO: renamed from: f */
    private f f433f;

    /* JADX INFO: renamed from: g */
    private long f434g;

    /* JADX INFO: renamed from: h */
    private long f435h;

    /* JADX INFO: renamed from: i */
    private int f436i;

    /* JADX INFO: renamed from: j */
    private long f437j;

    /* JADX INFO: renamed from: k */
    private String f438k;

    /* JADX INFO: renamed from: l */
    private String f439l;

    /* JADX INFO: renamed from: m */
    private AbstractC1380e f440m;

    /* JADX INFO: renamed from: n */
    private volatile boolean f441n;

    /* JADX INFO: renamed from: o */
    private boolean f442o;

    /* JADX INFO: renamed from: p */
    private final C1474p f443p;

    /* JADX INFO: renamed from: q */
    private volatile boolean f444q;

    /* JADX INFO: renamed from: s */
    private Runnable f445s;

    /* JADX INFO: renamed from: com.apm.insight.b.g$a */
    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    static class a {

        /* JADX INFO: renamed from: a */
        long f454a;

        /* JADX INFO: renamed from: b */
        long f455b;

        /* JADX INFO: renamed from: c */
        long f456c;

        /* JADX INFO: renamed from: d */
        boolean f457d;

        /* JADX INFO: renamed from: e */
        int f458e;

        /* JADX INFO: renamed from: f */
        StackTraceElement[] f459f;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.b.g$b */
    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    static class b {

        /* JADX INFO: renamed from: a */
        a f460a;

        /* JADX INFO: renamed from: b */
        private int f461b;

        /* JADX INFO: renamed from: a */
        final void m968a(a aVar) {
            List list = null;
            list.size();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.b.g$c */
    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public interface c {
    }

    /* JADX INFO: renamed from: com.apm.insight.b.g$d */
    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class d {
    }

    /* JADX INFO: renamed from: com.apm.insight.b.g$e */
    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class e {

        /* JADX INFO: renamed from: a */
        public long f462a;

        /* JADX INFO: renamed from: b */
        long f463b;

        /* JADX INFO: renamed from: c */
        long f464c;

        /* JADX INFO: renamed from: d */
        int f465d;

        /* JADX INFO: renamed from: e */
        int f466e;

        /* JADX INFO: renamed from: f */
        long f467f;

        /* JADX INFO: renamed from: g */
        long f468g;

        /* JADX INFO: renamed from: h */
        String f469h;

        /* JADX INFO: renamed from: i */
        public String f470i;

        /* JADX INFO: renamed from: j */
        private String f471j;

        /* JADX INFO: renamed from: k */
        private d f472k;

        /* JADX INFO: renamed from: a */
        public final JSONObject m969a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, C1382g.m952a(this.f469h));
                jSONObject.put("cpuDuration", this.f468g);
                jSONObject.put("duration", this.f467f);
                jSONObject.put("type", this.f465d);
                jSONObject.put("count", this.f466e);
                jSONObject.put("messageCount", this.f466e);
                jSONObject.put("lastDuration", this.f463b - this.f464c);
                jSONObject.put("start", this.f462a);
                jSONObject.put("end", this.f463b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject;
            }
        }

        /* JADX INFO: renamed from: b */
        final void m970b() {
            this.f465d = -1;
            this.f466e = -1;
            this.f467f = -1L;
            this.f469h = null;
            this.f471j = null;
            this.f472k = null;
            this.f470i = null;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.b.g$f */
    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    static class f {

        /* JADX INFO: renamed from: a */
        private int f473a;

        /* JADX INFO: renamed from: b */
        private int f474b;

        /* JADX INFO: renamed from: c */
        private e f475c;

        /* JADX INFO: renamed from: d */
        private List<e> f476d = new ArrayList();

        f(int i) {
            this.f473a = i;
        }

        /* JADX INFO: renamed from: a */
        final e m971a(int i) {
            e eVar = this.f475c;
            if (eVar == null) {
                e eVar2 = new e();
                eVar2.f465d = i;
                return eVar2;
            }
            eVar.f465d = i;
            e eVar3 = this.f475c;
            this.f475c = null;
            return eVar3;
        }

        /* JADX INFO: renamed from: a */
        final List<e> m972a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f476d.size() == this.f473a) {
                for (int i2 = this.f474b; i2 < this.f476d.size(); i2++) {
                    arrayList.add(this.f476d.get(i2));
                }
                while (i < this.f474b - 1) {
                    arrayList.add(this.f476d.get(i));
                    i++;
                }
            } else {
                while (i < this.f476d.size()) {
                    arrayList.add(this.f476d.get(i));
                    i++;
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: a */
        final void m973a(e eVar) {
            int size = this.f476d.size();
            int i = this.f473a;
            if (size < i) {
                this.f476d.add(eVar);
                this.f474b = this.f476d.size();
                return;
            }
            int i2 = this.f474b % i;
            this.f474b = i2;
            e eVar2 = this.f476d.set(i2, eVar);
            eVar2.m970b();
            this.f475c = eVar2;
            this.f474b++;
        }
    }

    public C1382g() {
        this((byte) 0);
    }

    private C1382g(byte b2) {
        this.f429b = 0;
        this.f430c = 0;
        this.f431d = 100;
        this.f432e = 200;
        this.f434g = -1L;
        this.f435h = -1L;
        this.f436i = -1;
        this.f437j = -1L;
        this.f441n = false;
        this.f442o = false;
        this.f444q = false;
        this.f445s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b */
            private long f448b;

            /* JADX INFO: renamed from: a */
            private long f447a = 0;

            /* JADX INFO: renamed from: c */
            private int f449c = -1;

            /* JADX INFO: renamed from: d */
            private int f450d = 0;

            /* JADX INFO: renamed from: e */
            private int f451e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (C1382g.m959c().f460a != null) {
                    b bVar = null;
                    a aVar = bVar.f460a;
                    throw null;
                }
                a aVar2 = new a((byte) 0);
                if (this.f449c == C1382g.this.f430c) {
                    this.f450d++;
                } else {
                    this.f450d = 0;
                    this.f451e = 0;
                    this.f448b = jUptimeMillis;
                }
                this.f449c = C1382g.this.f430c;
                int i = this.f450d;
                if (i > 0 && i - this.f451e >= C1382g.f427r && this.f447a != 0 && jUptimeMillis - this.f448b > 700 && C1382g.this.f444q) {
                    aVar2.f459f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f451e = this.f450d;
                }
                aVar2.f457d = C1382g.this.f444q;
                aVar2.f456c = (jUptimeMillis - this.f447a) - 300;
                aVar2.f454a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f447a = jUptimeMillis2;
                aVar2.f455b = jUptimeMillis2 - jUptimeMillis;
                aVar2.f458e = C1382g.this.f430c;
                C1382g.m963e().m1736a(C1382g.this.f445s, 300L);
                C1382g.m959c().m968a(aVar2);
            }
        };
        this.f428a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f443p = null;
    }

    /* JADX INFO: renamed from: a */
    public static String m952a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m953a(int i, long j, String str) {
        m954a(i, j, str, true);
    }

    /* JADX INFO: renamed from: a */
    private void m954a(int i, long j, String str, boolean z) {
        this.f442o = true;
        e eVarM971a = this.f433f.m971a(i);
        eVarM971a.f467f = j - this.f434g;
        if (z) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarM971a.f468g = jCurrentThreadTimeMillis - this.f437j;
            this.f437j = jCurrentThreadTimeMillis;
        } else {
            eVarM971a.f468g = -1L;
        }
        eVarM971a.f466e = this.f429b;
        eVarM971a.f469h = str;
        eVarM971a.f470i = this.f438k;
        eVarM971a.f462a = this.f434g;
        eVarM971a.f463b = j;
        eVarM971a.f464c = this.f435h;
        this.f433f.m973a(eVarM971a);
        this.f429b = 0;
        this.f434g = j;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m955a(C1382g c1382g, boolean z, long j) {
        int i = c1382g.f430c + 1;
        c1382g.f430c = i;
        c1382g.f430c = i & 65535;
        c1382g.f442o = false;
        if (c1382g.f434g < 0) {
            c1382g.f434g = j;
        }
        if (c1382g.f435h < 0) {
            c1382g.f435h = j;
        }
        if (c1382g.f436i < 0) {
            c1382g.f436i = Process.myTid();
            c1382g.f437j = SystemClock.currentThreadTimeMillis();
        }
        long j2 = j - c1382g.f434g;
        int i2 = c1382g.f432e;
        if (j2 > i2) {
            long j3 = c1382g.f435h;
            if (j - j3 <= i2) {
                c1382g.m953a(9, j, c1382g.f439l);
            } else if (z) {
                if (c1382g.f429b == 0) {
                    c1382g.m953a(1, j, "no message running");
                } else {
                    c1382g.m953a(9, j3, c1382g.f438k);
                    c1382g.m954a(1, j, "no message running", false);
                }
            } else if (c1382g.f429b == 0) {
                c1382g.m954a(8, j, c1382g.f439l, true);
            } else {
                c1382g.m954a(9, j3, c1382g.f438k, false);
                c1382g.m954a(8, j, c1382g.f439l, true);
            }
        }
        c1382g.f435h = j;
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ b m959c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ int m962d(C1382g c1382g) {
        int i = c1382g.f429b;
        c1382g.f429b = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ C1474p m963e() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final e m965a(long j) {
        e eVar = new e();
        eVar.f469h = this.f439l;
        eVar.f470i = this.f438k;
        eVar.f467f = j - this.f435h;
        eVar.f468g = 0 - this.f437j;
        eVar.f466e = this.f429b;
        return eVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m966a() {
        if (this.f441n) {
            return;
        }
        this.f441n = true;
        this.f431d = 100;
        this.f432e = 300;
        this.f433f = new f(this.f431d);
        this.f440m = new AbstractC1380e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.p011b.AbstractC1380e
            /* JADX INFO: renamed from: a */
            public final void mo942a(String str) {
                C1382g.this.f444q = true;
                C1382g.this.f439l = str;
                super.mo942a(str);
                C1382g.m955a(C1382g.this, true, AbstractC1380e.f421a);
            }

            @Override // com.apm.insight.p011b.AbstractC1380e
            /* JADX INFO: renamed from: a */
            public final boolean mo943a() {
                return true;
            }

            @Override // com.apm.insight.p011b.AbstractC1380e
            /* JADX INFO: renamed from: b */
            public final void mo944b(String str) {
                super.mo944b(str);
                C1382g.m962d(C1382g.this);
                C1382g.m955a(C1382g.this, false, AbstractC1380e.f421a);
                C1382g c1382g = C1382g.this;
                c1382g.f438k = c1382g.f439l;
                C1382g.this.f439l = "no message running";
                C1382g.this.f444q = false;
            }
        };
        C1383h.m974a();
        C1383h.m975a(this.f440m);
        C1385j.m986a(C1385j.m987a());
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m967b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            for (e eVar : this.f433f.m972a()) {
                if (eVar != null) {
                    i++;
                    jSONArray.put(eVar.m969a().put("id", i));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
