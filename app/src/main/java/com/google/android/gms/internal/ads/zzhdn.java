package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdn implements zzhdo {
    private final List zza;
    private final Map zzb;

    @Nullable
    private final zzhdn zzc;

    private zzhdn(List list, Map map) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = map;
        if (zzhkf.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhdl zzhdlVar = (zzhdl) it.next();
                if (hashSet.contains(Integer.valueOf(zzhdlVar.zzc()))) {
                    int iZzc = zzhdlVar.zzc();
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                    sb.append("KeyID ");
                    sb.append(iZzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
                hashSet.add(Integer.valueOf(zzhdlVar.zzc()));
                zZzd |= zzhdlVar.zzd();
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    private zzhdn(List list, Map map, zzhdn zzhdnVar) {
        this.zza = list;
        this.zzb = map;
        this.zzc = zzhdnVar;
    }

    /* synthetic */ zzhdn(List list, Map map, byte[] bArr) {
        this(list, map);
    }

    static final zzhdn zza(zzhso zzhsoVar) throws GeneralSecurityException {
        if (zzhsoVar == null || zzhsoVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhdn(zzj(zzhsoVar), new HashMap());
    }

    public static final zzhdn zzg(zzhdt zzhdtVar) throws GeneralSecurityException {
        zzhdi zzhdiVar = new zzhdi();
        zzhdg zzhdgVar = new zzhdg(zzhdtVar, null);
        zzhdgVar.zzb();
        zzhdgVar.zza();
        zzhdiVar.zza(zzhdgVar);
        return zzhdiVar.zzb();
    }

    static /* synthetic */ zzhdn zzi(final zzhdn zzhdnVar) {
        final zzhlu zzhluVar = (zzhlu) zzhdnVar.zzf(zzhlu.class);
        if (zzhluVar == null) {
            return zzhdnVar;
        }
        zzhdj zzhdjVar = new zzhdj() { // from class: com.google.android.gms.internal.ads.zzhdm
            @Override // com.google.android.gms.internal.ads.zzhdj
            public final /* synthetic */ void zza(zzhdl zzhdlVar) {
                zzhme.zza().zzb().zza(this.zza, zzhluVar, "keyset_handle", "get_key");
            }
        };
        List<zzhdl> list = zzhdnVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhdl zzhdlVar : list) {
            arrayList.add(new zzhdl(zzhdlVar.zzf(), zzhdlVar.zzj(), zzhdlVar.zzg(), zzhdlVar.zzh(), zzhdlVar.zzi(), zzhdjVar, null));
        }
        return new zzhdn(arrayList, zzhdnVar.zzb, zzhdnVar);
    }

    private static List zzj(zzhso zzhsoVar) throws GeneralSecurityException {
        zzhdc zzhlrVar;
        boolean z;
        ArrayList arrayList = new ArrayList(zzhsoVar.zzc());
        for (zzhsn zzhsnVar : zzhsoVar.zzb()) {
            int iZzc = zzhsnVar.zzc();
            try {
                zzhne zzhneVarZzl = zzl(zzhsnVar);
                zzhmj zzhmjVarZza = zzhmj.zza();
                zzhdx zzhdxVarZza = zzhdx.zza();
                zzhlrVar = !zzhmjVarZza.zzf(zzhneVarZzl) ? new zzhlr(zzhneVarZzl, zzhdxVarZza) : zzhmjVarZza.zzg(zzhneVarZzl, zzhdxVarZza);
                z = false;
            } catch (GeneralSecurityException e) {
                if (zzhkf.zza.zza()) {
                    throw e;
                }
                zzhlrVar = new zzhlr(zzl(zzhsnVar), zzhdx.zza());
                z = true;
            }
            if (zzhkf.zza.zza() && !zzm(zzhsnVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z2 = false;
            int iZzk = zzhsnVar.zzk();
            if (iZzc == zzhsoVar.zza()) {
                z2 = true;
            }
            arrayList.add(new zzhdl(zzhlrVar, iZzk, iZzc, z2, z, zzhdl.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhdn zzk() {
        zzhdn zzhdnVar = this.zzc;
        return zzhdnVar == null ? this : zzhdnVar;
    }

    private static zzhne zzl(zzhsn zzhsnVar) throws GeneralSecurityException {
        return zzhne.zza(zzhsnVar.zzb().zza(), zzhsnVar.zzb().zzb(), zzhsnVar.zzb().zzc(), zzhsnVar.zzd(), zzhsnVar.zzd() == zzhtb.RAW ? null : Integer.valueOf(zzhsnVar.zzc()));
    }

    private static boolean zzm(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final String toString() {
        zzhso zzhsoVarZzb = zzb();
        int i = zzhea.zza;
        zzhsp zzhspVarZza = zzhss.zza();
        zzhspVarZza.zza(zzhsoVarZzb.zza());
        for (zzhsn zzhsnVar : zzhsoVarZzb.zzb()) {
            zzhsq zzhsqVarZza = zzhsr.zza();
            zzhsqVarZza.zza(zzhsnVar.zzb().zza());
            zzhsqVarZza.zzd(zzhsnVar.zzk());
            zzhsqVarZza.zzc(zzhsnVar.zzd());
            zzhsqVarZza.zzb(zzhsnVar.zzc());
            zzhspVarZza.zzb((zzhsr) zzhsqVarZza.zzbu());
        }
        return ((zzhss) zzhspVarZza.zzbu()).toString();
    }

    final zzhso zzb() {
        try {
            zzhsl zzhslVarZzh = zzhso.zzh();
            for (zzhdl zzhdlVar : this.zza) {
                zzhdc zzhdcVarZza = zzhdlVar.zza();
                int iZzj = zzhdlVar.zzj();
                int iZzc = zzhdlVar.zzc();
                zzhne zzhneVar = (zzhne) zzhmj.zza().zzh(zzhdcVarZza, zzhne.class, zzhdx.zza());
                Integer numZzb = zzhdcVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhsm zzhsmVarZze = zzhsn.zze();
                zzhsd zzhsdVarZzd = zzhsf.zzd();
                zzhsdVarZzd.zza(zzhneVar.zzg());
                zzhsdVarZzd.zzb(zzhneVar.zzb());
                zzhsdVarZzd.zzc(zzhneVar.zzc());
                zzhsmVarZze.zzb(zzhsdVarZzd);
                zzhsmVarZze.zze(iZzj);
                zzhsmVarZze.zzc(iZzc);
                zzhsmVarZze.zzd(zzhneVar.zzd());
                zzhslVarZzh.zzb((zzhsn) zzhsmVarZze.zzbu());
                if (zzhdlVar.zzd()) {
                    zzhslVarZzh.zza(zzhdlVar.zzc());
                }
            }
            return (zzhso) zzhslVarZzh.zzbu();
        } catch (GeneralSecurityException e) {
            throw new zzhnp(e);
        }
    }

    public final zzhdl zzc() {
        for (zzhdl zzhdlVar : this.zza) {
            if (zzhdlVar != null && zzhdlVar.zzd()) {
                if (zzhdlVar.zzb() == zzhde.zza) {
                    return zzhdlVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhdo
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhdl zze(int i) {
        if (i < 0 || i >= zzd()) {
            int iZzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(iZzd).length());
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(" for keyset of size ");
            sb.append(iZzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.zza;
        zzhdl zzhdlVar = (zzhdl) list.get(i);
        if (!zzm(zzhdlVar.zzj())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!zzhdlVar.zzi()) {
            return (zzhdl) list.get(i);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhdo
    @Nullable
    public final zzhcv zzf(Class cls) {
        return (zzhcv) this.zzb.get(cls);
    }

    public final Object zzh(zzhcz zzhczVar, Class cls) throws GeneralSecurityException {
        if (!(zzhczVar instanceof zzhlb)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhlb zzhlbVar = (zzhlb) zzhczVar;
        zzhso zzhsoVarZzb = zzk().zzb();
        int i = zzhea.zza;
        int iZza = zzhsoVarZzb.zza();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (zzhsn zzhsnVar : zzhsoVarZzb.zzb()) {
            if (zzhsnVar.zzk() == 3) {
                if (!zzhsnVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhsnVar.zzc())));
                }
                if (zzhsnVar.zzd() == zzhtb.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhsnVar.zzc())));
                }
                if (zzhsnVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhsnVar.zzc())));
                }
                if (zzhsnVar.zzc() == iZza) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= zzhsnVar.zzb().zzc() == zzhse.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            List list = this.zza;
            if (((zzhdl) list.get(i3)).zzi() || !zzm(((zzhdl) list.get(i3)).zzj())) {
                String strZza = zzhsoVarZzb.zzd(i3).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 44 + String.valueOf(strZza).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(strZza);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhlbVar.zza(zzk(), cls);
    }
}
