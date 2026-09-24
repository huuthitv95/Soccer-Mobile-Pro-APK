package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.z */
/* JADX INFO: compiled from: DynamicViewResourceManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13236z {

    /* JADX INFO: renamed from: a */
    static final List<String> f36404a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.z$a */
    /* JADX INFO: compiled from: DynamicViewResourceManager.java */
    class a implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36405a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36406b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ c f36407c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f36408d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f36409e;

        a(String str, String str2, c cVar, String str3, String str4) {
            this.f36405a = str;
            this.f36406b = str2;
            this.f36407c = cVar;
            this.f36408d = str3;
            this.f36409e = str4;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                String str2 = this.f36405a + File.separator + this.f36406b;
                String str3 = this.f36405a;
                MBResourceManager.getInstance().unZip(str2, str3);
                if (this.f36407c != null) {
                    if (downloadMessage != null) {
                        try {
                            str = (String) downloadMessage.getExtra("responseHeaders");
                        } catch (Throwable th) {
                            C13219q0.m37816b("DynamicViewResourceManager", th.getMessage());
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    try {
                        this.f36407c.mo37966a(this.f36408d, str3, this.f36409e, str, false);
                    } catch (Exception e) {
                        C13219q0.m37816b("DynamicViewResourceManager", e.getMessage());
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            c cVar = this.f36407c;
            if (cVar != null) {
                try {
                    cVar.mo37965a(this.f36408d, downloadError);
                } catch (Exception e) {
                    C13219q0.m37816b("DynamicViewResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.z$b */
    /* JADX INFO: compiled from: DynamicViewResourceManager.java */
    class b implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36410a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36411b;

        b(String str, String str2) {
            this.f36410a = str;
            this.f36411b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                MBResourceManager.getInstance().unZip(this.f36410a + File.separator + this.f36411b, this.f36410a);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.z$c */
    /* JADX INFO: compiled from: DynamicViewResourceManager.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo37965a(String str, DownloadError downloadError);

        /* JADX INFO: renamed from: a */
        void mo37966a(String str, String str2, String str3, String str4, boolean z);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        f36404a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r13 != 5) goto L34;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m37960a(int r13, java.lang.String r14, java.lang.String r15, com.mbridge.msdk.foundation.tools.C13236z.c r16, com.mbridge.msdk.foundation.entity.CampaignEx r17) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C13236z.m37960a(int, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.tools.z$c, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    /* JADX INFO: renamed from: b */
    private static String m37963b(int i, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                String path = new URL(str2).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    return strSubstring.replace(".zip", "");
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    private static String m37964b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = new URL(str).getPath();
                String strSubstring = path.substring(path.lastIndexOf(47) + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    String strReplace = strSubstring.replace(".zip", "");
                    List<String> list = f36404a;
                    if (list != null && !list.contains(strReplace)) {
                        return strReplace;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static String m37958a(int i, String str, String str2) {
        String strM37963b;
        File file;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            strM37963b = m37963b(i, str, str2);
        } catch (Exception unused) {
            strM37963b = "";
        }
        String str3 = C13098e.m37149b(EnumC13096c.MBRIDGE_700_XML) + File.separator;
        try {
            file = !TextUtils.isEmpty(strM37963b) ? new File(str3, strM37963b) : null;
        } catch (Exception unused2) {
        }
        if (file == null || !file.exists()) {
            file = new File(str3 + File.separator + strM37963b.replace(".xml", ""), strM37963b);
        }
        return file.getPath();
    }

    /* JADX INFO: renamed from: a */
    public static String m37959a(String str) {
        String strM37964b;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter) && !queryParameter.equals("1")) {
                return "";
            }
        } catch (Throwable unused) {
        }
        try {
            strM37964b = m37964b(str);
        } catch (Exception unused2) {
            strM37964b = "";
        }
        if (TextUtils.isEmpty(strM37964b)) {
            return "";
        }
        try {
            String str2 = C13098e.m37149b(EnumC13096c.MBRIDGE_700_XML) + File.separator;
            File file = new File(str2, strM37964b);
            if (file.isFile() && file.exists()) {
                return file.getPath();
            }
            String path = new URL(str).getPath();
            m37961a(str, path.substring(path.lastIndexOf(47) + 1), str2, strM37964b);
            return "";
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static final void m37962a(String str, String str2, String str3, String str4, c cVar, CampaignEx campaignEx, int i) throws Exception {
        C13219q0.m37813a("test_zip_download ", "start download path： " + str3 + str2);
        DownloadMessage<?> downloadMessage = new DownloadMessage<>(campaignEx, str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER);
        downloadMessage.addExtra("resource_type", Integer.valueOf(i));
        MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout((long) C13088a.f35879u).withConnectTimeout((long) C13088a.f35878t).withTimeout(60000L).withWriteTimeout((long) C13088a.f35877s).with("download_scene", "download_dynamic_view").withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new a(str3, str2, cVar, str, str4)).build().start();
    }

    /* JADX INFO: renamed from: a */
    private static final void m37961a(String str, String str2, String str3, String str4) throws Exception {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(C13088a.f35879u).withConnectTimeout(C13088a.f35873o).with("download_scene", "download_dynamic_view").withWriteTimeout(C13088a.f35877s).withTimeout(60000L).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new b(str3, str2)).build().start();
    }
}
