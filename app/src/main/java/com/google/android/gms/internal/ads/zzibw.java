package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzibv;
import com.google.android.gms.internal.ads.zzibw;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzibw<MessageType extends zzibw<MessageType, BuilderType>, BuilderType extends zzibv<MessageType, BuilderType>> implements zzifc {
    protected transient int zzq = 0;

    protected static void zzaV(zzicn zzicnVar) throws IllegalArgumentException {
        if (!zzicnVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    protected static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzibv.zzaT(iterable, list);
    }

    private String zzdV(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 18 + String.valueOf(str).length() + 44);
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzifc
    public zzicn zzaM() {
        try {
            int iZzbr = zzbr();
            zzicn zzicnVar = zzicn.zza;
            byte[] bArr = new byte[iZzbr];
            int i = zzicw.zzb;
            zzict zzictVar = new zzict(bArr, 0, iZzbr);
            zzcX(zzictVar);
            return zzicj.zza(zzictVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdV("ByteString"), e);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i = zzicw.zzb;
            zzict zzictVar = new zzict(bArr, 0, iZzbr);
            zzcX(zzictVar);
            zzictVar.zzI();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdV("byte array"), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifc
    public void zzaO(OutputStream outputStream) throws IOException {
        zzicv zzicvVar = new zzicv(outputStream, zzicw.zzE(zzbr()));
        zzcX(zzicvVar);
        zzicvVar.zzx();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int iZzbr = zzbr();
        zzicv zzicvVar = new zzicv(outputStream, zzicw.zzE(zzicw.zzF(iZzbr) + iZzbr));
        zzicvVar.zzr(iZzbr);
        zzcX(zzicvVar);
        zzicvVar.zzx();
    }

    int zzaQ() {
        throw new UnsupportedOperationException();
    }

    void zzaR(int i) {
        throw new UnsupportedOperationException();
    }

    public zzifh zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    int zzaT(zzifu zzifuVar) {
        return zzaQ();
    }

    zzigg zzaU() {
        return new zzigg(this);
    }
}
