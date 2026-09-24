package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgak implements Serializer {
    public static final zzgak zza = new zzgak();
    private static final zzgah zzb;

    static {
        zzgah zzgahVarZzd = zzgah.zzd();
        Intrinsics.checkNotNullExpressionValue(zzgahVarZzd, "getDefaultInstance(...)");
        zzb = zzgahVarZzd;
    }

    private zzgak() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) {
        try {
            zzgah zzgahVarZzc = zzgah.zzc(inputStream);
            Intrinsics.checkNotNull(zzgahVarZzc);
            return zzgahVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        ((zzgah) obj).zzaO(outputStream);
        return Unit.INSTANCE;
    }
}
