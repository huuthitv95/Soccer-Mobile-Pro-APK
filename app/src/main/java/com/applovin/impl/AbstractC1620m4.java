package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.applovin.impl.m4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1620m4 {

    /* JADX INFO: renamed from: a */
    private static final AtomicReference f2065a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static String m3224a() {
        return "iabtechlab-Applovin";
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static String m3225a(C1748l c1748l, Map map) {
        String str = (String) f2065a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL urlM3226b = m3226b();
        if (urlM3226b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamM4972a = c1748l.m4771I().m4972a(urlM3226b.toString(), (List) null, false, map);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM4972a));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append("\n");
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    if (inputStreamM4972a != null) {
                        try {
                            inputStreamM4972a.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
                bufferedReader.close();
                if (inputStreamM4972a != null) {
                    inputStreamM4972a.close();
                }
            } catch (Throwable th4) {
                if (inputStreamM4972a != null) {
                    inputStreamM4972a.close();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            c1748l.m4782Q().m5173a("OpenMeasurementTestParameters", th5);
            c1748l.m4764E().m4329a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th5);
        }
        String string = sb.toString();
        f2065a.set(string);
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static URL m3226b() {
        try {
            return new URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m3227c() {
        return "iabtechlab.com-omid";
    }
}
