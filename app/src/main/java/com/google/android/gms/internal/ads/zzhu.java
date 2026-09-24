package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhu extends zzhb implements zzic {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzib zze;
    private final zzib zzf;
    private zzhn zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzhu(String str, int i, int i2, boolean z, boolean z2, zzib zzibVar, zzgsx zzgsxVar, boolean z3, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzibVar;
        this.zzf = new zzib();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0) {
            sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.zzd;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i2 = zzhn.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhn zzhnVar) throws zzhy {
        if (str == null) {
            throw new zzhy("Null location redirect", zzhnVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                String.valueOf(protocol);
                throw new zzhy("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhnVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + String.valueOf(protocol).length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzhy(sb.toString(), zzhnVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzhy(e, zzhnVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzef.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzhy {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.zzi;
            String str = zzfk.zza;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.zzm += (long) i3;
            zzh(i3);
            return i3;
        } catch (IOException e) {
            zzhn zzhnVar = this.zzg;
            String str2 = zzfk.zza;
            throw zzhy.zza(e, zzhnVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    @Override // com.google.android.gms.internal.ads.zzhj
    public final long zzb(zzhn zzhnVar) throws zzhy {
        zzhu zzhuVar;
        long j;
        int i;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j2;
        zzhu zzhuVar2 = this;
        zzhuVar2.zzg = zzhnVar;
        long j3 = 0;
        zzhuVar2.zzm = 0L;
        zzhuVar2.zzl = 0L;
        zzf(zzhnVar);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            URL url = new URL(zzhnVar.zza.toString());
            int i2 = zzhnVar.zzb;
            byte[] bArr = zzhnVar.zzc;
            long j4 = zzhnVar.zze;
            long j5 = zzhnVar.zzf;
            boolean zZza = zzhnVar.zza(1);
            int i3 = 0;
            try {
                if (zzhuVar2.zza) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i3 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i5);
                            throw new zzhy(new NoRouteToHostException(sb.toString()), zzhnVar, 2001, 1);
                        }
                        j = j3;
                        i = i4;
                        zzhuVar2 = this;
                        HttpURLConnection httpURLConnectionZzk2 = zzhuVar2.zzk(url, 1, null, j4, j5, zZza, false, zzhnVar.zzd);
                        URL url2 = url;
                        long j6 = j5;
                        zzhuVar = zzhuVar2;
                        try {
                            int responseCode = httpURLConnectionZzk2.getResponseCode();
                            String headerField = httpURLConnectionZzk2.getHeaderField(HttpHeaders.LOCATION);
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnectionZzk = httpURLConnectionZzk2;
                                break;
                            }
                            httpURLConnectionZzk2.disconnect();
                            URL urlZzl = zzhuVar.zzl(url2, headerField, zzhnVar);
                            j5 = j6;
                            url = urlZzl;
                            i4 = i;
                            i3 = i5;
                            j3 = j;
                        } catch (IOException e) {
                            e = e;
                        }
                        zzhuVar.zzm();
                        throw zzhy.zza(e, zzhnVar, 1);
                    }
                }
                httpURLConnectionZzk = zzhuVar2.zzk(url, 1, null, j4, j5, zZza, true, zzhnVar.zzd);
                zzhuVar = this;
                j = 0;
                i = 0;
                zzhuVar.zzh = httpURLConnectionZzk;
                zzhuVar.zzk = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i6 = zzhuVar.zzk;
                if (i6 < 200 || i6 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (zzhuVar.zzk == 416) {
                        if (zzhnVar.zze == zzid.zza(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                            zzhuVar.zzj = true;
                            zzg(zzhnVar);
                            long j7 = zzhnVar.zzf;
                            return j7 != -1 ? j7 : j;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzgyz.zza(errorStream) : zzfk.zzb;
                    } catch (IOException unused) {
                        bArrZza = zzfk.zzb;
                    }
                    zzhuVar.zzm();
                    throw new zzia(zzhuVar.zzk, responseMessage, zzhuVar.zzk == 416 ? new zzhk(2008) : null, headerFields, zzhnVar, bArrZza);
                }
                httpURLConnectionZzk.getContentType();
                if (zzhuVar.zzk == 200) {
                    j2 = zzhnVar.zze;
                    if (j2 == j) {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                if (zEqualsIgnoreCase) {
                    zzhuVar.zzl = zzhnVar.zzf;
                } else {
                    long j8 = zzhnVar.zzf;
                    if (j8 != -1) {
                        zzhuVar.zzl = j8;
                    } else {
                        long jZzb = zzid.zzb(httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnectionZzk.getHeaderField(HttpHeaders.CONTENT_RANGE));
                        zzhuVar.zzl = jZzb != -1 ? jZzb - j2 : -1L;
                    }
                }
                try {
                    zzhuVar.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        zzhuVar.zzi = new GZIPInputStream(zzhuVar.zzi);
                    }
                    zzhuVar.zzj = true;
                    zzg(zzhnVar);
                    if (j2 != j) {
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (j2 > j) {
                                int iMin = (int) Math.min(j2, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                                InputStream inputStream = zzhuVar.zzi;
                                String str = zzfk.zza;
                                int i7 = inputStream.read(bArr2, i, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhy(new InterruptedIOException(), zzhnVar, 2000, 1);
                                }
                                if (i7 == -1) {
                                    throw new zzhy(zzhnVar, 2008, 1);
                                }
                                j2 -= (long) i7;
                                zzhuVar.zzh(i7);
                            }
                        } catch (IOException e2) {
                            zzhuVar.zzm();
                            if (e2 instanceof zzhy) {
                                throw ((zzhy) e2);
                            }
                            throw new zzhy(e2, zzhnVar, 2000, 1);
                        }
                    }
                    return zzhuVar.zzl;
                } catch (IOException e3) {
                    zzhuVar.zzm();
                    throw new zzhy(e3, zzhnVar, 2000, 1);
                }
            } catch (IOException e4) {
                e = e4;
                zzhuVar = this;
            }
        } catch (IOException e5) {
            e = e5;
            zzhuVar = zzhuVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhn zzhnVar = this.zzg;
        if (zzhnVar != null) {
            return zzhnVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() throws zzhy {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhn zzhnVar = this.zzg;
                    String str = zzfk.zza;
                    throw new zzhy(e, zzhnVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhj
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgwc.zza() : new zzht(httpURLConnection.getHeaderFields());
    }
}
