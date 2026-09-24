package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8291a {

    /* JADX INFO: renamed from: a */
    public final String f18494a;

    /* JADX INFO: renamed from: b */
    public final String f18495b;

    /* JADX INFO: renamed from: c */
    public final String f18496c;

    /* JADX INFO: renamed from: d */
    public final boolean f18497d;

    public C8291a(String str, String str2, String str3) {
        String strTrim = str != null ? str.trim() : null;
        this.f18494a = strTrim;
        String strTrim2 = str2 != null ? str2.trim() : null;
        this.f18495b = strTrim2;
        String strTrim3 = str3 != null ? str3.trim() : null;
        this.f18496c = strTrim3;
        this.f18497d = (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3) || !strTrim3.contains("[TIME]")) ? false : true;
    }
}
