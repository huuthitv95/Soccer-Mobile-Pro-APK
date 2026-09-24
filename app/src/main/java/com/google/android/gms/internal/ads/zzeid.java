package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeid implements zzfny {
    private static final Pattern zzd = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zza;
    private final zzfpi zzb;
    private final zzfps zzc;

    public zzeid(String str, zzfps zzfpsVar, zzfpi zzfpiVar) {
        this.zza = str;
        this.zzc = zzfpsVar;
        this.zzb = zzfpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzedr zzedrVar;
        String strJoin;
        byte[] bArr;
        JSONObject jSONObjectZza;
        String strConcat;
        zzeic zzeicVar = (zzeic) obj;
        int iOptInt = zzeicVar.zza().optInt("http_timeout_millis", 60000);
        zzcat zzcatVarZzb = zzeicVar.zzb();
        if (zzcatVarZzb.zza() != -2) {
            if (zzcatVarZzb.zza() == 1) {
                if (zzcatVarZzb.zzb() != null) {
                    strJoin = TextUtils.join(", ", zzcatVarZzb.zzb());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strJoin);
                } else {
                    strJoin = "";
                }
                String.valueOf(strJoin);
                zzedrVar = new zzedr(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzedrVar = new zzedr(1);
            }
            zzfps zzfpsVar = this.zzc;
            zzfpi zzfpiVar = this.zzb;
            zzfpiVar.zzj(zzedrVar);
            zzfpiVar.zzd(false);
            zzfpsVar.zza(zzfpiVar);
            throw zzedrVar;
        }
        HashMap map = new HashMap();
        if (zzeicVar.zzb().zzg()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbA)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = zzd.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null && (strGroup.toLowerCase(Locale.ROOT).startsWith("id=") || strGroup.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put(HttpHeaders.COOKIE, strConcat);
                    }
                } else {
                    map.put(HttpHeaders.COOKIE, str);
                }
            }
        }
        if (zzeicVar.zzb().zzf() && (jSONObjectZza = zzeicVar.zza()) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectZza.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        byte[] byteArray = new byte[0];
        if (TextUtils.isEmpty(zzeicVar.zzb().zzd())) {
            bArr = byteArray;
        } else {
            byte[] bytes = zzeicVar.zzb().zzd().getBytes(StandardCharsets.UTF_8);
            if (zzeicVar.zzb().zzm()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("gzip compression failed, sending uncompressed.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PrepareRequestFunction.apply");
                    byteArray = null;
                }
                if (byteArray != null) {
                    map.put(HttpHeaders.CONTENT_ENCODING, "gzip");
                    bArr = byteArray;
                }
            }
            bArr = bytes;
        }
        String strZzl = !TextUtils.isEmpty(zzeicVar.zzb().zzl()) ? zzeicVar.zzb().zzl() : "";
        zzfps zzfpsVar2 = this.zzc;
        zzfpi zzfpiVar2 = this.zzb;
        zzfpiVar2.zzd(true);
        zzfpsVar2.zza(zzfpiVar2);
        return new zzehy(zzeicVar.zzb().zze(), iOptInt, map, bArr, strZzl, zzeicVar.zzb().zzf());
    }
}
