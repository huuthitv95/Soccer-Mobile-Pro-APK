package com.ironsource;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.Yc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11770Yc {

    /* JADX INFO: renamed from: a */
    private final String f26646a;

    public C11770Yc(String baseControllerUrl) {
        Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.f26646a = baseControllerUrl;
    }

    /* JADX INFO: renamed from: a */
    public final String m28053a() {
        String str = this.f26646a;
        String strSubstring = str.substring(0, StringsKt.lastIndexOf$default((CharSequence) str, RemoteSettings.FORWARD_SLASH_STRING, 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
