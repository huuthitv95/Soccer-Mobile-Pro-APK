package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.os.Build;
import com.google.android.material.chip.Chip$$ExternalSyntheticApiModelOutline0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzqk {
    public static zzgvz zza(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return zzgvz.zzi();
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzqj.zza).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorM22326m = Chip$$ExternalSyntheticApiModelOutline0.m22326m(it.next());
            if (audioDescriptorM22326m.getStandard() == 1) {
                byte[] descriptor = audioDescriptorM22326m.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 20);
                    sb.append("Invalid SAD length: ");
                    sb.append(length);
                    zzef.zzc("AudioDescriptorUtil", sb.toString());
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zzfk.zzD(i)));
                    }
                }
            }
        }
        return zzgvz.zzq(treeSet);
    }
}
