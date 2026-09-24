package com.iab.omid.library.vungle.utils;

import android.text.TextUtils;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11316g {
    /* JADX INFO: renamed from: a */
    public static void m25156a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25157a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m25158a(C11271a c11271a) {
        m25164d(c11271a);
        m25162b(c11271a);
    }

    /* JADX INFO: renamed from: a */
    public static void m25159a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25160a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25161a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25162b(C11271a c11271a) {
        if (c11271a.m24939i()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m25163c(C11271a c11271a) {
        if (c11271a.m24942l()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m25164d(C11271a c11271a) {
        if (!c11271a.m24942l()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m25165e(C11271a c11271a) {
        if (!c11271a.m24940j()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m25166f(C11271a c11271a) {
        if (!c11271a.m24941k()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m25167g(C11271a c11271a) {
        if (c11271a.m24934d().m25101c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m25168h(C11271a c11271a) {
        if (c11271a.m24934d().m25102d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
