package com.chartboost.sdk.impl;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.CloseableKt;
import kotlin.p300io.TextStreamsKt;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.dg */
/* JADX INFO: loaded from: classes3.dex */
public final class C3713dg {

    /* JADX INFO: renamed from: a */
    public final Resources f13838a;

    public C3713dg(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f13838a = resources;
    }

    /* JADX INFO: renamed from: a */
    public final String m17303a(int i) {
        try {
            InputStream inputStreamOpenRawResource = this.f13838a.openRawResource(i);
            try {
                Intrinsics.checkNotNull(inputStreamOpenRawResource);
                Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    CloseableKt.closeFinally(inputStreamOpenRawResource, null);
                    return text;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(inputStreamOpenRawResource, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            C4048sb.m19410b("Raw resource file exception", e);
            return null;
        }
    }
}
