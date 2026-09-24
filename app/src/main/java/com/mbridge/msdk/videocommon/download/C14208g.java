package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.g */
/* JADX INFO: compiled from: ResourceCheckWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14208g {
    /* JADX INFO: renamed from: a */
    public static String m42537a(String str) {
        try {
            return H5DownLoadManager.getInstance().getH5ResAddress(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m42538b(String str) {
        try {
            return HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
