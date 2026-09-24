package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.tiktok.util.UrlConst;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.i */
/* JADX INFO: compiled from: LocalDNSManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13859i {

    /* JADX INFO: renamed from: f */
    private static final String f39561f = "i";

    /* JADX INFO: renamed from: g */
    private static volatile C13859i f39562g;

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, InetAddress> f39563a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f39564b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    private String f39566d = "";

    /* JADX INFO: renamed from: e */
    private String f39567e = "";

    /* JADX INFO: renamed from: c */
    private final C12998a f39565c = C12998a.m36460b();

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.i$a */
    /* JADX INFO: compiled from: LocalDNSManager.java */
    /* JADX INFO: loaded from: classes9.dex */
    private static class a implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a */
        private final String f39568a;

        /* JADX INFO: renamed from: b */
        private final String f39569b;

        /* JADX INFO: renamed from: c */
        private final String f39570c;

        public a(String str, String str2, String str3) {
            this.f39568a = str;
            this.f39569b = str2;
            this.f39570c = str3;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
            C13859i.m41292b().m41295c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            C13859i.m41292b().m41294b(this.f39568a, this.f39569b, this.f39570c);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            C13859i.m41292b().m41295c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    private C13859i() {
    }

    /* JADX INFO: renamed from: a */
    private void m41287a() {
        String strM36462a = this.f39565c.m36462a("cache");
        String strM36462a2 = this.f39565c.m36462a("url");
        String strM37845b = C13223s0.m37831a().m37845b("local_dns_config_url", "", false);
        if (TextUtils.isEmpty(strM37845b)) {
            this.f39565c.m36464a("cache", "");
        } else if (TextUtils.isEmpty(strM36462a) || TextUtils.isEmpty(strM36462a2) || !TextUtils.equals(strM37845b, strM36462a2)) {
            m41290a(strM37845b);
        } else {
            m41296d(strM36462a);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41290a(String str) {
        m41291a(str, C13098e.m37149b(EnumC13096c.MBRIDGE_OTHER) + File.separator, m41293b(str));
    }

    /* JADX INFO: renamed from: a */
    private void m41291a(String str, String str2, String str3) {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str3, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withConnectTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withWriteTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withHttpRetryCounter(5).withDirectoryPathInternal(str2).withDownloadPriority(DownloadPriority.HIGH).withDownloadStateListener(new a(str, str2, str3)).build().start();
    }

    /* JADX INFO: renamed from: b */
    public static C13859i m41292b() {
        if (f39562g == null) {
            synchronized (C13859i.class) {
                if (f39562g == null) {
                    f39562g = new C13859i();
                }
            }
        }
        return f39562g;
    }

    /* JADX INFO: renamed from: b */
    public static String m41293b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m41294b(String str, String str2, String str3) {
        try {
            String strM37116a = C13092c.m37116a(new FileInputStream(new File(str2, str3)));
            if (TextUtils.isEmpty(strM37116a)) {
                return;
            }
            this.f39565c.m36464a("cache", strM37116a);
            this.f39565c.m36464a("url", str);
            m41296d(strM37116a);
        } catch (Exception e) {
            C13219q0.m37817b(f39561f, "downloadLocalDNSConfig: onDownloadComplete: file not found", e);
            this.f39566d = "find local dns config file error";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m41295c() {
        this.f39564b.set(false);
        this.f39566d = "download local dns config error";
    }

    /* JADX INFO: renamed from: d */
    private void m41296d(String str) {
        try {
            this.f39567e = m41297e(C13121d.m37226h().f36048y);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(C13207k0.m37712a(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next) && next.contains(this.f39567e)) {
                    String string = jSONObject.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            this.f39563a.put(next, InetAddress.getByAddress(next, C13092c.m37124b(string)));
                        } catch (UnknownHostException e) {
                            this.f39566d = String.format("create InetAddress failed for %s with ip %s", next, string);
                            C13219q0.m37817b(f39561f, "init: local dns cache error", e);
                        }
                    }
                }
            }
            this.f39564b.set(true);
        } catch (Exception e2) {
            C13219q0.m37817b(f39561f, "init: local dns cache json parse error", e2);
            this.f39566d = "parse local dns config error";
            this.f39563a.clear();
            this.f39564b.set(false);
        }
    }

    /* JADX INFO: renamed from: e */
    private static String m41297e(String str) {
        return str.replace("https://{}", "").replace("http://{}", "");
    }

    /* JADX INFO: renamed from: a */
    public List<InetAddress> m41298a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        InetAddress inetAddress;
        try {
            inetAddress = this.f39563a.get(str);
        } catch (Exception e) {
            C13219q0.m37817b(f39561f, "lookup: local dns cache error", e);
            inetAddress = null;
        }
        if (inetAddress == null) {
            throw unknownHostException;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(inetAddress);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public boolean m41299c(String str) {
        return TextUtils.equals(str, C13121d.m37226h().f36026e.replace(UrlConst.HTTPS, ""));
    }

    /* JADX INFO: renamed from: c */
    public boolean m41300c(String str, String str2, String str3) {
        if (m41302e() && m41301d() && TextUtils.equals(str, "campaign") && !m41299c(str3)) {
            return TextUtils.equals(str2, String.valueOf(94)) || TextUtils.equals(str2, String.valueOf(MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m41301d() {
        return this.f39564b.get() && !this.f39563a.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public boolean m41302e() {
        return C13223s0.m37831a().m37846b("local_dns", false, false);
    }

    /* JADX INFO: renamed from: f */
    public void m41303f(String str) {
        if (TextUtils.isEmpty(str) || !m41302e()) {
            return;
        }
        this.f39564b.set(false);
        this.f39563a.clear();
        m41287a();
    }
}
