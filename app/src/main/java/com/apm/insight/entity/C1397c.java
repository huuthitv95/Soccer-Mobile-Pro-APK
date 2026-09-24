package com.apm.insight.entity;

import com.apm.insight.C1390e;
import com.apm.insight.p022l.C1425a;

/* JADX INFO: renamed from: com.apm.insight.entity.c */
/* JADX INFO: compiled from: EventBody.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1397c extends C1395a {

    /* JADX INFO: renamed from: a */
    private String f544a;

    private C1397c(String str) {
        this.f544a = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1397c m1119a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C1397c c1397c = new C1397c(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        c1397c.m1095a("event_type", (Object) "exception");
        c1397c.m1095a("log_type", (Object) str5);
        c1397c.m1095a("timestamp", Long.valueOf(System.currentTimeMillis()));
        c1397c.m1095a("crash_time", Long.valueOf(System.currentTimeMillis()));
        c1397c.m1095a("class_ref", (Object) className);
        c1397c.m1095a("method", (Object) methodName);
        c1397c.m1095a("line_num", Integer.valueOf(lineNumber));
        c1397c.m1095a("stack", (Object) str);
        c1397c.m1095a("exception_type", (Object) 1);
        c1397c.m1095a("ensure_type", (Object) str4);
        c1397c.m1095a("is_core", Integer.valueOf(z ? 1 : 0));
        c1397c.m1095a("message", (Object) str2);
        C1390e.m1032g();
        c1397c.m1095a("process_name", (Object) C1425a.m1291b());
        c1397c.m1095a("crash_thread_name", (Object) str3);
        C1398d.m1122b(c1397c.m1102c());
        return c1397c;
    }
}
