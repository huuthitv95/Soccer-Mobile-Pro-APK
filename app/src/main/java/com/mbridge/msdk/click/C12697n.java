package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.click.entity.C12687a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.tiktok.util.UrlConst;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.click.n */
/* JADX INFO: compiled from: SocketSpider.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12697n {

    /* JADX INFO: renamed from: d */
    private static final AtomicInteger f33703d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    private C13635g f33704a;

    /* JADX INFO: renamed from: b */
    private String f33705b;

    /* JADX INFO: renamed from: c */
    private int f33706c = 9377;

    public C12697n() {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        this.f33704a = c13635gM39718d;
        if (c13635gM39718d == null) {
            this.f33704a = C13636h.m39706b().m39708a();
        }
    }

    /* JADX INFO: renamed from: a */
    private C12687a m34707a(String str, String str2) {
        OutputStream outputStream;
        int length;
        C12687a c12687a = new C12687a();
        Socket socket = null;
        OutputStream outputStream2 = null;
        try {
            Socket socket2 = new Socket(this.f33705b, this.f33706c);
            try {
                socket2.setSoTimeout(15000);
                outputStream2 = socket2.getOutputStream();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferWrap.order(byteOrder);
                byteBufferWrap.put((byte) 2);
                byteBufferWrap.put((byte) 3);
                byteBufferWrap.putShort((short) f33703d.getAndIncrement());
                if (TextUtils.isEmpty(str2)) {
                    byteBufferWrap.putInt(0);
                    outputStream2.write(byteBufferWrap.array());
                    length = 0;
                } else {
                    byte[] bArrM34711a = m34711a(str2);
                    length = bArrM34711a.length;
                    byteBufferWrap.putInt(length);
                    outputStream2.write(byteBufferWrap.array());
                    outputStream2.write(bArrM34711a);
                }
                outputStream2.flush();
                C13219q0.m37813a("SocketSpider", "Socket Request : header : " + Arrays.toString(byteBufferWrap.array()) + " length : " + length);
                InputStream inputStream = socket2.getInputStream();
                byte[] bArr = new byte[8];
                inputStream.read(bArr, 0, 8);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                byteBufferWrap2.order(byteOrder);
                int i = byteBufferWrap2.getInt(4);
                byte b = bArr[1];
                boolean z = b == 3;
                boolean z2 = b == 2;
                C13219q0.m37816b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i + " isGzip : " + z);
                byte[] bArr2 = new byte[i];
                new DataInputStream(socket2.getInputStream()).readFully(bArr2);
                if (!z && i > 2 && ((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                    z = true;
                }
                if (z2 && i == 0) {
                    c12687a.f33664f = 200;
                    c12687a.f33665g = str;
                    c12687a.f33663e = 0;
                    try {
                        socket2.close();
                        outputStream2.close();
                        return c12687a;
                    } catch (Exception e) {
                        C13219q0.m37816b("SocketSpider", e.getMessage());
                    }
                } else if (i < 1) {
                    c12687a.f33664f = 200;
                    c12687a.f33665g = str;
                    c12687a.f33663e = 0;
                    try {
                        socket2.close();
                        outputStream2.close();
                        return c12687a;
                    } catch (Exception e2) {
                        C13219q0.m37816b("SocketSpider", e2.getMessage());
                    }
                } else {
                    try {
                        String strM34710a = z ? m34710a(bArr2) : new String(bArr2);
                        if (TextUtils.isEmpty(strM34710a)) {
                            inputStream.close();
                            try {
                                socket2.close();
                                outputStream2.close();
                            } catch (Exception e3) {
                                C13219q0.m37816b("SocketSpider", e3.getMessage());
                            }
                        } else {
                            c12687a.f33664f = 200;
                            c12687a.f33665g = str;
                            c12687a.f33663e = 0;
                            try {
                                JSONObject jSONObjectOptJSONObject = new JSONObject(strM34710a).optJSONObject("data");
                                if (jSONObjectOptJSONObject != null) {
                                    String strOptString = jSONObjectOptJSONObject.optString(FirebaseAnalytics.Param.LOCATION);
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        c12687a.f33664f = 302;
                                        c12687a.f33659a = strOptString;
                                    }
                                }
                            } catch (Throwable th) {
                                C13219q0.m37816b("SocketSpider", th.getMessage());
                            }
                            try {
                                socket2.close();
                                outputStream2.close();
                            } catch (Exception e4) {
                                C13219q0.m37816b("SocketSpider", e4.getMessage());
                            }
                        }
                    } catch (Throwable th2) {
                        C13219q0.m37816b("SocketSpider", th2.getMessage());
                        c12687a.f33666h = th2.getMessage();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = outputStream2;
                socket = socket2;
                try {
                    C13219q0.m37813a("SocketSpider", "Socket exception: " + th.getMessage());
                    c12687a.f33666h = th.getMessage();
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Exception e5) {
                            C13219q0.m37816b("SocketSpider", e5.getMessage());
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
        return c12687a;
    }

    /* JADX INFO: renamed from: b */
    private JSONObject m34708b(String str, CampaignEx campaignEx, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                String encodedQuery = uri.getEncodedQuery();
                this.f33705b = host;
                jSONObject.put(ShareConstants.MEDIA_URI, UrlConst.HTTPS + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("SocketSpider", th.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z && !z2) {
                jSONObject2.put("User-Agent", C13211m0.m37749i());
            }
            if (campaignEx != null) {
                if (z && campaignEx.getcUA() == 1) {
                    jSONObject2.put("User-Agent", C13211m0.m37749i());
                }
                if (z2 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put("User-Agent", C13211m0.m37749i());
                }
            } else {
                jSONObject2.put("User-Agent", C13211m0.m37749i());
            }
            jSONObject2.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
            if (this.f33704a.m39427M0() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th2) {
            C13219q0.m37816b("SocketSpider", th2.getMessage());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public C12687a m34709a(String str, CampaignEx campaignEx, boolean z, boolean z2) {
        C12687a c12687a = new C12687a();
        c12687a.f33665g = str;
        if (TextUtils.isEmpty(str)) {
            c12687a.f33666h = "request url can not null.";
            return c12687a;
        }
        String strReplace = str.replace(" ", "%20");
        JSONObject jSONObjectM34708b = m34708b(strReplace, campaignEx, z, z2);
        if (jSONObjectM34708b.length() == 0) {
            c12687a.f33666h = "request content generation failed.";
            return c12687a;
        }
        if (TextUtils.isEmpty(jSONObjectM34708b.optString(ShareConstants.MEDIA_URI))) {
            c12687a.f33666h = "request url parse error.";
            return c12687a;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f33706c = trackingTcpPort;
        }
        if (!TextUtils.isEmpty(this.f33705b)) {
            return m34707a(strReplace, jSONObjectM34708b.toString());
        }
        c12687a.f33666h = "request url parse error.";
        return c12687a;
    }

    /* JADX INFO: renamed from: a */
    public String m34710a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2, 0, 1024);
            if (i <= 0) {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m34711a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
