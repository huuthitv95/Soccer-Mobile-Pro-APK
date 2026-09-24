package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.C1768p;

/* JADX INFO: renamed from: com.applovin.impl.y */
/* JADX INFO: loaded from: classes3.dex */
public class C1817y {

    /* JADX INFO: renamed from: e */
    private static C1817y f3571e;

    /* JADX INFO: renamed from: f */
    private static final Object f3572f = new Object();

    /* JADX INFO: renamed from: a */
    private final Bundle f3573a;

    /* JADX INFO: renamed from: b */
    private final int f3574b;

    /* JADX INFO: renamed from: c */
    private final boolean f3575c;

    /* JADX INFO: renamed from: d */
    private final String f3576d;

    private C1817y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        String str = null;
        str = null;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                bundle = applicationInfo.metaData;
                try {
                    String str2 = applicationInfo.processName;
                    this.f3573a = bundle;
                    this.f3576d = str2;
                } catch (PackageManager.NameNotFoundException e) {
                    e = e;
                    C1768p.m5164c("AndroidManifest", "Failed to get meta data.", e);
                    this.f3573a = bundle;
                    this.f3576d = null;
                }
            } catch (Throwable th) {
                th = th;
                this.f3573a = bundle;
                this.f3576d = str;
                throw th;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            bundle = null;
        } catch (Throwable th2) {
            th = th2;
            bundle = null;
            this.f3573a = bundle;
            this.f3576d = str;
            throw th;
        }
        str = null;
        boolean z = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i = 0; i < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = zBooleanValue;
                        try {
                            C1768p.m5164c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.f3574b = iIntValue;
                            this.f3575c = z;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.f3574b = iIntValue;
            this.f3575c = zBooleanValue;
        } catch (Throwable th4) {
            th = th4;
            iIntValue = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1817y m5604a(Context context) {
        C1817y c1817y;
        synchronized (f3572f) {
            if (f3571e == null) {
                f3571e = new C1817y(context);
            }
            c1817y = f3571e;
        }
        return c1817y;
    }

    /* JADX INFO: renamed from: a */
    public String m5605a() {
        return this.f3576d;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5606a(String str) {
        Bundle bundle = this.f3573a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5607a(String str, boolean z) {
        Bundle bundle = this.f3573a;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }
}
