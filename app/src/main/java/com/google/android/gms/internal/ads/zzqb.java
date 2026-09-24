package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0;
import com.ironsource.C11744X3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqb {
    public static final zzqb zza;
    static final zzgwc zzb;
    private static final zzgvz zzc;
    private static final zzgvz zzd;
    private static final zzgvz zze;
    private final SparseArray zzf = new SparseArray();
    private final int zzg;
    private final zzgvz zzh;
    private final zzgvz zzi;

    static {
        zzgvz zzgvzVarZzj = zzgvz.zzj(12);
        zzc = zzgvzVarZzj;
        zzgvz zzgvzVarZzi = zzgvz.zzi();
        zzd = zzgvzVarZzi;
        zza = new zzqb(zzgvz.zzj(zzqa.zza), zzgvzVarZzj, zzgvzVarZzi);
        zze = zzgvz.zzl(2, 5, 6);
        zzgwb zzgwbVar = new zzgwb();
        zzgwbVar.zza(5, 6);
        zzgwbVar.zza(17, 6);
        zzgwbVar.zza(7, 6);
        zzgwbVar.zza(30, 10);
        zzgwbVar.zza(18, 6);
        zzgwbVar.zza(6, 8);
        zzgwbVar.zza(8, 8);
        zzgwbVar.zza(14, 8);
        zzb = zzgwbVar.zzc();
    }

    private zzqb(List list, List list2, List list3) {
        for (int i = 0; i < list.size(); i++) {
            zzqa zzqaVar = (zzqa) list.get(i);
            this.zzf.put(zzqaVar.zzb, zzqaVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            iMax = Math.max(iMax, ((zzqa) this.zzf.valueAt(i2)).zzc);
        }
        this.zzg = iMax;
        this.zzh = zzgvz.zzq(list2);
        this.zzi = zzgvz.zzq(list3);
    }

    static zzqb zza(Context context, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo, list);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    static zzqb zzb(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManagerZza = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List audioDevicesForAttributes = audioManagerZza.getAudioDevicesForAttributes(zzdVar.zza());
                if (audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = null;
                } else {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            } else {
                audioDeviceInfo = null;
            }
        }
        zzgvz zzgvzVarZza = audioDeviceInfo != null ? zztt.zza(audioDeviceInfo) : zzc;
        if (Build.VERSION.SDK_INT >= 33 && (zzfk.zzO(context) || zzfk.zzP(context))) {
            List directProfilesForAttributes = audioManagerZza.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzgzt.zzg(12)));
            for (int i = 0; i < directProfilesForAttributes.size(); i++) {
                AudioProfile audioProfileM426m = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m426m(directProfilesForAttributes.get(i));
                if (audioProfileM426m.getEncapsulationType() != 1) {
                    int format = audioProfileM426m.getFormat();
                    if (zzfk.zzC(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzgzt.zzg(audioProfileM426m.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzgzt.zzg(audioProfileM426m.getChannelMasks())));
                        }
                    }
                }
            }
            int i2 = zzgvz.zzd;
            zzgvw zzgvwVar = new zzgvw();
            for (Map.Entry entry : map.entrySet()) {
                zzgvwVar.zzf(new zzqa(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzqb(zzgvwVar.zzi(), zzgvzVarZza, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerZza.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (zztm.zza(audioDeviceInfo2.getType())) {
                return new zzqb(zzgvz.zzj(zzqa.zza), zzgvzVarZza, list);
            }
        }
        zzgwi zzgwiVar = new zzgwi();
        zzgwiVar.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfk.zzO(context) || zzfk.zzP(context))) {
            int i3 = zzgvz.zzd;
            zzgvw zzgvwVar2 = new zzgvw();
            zzgyn it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= zzfk.zzE(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzdVar.zza())) {
                    zzgvwVar2.zzf(num);
                }
            }
            zzgvwVar2.zzf((Object) 2);
            zzgwiVar.zzg(zzgvwVar2.zzi());
            return new zzqb(zzh(zzgzt.zzf(zzgwiVar.zzh()), 10), zzgvzVarZza, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || zzg()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgwiVar.zzg(zze);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzqb(zzh(zzgzt.zzf(zzgwiVar.zzh()), 10), zzgvzVarZza, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgwiVar.zzg(zzgzt.zzg(intArrayExtra));
        }
        return new zzqb(zzh(zzgzt.zzf(zzgwiVar.zzh()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), zzgvzVarZza, list);
    }

    static Uri zzc() {
        if (zzg()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean zzg() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    private static zzgvz zzh(int[] iArr, int i) {
        int i2 = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            zzgvwVar.zzf(new zzqa(i3, i));
        }
        return zzgvwVar.zzi();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqb)) {
            return false;
        }
        zzqb zzqbVar = (zzqb) obj;
        SparseArray sparseArray = this.zzf;
        SparseArray sparseArray2 = zzqbVar.zzf;
        String str = zzfk.zza;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                    }
                }
                if (this.zzg != zzqbVar.zzg) {
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zzg != zzqbVar.zzg && Objects.equals(this.zzh, zzqbVar.zzh) && Objects.equals(this.zzi, zzqbVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfk.zza;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzf;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + Objects.hashCode(sparseArray.valueAt(i2));
            }
            iContentHashCode = iKeyAt;
        }
        return (((((this.zzg * 31) + iContentHashCode) * 31) + Objects.hashCode(this.zzh)) * 31) + Objects.hashCode(this.zzi);
    }

    public final String toString() {
        zzgvz zzgvzVar = this.zzi;
        zzgvz zzgvzVar2 = this.zzh;
        String string = this.zzf.toString();
        String strValueOf = String.valueOf(zzgvzVar2);
        String strValueOf2 = String.valueOf(zzgvzVar);
        int i = this.zzg;
        int length = String.valueOf(i).length();
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + String.valueOf(strValueOf).length() + 26 + String.valueOf(strValueOf2).length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(string);
        sb.append(", speakerLayoutChannelMasks=");
        sb.append(strValueOf);
        sb.append(", spatializerChannelMasks=");
        sb.append(strValueOf2);
        sb.append(C11744X3.j.f26440e);
        return sb.toString();
    }

    public final zzgvz zzd() {
        return this.zzh;
    }

    public final zzgvz zze() {
        return this.zzi;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d A[PHI: r1
  0x003d: PHI (r1v5 int) = (r1v4 int), (r1v9 int) binds: [B:11:0x002f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    public final Pair zzf(zzv zzvVar, zzd zzdVar) {
        String str = zzvVar.zzp;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZzg))) {
            return null;
        }
        int i = 6;
        if (iZzg != 18) {
            if (iZzg != 8) {
                if (iZzg == 30 && !zzfk.zza(this.zzf, 30)) {
                    iZzg = 7;
                }
            } else if (zzfk.zza(this.zzf, 8)) {
                iZzg = 8;
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else {
                iZzg = 7;
            }
        } else if (zzfk.zza(this.zzf, 18)) {
            iZzg = 18;
            if (iZzg != 8) {
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else if (zzfk.zza(this.zzf, 8)) {
                iZzg = 8;
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else {
                iZzg = 7;
            }
        } else {
            iZzg = 6;
        }
        SparseArray sparseArray = this.zzf;
        if (!zzfk.zza(sparseArray, iZzg)) {
            return null;
        }
        zzqa zzqaVar = (zzqa) sparseArray.get(iZzg);
        zzqaVar.getClass();
        int iZzb = zzvVar.zzH;
        if (iZzb == -1 || iZzg == 18) {
            int i2 = zzvVar.zzI;
            if (i2 == -1) {
                i2 = 48000;
            }
            iZzb = zzqaVar.zzb(i2, zzdVar);
        } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!zzqaVar.zza(iZzb)) {
                return null;
            }
        } else if (iZzb > 10) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 28) {
            i = iZzb;
        } else if (iZzb == 7) {
            i = 8;
        } else if (iZzb != 3 && iZzb != 4 && iZzb != 5) {
            i = iZzb;
        }
        if (Build.VERSION.SDK_INT <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iZzD = zzfk.zzD(i);
        if (iZzD != 0) {
            return Pair.create(Integer.valueOf(iZzg), Integer.valueOf(iZzD));
        }
        return null;
    }
}
