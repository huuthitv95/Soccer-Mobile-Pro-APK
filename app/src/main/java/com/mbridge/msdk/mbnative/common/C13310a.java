package com.mbridge.msdk.mbnative.common;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.common.a */
/* JADX INFO: compiled from: NativeConst.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13310a {
    /* JADX INFO: renamed from: a */
    public static String m38393a(Exception exc) {
        if (exc == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
