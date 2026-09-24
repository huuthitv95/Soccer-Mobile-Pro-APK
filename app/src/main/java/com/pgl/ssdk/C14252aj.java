package com.pgl.ssdk;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.pgl.ssdk.aj */
/* JADX INFO: loaded from: classes7.dex */
public class C14252aj {
    /* JADX INFO: renamed from: a */
    public static String m42951a() {
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT < 26) {
            return "!version_error!";
        }
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return (currentWebViewPackage == null || (applicationInfo = currentWebViewPackage.applicationInfo) == null) ? "!error!" : applicationInfo.publicSourceDir;
    }
}
