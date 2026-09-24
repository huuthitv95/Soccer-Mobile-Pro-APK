package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C10116o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ea */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C10057ea {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22329a = new C10116o("PackMetadataManager");

    /* JADX INFO: renamed from: b */
    private final C9983bh f22330b;

    /* JADX INFO: renamed from: c */
    private final C10059ec f22331c;

    C10057ea(C9983bh c9983bh, C10059ec c10059ec) {
        this.f22330b = c9983bh;
        this.f22331c = c10059ec;
    }

    /* JADX INFO: renamed from: a */
    final String m22673a(String str) {
        if (!this.f22330b.m22556G(str)) {
            return "";
        }
        C10059ec c10059ec = this.f22331c;
        C9983bh c9983bh = this.f22330b;
        int iM22675a = c10059ec.m22675a();
        File fileM22567k = c9983bh.m22567k(str, iM22675a, c9983bh.m22559c(str));
        try {
            if (!fileM22567k.exists()) {
                return String.valueOf(iM22675a);
            }
            FileInputStream fileInputStream = new FileInputStream(fileM22567k);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(iM22675a) : property;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            f22329a.m22750b("Failed to read pack version tag for pack %s", str);
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    final void m22674b(String str, int i, long j, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File fileM22567k = this.f22330b.m22567k(str, i, j);
        fileM22567k.getParentFile().mkdirs();
        fileM22567k.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileM22567k);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
