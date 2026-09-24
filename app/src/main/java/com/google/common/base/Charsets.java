package com.google.common.base;

import com.google.android.exoplayer2.C9415C;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
@ElementTypesAreNonnullByDefault
public final class Charsets {
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset ISO_8859_1 = Charset.forName(C9415C.ISO88591_NAME);
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");
    public static final Charset UTF_16LE = Charset.forName(C9415C.UTF16LE_NAME);
    public static final Charset UTF_16 = Charset.forName("UTF-16");

    private Charsets() {
    }
}
