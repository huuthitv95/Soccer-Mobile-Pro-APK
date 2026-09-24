package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.u */
/* JADX INFO: compiled from: ReportMonitor.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13878u {

    /* JADX INFO: renamed from: g */
    private static volatile C13878u f39627g;

    /* JADX INFO: renamed from: a */
    private C13826m f39628a;

    /* JADX INFO: renamed from: b */
    private C13881x f39629b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f39630c = false;

    /* JADX INFO: renamed from: d */
    private int f39631d = 30000;

    /* JADX INFO: renamed from: e */
    private final HashMap<String, String> f39632e = new HashMap<>();

    /* JADX INFO: renamed from: f */
    Handler f39633f = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.u$a */
    /* JADX INFO: compiled from: ReportMonitor.java */
    /* JADX INFO: loaded from: classes9.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                C13878u.this.m41384b();
                C13878u.this.f39633f.removeMessages(1);
                C13878u.this.m41382d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private C13878u() {
    }

    /* JADX INFO: renamed from: a */
    public static C13878u m41380a() {
        if (f39627g == null) {
            synchronized (C13878u.class) {
                if (f39627g == null) {
                    f39627g = new C13878u();
                }
            }
        }
        return f39627g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m41382d() {
        try {
            this.f39633f.sendEmptyMessageDelayed(1, this.f39631d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m41383a(Context context, C13881x c13881x, int i, JSONObject jSONObject) {
        this.f39629b = c13881x;
        this.f39631d = i;
        C13826m c13826mM41070b = C13826m.m41070b("monitor", context, c13881x);
        this.f39628a = c13826mM41070b;
        if (c13826mM41070b != null) {
            c13826mM41070b.m41075a(jSONObject);
            this.f39628a.m41085h();
        }
        m41385c();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: Exception -> 0x00ac, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ac, blocks: (B:5:0x0009, B:7:0x000e, B:9:0x001c, B:12:0x002f, B:15:0x003b, B:18:0x0059, B:23:0x00a5, B:20:0x0071), top: B:28:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0059, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public void m41384b() {
        C13826m[] c13826mArrM41072b = C13826m.m41072b();
        if (c13826mArrM41072b.length == 0) {
            return;
        }
        try {
            for (C13826m c13826m : c13826mArrM41072b) {
                String strM41083f = c13826m.m41083f();
                if (!"monitor".equals(strM41083f)) {
                    String strM41080d = c13826m.m41080d();
                    long[] jArrM41082e = c13826m.m41082e();
                    long j = jArrM41082e[1];
                    if (j != 0) {
                        long j2 = jArrM41082e[0];
                        if (this.f39632e.containsKey(strM41083f)) {
                            if (!(j2 + "").equals(this.f39632e.get(strM41083f))) {
                                this.f39632e.put(strM41083f, j2 + "");
                                if (this.f39628a != null) {
                                    try {
                                        C13818e c13818e = new C13818e("event_lib_monitor");
                                        c13818e.m41002a(1);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("key", "m_report_rate");
                                        jSONObject.put("task_name", strM41083f);
                                        jSONObject.put("task_count", j);
                                        jSONObject.put("task_session_id", strM41080d);
                                        jSONObject.put("task_ts", j2);
                                        c13818e.m41006a(jSONObject);
                                        this.f39628a.m41081d(c13818e);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } else {
                            this.f39632e.put(strM41083f, j2 + "");
                            if (this.f39628a != null) {
                                C13818e c13818e2 = new C13818e("event_lib_monitor");
                                c13818e2.m41002a(1);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("key", "m_report_rate");
                                jSONObject2.put("task_name", strM41083f);
                                jSONObject2.put("task_count", j);
                                jSONObject2.put("task_session_id", strM41080d);
                                jSONObject2.put("task_ts", j2);
                                c13818e2.m41006a(jSONObject2);
                                this.f39628a.m41081d(c13818e2);
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m41385c() {
        if (this.f39630c) {
            return;
        }
        this.f39630c = true;
        m41382d();
    }
}
