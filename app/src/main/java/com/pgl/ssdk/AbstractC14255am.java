package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11540L6;
import com.pgl.ssdk.ces.C14272b;
import com.tiktok.util.UrlConst;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.pgl.ssdk.am */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC14255am {

    /* JADX INFO: renamed from: a */
    public static String f41250a;

    /* JADX INFO: renamed from: c */
    private Context f41252c;

    /* JADX INFO: renamed from: d */
    private int f41253d;

    /* JADX INFO: renamed from: e */
    private int f41254e;

    /* JADX INFO: renamed from: f */
    private byte[] f41255f;

    /* JADX INFO: renamed from: b */
    private HttpURLConnection f41251b = null;

    /* JADX INFO: renamed from: g */
    private int f41256g = -1;

    /* JADX INFO: renamed from: h */
    private byte[] f41257h = null;

    /* JADX INFO: renamed from: i */
    private int f41258i = 10000;

    /* JADX INFO: renamed from: j */
    private int f41259j = 0;

    /* JADX INFO: renamed from: k */
    private int f41260k = 2;

    /* JADX INFO: renamed from: l */
    private boolean f41261l = true;

    /* JADX INFO: renamed from: m */
    private Runnable f41262m = new a();

    /* JADX INFO: renamed from: com.pgl.ssdk.am$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC14255am.this.m42978c() || AbstractC14255am.this.f41259j >= AbstractC14255am.this.f41260k) {
                return;
            }
            AbstractC14255am.m42977c(AbstractC14255am.this);
            C14260ar.m42992a(this);
        }
    }

    public AbstractC14255am(Context context) {
        this.f41252c = context;
    }

    /* JADX INFO: renamed from: a */
    private void m42969a(int i) throws ProtocolException {
        String str;
        if (i == 1) {
            str = "POST";
        } else if (i == 3) {
            str = "PUT";
        } else if (i == 4) {
            str = "DELETE";
        } else if (i != 5) {
            str = i != 6 ? "GET" : "TRACE";
        } else {
            str = "HEAD";
        }
        this.f41251b.setRequestMethod(str);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m42970a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f41250a)) {
            f41250a = str;
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m42972a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr, 0, 1024);
            if (i <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m42974b() {
        Object obj;
        if (this.f41251b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f41250a)) {
                jSONObject.put("ipv6", f41250a);
            }
            if (!TextUtils.isEmpty(C14272b.m43042c())) {
                jSONObject.put(C11540L6.f24947V0, C14272b.m43042c());
            }
            jSONObject.put("region", C14256an.m42983a());
            Pair<Integer, String> pairM42990a = C14259aq.m42990a(jSONObject.toString());
            if (pairM42990a == null || (obj = pairM42990a.first) == null || pairM42990a.second == null) {
                return;
            }
            this.f41251b.addRequestProperty("cypher", String.valueOf(obj));
            this.f41251b.addRequestProperty("transfer-param", (String) pairM42990a.second);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m42975b(int i) {
        String str;
        if (i != 1) {
            str = i != 2 ? "" : "application/octet-stream";
        } else {
            str = "application/json; charset=utf-8";
        }
        if (!str.isEmpty()) {
            this.f41251b.addRequestProperty("Content-Type", str);
        }
        String strM42987b = C14256an.m42987b();
        if (strM42987b != null) {
            this.f41251b.addRequestProperty("x-pangle-target-idc", strM42987b);
        }
        m42974b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f41251b.addRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            this.f41251b.addRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m42976b(int i, int i2, byte[] bArr) {
        this.f41253d = i;
        this.f41254e = i2;
        this.f41255f = bArr;
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ int m42977c(AbstractC14255am abstractC14255am) {
        int i = abstractC14255am.f41259j;
        abstractC14255am.f41259j = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba A[Catch: all -> 0x00ce, PHI: r0
  0x00ba: PHI (r0v14 java.io.InputStream) = (r0v13 java.io.InputStream), (r0v20 java.io.InputStream) binds: [B:30:0x00b7, B:27:0x00b3] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ce, blocks: (B:3:0x0004, B:5:0x0010, B:10:0x001f, B:12:0x0038, B:14:0x0040, B:15:0x0048, B:17:0x0051, B:19:0x0064, B:21:0x0081, B:23:0x0084, B:24:0x009a, B:33:0x00bd, B:32:0x00ba, B:18:0x005c), top: B:48:0x0004 }] */
    /* JADX INFO: renamed from: c */
    public boolean m42978c() {
        InputStream inputStream;
        try {
            String strM42984a = C14256an.m42984a(this.f41252c);
            if (TextUtils.isEmpty(strM42984a)) {
                C14256an.m42988b(this.f41252c);
                HttpURLConnection httpURLConnection = this.f41251b;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    this.f41251b = null;
                }
                return false;
            }
            String strConcat = strM42984a + mo42980a();
            if (!strConcat.startsWith(UrlConst.HTTPS) && !strConcat.startsWith("http://")) {
                strConcat = UrlConst.HTTPS.concat(String.valueOf(strConcat));
            }
            URL url = new URL(strConcat);
            if (this.f41261l) {
                this.f41251b = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            } else {
                this.f41251b = (HttpURLConnection) url.openConnection();
            }
            this.f41251b.setConnectTimeout(this.f41258i);
            this.f41251b.setReadTimeout(this.f41258i);
            m42969a(this.f41253d);
            m42975b(this.f41254e);
            byte[] bArr = this.f41255f;
            if (bArr != null && bArr.length > 0) {
                this.f41251b.setDoOutput(true);
                OutputStream outputStream = this.f41251b.getOutputStream();
                outputStream.write(this.f41255f);
                outputStream.flush();
                outputStream.close();
            }
            this.f41251b.connect();
            try {
                this.f41256g = this.f41251b.getResponseCode();
                inputStream = this.f41251b.getInputStream();
                try {
                    this.f41257h = m42972a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable unused) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                inputStream = null;
            }
            mo42982a(this.f41256g, this.f41257h);
            HttpURLConnection httpURLConnection2 = this.f41251b;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                this.f41251b = null;
            }
            return true;
        } catch (Throwable unused3) {
            HttpURLConnection httpURLConnection3 = this.f41251b;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
                this.f41251b = null;
            }
            C14256an.m42988b(this.f41252c);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    abstract String mo42980a();

    /* JADX INFO: renamed from: a */
    public void m42981a(int i, int i2, byte[] bArr) {
        m42976b(i, i2, bArr);
        C14260ar.m42992a(this.f41262m);
    }

    /* JADX INFO: renamed from: a */
    abstract void mo42982a(int i, byte[] bArr);
}
