package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfxn {
    public static boolean zza(zzbdh zzbdhVar) {
        int iOrdinal = zzbdhVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzbdh zzb(Context context, zzfwq zzfwqVar) {
        zzbdh zzbdhVar;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzgzh(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfwqVar != null) {
                    zzfwqVar.zze(5017, "No .so");
                } else {
                    zzfwqVar = null;
                }
                zzbdhVar = zzbdh.UNKNOWN;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                zzc(bArr, null, context, zzfwqVar);
                                zzbdhVar = zzbdh.UNSUPPORTED;
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    zzbdhVar = zzbdh.X86;
                                } else if (s == 40) {
                                    zzbdhVar = zzbdh.ARM7;
                                } else if (s == 62) {
                                    zzbdhVar = zzbdh.X86_64;
                                } else if (s == 183) {
                                    zzbdhVar = zzbdh.ARM64;
                                } else if (s != 243) {
                                    zzc(bArr, null, context, zzfwqVar);
                                    zzbdhVar = zzbdh.UNSUPPORTED;
                                } else {
                                    zzbdhVar = zzbdh.RISCV64;
                                }
                            }
                            fileInputStream.close();
                        } else {
                            fileInputStream.close();
                            zzbdhVar = zzbdh.UNSUPPORTED;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    zzc(null, e.toString(), context, zzfwqVar);
                }
            }
        } else {
            if (zzfwqVar != null) {
                zzfwqVar.zze(5017, "No lib/");
            } else {
                zzfwqVar = null;
            }
            zzbdhVar = zzbdh.UNKNOWN;
        }
        if (zzbdhVar == zzbdh.UNKNOWN) {
            String strZzd = zzd(context, zzfwqVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfwqVar);
                zzbdhVar = zzbdh.UNSUPPORTED;
            } else if (strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase("x86")) {
                zzbdhVar = zzbdh.X86;
            } else if (strZzd.equalsIgnoreCase("x86_64")) {
                zzbdhVar = zzbdh.X86_64;
            } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                zzbdhVar = zzbdh.ARM64;
            } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                zzbdhVar = zzbdh.ARM7;
            } else if (strZzd.equalsIgnoreCase("riscv64")) {
                zzbdhVar = zzbdh.RISCV64;
            } else {
                zzc(null, strZzd, context, zzfwqVar);
                zzbdhVar = zzbdh.UNSUPPORTED;
            }
        }
        if (zzfwqVar != null) {
            zzfwqVar.zze(5018, zzbdhVar.name());
        }
        return zzbdhVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfwq zzfwqVar) {
        if (zzfwqVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzgtm.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfwqVar.zze(4007, sb.toString());
    }

    private static final String zzd(Context context, zzfwq zzfwqVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzgtm.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            if (zzfwqVar != null) {
                zzfwqVar.zzc(2024, 0L, e);
            }
        } catch (NoSuchFieldException e2) {
            if (zzfwqVar != null) {
                zzfwqVar.zzc(2024, 0L, e2);
            }
        }
        return Build.CPU_ABI != null ? Build.CPU_ABI : Build.CPU_ABI2;
    }
}
