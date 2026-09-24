package com.fyber.inneractive.sdk.cache;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C7902d implements InterfaceC7899a {

    /* JADX INFO: renamed from: c */
    public static final String f17570c = IAlog.m21942a(C7902d.class);

    /* JADX INFO: renamed from: a */
    public final String f17571a;

    /* JADX INFO: renamed from: b */
    public final String f17572b;

    public C7902d(String str) {
        this.f17571a = str;
        Locale locale = Locale.US;
        int iHashCode = str.hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(iHashCode);
        this.f17572b = sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final Object mo20349a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.fromFile(new File(str));
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final String mo20350a() {
        return this.f17571a;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final void mo20351a(Object obj) {
        IAlog.m21947c("%s: onCacheCommitted: %s for url: %s", f17570c, (Uri) obj, this.f17571a);
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: b */
    public final String mo20352b() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: c */
    public final String mo20353c() {
        return this.f17572b;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: d */
    public final boolean mo20354d() {
        return true;
    }
}
