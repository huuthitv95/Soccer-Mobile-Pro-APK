package com.iab.omid.library.unity3d.utils;

import android.text.TextUtils;
import com.iab.omid.library.unity3d.Omid;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.utils.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11253g {
    /* JADX INFO: renamed from: a */
    public static void m24856a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24857a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m24858a(C11224a c11224a) {
        m24864d(c11224a);
        m24862b(c11224a);
    }

    /* JADX INFO: renamed from: a */
    public static void m24859a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24860a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24861a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24862b(C11224a c11224a) {
        if (c11224a.m24706g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m24863c(C11224a c11224a) {
        if (c11224a.m24709j()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m24864d(C11224a c11224a) {
        if (!c11224a.m24709j()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m24865e(C11224a c11224a) {
        if (!c11224a.m24707h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m24866f(C11224a c11224a) {
        if (!c11224a.m24708i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m24867g(C11224a c11224a) {
        if (c11224a.getAdSessionStatePublisher().m24813c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m24868h(C11224a c11224a) {
        if (c11224a.getAdSessionStatePublisher().m24814d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
