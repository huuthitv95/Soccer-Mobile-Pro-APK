package com.chartboost.sdk.impl;

import android.util.Base64;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3768g2 {
    /* JADX INFO: renamed from: a */
    public final String m17750a(String str) {
        String strReplace$default = StringsKt.replace$default(str, "\n", "", false, 4, (Object) null);
        int length = strReplace$default.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) strReplace$default.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return strReplace$default.subSequence(i, length + 1).toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m17751b(String encodedString) {
        Object objM44946constructorimpl;
        Intrinsics.checkNotNullParameter(encodedString, "encodedString");
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bArrDecode = Base64.decode(m17750a(encodedString), 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            objM44946constructorimpl = Result.m44946constructorimpl(new String(bArrDecode, Charsets.UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19411b("Cannot decode base64 string: " + thM44949exceptionOrNullimpl.getLocalizedMessage(), (Throwable) null, 2, (Object) null);
        }
        if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
            objM44946constructorimpl = "";
        }
        return (String) objM44946constructorimpl;
    }

    /* JADX INFO: renamed from: c */
    public final String m17752c(String originalString) {
        Object objM44946constructorimpl;
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bytes = originalString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            objM44946constructorimpl = Result.m44946constructorimpl(m17750a(strEncodeToString));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19411b("Cannot encode to base64 string: " + thM44949exceptionOrNullimpl.getLocalizedMessage(), (Throwable) null, 2, (Object) null);
        }
        if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
            objM44946constructorimpl = "";
        }
        return (String) objM44946constructorimpl;
    }
}
