package com.chartboost.sdk.impl;

import android.net.Uri;
import com.tiktok.util.UrlConst;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.l0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3881l0 {
    /* JADX INFO: renamed from: a */
    public static final EnumC3709dc m18462a(int i) {
        Object next;
        Iterator<E> it = EnumC3709dc.m17278b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((EnumC3709dc) next).m17279c() != i);
        EnumC3709dc enumC3709dc = (EnumC3709dc) next;
        return enumC3709dc == null ? EnumC3709dc.UNKNOWN : enumC3709dc;
    }

    /* JADX INFO: renamed from: a */
    public static final String m18463a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() <= 0) {
            return "";
        }
        if (!StringsKt.startsWith$default(url, UrlConst.HTTPS, false, 2, (Object) null) && !StringsKt.startsWith$default(url, "http://", false, 2, (Object) null)) {
            url = UrlConst.HTTPS + url;
        }
        Uri uri = Uri.parse(url);
        if (uri == null) {
            return "";
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNull(pathSegments);
        return CollectionsKt.joinToString$default(pathSegments, "_", null, null, 0, null, null, 62, null);
    }
}
