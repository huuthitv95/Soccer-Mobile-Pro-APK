package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgzh implements FilenameFilter {
    private final Pattern zza;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }

    public zzgzh(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
