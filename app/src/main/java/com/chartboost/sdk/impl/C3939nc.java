package com.chartboost.sdk.impl;

import com.chartboost.sdk.C3613R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.nc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3939nc {

    /* JADX INFO: renamed from: c */
    public static final a f15500c = new a(null);

    /* JADX INFO: renamed from: d */
    public static boolean f15501d = true;

    /* JADX INFO: renamed from: a */
    public final C4097ug f15502a;

    /* JADX INFO: renamed from: b */
    public final C3713dg f15503b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.nc$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3939nc(C4097ug sharedPrefsHelper, C3713dg resourcesLoader) {
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        this.f15502a = sharedPrefsHelper;
        this.f15503b = resourcesLoader;
    }

    /* JADX INFO: renamed from: a */
    public final String m18779a() {
        String strM18780a = m18780a(C3613R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
        return strM18780a == null ? "" : strM18780a;
    }

    /* JADX INFO: renamed from: a */
    public final String m18780a(int i, String str) {
        try {
            if (f15501d) {
                f15501d = false;
                return m18781a(str, i);
            }
            String strM19600a = this.f15502a.m19600a(str);
            return strM19600a == null ? m18781a(str, i) : strM19600a;
        } catch (Exception e) {
            C4048sb.m19410b("OmidJS exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18781a(String str, int i) {
        try {
            String strM17303a = this.f15503b.m17303a(i);
            if (strM17303a == null) {
                return null;
            }
            this.f15502a.m19601a(str, strM17303a);
            return strM17303a;
        } catch (Exception e) {
            C4048sb.m19410b("OmidJS resource file exception", e);
            return null;
        }
    }
}
