package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11744X3;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8791p implements InterfaceC8783h {

    /* JADX INFO: renamed from: o */
    public static final Pattern f20570o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: p */
    public static final AtomicReference f20571p = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final boolean f20572a;

    /* JADX INFO: renamed from: b */
    public final int f20573b;

    /* JADX INFO: renamed from: c */
    public final int f20574c;

    /* JADX INFO: renamed from: d */
    public final String f20575d;

    /* JADX INFO: renamed from: e */
    public final C8798w f20576e;

    /* JADX INFO: renamed from: f */
    public final C8798w f20577f;

    /* JADX INFO: renamed from: g */
    public final C8788m f20578g;

    /* JADX INFO: renamed from: h */
    public HttpURLConnection f20579h;

    /* JADX INFO: renamed from: i */
    public InputStream f20580i;

    /* JADX INFO: renamed from: j */
    public boolean f20581j;

    /* JADX INFO: renamed from: k */
    public long f20582k;

    /* JADX INFO: renamed from: l */
    public long f20583l;

    /* JADX INFO: renamed from: m */
    public long f20584m;

    /* JADX INFO: renamed from: n */
    public long f20585n;

    public C8791p(String str, C8788m c8788m, int i, int i2, boolean z, C8798w c8798w) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f20575d = str;
        this.f20578g = c8788m;
        this.f20577f = new C8798w();
        this.f20573b = i;
        this.f20574c = i2;
        this.f20572a = z;
        this.f20576e = c8798w;
    }

    /* JADX INFO: renamed from: a */
    public static void m21311a(HttpURLConnection httpURLConnection, long j) {
        int i = AbstractC8827z.f20671a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m21312a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20583l;
        if (j != -1) {
            long j2 = j - this.f20585n;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = this.f20580i.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f20583l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = i3;
        this.f20585n += j3;
        C8788m c8788m = this.f20578g;
        if (c8788m == null) {
            return i3;
        }
        synchronized (c8788m) {
            c8788m.f20559d += j3;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) throws C8796u {
        long j;
        long jMax;
        this.f20585n = 0L;
        this.f20584m = 0L;
        try {
            HttpURLConnection httpURLConnectionM21314b = m21314b(c8786k);
            this.f20579h = httpURLConnectionM21314b;
            try {
                int responseCode = httpURLConnectionM21314b.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    this.f20579h.getHeaderFields();
                    m21315b();
                    C8797v c8797v = new C8797v(responseCode);
                    if (responseCode != 416) {
                        throw c8797v;
                    }
                    c8797v.initCause(new C8784i());
                    throw c8797v;
                }
                this.f20579h.getContentType();
                if (responseCode == 200) {
                    j = c8786k.f20547c;
                    if (j == 0) {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                this.f20582k = j;
                if ((c8786k.f20550f & 1) == 1) {
                    this.f20583l = c8786k.f20548d;
                } else {
                    long j2 = c8786k.f20548d;
                    if (j2 != -1) {
                        this.f20583l = j2;
                    } else {
                        HttpURLConnection httpURLConnection = this.f20579h;
                        String headerField = httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                        if (TextUtils.isEmpty(headerField)) {
                            jMax = -1;
                        } else {
                            try {
                                jMax = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField + C11744X3.j.f26440e);
                                jMax = -1;
                            }
                        }
                        String headerField2 = httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE);
                        if (!TextUtils.isEmpty(headerField2)) {
                            Matcher matcher = f20570o.matcher(headerField2);
                            if (matcher.find()) {
                                try {
                                    long j3 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                    if (jMax < 0) {
                                        jMax = j3;
                                    } else if (jMax != j3) {
                                        Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField + "] [" + headerField2 + C11744X3.j.f26440e);
                                        jMax = Math.max(jMax, j3);
                                    }
                                } catch (NumberFormatException unused2) {
                                    Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField2 + C11744X3.j.f26440e);
                                }
                            }
                        }
                        this.f20583l = jMax != -1 ? jMax - this.f20582k : -1L;
                    }
                }
                try {
                    this.f20580i = this.f20579h.getInputStream();
                    this.f20581j = true;
                    C8788m c8788m = this.f20578g;
                    if (c8788m != null) {
                        synchronized (c8788m) {
                            if (c8788m.f20557b == 0) {
                                c8788m.f20558c = SystemClock.elapsedRealtime();
                            }
                            c8788m.f20557b++;
                        }
                    }
                    return this.f20583l;
                } catch (IOException e) {
                    m21315b();
                    throw new C8796u(e);
                }
            } catch (IOException e2) {
                m21315b();
                throw new C8796u("Unable to connect to " + c8786k.f20545a.toString(), e2);
            }
        } catch (IOException e3) {
            throw new C8796u("Unable to connect to " + c8786k.f20545a.toString(), e3);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        HttpURLConnection httpURLConnection = this.f20579h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection m21313a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f20573b);
        httpURLConnection.setReadTimeout(this.f20574c);
        C8798w c8798w = this.f20576e;
        if (c8798w != null) {
            synchronized (c8798w) {
                if (c8798w.f20599b == null) {
                    c8798w.f20599b = Collections.unmodifiableMap(new HashMap(c8798w.f20598a));
                }
                map = c8798w.f20599b;
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f20577f.m21317a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f20575d);
        if (!z) {
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setRequestMethod("POST");
        if (bArr.length == 0) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: b */
    public final HttpURLConnection m21314b(C8786k c8786k) throws IOException {
        URL url = new URL(c8786k.f20545a.toString());
        long j = c8786k.f20547c;
        long j2 = c8786k.f20548d;
        int i = 0;
        boolean z = (c8786k.f20550f & 1) == 1;
        if (!this.f20572a) {
            return m21313a(url, null, j, j2, z, true);
        }
        while (true) {
            int i2 = i + 1;
            if (i > 20) {
                throw new NoRouteToHostException(AbstractC8673m.m21221a("Too many redirects: ", i2));
            }
            boolean z2 = z;
            long j3 = j2;
            long j4 = j;
            HttpURLConnection httpURLConnectionM21313a = m21313a(url, null, j4, j3, z2, false);
            j = j4;
            j2 = j3;
            z = z2;
            int responseCode = httpURLConnectionM21313a.getResponseCode();
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                return httpURLConnectionM21313a;
            }
            String headerField = httpURLConnectionM21313a.getHeaderField(HttpHeaders.LOCATION);
            httpURLConnectionM21313a.disconnect();
            if (headerField == null) {
                throw new ProtocolException("Null location redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            i = i2;
            url = url2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21315b() {
        HttpURLConnection httpURLConnection = this.f20579h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f20579h = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21316c() throws IOException {
        if (this.f20584m == this.f20582k) {
            return;
        }
        byte[] bArr = (byte[]) f20571p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j = this.f20584m;
            long j2 = this.f20582k;
            if (j == j2) {
                f20571p.set(bArr);
                return;
            }
            int i = this.f20580i.read(bArr, 0, (int) Math.min(j2 - j, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i == -1) {
                throw new EOFException();
            }
            long j3 = i;
            this.f20584m += j3;
            C8788m c8788m = this.f20578g;
            if (c8788m != null) {
                synchronized (c8788m) {
                    c8788m.f20559d += j3;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final void close() {
        try {
            if (this.f20580i != null) {
                HttpURLConnection httpURLConnection = this.f20579h;
                long j = this.f20583l;
                if (j != -1) {
                    j -= this.f20585n;
                }
                m21311a(httpURLConnection, j);
                try {
                    this.f20580i.close();
                } catch (IOException e) {
                    throw new C8796u(e);
                }
            }
            this.f20580i = null;
            m21315b();
            if (this.f20581j) {
                this.f20581j = false;
                C8788m c8788m = this.f20578g;
                if (c8788m != null) {
                    c8788m.m21310a();
                }
            }
        } catch (Throwable th) {
            this.f20580i = null;
            m21315b();
            if (this.f20581j) {
                this.f20581j = false;
                C8788m c8788m2 = this.f20578g;
                if (c8788m2 != null) {
                    c8788m2.m21310a();
                }
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) throws C8796u {
        try {
            m21316c();
            return m21312a(bArr, i, i2);
        } catch (IOException e) {
            throw new C8796u(e);
        }
    }
}
