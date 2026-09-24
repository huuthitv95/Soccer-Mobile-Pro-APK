package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.FilesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ig */
/* JADX INFO: loaded from: classes3.dex */
public final class C3828ig {
    /* JADX INFO: renamed from: a */
    public final String m18019a(File htmlFile, String params, String adm) {
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(adm, "adm");
        try {
            return StringsKt.replace$default(StringsKt.replace$default(FilesKt.readText(htmlFile, Charsets.UTF_8), "\"{% params %}\"", params, false, 4, (Object) null), "{% adm %}", adm, false, 4, (Object) null);
        } catch (Exception e) {
            C4048sb.m19410b("Parse sdk bidding template exception", e);
            return null;
        }
    }
}
