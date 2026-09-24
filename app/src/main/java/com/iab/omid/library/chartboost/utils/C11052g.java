package com.iab.omid.library.chartboost.utils;

import android.text.TextUtils;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11052g {
    /* JADX INFO: renamed from: a */
    public static void m23855a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23856a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23857a(C11021a c11021a) {
        m23863d(c11021a);
        m23861b(c11021a);
    }

    /* JADX INFO: renamed from: a */
    public static void m23858a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23859a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23860a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23861b(C11021a c11021a) {
        if (c11021a.m23683i()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m23862c(C11021a c11021a) {
        if (c11021a.m23686l()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m23863d(C11021a c11021a) {
        if (!c11021a.m23686l()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m23864e(C11021a c11021a) {
        if (!c11021a.m23684j()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m23865f(C11021a c11021a) {
        if (!c11021a.m23685k()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m23866g(C11021a c11021a) {
        if (c11021a.m23678d().m23809c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m23867h(C11021a c11021a) {
        if (c11021a.m23678d().m23810d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
