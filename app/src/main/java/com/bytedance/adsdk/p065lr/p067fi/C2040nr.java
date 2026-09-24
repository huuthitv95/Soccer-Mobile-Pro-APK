package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C2040nr implements InterfaceC2037kt<Integer> {

    /* JADX INFO: renamed from: ri */
    public static final C2040nr f4776ri = new C2040nr();

    private C2040nr() {
    }

    @Override // com.bytedance.adsdk.p065lr.p067fi.InterfaceC2037kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public Integer mo6614lr(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(tan.m6669lr(jsonReader) * f));
    }
}
