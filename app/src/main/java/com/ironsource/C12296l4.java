package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.l4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12296l4 {

    /* JADX INFO: renamed from: a */
    private final Throwable f30848a;

    /* JADX INFO: renamed from: b */
    private final String f30849b;

    /* JADX INFO: renamed from: c */
    private final boolean f30850c;

    public C12296l4(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f30848a = throwable;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb.append(throwable.toString());
        sb.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            Intrinsics.checkNotNullExpressionValue(string, "elem.toString()");
            String strM32158e = C12317m4.m32153d().m32158e();
            Intrinsics.checkNotNullExpressionValue(strM32158e, "getInstance().keyword");
            if (StringsKt.contains$default((CharSequence) string, (CharSequence) strM32158e, false, 2, (Object) null)) {
                z = true;
            }
        }
        Throwable cause = this.f30848a.getCause();
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb.append(stackTraceElement2.toString());
                sb.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "elem.toString()");
                String strM32158e2 = C12317m4.m32153d().m32158e();
                Intrinsics.checkNotNullExpressionValue(strM32158e2, "getInstance().keyword");
                if (StringsKt.contains$default((CharSequence) string2, (CharSequence) strM32158e2, false, 2, (Object) null)) {
                    z = true;
                }
            }
        }
        String string3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "builder.toString()");
        this.f30849b = string3;
        this.f30850c = z;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m32051a() {
        return this.f30848a;
    }

    /* JADX INFO: renamed from: b */
    public final String m32052b() {
        return this.f30849b;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m32053c() {
        return this.f30848a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m32054d() {
        return this.f30850c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12296l4) && Intrinsics.areEqual(this.f30848a, ((C12296l4) obj).f30848a);
    }

    public int hashCode() {
        return this.f30848a.hashCode();
    }

    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f30848a + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12296l4 m32050a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C12296l4(throwable);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12296l4 m32049a(C12296l4 c12296l4, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c12296l4.f30848a;
        }
        return c12296l4.m32050a(th);
    }
}
