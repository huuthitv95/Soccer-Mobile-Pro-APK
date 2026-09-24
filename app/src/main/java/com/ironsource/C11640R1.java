package com.ironsource;

import android.os.Looper;
import android.util.Log;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.R1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11640R1 {

    /* JADX INFO: renamed from: a */
    public static final a f25566a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.R1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m27317a() {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        private a() {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m27316a() {
        f25566a.m27317a();
    }
}
