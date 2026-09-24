package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.d */
/* JADX INFO: compiled from: H5DownLoadManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14205d {

    /* JADX INFO: renamed from: h */
    private static C14205d f41027h;

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<String> f41028a;

    /* JADX INFO: renamed from: b */
    private ConcurrentMap<String, Object> f41029b;

    /* JADX INFO: renamed from: c */
    private C14210i f41030c;

    /* JADX INFO: renamed from: d */
    private C14207f f41031d;

    /* JADX INFO: renamed from: e */
    private boolean f41032e;

    /* JADX INFO: renamed from: f */
    private final String f41033f = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* JADX INFO: renamed from: g */
    private final String f41034g = "down_type";

    private C14205d() {
        this.f41032e = false;
        try {
            this.f41030c = C14210i.m42539a();
            this.f41031d = C14207f.m42533a();
            this.f41028a = new CopyOnWriteArrayList<>();
            this.f41029b = new ConcurrentHashMap();
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null) {
                this.f41032e = c13635gM39718d.m39476b(1);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("H5DownLoadManager", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C14205d m42529a() {
        if (f41027h == null) {
            f41027h = new C14205d();
        }
        return f41027h;
    }

    /* JADX INFO: renamed from: b */
    private String m42530b(String str) {
        C14207f c14207f = this.f41031d;
        return c14207f != null ? c14207f.m42535b(str) : str;
    }

    /* JADX INFO: renamed from: a */
    public String m42531a(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    return path.toLowerCase().endsWith(".zip") ? m42532c(str) : m42530b(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public String m42532c(String str) {
        C14210i c14210i = this.f41030c;
        if (c14210i != null) {
            return c14210i.m42540a(str);
        }
        return null;
    }
}
