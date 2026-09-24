package com.iab.omid.library.mmadbridge.utils;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.Omid;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.adsession.CreativeType;
import com.iab.omid.library.mmadbridge.adsession.ImpressionType;
import com.iab.omid.library.mmadbridge.adsession.Owner;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11206g {
    /* JADX INFO: renamed from: a */
    public static void m24617a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24618a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m24619a(C11175a c11175a) {
        m24625d(c11175a);
        m24623b(c11175a);
    }

    /* JADX INFO: renamed from: a */
    public static void m24620a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24621a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24622a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24623b(C11175a c11175a) {
        if (c11175a.m24450g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m24624c(C11175a c11175a) {
        if (c11175a.m24453j()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m24625d(C11175a c11175a) {
        if (!c11175a.m24453j()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m24626e(C11175a c11175a) {
        if (!c11175a.m24451h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m24627f(C11175a c11175a) {
        if (!c11175a.m24452i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m24628g(C11175a c11175a) {
        if (c11175a.getAdSessionStatePublisher().m24572c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m24629h(C11175a c11175a) {
        if (c11175a.getAdSessionStatePublisher().m24573d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
