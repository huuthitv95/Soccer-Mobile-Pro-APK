package com.apm.insight.p021k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.k.c */
/* JADX INFO: compiled from: CrashUploadHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1416c {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<AbstractC1416c> f660a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: CrashUploadHandler.java */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f661a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f661a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f661a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f661a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.k.c$a */
    /* JADX INFO: compiled from: CrashUploadHandler.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        private JSONObject f662a;

        /* JADX INFO: renamed from: b */
        private JSONObject f663b;

        /* JADX INFO: renamed from: c */
        private CrashType f664c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.f664c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f662a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f662a = jSONObject;
            }
            this.f663b = jSONObject.optJSONObject("header");
        }

        /* JADX INFO: renamed from: a */
        public final String m1223a() {
            return this.f662a.optString("crash_thread_name", null);
        }

        /* JADX INFO: renamed from: b */
        public final long m1224b() {
            return this.f662a.optInt("app_start_time", -1);
        }

        /* JADX INFO: renamed from: c */
        public final String m1225c() {
            int i = AnonymousClass1.f661a[this.f664c.ordinal()];
            if (i == 1) {
                return this.f662a.optString("data", null);
            }
            if (i == 2) {
                return this.f662a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f662a.optString("data", null);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m1222a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<AbstractC1416c> concurrentLinkedQueue = f660a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f660a.isEmpty()) {
            f660a.poll();
        }
        f660a = null;
    }
}
