package com.apm.insight;

import android.text.TextUtils;
import com.ironsource.C12460ra;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.apm.insight.b */
/* JADX INFO: compiled from: CrashCallbackWrapper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class C1375b implements ICrashCallback, IOOMCallback {

    /* JADX INFO: renamed from: a */
    private IOOMCallback f373a;

    /* JADX INFO: renamed from: b */
    private ICrashCallback f374b;

    /* JADX INFO: renamed from: c */
    private String f375c;

    public C1375b(String str, ICrashCallback iCrashCallback) {
        this.f375c = str;
        this.f374b = iCrashCallback;
    }

    public C1375b(String str, IOOMCallback iOOMCallback) {
        this.f375c = str;
        this.f373a = iOOMCallback;
    }

    /* JADX INFO: renamed from: a */
    public final void m900a(CrashType crashType, String str, String str2, String str3) {
        C1388d c1388dM994a;
        if (this.f374b == null || (c1388dM994a = C1388d.m994a(this.f375c)) == null || !c1388dM994a.m1005a(str3, str2)) {
            return;
        }
        this.f374b.onCrash(crashType, str, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m901a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.f374b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(C1373a.m857a(jSONArray.optJSONObject(i), "header", C12460ra.f31825b), this.f375c)) {
                this.f374b.onCrash(crashType, str, thread);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m902a(CrashType crashType, Throwable th, Thread thread, long j, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th2;
        Thread thread2;
        long j2;
        if (this.f373a == null || jSONArray == null) {
            return;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            if (TextUtils.equals(C1373a.m857a(jSONArray.optJSONObject(i), "header", C12460ra.f31825b), this.f375c)) {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j2 = j;
                this.f373a.onCrash(crashType2, th2, thread2, j2);
            } else {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j2 = j;
            }
            i++;
            crashType = crashType2;
            th = th2;
            thread = thread2;
            j = j2;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(CrashType crashType, Throwable th, Thread thread, long j) {
    }
}
