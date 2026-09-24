package com.google.android.gms.internal.ads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziax extends zziat {
    private final Object zza;

    public zziax(Boolean bool) {
        this.zza = Objects.requireNonNull(bool);
    }

    private static boolean zzl(zziax zziaxVar) {
        Object obj = zziaxVar.zza;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zziax zziaxVar = (zziax) obj;
        Object obj2 = this.zza;
        if (obj2 == null) {
            return zziaxVar.zza == null;
        }
        if (zzl(this) && zzl(zziaxVar)) {
            if ((obj2 instanceof BigInteger) || (zziaxVar.zza instanceof BigInteger)) {
                return zzk().equals(zziaxVar.zzk());
            }
            return zzh().longValue() == zziaxVar.zzh().longValue();
        }
        if (obj2 instanceof Number) {
            Object obj3 = zziaxVar.zza;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return zzj().compareTo(zziaxVar.zzj()) == 0;
                }
                double dZzi = zzi();
                double dZzi2 = zziaxVar.zzi();
                if (dZzi != dZzi2) {
                    return Double.isNaN(dZzi) && Double.isNaN(dZzi2);
                }
                return true;
            }
        }
        return obj2.equals(zziaxVar.zza);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Object obj = this.zza;
        if (obj == null) {
            return 31;
        }
        if (zzl(this)) {
            jDoubleToLongBits = zzh().longValue();
        } else {
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(zzh().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean zza() {
        return this.zza instanceof Boolean;
    }

    public final boolean zzb() {
        Object obj = this.zza;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(zzd());
    }

    public final boolean zzc() {
        return this.zza instanceof Number;
    }

    @Override // com.google.android.gms.internal.ads.zziat
    public final String zzd() {
        Object obj = this.zza;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return zzh().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        String strValueOf = String.valueOf(obj.getClass());
        String.valueOf(strValueOf);
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(strValueOf)));
    }

    public final Number zzh() {
        Object obj = this.zza;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new zzibb((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final double zzi() {
        return this.zza instanceof Number ? zzh().doubleValue() : Double.parseDouble(zzd());
    }

    public final BigDecimal zzj() {
        Object obj = this.zza;
        return obj instanceof BigDecimal ? (BigDecimal) obj : zzibk.zza(zzd());
    }

    public final BigInteger zzk() {
        Object obj = this.zza;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return zzl(this) ? BigInteger.valueOf(zzh().longValue()) : zzibk.zzb(zzd());
    }

    public zziax(Number number) {
        this.zza = Objects.requireNonNull(number);
    }

    public zziax(String str) {
        this.zza = Objects.requireNonNull(str);
    }
}
