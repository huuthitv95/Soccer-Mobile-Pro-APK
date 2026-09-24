package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.k */
/* JADX INFO: compiled from: StatusLine.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13745k {

    /* JADX INFO: renamed from: a */
    public final EnumC13787w f38882a;

    /* JADX INFO: renamed from: b */
    public final int f38883b;

    /* JADX INFO: renamed from: c */
    public final String f38884c;

    public C13745k(EnumC13787w enumC13787w, int i, String str) {
        this.f38882a = enumC13787w;
        this.f38883b = i;
        this.f38884c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C13745k m40416a(String str) throws IOException {
        EnumC13787w enumC13787w;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC13787w = EnumC13787w.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC13787w = EnumC13787w.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            enumC13787w = EnumC13787w.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i + 4);
            }
            return new C13745k(enumC13787w, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38882a == EnumC13787w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f38883b);
        if (this.f38884c != null) {
            sb.append(' ');
            sb.append(this.f38884c);
        }
        return sb.toString();
    }
}
