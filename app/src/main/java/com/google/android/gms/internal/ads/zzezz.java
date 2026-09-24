package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezz implements zzfbw {
    private final zzfkm zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzezz(zzfkm zzfkmVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfkmVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        zzfkm zzfkmVar = this.zza;
        ArrayList<String> arrayList = zzfkmVar.zzh;
        Bundle bundle = (Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfkmVar.zzi);
        zzblh zzblhVar = zzfkmVar.zzj;
        if (zzblhVar != null) {
            int i = zzblhVar.zza;
            String str2 = C11744X3.i.f26320C;
            if (i > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i2 = zzblhVar.zzh;
                if (i2 == 1) {
                    str = "any";
                } else if (i2 == 2) {
                    str = C11744X3.i.f26320C;
                } else if (i2 != 3) {
                    str = i2 != 4 ? "unknown" : MessengerShareContentUtility.IMAGE_RATIO_SQUARE;
                } else {
                    str = C11744X3.i.f26322D;
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i3 = zzblhVar.zzc;
            if (i3 == 0) {
                str2 = "any";
            } else if (i3 == 1) {
                str2 = C11744X3.i.f26322D;
            } else if (i3 != 2) {
                str2 = "unknown";
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzblhVar.zzd);
            bundle.putBoolean("use_custom_mute", zzblhVar.zzg);
            int i4 = zzblhVar.zzi;
            if (i4 != 0) {
                bundle.putBoolean("sccg_tap", zzblhVar.zzj);
                bundle.putInt("sccg_dir", i4);
            }
        }
        PackageInfo packageInfo = this.zzb;
        int i5 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i5 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i5);
        }
        JSONObject jSONObjectZzs = zzgVar.zzs();
        String string = null;
        if (jSONObjectZzs != null && (jSONArrayOptJSONArray = jSONObjectZzs.optJSONArray(zzfkmVar.zzg)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i6 = zzfkmVar.zzl;
        if (i6 > 1) {
            bundle.putInt("max_num_ads", i6);
        }
        zzbrp zzbrpVar = zzfkmVar.zzb;
        if (zzbrpVar != null) {
            String str3 = zzbrpVar.zzc;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (zzbrpVar.zza >= 2) {
                    int i7 = zzbrpVar.zzd;
                    if (i7 == 2 || i7 != 3) {
                        str4 = CmcdData.Factory.STREAM_TYPE_LIVE;
                    }
                } else {
                    int i8 = zzbrpVar.zzb;
                    if (i8 == 1) {
                        str4 = CmcdData.Factory.STREAM_TYPE_LIVE;
                    } else if (i8 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 41);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i8);
                        sb.append(" is wrong.");
                        com.google.android.gms.ads.internal.util.client.zzo.zzf(sb.toString());
                        str4 = CmcdData.Factory.STREAM_TYPE_LIVE;
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznn)).booleanValue() || zzblhVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzblhVar.zzf;
        if (zzfwVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzfwVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzfwVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzfwVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzblhVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzblhVar.zze);
    }
}
