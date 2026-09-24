package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.a1 */
/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13182a1 {
    /* JADX INFO: renamed from: a */
    public static boolean m37596a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || AbstractJsonLexerKt.NULL.equals(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37597b(String str) {
        return (str == null || TextUtils.isEmpty(str.trim()) || AbstractJsonLexerKt.NULL.equals(str)) ? false : true;
    }
}
