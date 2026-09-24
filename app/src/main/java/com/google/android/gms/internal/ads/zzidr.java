package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzidl;
import com.google.android.gms.internal.ads.zzidr;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzidr<MessageType extends zzidr<MessageType, BuilderType>, BuilderType extends zzidl<MessageType, BuilderType>> extends zzibw<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzidr<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzigi zzt = zzigi.zza();

    static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 43 + String.valueOf(str).length() + 2);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static zzidz zzbC() {
        return zzids.zzd();
    }

    protected static zzidz zzbD(zzidz zzidzVar) {
        int size = zzidzVar.size();
        return zzidzVar.zzh(size + size);
    }

    protected static zziec zzbE() {
        return zzieq.zzg();
    }

    protected static zziec zzbF(zziec zziecVar) {
        int size = zziecVar.size();
        return zziecVar.zzh(size + size);
    }

    protected static zzidy zzbG() {
        return zzidi.zzd();
    }

    protected static zzidy zzbH(zzidy zzidyVar) {
        int size = zzidyVar.size();
        return zzidyVar.zzh(size + size);
    }

    protected static zzidu zzbI() {
        return zzicy.zzd();
    }

    protected static zzidu zzbJ(zzidu zziduVar) {
        int size = zziduVar.size();
        return zziduVar.zzh(size + size);
    }

    protected static zzidt zzbK() {
        return zzicd.zzd();
    }

    protected static zzidt zzbL(zzidt zzidtVar) {
        int size = zzidtVar.size();
        return zzidtVar.zzh(size + size);
    }

    protected static <E> zzied<E> zzbM() {
        return zzifn.zzd();
    }

    protected static <E> zzied<E> zzbN(zzied<E> zziedVar) {
        int size = zziedVar.size();
        return zziedVar.zzh(size + size);
    }

    static <T extends zzidr<T, ?>> T zzbO(T t, zzicr zzicrVar, zzidb zzidbVar) throws zzieg {
        T t2 = (T) t.zzbg();
        try {
            zzifu zzifuVarZzb = zzifm.zza().zzb(t2.getClass());
            zzifuVarZzb.zzg(t2, zzics.zza(zzicrVar), zzidbVar);
            zzifuVarZzb.zzk(t2);
            return t2;
        } catch (zzieg e) {
            if (e.zzb()) {
                throw new zzieg(e);
            }
            throw e;
        } catch (zzigg e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzieg) {
                throw ((zzieg) e3.getCause());
            }
            throw new zzieg(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzieg) {
                throw ((zzieg) e4.getCause());
            }
            throw e4;
        }
    }

    protected static <T extends zzidr<T, ?>> T zzbP(T t, zzicr zzicrVar) throws zzieg {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        return (T) zzbO(t, zzicrVar, zzidb.zza);
    }

    protected static <T extends zzidr<T, ?>> T zzbQ(T t, ByteBuffer byteBuffer, zzidb zzidbVar) throws zzieg {
        zzicr zzicrVarZzI;
        int i = zzicr.zze;
        if (byteBuffer.hasArray()) {
            zzicrVarZzI = zzicr.zzI(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zzicrVarZzI = zzicr.zzI(bArr, 0, iRemaining, true);
        }
        T t2 = (T) zzbZ(t, zzicrVarZzI, zzidbVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzidr<T, ?>> T zzbR(T t, ByteBuffer byteBuffer) throws zzieg {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        return (T) zzbQ(t, byteBuffer, zzidb.zza);
    }

    protected static <T extends zzidr<T, ?>> T zzbS(T t, zzicn zzicnVar) throws zzieg {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        T t2 = (T) zzbT(t, zzicnVar, zzidb.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzidr<T, ?>> T zzbT(T t, zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        T t2 = (T) zzj(t, zzicnVar, zzidbVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzidr<T, ?>> T zzbU(T t, byte[] bArr) throws zzieg {
        int length = bArr.length;
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        T t2 = (T) zzh(t, bArr, 0, length, zzidb.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzidr<T, ?>> T zzbV(T t, byte[] bArr, zzidb zzidbVar) throws zzieg {
        T t2 = (T) zzh(t, bArr, 0, bArr.length, zzidbVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzidr<T, ?>> T zzbW(T t, InputStream inputStream) throws zzieg {
        zzicr zzicrVarZzH = zzicr.zzH(inputStream, 4096);
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        T t2 = (T) zzbO(t, zzicrVarZzH, zzidb.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzidr<T, ?>> T zzbX(T t, InputStream inputStream, zzidb zzidbVar) throws zzieg {
        T t2 = (T) zzbO(t, zzicr.zzH(inputStream, 4096), zzidbVar);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzidr<T, ?>> T zzbY(T t, zzicr zzicrVar) throws zzieg {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        return (T) zzbZ(t, zzicrVar, zzidb.zza);
    }

    protected static <T extends zzidr<T, ?>> T zzbZ(T t, zzicr zzicrVar, zzidb zzidbVar) throws zzieg {
        T t2 = (T) zzbO(t, zzicrVar, zzidbVar);
        zzi(t2);
        return t2;
    }

    static <T extends zzidr> T zzbt(Class<T> cls) {
        zzidr<?, ?> zzidrVar = zzd.get(cls);
        if (zzidrVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzidrVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzidrVar != null) {
            return zzidrVar;
        }
        zzidr<?, ?> zzidrVarZzbw = ((zzidr) zzigo.zzc(cls)).zzbw();
        if (zzidrVarZzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzidrVarZzbw);
        return zzidrVarZzbw;
    }

    protected static <T extends zzidr> void zzbu(Class<T> cls, T t) {
        t.zzaY();
        zzd.put(cls, t);
    }

    protected static Object zzbv(zzifc zzifcVar, String str, Object[] objArr) {
        return new zzifo(zzifcVar, str, objArr);
    }

    public static <ContainingType extends zzifc, Type> zzidp<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzifc zzifcVar, zzidw zzidwVar, int i, zzigu zziguVar, Class cls) {
        return new zzidp<>(containingtype, type, zzifcVar, new zzido(zzidwVar, i, zziguVar, false, false), cls);
    }

    public static <ContainingType extends zzifc, Type> zzidp<ContainingType, Type> zzbz(ContainingType containingtype, zzifc zzifcVar, zzidw zzidwVar, int i, zzigu zziguVar, boolean z, Class cls) {
        return new zzidp<>(containingtype, zzifn.zzd(), zzifcVar, new zzido(zzidwVar, i, zziguVar, true, z), cls);
    }

    private void zzc() {
        if (this.zzt == zzigi.zza()) {
            this.zzt = zzigi.zzb();
        }
    }

    protected static <T extends zzidr<T, ?>> T zzca(T t, InputStream inputStream) throws zzieg {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
        T t2 = (T) zzk(t, inputStream, zzidb.zza);
        zzi(t2);
        return t2;
    }

    protected static <T extends zzidr<T, ?>> T zzcb(T t, InputStream inputStream, zzidb zzidbVar) throws zzieg {
        T t2 = (T) zzk(t, inputStream, zzidbVar);
        zzi(t2);
        return t2;
    }

    private int zzd(zzifu<?> zzifuVar) {
        if (zzifuVar != null) {
            return zzifuVar.zze(this);
        }
        return zzifm.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzidn<MessageType, BuilderType>, BuilderType, T> zzidp<MessageType, T> zze(zzicz<MessageType, T> zziczVar) {
        return (zzidp) zziczVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzidr<T, ?>> boolean zzg(T t, boolean z) {
        byte bByteValue = ((Byte) t.zzdc(zzidq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzifm.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdc(zzidq.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t, null);
        }
        return zZzl;
    }

    private static <T extends zzidr<T, ?>> T zzh(T t, byte[] bArr, int i, int i2, zzidb zzidbVar) throws zzieg {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.zzbg();
        try {
            zzifu zzifuVarZzb = zzifm.zza().zzb(t2.getClass());
            zzifuVarZzb.zzj(t2, bArr, i, i + i2, new zzicb(zzidbVar));
            zzifuVarZzb.zzk(t2);
            return t2;
        } catch (zzieg e) {
            if (e.zzb()) {
                throw new zzieg(e);
            }
            throw e;
        } catch (zzigg e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzieg) {
                throw ((zzieg) e3.getCause());
            }
            throw new zzieg(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzieg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzidr<T, ?>> T zzi(T t) throws zzieg {
        if (t == null || t.zzbi()) {
            return t;
        }
        throw t.zzaU().zza();
    }

    private static <T extends zzidr<T, ?>> T zzj(T t, zzicn zzicnVar, zzidb zzidbVar) throws zzieg {
        zzicr zzicrVarZzm = zzicnVar.zzm();
        T t2 = (T) zzbO(t, zzicrVarZzm, zzidbVar);
        zzicrVarZzm.zzb(0);
        return t2;
    }

    private static <T extends zzidr<T, ?>> T zzk(T t, InputStream inputStream, zzidb zzidbVar) throws zzieg {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            zzicr zzicrVarZzH = zzicr.zzH(new zzibu(inputStream, zzicr.zzO(i, inputStream)), 4096);
            T t2 = (T) zzbO(t, zzicrVarZzH, zzidbVar);
            zzicrVarZzH.zzb(0);
            return t2;
        } catch (zzieg e) {
            if (e.zzb()) {
                throw new zzieg(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzieg(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzifm.zza().zzb(getClass()).zzb(this, (zzidr) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzife.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzibw
    int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzibw
    void zzaR(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzibw
    int zzaT(zzifu zzifuVar) {
        if (!zzaX()) {
            if (zzaQ() != Integer.MAX_VALUE) {
                return zzaQ();
            }
            int iZzd = zzd(zzifuVar);
            zzaR(iZzd);
            return iZzd;
        }
        int iZzd2 = zzd(zzifuVar);
        if (iZzd2 >= 0) {
            return iZzd2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzd2).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(iZzd2);
        throw new IllegalStateException(sb.toString());
    }

    boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    int zzaZ() {
        return this.zzq;
    }

    void zzba(int i) {
        this.zzq = i;
    }

    void zzbb() {
        this.zzq = 0;
    }

    boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzifc
    public final zzifk<MessageType> zzbd() {
        return (zzifk) zzdc(zzidq.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifd
    /* JADX INFO: renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzidq.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifc
    /* JADX INFO: renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzidq.NEW_BUILDER, null, null);
    }

    MessageType zzbg() {
        return (MessageType) zzdc(zzidq.NEW_MUTABLE_INSTANCE, null, null);
    }

    int zzbh() {
        return zzifm.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzifd
    public final boolean zzbi() {
        return zzg(this, true);
    }

    protected boolean zzbj(int i, zzicr zzicrVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i, zzicrVar);
    }

    protected void zzbk(int i, int i2) {
        zzc();
        zzigi zzigiVar = this.zzt;
        zzigiVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzigiVar.zzk(i << 3, Long.valueOf(i2));
    }

    protected void zzbl(int i, zzicn zzicnVar) {
        zzc();
        zzigi zzigiVar = this.zzt;
        zzigiVar.zze();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzigiVar.zzk((i << 3) | 2, zzicnVar);
    }

    protected void zzbm() {
        zzifm.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zzidr<MessageType2, BuilderType2>, BuilderType2 extends zzidl<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzidq.NEW_BUILDER, null, null);
    }

    protected final <MessageType2 extends zzidr<MessageType2, BuilderType2>, BuilderType2 extends zzidl<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzidq.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzifc
    public int zzbr() {
        return zzaT(null);
    }

    Object zzbs() throws Exception {
        return zzdc(zzidq.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zzigi zzigiVar) {
        this.zzt = zzigi.zzc(this.zzt, zzigiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifc
    public void zzcX(zzicw zzicwVar) throws IOException {
        zzifm.zza().zzb(getClass()).zzf(this, zzicx.zza(zzicwVar));
    }

    protected abstract Object zzdc(zzidq zzidqVar, Object obj, Object obj2);
}
