package com.chartboost.sdk.impl;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4017r2 {

    /* JADX INFO: renamed from: a */
    public static final C4017r2 f16110a = new C4017r2();

    /* JADX INFO: renamed from: a */
    public static final String m19290a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        C4017r2 c4017r2 = f16110a;
        return c4017r2.m19291a(c4017r2.m19292b(bytes));
    }

    /* JADX INFO: renamed from: a */
    public final String m19291a(byte[] bArr) {
        String str = String.format("%0" + (bArr.length << 1) + "x", Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m19292b(byte[] bArr) {
        return MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(bArr);
    }
}
