package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzatm implements zzasq {
    protected final zzato zza;
    private final zzatl zzb;

    public zzatm(zzatl zzatlVar) {
        zzato zzatoVar = new zzato(4096);
        this.zzb = zzatlVar;
        this.zza = zzatoVar;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:138:0x024d  */
    /* JADX WARN: Code duplicated, block: B:174:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0289 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzasq
    public zzast zza(zzasx zzasxVar) throws Throwable {
        char c;
        zzatv zzatvVar;
        byte[] bArr;
        int iZza;
        zzatg zzassVar;
        String str;
        zzast zzastVar;
        int iZzo;
        Map map;
        byte[] byteArray;
        byte[] bArrZza;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List list = Collections.EMPTY_LIST;
            char c2 = 0;
            try {
                zzasg zzasgVarZzk = zzasxVar.zzk();
                if (zzasgVarZzk == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str2 = zzasgVarZzk.zzb;
                    if (str2 != null) {
                        map2.put(HttpHeaders.IF_NONE_MATCH, str2);
                    }
                    long j = zzasgVarZzk.zzd;
                    if (j > 0) {
                        map2.put(HttpHeaders.IF_MODIFIED_SINCE, zzatu.zzc(j));
                    }
                    map = map2;
                }
                zzatv zzatvVarZza = this.zzb.zza(zzasxVar, map);
                try {
                    int iZza2 = zzatvVarZza.zza();
                    List listZzb = zzatvVarZza.zzb();
                    if (iZza2 == 304) {
                        try {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            zzasg zzasgVarZzk2 = zzasxVar.zzk();
                            if (zzasgVarZzk2 == null) {
                                return new zzast(304, (byte[]) null, true, jElapsedRealtime2, listZzb);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listZzb.isEmpty()) {
                                Iterator it = listZzb.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((zzasp) it.next()).zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(listZzb);
                            List list2 = zzasgVarZzk2.zzh;
                            if (list2 != null) {
                                if (!list2.isEmpty()) {
                                    for (zzasp zzaspVar : zzasgVarZzk2.zzh) {
                                        if (!treeSet.contains(zzaspVar.zza())) {
                                            arrayList.add(zzaspVar);
                                        }
                                    }
                                }
                            } else if (!zzasgVarZzk2.zzg.isEmpty()) {
                                for (Map.Entry entry : zzasgVarZzk2.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        c = 1;
                                        try {
                                            arrayList.add(new zzasp((String) entry.getKey(), (String) entry.getValue()));
                                        } catch (IOException e) {
                                            e = e;
                                        }
                                    }
                                }
                            }
                            return new zzast(304, zzasgVarZzk2.zza, true, jElapsedRealtime2, (List) arrayList);
                        } catch (IOException e2) {
                            e = e2;
                            c = 1;
                        }
                    } else {
                        c = 1;
                        InputStream inputStreamZzd = zzatvVarZza.zzd();
                        if (inputStreamZzd != null) {
                            int iZzc = zzatvVarZza.zzc();
                            zzato zzatoVar = this.zza;
                            zzatz zzatzVar = new zzatz(zzatoVar, iZzc);
                            try {
                                bArrZza = zzatoVar.zza(1024);
                                while (true) {
                                    try {
                                        int i = inputStreamZzd.read(bArrZza);
                                        if (i == -1) {
                                            break;
                                        }
                                        zzatzVar.write(bArrZza, 0, i);
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            inputStreamZzd.close();
                                        } catch (IOException unused) {
                                            zzatj.zza("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        zzatoVar.zzb(bArrZza);
                                        zzatzVar.close();
                                        throw th;
                                    }
                                }
                                byteArray = zzatzVar.toByteArray();
                                try {
                                    inputStreamZzd.close();
                                } catch (IOException unused2) {
                                    zzatj.zza("Error occurred when closing InputStream", new Object[0]);
                                }
                                zzatoVar.zzb(bArrZza);
                                zzatzVar.close();
                            } catch (Throwable th2) {
                                th = th2;
                                bArrZza = null;
                            }
                        } else {
                            byteArray = new byte[0];
                        }
                        byte[] bArr2 = byteArray;
                        try {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (zzatj.zzb || jElapsedRealtime3 > 3000) {
                                c2 = 0;
                                try {
                                    zzatj.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzasxVar, Long.valueOf(jElapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : AbstractJsonLexerKt.NULL, Integer.valueOf(iZza2), Integer.valueOf(zzasxVar.zzy().zzb()));
                                } catch (IOException e3) {
                                    e = e3;
                                    zzatvVar = zzatvVarZza;
                                    bArr = bArr2;
                                    if (e instanceof SocketTimeoutException) {
                                        zzassVar = new zzatf();
                                        str = "socket";
                                    } else {
                                        if (!(e instanceof MalformedURLException)) {
                                            String strZzh = zzasxVar.zzh();
                                            String.valueOf(strZzh);
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(strZzh)), e);
                                        }
                                        if (zzatvVar != null) {
                                            throw new zzasu(e);
                                        }
                                        iZza = zzatvVar.zza();
                                        Integer numValueOf = Integer.valueOf(iZza);
                                        String strZzh2 = zzasxVar.zzh();
                                        Object[] objArr = new Object[2];
                                        objArr[c2] = numValueOf;
                                        objArr[c] = strZzh2;
                                        zzatj.zzc("Unexpected response code %d for %s", objArr);
                                        if (bArr != null) {
                                            zzastVar = new zzast(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzatvVar.zzb());
                                            if (iZza == 401) {
                                            }
                                            zzassVar = new zzasf(zzastVar);
                                            str = "auth";
                                        } else {
                                            zzassVar = new zzass();
                                            str = "network";
                                        }
                                    }
                                    zzasl zzaslVarZzy = zzasxVar.zzy();
                                    iZzo = zzasxVar.zzo();
                                    zzaslVarZzy.zzc(zzassVar);
                                    Integer numValueOf2 = Integer.valueOf(iZzo);
                                    Object[] objArr2 = new Object[2];
                                    objArr2[c2] = str;
                                    objArr2[c] = numValueOf2;
                                    zzasxVar.zzc(String.format("%s-retry [timeout=%s]", objArr2));
                                }
                            }
                            if (iZza2 < 200 || iZza2 > 299) {
                                throw new IOException();
                            }
                            return new zzast(iZza2, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzb);
                        } catch (IOException e4) {
                            e = e4;
                            c2 = 0;
                        }
                    }
                    e = e;
                } catch (IOException e5) {
                    e = e5;
                    c = 1;
                }
                zzatvVar = zzatvVarZza;
            } catch (IOException e6) {
                e = e6;
                c2 = 0;
                c = 1;
                zzatvVar = null;
            }
            bArr = null;
            if (e instanceof SocketTimeoutException) {
                zzassVar = new zzatf();
                str = "socket";
            } else {
                if (!(e instanceof MalformedURLException)) {
                    String strZzh3 = zzasxVar.zzh();
                    String.valueOf(strZzh3);
                    throw new RuntimeException("Bad URL ".concat(String.valueOf(strZzh3)), e);
                }
                if (zzatvVar != null) {
                    throw new zzasu(e);
                }
                iZza = zzatvVar.zza();
                Integer numValueOf3 = Integer.valueOf(iZza);
                String strZzh4 = zzasxVar.zzh();
                Object[] objArr3 = new Object[2];
                objArr3[c2] = numValueOf3;
                objArr3[c] = strZzh4;
                zzatj.zzc("Unexpected response code %d for %s", objArr3);
                if (bArr != null) {
                    zzastVar = new zzast(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzatvVar.zzb());
                    if (iZza == 401 && iZza != 403) {
                        if (iZza < 400 || iZza > 499) {
                            throw new zzate(zzastVar);
                        }
                        throw new zzask(zzastVar);
                    }
                    zzassVar = new zzasf(zzastVar);
                    str = "auth";
                } else {
                    zzassVar = new zzass();
                    str = "network";
                }
            }
            zzasl zzaslVarZzy2 = zzasxVar.zzy();
            iZzo = zzasxVar.zzo();
            try {
                zzaslVarZzy2.zzc(zzassVar);
                Integer numValueOf4 = Integer.valueOf(iZzo);
                Object[] objArr4 = new Object[2];
                objArr4[c2] = str;
                objArr4[c] = numValueOf4;
                zzasxVar.zzc(String.format("%s-retry [timeout=%s]", objArr4));
            } catch (zzatg e7) {
                Integer numValueOf5 = Integer.valueOf(iZzo);
                Object[] objArr5 = new Object[2];
                objArr5[c2] = str;
                objArr5[c] = numValueOf5;
                zzasxVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", objArr5));
                throw e7;
            }
        }
    }
}
