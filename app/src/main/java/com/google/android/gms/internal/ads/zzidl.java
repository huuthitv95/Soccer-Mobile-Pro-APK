package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzidl;
import com.google.android.gms.internal.ads.zzidr;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzidl<MessageType extends zzidr<MessageType, BuilderType>, BuilderType extends zzidl<MessageType, BuilderType>> extends zzibv<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzidl(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzifm.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    /* JADX INFO: renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzibv zzbd(zzicr zzicrVar, zzidb zzidbVar) throws IOException {
        zzbr(zzicrVar, zzidbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    /* JADX INFO: renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzibv zzaZ(byte[] bArr, int i, int i2) throws zzieg {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzibv zzaX(byte[] bArr, int i, int i2, zzidb zzidbVar) throws zzieg {
        zzbp(bArr, i, i2, zzidbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    protected /* bridge */ /* synthetic */ zzibv zzaQ(zzibw zzibwVar) {
        zzbn((zzidr) zzibwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    public /* bridge */ /* synthetic */ zzifb zzaX(byte[] bArr, int i, int i2, zzidb zzidbVar) throws zzieg {
        zzbp(bArr, i, i2, zzidbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    public /* bridge */ /* synthetic */ zzifb zzaZ(byte[] bArr, int i, int i2) throws zzieg {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    public /* bridge */ /* synthetic */ zzifb zzbd(zzicr zzicrVar, zzidb zzidbVar) throws IOException {
        zzbr(zzicrVar, zzidbVar);
        return this;
    }

    protected final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    protected void zzbh() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzifd
    public final boolean zzbi() {
        return zzidr.zzg(this.zza, false);
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzibv
    /* JADX INFO: renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzcY();
        buildertype.zza = (MessageType) zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzifb
    /* JADX INFO: renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* JADX INFO: renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType messagetype = (MessageType) zzbt();
        if (messagetype.zzbi()) {
            return messagetype;
        }
        throw zzaR(messagetype);
    }

    protected BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i, int i2, zzidb zzidbVar) throws zzieg {
        zzbg();
        try {
            zzifm.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i, i + i2, new zzicb(zzidbVar));
            return this;
        } catch (zzieg e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i, int i2) throws zzieg {
        int i3 = zzidb.zzb;
        int i4 = zzica.zza;
        zzbp(bArr, i, i2, zzidb.zza);
        return this;
    }

    public BuilderType zzbr(zzicr zzicrVar, zzidb zzidbVar) throws IOException {
        zzbg();
        try {
            zzifm.zza().zzb(this.zza.getClass()).zzg(this.zza, zzics.zza(zzicrVar), zzidbVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifd
    /* JADX INFO: renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzifb zzbv() {
        zzbj();
        return this;
    }
}
