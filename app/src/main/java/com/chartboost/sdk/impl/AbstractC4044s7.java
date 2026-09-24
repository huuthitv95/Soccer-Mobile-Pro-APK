package com.chartboost.sdk.impl;

import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.s7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4044s7 {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.s7$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f16228b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            return StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + stackTraceElement.getMethodName() + CertificateUtil.DELIMITER + stackTraceElement.getLineNumber();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.s7$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final b f16229b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            return StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + stackTraceElement.getMethodName() + CertificateUtil.DELIMITER + stackTraceElement.getLineNumber();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m19389a(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                arrayList.add(stackTraceElement);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String className2 = ((StackTraceElement) obj).getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (!StringsKt.contains$default((CharSequence) className2, (CharSequence) "ExceptionUtils", false, 2, (Object) null)) {
                arrayList2.add(obj);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.take(arrayList2, i), " | ", null, null, 0, null, a.f16228b, 30, null);
        return strJoinToString$default.length() == 0 ? "<no_sdk_frames>" : strJoinToString$default;
    }

    /* JADX INFO: renamed from: a */
    public static final String m19390a(Exception exc) {
        String message;
        return (exc == null || (message = exc.getMessage()) == null) ? "Unknown error" : message;
    }

    /* JADX INFO: renamed from: a */
    public static final String m19391a(Throwable th, int i) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                arrayList.add(stackTraceElement);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.take(arrayList, i), " | ", null, null, 0, null, b.f16229b, 30, null);
        return strJoinToString$default.length() == 0 ? "<no_sdk_frames>" : strJoinToString$default;
    }
}
