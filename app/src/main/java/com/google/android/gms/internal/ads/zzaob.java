package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaob {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzaoh zzf;
    public final String zzg;
    public final String zzh;
    public final zzaob zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzaob zza(String str) {
        return new zzaob(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzaob zzb(String str, long j, long j2, zzaoh zzaohVar, String[] strArr, String str2, String str3, zzaob zzaobVar) {
        return new zzaob(str, null, j, j2, zzaohVar, strArr, str2, str3, zzaobVar);
    }

    private final void zzi(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        if (z || zEquals || ("div".equals(str) && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzaob zzaobVar = (zzaob) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                zzaobVar.zzi(treeSet, z2);
            }
        }
    }

    private final void zzj(long j, String str, List list) {
        String str2;
        String str3 = this.zzg;
        boolean zEquals = "".equals(str3);
        boolean zZzc = zzc(j);
        if (true != zEquals) {
            str = str3;
        }
        if (zZzc && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zzf(); i++) {
            zze(i).zzj(j, str, list);
        }
    }

    private final void zzk(long j, boolean z, String str, Map map) {
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzcw) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < zzf(); i++) {
                zze(i).zzk(j, z || zEquals, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzcw) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcw zzcwVar = new zzcw();
            zzcwVar.zza(new SpannableStringBuilder());
            map.put(str, zzcwVar);
        }
        CharSequence charSequenceZzb = ((zzcw) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }

    private final void zzm(long j, Map map, Map map2, String str, Map map3) {
        zzaob zzaobVar;
        zzaoh zzaohVarZza;
        boolean z;
        int i;
        Map map4 = map;
        if (zzc(j)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.zzk;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcw zzcwVar = (zzcw) map3.get(str4);
                    zzcwVar.getClass();
                    zzaof zzaofVar = (zzaof) map2.get(str3);
                    zzaofVar.getClass();
                    int i2 = zzaofVar.zzj;
                    zzaoh zzaohVarZza2 = zzaog.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcwVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcwVar.zza(spannableStringBuilder);
                    }
                    if (zzaohVarZza2 != null) {
                        zzaob zzaobVar2 = this.zzi;
                        if (zzaohVarZza2.zza() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzaohVarZza2.zza()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzl()) {
                            zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzaohVarZza2.zzj()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzo()) {
                            zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzaohVarZza2.zzm()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzh() != null) {
                            zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzaohVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzE() != null) {
                            zzaoa zzaoaVarZzE = zzaohVarZza2.zzE();
                            zzaoaVarZzE.getClass();
                            int i3 = zzaoaVarZzE.zza;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = zzaoaVarZzE.zzb;
                            }
                            int i4 = zzaoaVarZzE.zzc;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            zzdd.zza(spannableStringBuilder, new zzde(i3, i, i4), iIntValue, iIntValue2, 33);
                        }
                        int iZzv = zzaohVarZza2.zzv();
                        if (iZzv == 2) {
                            while (true) {
                                if (zzaobVar2 == null) {
                                    zzaobVar2 = null;
                                    break;
                                }
                                zzaoh zzaohVarZza3 = zzaog.zza(zzaobVar2.zzf, zzaobVar2.zzj, map4);
                                if (zzaohVarZza3 != null && zzaohVarZza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzaobVar2 = zzaobVar2.zzi;
                                }
                            }
                            if (zzaobVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzaobVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzaobVar = null;
                                        break;
                                    }
                                    zzaob zzaobVar3 = (zzaob) arrayDeque.pop();
                                    zzaoh zzaohVarZza4 = zzaog.zza(zzaobVar3.zzf, zzaobVar3.zzj, map4);
                                    if (zzaohVarZza4 != null && zzaohVarZza4.zzv() == 3) {
                                        zzaobVar = zzaobVar3;
                                        break;
                                    }
                                    for (int iZzf = zzaobVar3.zzf() - 1; iZzf >= 0; iZzf--) {
                                        arrayDeque.push(zzaobVar3.zze(iZzf));
                                    }
                                }
                                if (zzaobVar != null) {
                                    if (zzaobVar.zzf() != 1 || zzaobVar.zze(0).zzb == null) {
                                        zzef.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzaobVar.zze(0).zzb;
                                        String str6 = zzfk.zza;
                                        zzaoh zzaohVarZza5 = zzaog.zza(zzaobVar.zzf, zzaobVar.zzj, map4);
                                        int iZzx = zzaohVarZza5 != null ? zzaohVarZza5.zzx() : -1;
                                        if (iZzx == -1 && (zzaohVarZza = zzaog.zza(zzaobVar2.zzf, zzaobVar2.zzj, map4)) != null) {
                                            iZzx = zzaohVarZza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzdc(str5, iZzx), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzv == 3 || iZzv == 4) {
                            spannableStringBuilder.setSpan(new zzanz(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzC()) {
                            zzdd.zza(spannableStringBuilder, new zzdb(), iIntValue, iIntValue2, 33);
                        }
                        int iZzI = zzaohVarZza2.zzI();
                        if (iZzI != 1) {
                            if (iZzI == 2) {
                                zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaohVarZza2.zzJ()), iIntValue, iIntValue2, 33);
                            } else if (iZzI == 3) {
                                zzdd.zzb(spannableStringBuilder, zzaohVarZza2.zzJ() / 100.0f, iIntValue, iIntValue2, 33);
                            }
                            z = true;
                        } else {
                            z = true;
                            zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaohVarZza2.zzJ(), true), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzaohVarZza2.zzq() != Float.MAX_VALUE) {
                                zzcwVar.zzp((zzaohVarZza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zzaohVarZza2.zzy() != null) {
                                zzcwVar.zzd(zzaohVarZza2.zzy());
                            }
                            if (zzaohVarZza2.zzA() != null) {
                                zzcwVar.zze(zzaohVarZza2.zzA());
                            }
                        }
                        it = it;
                    }
                }
            }
            int i5 = 0;
            while (i5 < zzf()) {
                zze(i5).zzm(j, map4, map2, str3, map3);
                i5++;
                map4 = map;
            }
        }
    }

    public final boolean zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final void zzd(zzaob zzaobVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaobVar);
    }

    public final zzaob zze(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzaob) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final List zzh(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j, false, str, treeMap);
        zzm(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzaof zzaofVar = (zzaof) map2.get(pair.first);
                zzaofVar.getClass();
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(bitmapDecodeByteArray);
                zzcwVar.zzi(zzaofVar.zzb);
                zzcwVar.zzj(0);
                zzcwVar.zzf(zzaofVar.zzc, 0);
                zzcwVar.zzg(zzaofVar.zze);
                zzcwVar.zzm(zzaofVar.zzf);
                zzcwVar.zzn(zzaofVar.zzg);
                zzcwVar.zzo(zzaofVar.zzj);
                arrayList2.add(zzcwVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzaof zzaofVar2 = (zzaof) map2.get(entry.getKey());
            zzaofVar2.getClass();
            zzcw zzcwVar2 = (zzcw) entry.getValue();
            CharSequence charSequenceZzb = zzcwVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzanz zzanzVar : (zzanz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzanz.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzanzVar), spannableStringBuilder.getSpanEnd(zzanzVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcwVar2.zzf(zzaofVar2.zzc, zzaofVar2.zzd);
            zzcwVar2.zzg(zzaofVar2.zze);
            zzcwVar2.zzi(zzaofVar2.zzb);
            zzcwVar2.zzm(zzaofVar2.zzf);
            zzcwVar2.zzl(zzaofVar2.zzi, zzaofVar2.zzh);
            zzcwVar2.zzo(zzaofVar2.zzj);
            arrayList2.add(zzcwVar2.zzr());
        }
        return arrayList2;
    }

    private zzaob(String str, String str2, long j, long j2, zzaoh zzaohVar, String[] strArr, String str3, String str4, zzaob zzaobVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaohVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaobVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
