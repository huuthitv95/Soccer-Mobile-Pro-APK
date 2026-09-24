package com.iab.omid.library.fyber.utils;

import android.text.TextUtils;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11104g {
    /* JADX INFO: renamed from: a */
    public static void m24111a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24112a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m24113a(C11073a c11073a) {
        m24119d(c11073a);
        m24117b(c11073a);
    }

    /* JADX INFO: renamed from: a */
    public static void m24114a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24115a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24116a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24117b(C11073a c11073a) {
        if (c11073a.m23944i()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m24118c(C11073a c11073a) {
        if (c11073a.m23947l()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m24119d(C11073a c11073a) {
        if (!c11073a.m23947l()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m24120e(C11073a c11073a) {
        if (!c11073a.m23945j()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m24121f(C11073a c11073a) {
        if (!c11073a.m23946k()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m24122g(C11073a c11073a) {
        if (c11073a.m23939d().m24066c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m24123h(C11073a c11073a) {
        if (c11073a.m23939d().m24067d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
