package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.internal.C10097aq;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bu */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9996bu {

    /* JADX INFO: renamed from: a */
    private final C10097aq f22107a;

    C9996bu(C10097aq c10097aq) {
        this.f22107a = c10097aq;
    }

    /* JADX INFO: renamed from: a */
    final InputStream m22602a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.await(((InterfaceC10145y) this.f22107a.mo22526a()).mo22516a(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new C10013ck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new C10013ck("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new C10013ck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
