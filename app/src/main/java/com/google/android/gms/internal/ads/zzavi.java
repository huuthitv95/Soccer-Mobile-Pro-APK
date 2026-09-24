package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzavi implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzavj zzavjVar = (zzavj) obj;
        zzavj zzavjVar2 = (zzavj) obj2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzavjVar.zza.length;
            if (i >= length || i2 >= zzavjVar2.zza.length) {
                break;
            }
            int iCompare = Integer.compare(zzavj.zzg(zzavjVar.zzb(i)), zzavj.zzg(zzavjVar2.zzb(i2)));
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
            i2++;
        }
        return Integer.compare(length, zzavjVar2.zza.length);
    }
}
