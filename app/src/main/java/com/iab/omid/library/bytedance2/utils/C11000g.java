package com.iab.omid.library.bytedance2.utils;

import android.text.TextUtils;
import com.iab.omid.library.bytedance2.Omid;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11000g {
    /* JADX INFO: renamed from: a */
    public static void m23598a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23599a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m23600a(C10970a c10970a) {
        m23606d(c10970a);
        m23604b(c10970a);
    }

    /* JADX INFO: renamed from: a */
    public static void m23601a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23602a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23603a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23604b(C10970a c10970a) {
        if (c10970a.m23440g()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m23605c(C10970a c10970a) {
        if (c10970a.m23443j()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m23606d(C10970a c10970a) {
        if (!c10970a.m23443j()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m23607e(C10970a c10970a) {
        if (!c10970a.m23441h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m23608f(C10970a c10970a) {
        if (!c10970a.m23442i()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m23609g(C10970a c10970a) {
        if (c10970a.getAdSessionStatePublisher().m23554c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m23610h(C10970a c10970a) {
        if (c10970a.getAdSessionStatePublisher().m23555d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
