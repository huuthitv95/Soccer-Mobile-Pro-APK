package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.ad */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10084ad {

    /* JADX INFO: renamed from: a */
    private static final C10116o f22392a = new C10116o("SplitInstallInfoProvider");

    /* JADX INFO: renamed from: b */
    private final Context f22393b;

    /* JADX INFO: renamed from: c */
    private final String f22394c;

    C10084ad(Context context) {
        this.f22393b = context;
        this.f22394c = context.getPackageName();
    }

    /* JADX INFO: renamed from: a */
    public final Set m22704a() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f22393b.getPackageManager().getPackageInfo(this.f22394c, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f22392a.m22750b("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        if (packageInfo == null || packageInfo.applicationInfo == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet<String> hashSet2 = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f22392a.m22749a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet2, string.split(",", -1));
                hashSet2.remove("");
                hashSet2.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f22392a.m22749a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet2, strArr);
        } else {
            f22392a.m22749a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        InterfaceC10082ab interfaceC10082abM22703a = C10083ac.m22703a();
        if (interfaceC10082abM22703a != null) {
            hashSet2.addAll(interfaceC10082abM22703a.m22702a());
        }
        for (String str : hashSet2) {
            if (!str.startsWith("config.") && !str.contains(".config.")) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }
}
