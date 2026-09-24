package com.google.android.gms.internal.nearby;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.Hex;
import com.ironsource.C11341A5;
import com.ironsource.C11744X3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhi {
    private static final ParcelUuid zza = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private final int zzb;
    private final List<ParcelUuid> zzc;
    private final SparseArray<byte[]> zzd;
    private final Map<ParcelUuid, byte[]> zze;
    private final int zzf;
    private final String zzg;
    private final byte[] zzh;

    private zzhi(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.zzc = list;
        this.zzd = sparseArray;
        this.zze = map;
        this.zzg = str;
        this.zzb = i;
        this.zzf = i2;
        this.zzh = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    public static zzhi zza(byte[] bArr) {
        byte[] bArr2;
        ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        HashMap map = new HashMap();
        int i = 0;
        String str = null;
        byte b = -2147483648;
        int i2 = -1;
        try {
            while (i < bArr.length) {
                try {
                    int i3 = i + 1;
                    int i4 = bArr[i] & 255;
                    if (i4 == 0) {
                        if (true != arrayList2.isEmpty()) {
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        bArr2 = bArr;
                        return new zzhi(arrayList, sparseArray, map, i2, b, str, bArr2);
                    }
                    int i5 = i4 - 1;
                    int i6 = i + 2;
                    int i7 = bArr[i3] & 255;
                    if (i7 == 22) {
                        map.put(zzd(zzc(bArr, i6, 2)), zzc(bArr, i + 4, i4 - 3));
                    } else if (i7 != 255) {
                        switch (i7) {
                            case 1:
                                i2 = bArr[i6] & 255;
                                break;
                            case 2:
                            case 3:
                                zzb(bArr, i6, i5, 2, arrayList2);
                                break;
                            case 4:
                            case 5:
                                zzb(bArr, i6, i5, 4, arrayList2);
                                break;
                            case 6:
                            case 7:
                                zzb(bArr, i6, i5, 16, arrayList2);
                                break;
                            case 8:
                            case 9:
                                str = new String(zzc(bArr, i6, i5));
                                break;
                            case 10:
                                b = bArr[i6];
                                break;
                        }
                    } else {
                        sparseArray.put(((bArr[i + 3] & 255) << 8) + (255 & bArr[i6]), zzc(bArr, i + 4, i4 - 3));
                    }
                    i = i6 + i5;
                } catch (Exception e) {
                    e = e;
                    bArr2 = bArr;
                }
            }
            return new zzhi(arrayList, sparseArray, map, i2, b, str, bArr2);
        } catch (Exception e2) {
            e = e2;
            String strValueOf = String.valueOf(Arrays.toString(bArr2));
            Log.w("BleRecord", strValueOf.length() != 0 ? "Unable to parse scan record: ".concat(strValueOf) : new String("Unable to parse scan record: "), e);
            return null;
        }
        if (true != arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        bArr2 = bArr;
    }

    private static int zzb(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(zzd(zzc(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhi) {
            return Arrays.equals(this.zzh, ((zzhi) obj).zzh);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String string;
        int i = this.zzb;
        String strValueOf = String.valueOf(this.zzc);
        SparseArray<byte[]> sparseArray = this.zzd;
        StringBuilder sb = new StringBuilder();
        int size = sparseArray.size();
        String string2 = JsonUtils.EMPTY_JSON;
        int i2 = 0;
        if (size <= 0) {
            string = JsonUtils.EMPTY_JSON;
        } else {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                int iKeyAt = sparseArray.keyAt(i3);
                byte[] bArrValueAt = sparseArray.valueAt(i3);
                sb.append(iKeyAt);
                sb.append(C11341A5.f23808U);
                sb.append(bArrValueAt == null ? null : Hex.bytesToStringUppercase(bArrValueAt));
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            string = sb.toString();
        }
        Map<ParcelUuid, byte[]> map = this.zze;
        StringBuilder sb2 = new StringBuilder();
        if (map.keySet().size() > 0) {
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            for (Map.Entry<ParcelUuid, byte[]> entry : map.entrySet()) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append(C11341A5.f23808U);
                byte[] value = entry.getValue();
                sb2.append(value == null ? null : Hex.bytesToStringUppercase(value));
                i2++;
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            string2 = sb2.toString();
        }
        int i4 = this.zzf;
        String str = this.zzg;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb3 = new StringBuilder(length + TsExtractor.TS_STREAM_TYPE_DTS_UHD + String.valueOf(string).length() + String.valueOf(string2).length() + String.valueOf(str).length());
        sb3.append("BleRecord [mAdvertiseFlags=");
        sb3.append(i);
        sb3.append(", mServiceUuids=");
        sb3.append(strValueOf);
        sb3.append(", mManufacturerSpecificData=");
        sb3.append(string);
        sb3.append(", mServiceData=");
        sb3.append(string2);
        sb3.append(", mTxPowerLevel=");
        sb3.append(i4);
        sb3.append(", mDeviceName=");
        sb3.append(str);
        sb3.append(C11744X3.j.f26440e);
        return sb3.toString();
    }

    private static ParcelUuid zzd(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("uuidBytes length invalid - ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
        } else {
            j = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
        }
        ParcelUuid parcelUuid = zza;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }
}
