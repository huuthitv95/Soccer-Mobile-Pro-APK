package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.C11540L6;
import com.ironsource.C12460ra;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.pgl.ssdk.ces.C14271a;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.pgl.ssdk.v */
/* JADX INFO: loaded from: classes7.dex */
public class C14292v {

    /* JADX INFO: renamed from: a */
    private static volatile String f41343a = null;

    /* JADX INFO: renamed from: b */
    private static volatile String f41344b = null;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f41345c = false;

    /* JADX INFO: renamed from: d */
    private static String f41346d = null;

    /* JADX INFO: renamed from: e */
    private static String f41347e = null;

    /* JADX INFO: renamed from: f */
    private static String f41348f = null;

    /* JADX INFO: renamed from: g */
    private static int f41349g = -1;

    /* JADX INFO: renamed from: h */
    private static long f41350h = 0;

    /* JADX INFO: renamed from: i */
    private static long f41351i = 0;

    /* JADX INFO: renamed from: j */
    private static volatile long f41352j = -1;

    @DungeonFlag
    /* JADX INFO: renamed from: a */
    private static C14275e m43117a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        List<C14275e> listM43083a;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    InterfaceC14287q interfaceC14287qM43108a = AbstractC14288r.m43108a(randomAccessFile, 0L, randomAccessFile.length());
                    listM43083a = C14282l.m43086a(interfaceC14287qM43108a, AbstractC14270c.m43033a(interfaceC14287qM43108a));
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                } catch (C14277g.a unused2) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listM43083a = null;
                } catch (Throwable unused3) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listM43083a = null;
                }
            } catch (IOException unused4) {
                listM43083a = null;
            }
        } catch (C14277g.a unused5) {
            randomAccessFile = null;
        } catch (Throwable unused6) {
            randomAccessFile = null;
        }
        if (listM43083a == null || listM43083a.isEmpty()) {
            listM43083a = C14281k.m43083a(file);
        }
        if (listM43083a == null || listM43083a.isEmpty()) {
            return null;
        }
        return listM43083a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m43118a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[1048576];
            while (true) {
                int i = randomAccessFile.read(bArr);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(String.valueOf(string));
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m43119a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(CertificateUtil.DELIMITER);
            }
            return sb.substring(0, sb.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m43120a() {
        SharedPreferences sharedPreferencesM43024a = C14266ax.m43024a(C14296z.m43153a());
        if (sharedPreferencesM43024a != null) {
            if (!TextUtils.isEmpty(f41343a)) {
                sharedPreferencesM43024a.edit().putString("sa", f41343a).apply();
            }
            if (!TextUtils.isEmpty(f41347e)) {
                sharedPreferencesM43024a.edit().putString("md5", f41347e).apply();
            }
            if (!TextUtils.isEmpty(f41346d)) {
                sharedPreferencesM43024a.edit().putString("sj", f41346d).apply();
            }
            if (f41350h != 0) {
                sharedPreferencesM43024a.edit().putLong("as", f41350h).apply();
            }
            if (f41351i != 0) {
                sharedPreferencesM43024a.edit().putLong("ds", f41351i).apply();
            }
            if (f41352j != -1) {
                sharedPreferencesM43024a.edit().putLong(C11540L6.f24958a1, f41352j).apply();
            }
            if (f41349g != -1) {
                sharedPreferencesM43024a.edit().putInt("cpc", f41349g).apply();
            }
            if (TextUtils.isEmpty(f41348f)) {
                return;
            }
            sharedPreferencesM43024a.edit().putString(C12460ra.f31826c, f41348f).apply();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m43121a(File file, boolean z) throws Throwable {
        C14275e c14275eM43117a;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    if (TextUtils.isEmpty(f41343a) && (c14275eM43117a = m43117a(file)) != null) {
                        f41343a = m43119a(c14275eM43117a.m43062a());
                        f41346d = c14275eM43117a.m43063b();
                        if (z) {
                            m43120a();
                            randomAccessFile2.close();
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(f41347e)) {
                        f41347e = m43118a(randomAccessFile2);
                    }
                    if (f41350h == 0) {
                        f41350h = randomAccessFile2.length() / 1024;
                    }
                    if (f41351i == 0) {
                        f41351i = m43122b(file);
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException unused2) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
            }
        } catch (FileNotFoundException unused5) {
        } catch (IOException unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m43122b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i = 0;
                int size = 0;
                while (true) {
                    if (i == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i));
                    }
                    try {
                        ZipEntry entry = zipFile2.getEntry(str);
                        if (entry == null) {
                            break;
                        }
                        size = (int) (((long) size) + entry.getSize());
                        i++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j = size / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j;
            } catch (IOException unused5) {
                return 0L;
            }
        } catch (ZipException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m43123b() throws Throwable {
        long j;
        boolean z;
        String string;
        String string2;
        String string3;
        String string4;
        long j2;
        long j3;
        int i;
        String str;
        if (TextUtils.isEmpty(f41343a) || TextUtils.isEmpty(f41347e) || f41349g == -1) {
            SharedPreferences sharedPreferencesM43024a = C14266ax.m43024a(C14296z.m43153a());
            long j4 = -1;
            if (sharedPreferencesM43024a != null) {
                j4 = sharedPreferencesM43024a.getLong(C11540L6.f24958a1, -1L);
                string2 = sharedPreferencesM43024a.getString("sa", null);
                string3 = sharedPreferencesM43024a.getString("sj", null);
                string4 = sharedPreferencesM43024a.getString("md5", null);
                j2 = sharedPreferencesM43024a.getLong("as", 0L);
                j3 = sharedPreferencesM43024a.getLong("ds", 0L);
                z = true;
                i = sharedPreferencesM43024a.getInt("cpc", -1);
                j = 0;
                string = sharedPreferencesM43024a.getString(C12460ra.f31826c, null);
            } else {
                j = 0;
                z = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j2 = 0;
                j3 = 0;
                i = 0;
            }
            String strM43124c = m43124c();
            if (strM43124c == null) {
                return null;
            }
            File file = new File(strM43124c);
            str = null;
            Object[] objArr = (Object[]) C14271a.meta(158, C14296z.m43153a(), strM43124c);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j4 || string2 == null || i == -1) {
                f41352j = jLastModified;
                if (str2 != null) {
                    f41348f = str2;
                }
                if (num != null) {
                    f41349g = num.intValue();
                }
                m43121a(file, false);
                m43120a();
            } else {
                f41343a = string2;
                f41346d = string3;
                f41350h = j2;
                f41351i = j3;
                f41347e = string4;
                f41349g = i;
                f41348f = string;
            }
        } else {
            j = 0;
            str = null;
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f41343a)) {
                jSONObject.put("sign", f41343a);
            }
            if (!TextUtils.isEmpty(f41346d)) {
                jSONObject.put("subject", f41346d);
            }
            if (!TextUtils.isEmpty(f41347e)) {
                jSONObject.put("md5", f41347e);
            }
            if (!TextUtils.isEmpty(f41348f)) {
                jSONObject.put("path", f41348f);
            }
            long j5 = f41350h;
            if (j5 != j) {
                jSONObject.put("apkSize", j5);
            }
            long j6 = f41351i;
            if (j6 != j) {
                jSONObject.put("dexSize", j6);
            }
            int i2 = f41349g;
            if (i2 != -1) {
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i2);
            }
            m43126e();
            jSONObject.put("signpm", f41344b);
            if (!TextUtils.isEmpty(f41344b) && !TextUtils.isEmpty(f41343a)) {
                if (!f41344b.equals(f41343a)) {
                    f41345c = z;
                }
                jSONObject.put("rebud", f41345c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m43124c() {
        if (C14296z.m43153a() == null) {
            return null;
        }
        String packageCodePath = C14296z.m43153a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static void m43125d() throws Throwable {
        if (TextUtils.isEmpty(f41343a)) {
            SharedPreferences sharedPreferencesM43024a = C14266ax.m43024a(C14296z.m43153a());
            String string = null;
            long j = -1;
            if (sharedPreferencesM43024a != null) {
                j = sharedPreferencesM43024a.getLong(C11540L6.f24958a1, -1L);
                string = sharedPreferencesM43024a.getString("sa", null);
            }
            String strM43124c = m43124c();
            if (TextUtils.isEmpty(strM43124c)) {
                return;
            }
            File file = new File(strM43124c);
            long jLastModified = file.lastModified();
            if (jLastModified != j || string == null) {
                f41352j = jLastModified;
                m43121a(file, true);
                m43120a();
            } else {
                f41343a = string;
            }
        }
        m43126e();
        if (TextUtils.isEmpty(f41344b) || TextUtils.isEmpty(f41343a) || f41344b.equals(f41343a)) {
            return;
        }
        f41345c = true;
    }

    /* JADX INFO: renamed from: e */
    public static String m43126e() {
        if (!TextUtils.isEmpty(f41344b)) {
            return f41344b;
        }
        try {
            String strM43119a = m43119a(C14296z.m43153a().getPackageManager().getPackageInfo(C14296z.m43153a().getPackageName(), 64).signatures[0].toByteArray());
            f41344b = strM43119a;
            return strM43119a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m43127f() throws Throwable {
        m43125d();
        return f41345c;
    }
}
