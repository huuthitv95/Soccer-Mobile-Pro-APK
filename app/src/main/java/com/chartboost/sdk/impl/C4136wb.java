package com.chartboost.sdk.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.wb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4136wb {
    /* JADX INFO: renamed from: a */
    public final String m19782a(String str, InterfaceC3806hh eventData, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        if (str == null) {
            return null;
        }
        String str2 = z2 ? AbstractJsonLexerKt.NULL : "";
        String strReplace$default = str;
        for (Map.Entry entry : eventData.mo16812b().entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String str5 = "%%" + str3 + "%%";
            if (StringsKt.startsWith$default(str3, "CB_ERROR", false, 2, (Object) null) && (str4 == null || str4.length() == 0)) {
                strReplace$default = StringsKt.replace$default(strReplace$default, str5, "", false, 4, (Object) null);
            } else if (Intrinsics.areEqual(str3, "CB_BASE64_ADM")) {
                strReplace$default = StringsKt.replace$default(strReplace$default, str5, str4 == null ? str2 : str4, false, 4, (Object) null);
            } else {
                String strM19783a = m19783a(str4, z);
                strReplace$default = StringsKt.replace$default(strReplace$default, str5, strM19783a == null ? str2 : strM19783a, false, 4, (Object) null);
            }
        }
        return new Regex("%%CB_[A-Z0-9_]+%%").replace(strReplace$default, str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m19783a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z) {
            try {
                return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                C4048sb.m19410b("Failed to URL encode macro value: " + str + ". Error: " + e.getMessage(), e);
            }
        }
        return str;
    }
}
