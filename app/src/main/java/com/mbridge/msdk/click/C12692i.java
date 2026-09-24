package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.click.entity.C12687a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.mbridge.msdk.click.i */
/* JADX INFO: compiled from: JavaHttpSpider.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12692i {

    /* JADX INFO: renamed from: f */
    private static final String f33681f = "i";

    /* JADX INFO: renamed from: a */
    private C13635g f33682a;

    /* JADX INFO: renamed from: b */
    private String f33683b;

    /* JADX INFO: renamed from: c */
    private boolean f33684c = true;

    /* JADX INFO: renamed from: d */
    private final int f33685d = 3145728;

    /* JADX INFO: renamed from: e */
    private C12687a f33686e;

    public C12692i() {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        this.f33682a = c13635gM39718d;
        if (c13635gM39718d == null) {
            this.f33682a = C13636h.m39706b().m39708a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034 A[Catch: all -> 0x002d, TryCatch #5 {all -> 0x002d, blocks: (B:4:0x0008, B:5:0x000e, B:21:0x0030, B:23:0x0034, B:24:0x0041), top: B:38:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c A[Catch: Exception -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0026, blocks: (B:10:0x0022, B:26:0x004c), top: B:41:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private String m34685a(InputStream inputStream, boolean z) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            if (z) {
                try {
                    try {
                        inputStream = new GZIPInputStream(inputStream);
                    } catch (Exception e2) {
                        e = e2;
                        if (this.f33686e == null) {
                            C12687a c12687a = new C12687a();
                            this.f33686e = c12687a;
                            c12687a.f33666h = e.getMessage();
                        }
                        C13219q0.m37816b(f33681f, e.getMessage());
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return sb.toString();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                            C13219q0.m37816b(f33681f, e3.getMessage());
                        }
                    }
                    throw th;
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (Exception e4) {
                    e = e4;
                    bufferedReader2 = bufferedReader;
                    if (this.f33686e == null) {
                        C12687a c12687a2 = new C12687a();
                        this.f33686e = c12687a2;
                        c12687a2.f33666h = e.getMessage();
                    }
                    C13219q0.m37816b(f33681f, e.getMessage());
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return sb.toString();
                } catch (Throwable th3) {
                    th = th3;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
            bufferedReader.close();
        } catch (Exception e5) {
            C13219q0.m37816b(f33681f, e5.getMessage());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public C12687a m34686a(String str, boolean z, boolean z2, CampaignEx campaignEx) {
        int i;
        HttpsURLConnection httpsURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(" ", "%20");
        this.f33686e = new C12687a();
        try {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(strReplace).openConnection();
            try {
                httpsURLConnection2.setHostnameVerifier(new MBridgeHostnameVerifier(strReplace));
                httpsURLConnection2.setRequestMethod("GET");
                if ((!z && !z2) || campaignEx == null) {
                    httpsURLConnection2.setRequestProperty("User-Agent", C13211m0.m37749i());
                }
                if (z && campaignEx != null && campaignEx.getcUA() == 1) {
                    httpsURLConnection2.setRequestProperty("User-Agent", C13211m0.m37749i());
                }
                if (z2 && campaignEx != null && campaignEx.getImpUA() == 1) {
                    httpsURLConnection2.setRequestProperty("User-Agent", C13211m0.m37749i());
                }
                httpsURLConnection2.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                if (this.f33682a.m39427M0() && !TextUtils.isEmpty(this.f33683b)) {
                    httpsURLConnection2.setRequestProperty("referer", this.f33683b);
                }
                httpsURLConnection2.setConnectTimeout(60000);
                httpsURLConnection2.setReadTimeout(60000);
                httpsURLConnection2.setInstanceFollowRedirects(false);
                httpsURLConnection2.connect();
                this.f33686e.f33659a = httpsURLConnection2.getHeaderField(HttpHeaders.LOCATION);
                this.f33686e.f33662d = httpsURLConnection2.getHeaderField(HttpHeaders.REFERER);
                this.f33686e.f33664f = httpsURLConnection2.getResponseCode();
                this.f33686e.f33660b = httpsURLConnection2.getContentType();
                this.f33686e.f33663e = httpsURLConnection2.getContentLength();
                this.f33686e.f33661c = httpsURLConnection2.getContentEncoding();
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(this.f33686e.f33661c);
                C12687a c12687a = this.f33686e;
                if (c12687a.f33664f == 200 && this.f33684c && (i = c12687a.f33663e) > 0 && i < 3145728 && !TextUtils.isEmpty(strReplace)) {
                    try {
                        String strM34685a = m34685a(httpsURLConnection2.getInputStream(), zEqualsIgnoreCase);
                        if (!TextUtils.isEmpty(strM34685a)) {
                            byte[] bytes = strM34685a.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f33686e.f33665g = strM34685a.trim();
                            }
                        }
                    } catch (Throwable th) {
                        C13219q0.m37816b(f33681f, th.getMessage());
                    }
                }
                this.f33683b = strReplace;
                httpsURLConnection2.disconnect();
                return this.f33686e;
            } catch (Throwable th2) {
                th = th2;
                httpsURLConnection = httpsURLConnection2;
                try {
                    this.f33686e.f33666h = th.getMessage();
                    return this.f33686e;
                } finally {
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
