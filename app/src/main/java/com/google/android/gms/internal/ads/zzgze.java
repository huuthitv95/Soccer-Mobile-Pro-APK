package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgze {
    public static final FileOutputStream zza(File file, zzgwj zzgwjVar, zzgyv zzgyvVar) throws IOException {
        return new FileOutputStream(file, zzgwjVar.contains(zzgzd.APPEND));
    }
}
