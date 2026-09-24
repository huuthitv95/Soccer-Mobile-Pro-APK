package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0;
import com.google.android.material.chip.Chip$$ExternalSyntheticApiModelOutline0;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zztt {
    private static final zzgvz zza = zzgvz.zzj(12);

    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6 A[RETURN] */
    public static zzgvz zza(AudioDeviceInfo audioDeviceInfo) {
        int type;
        zzgvz zzgvzVarZzb;
        zzgvz zzgvzVarZzi;
        int speakerLayoutChannelMask;
        if (!zztm.zza(audioDeviceInfo.getType())) {
            if (audioDeviceInfo.getType() == 1) {
                return zzgvz.zzj(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return zzgvz.zzj(Integer.valueOf(speakerLayoutChannelMask));
                }
                zzef.zzc("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return zza;
            }
            if (Build.VERSION.SDK_INT >= 31 && audioDeviceInfo.getType() == 10) {
                zzgvz zzgvzVarZzb2 = zzb(audioDeviceInfo);
                if (!zzgvzVarZzb2.isEmpty()) {
                    return zzgvzVarZzb2;
                }
                zzgvz zzgvzVarZza = zzqk.zza(audioDeviceInfo.getAudioDescriptors());
                if (!zzgvzVarZza.isEmpty()) {
                    return zzgvzVarZza;
                }
            } else if (Build.VERSION.SDK_INT >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (Build.VERSION.SDK_INT >= 31 && type2 == 29) {
                    zzgvz zzgvzVarZzb3 = zzb(audioDeviceInfo);
                    if (!zzgvzVarZzb3.isEmpty()) {
                        return zzgvzVarZzb3;
                    }
                    List audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (Build.VERSION.SDK_INT >= 34) {
                        if (Build.VERSION.SDK_INT < 34 || audioDescriptors == null) {
                            zzgvzVarZzi = zzgvz.zzi();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorM22326m = Chip$$ExternalSyntheticApiModelOutline0.m22326m(it.next());
                                if (audioDescriptorM22326m.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorM22326m.getDescriptor();
                                    int length = descriptor.length;
                                    if (length != 3) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
                                        sb.append("Invalid SADB length: ");
                                        sb.append(length);
                                        zzef.zzc("AudioDescriptorUtil", sb.toString());
                                    } else {
                                        int i = 0;
                                        if (Build.VERSION.SDK_INT >= 34) {
                                            byte b = descriptor[0];
                                            i = 1 == (b & 1) ? 12 : 0;
                                            if ((b & 2) != 0) {
                                                i |= 32;
                                            }
                                            if ((b & 4) != 0) {
                                                i |= 16;
                                            }
                                            if ((b & 8) != 0) {
                                                i |= 192;
                                            }
                                            if ((b & Ascii.DLE) != 0) {
                                                i |= 1024;
                                            }
                                            if ((b & 32) != 0) {
                                                i |= ViewUtils.EDGE_TO_EDGE_FLAGS;
                                            }
                                            if ((b & 128) != 0) {
                                                i |= 201326592;
                                            }
                                            byte b2 = descriptor[1];
                                            if ((b2 & 1) != 0) {
                                                i |= 81920;
                                            }
                                            if ((b2 & 2) != 0) {
                                                i |= 8192;
                                            }
                                            if ((b2 & 4) != 0) {
                                                i |= 32768;
                                            }
                                            if ((b2 & 8) != 0) {
                                                i |= 6144;
                                            }
                                            if ((b2 & Ascii.DLE) != 0) {
                                                i |= 33554432;
                                            }
                                            if ((b2 & 32) != 0) {
                                                i |= 262144;
                                            }
                                            if ((b2 & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                                                i |= 6144;
                                            }
                                            if ((b2 & 128) != 0) {
                                                i |= 3145728;
                                            }
                                            byte b3 = descriptor[2];
                                            if ((b3 & 1) != 0) {
                                                i |= 655360;
                                            }
                                            if ((b3 & 2) != 0) {
                                                i = 8388608 | i;
                                            }
                                            if ((b3 & 4) != 0) {
                                                i |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i));
                                    }
                                }
                            }
                            arrayList.sort(zzqi.zza);
                            zzgvzVarZzi = zzgvz.zzq(arrayList);
                        }
                        if (!zzgvzVarZzi.isEmpty()) {
                            return zzgvzVarZzi;
                        }
                    }
                    zzgvz zzgvzVarZza2 = zzqk.zza(audioDescriptors);
                    if (!zzgvzVarZza2.isEmpty()) {
                        return zzgvzVarZza2;
                    }
                } else if (Build.VERSION.SDK_INT >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (Build.VERSION.SDK_INT >= 31 && type == 22))) {
                    zzgvzVarZzb = zzb(audioDeviceInfo);
                    if (!zzgvzVarZzb.isEmpty()) {
                        return zzgvzVarZzb;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 31) {
                zzgvzVarZzb = zzb(audioDeviceInfo);
                if (!zzgvzVarZzb.isEmpty()) {
                    return zzgvzVarZzb;
                }
            }
        }
        return zza;
    }

    private static zzgvz zzb(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzts.zza).reversed());
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileM426m = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m426m(it.next());
            if (audioProfileM426m.getEncapsulationType() != 1 && zzfk.zzC(audioProfileM426m.getFormat())) {
                for (int i : audioProfileM426m.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return zzgvz.zzq(treeSet);
    }
}
