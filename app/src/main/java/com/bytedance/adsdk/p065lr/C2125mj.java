package com.bytedance.adsdk.p065lr;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p067fi.wjv;
import com.bytedance.adsdk.p065lr.p068ik.C2055fi;
import com.bytedance.adsdk.p065lr.p068ik.C2056ik;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2125mj {

    /* JADX INFO: renamed from: ri */
    private static final Map<String, C2013aw<xha>> f5132ri = new HashMap();

    /* JADX INFO: renamed from: lr */
    private static final Set<Object> f5131lr = new HashSet();

    /* JADX INFO: renamed from: ik */
    private static final byte[] f5130ik = {80, 75, 3, 4};

    /* JADX INFO: renamed from: ik */
    public static C2015co<xha> m7024ik(Context context, String str) {
        return m7025ik(context, str, "asset_".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: ik */
    public static C2015co<xha> m7025ik(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m7032lr(context.getAssets().open(str), str2);
            }
            return m7040ri(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C2015co<>((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ik */
    private static String m7026ik(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(m7048ri(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: lr */
    public static C2013aw<xha> m7027lr(Context context, String str) {
        return m7028lr(context, str, "asset_".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: lr */
    public static C2013aw<xha> m7028lr(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return m7039ri(str2, new Callable<C2015co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public C2015co<xha> call() throws Exception {
                return C2125mj.m7025ik(applicationContext, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static C2015co<xha> m7029lr(Context context, int i) {
        return m7030lr(context, i, m7026ik(context, i));
    }

    /* JADX INFO: renamed from: lr */
    public static C2015co<xha> m7030lr(Context context, int i, String str) {
        try {
            return m7032lr(context.getResources().openRawResource(i), m7026ik(context, i));
        } catch (Resources.NotFoundException e) {
            return new C2015co<>((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: lr */
    private static C2015co<xha> m7031lr(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            xha xhaVarM6474ri = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    xhaVarM6474ri = m7042ri(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).m6474ri();
                } else if (name.endsWith(".png") || name.endsWith(".webp") || name.endsWith(".jpg") || name.endsWith(".jpeg")) {
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                        map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                } else if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                    zipInputStream.closeEntry();
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        file.getAbsolutePath();
                    }
                    map2.put(str3, typefaceCreateFromFile);
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (xhaVarM6474ri == null) {
                return new C2015co<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                C2127qt c2127qtM7044ri = m7044ri(xhaVarM6474ri, (String) entry.getKey());
                if (c2127qtM7044ri != null) {
                    c2127qtM7044ri.m7065ri(C2017di.m6544ri((Bitmap) entry.getValue(), c2127qtM7044ri.m7064ri(), c2127qtM7044ri.m7061lr()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (C2056ik c2056ik : xhaVarM6474ri.m7201vr().values()) {
                    if (c2056ik.m6707ri().equals(entry2.getKey())) {
                        c2056ik.m6708ri((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, C2127qt>> it = xhaVarM6474ri.slm().entrySet().iterator();
                while (it.hasNext()) {
                    C2127qt value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strJbs = value.jbs();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strJbs.startsWith("data:") && strJbs.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strJbs.substring(strJbs.indexOf(44) + 1), 0);
                            value.m7065ri(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, C2127qt> entry3 : xhaVarM6474ri.slm().entrySet()) {
                if (entry3.getValue().m7066sf() == null) {
                    return new C2015co<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().jbs()));
                }
            }
            if (str != null) {
                C2055fi.m6701ri().m6703ri(str, xhaVarM6474ri);
            }
            return new C2015co<>(xhaVarM6474ri);
        } catch (IOException e) {
            return new C2015co<>((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static C2015co<xha> m7032lr(InputStream inputStream, String str) {
        return m7043ri(inputStream, str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m7033lr(boolean z) {
        ArrayList arrayList = new ArrayList(f5131lr);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2013aw<xha> m7034ri(Context context, int i) {
        return m7035ri(context, i, m7026ik(context, i));
    }

    /* JADX INFO: renamed from: ri */
    public static C2013aw<xha> m7035ri(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m7039ri(str, new Callable<C2015co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public C2015co<xha> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return C2125mj.m7030lr(context2, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static C2013aw<xha> m7036ri(Context context, String str) {
        return m7037ri(context, str, "url_".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: ri */
    public static C2013aw<xha> m7037ri(final Context context, final String str, final String str2) {
        return m7039ri(str2, new Callable<C2015co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public C2015co<xha> call() throws Exception {
                C2015co<xha> c2015coM7005ri = C2023fi.m6598ri(context).m7005ri(context, str, str2);
                if (str2 != null && c2015coM7005ri.m6474ri() != null) {
                    C2055fi.m6701ri().m6703ri(str2, c2015coM7005ri.m6474ri());
                }
                return c2015coM7005ri;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static C2013aw<xha> m7038ri(final InputStream inputStream, final String str) {
        return m7039ri(str, new Callable<C2015co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public C2015co<xha> call() throws Exception {
                return C2125mj.m7032lr(inputStream, str);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private static C2013aw<xha> m7039ri(final String str, Callable<C2015co<xha>> callable) {
        final xha xhaVarM6702ri = str == null ? null : C2055fi.m6701ri().m6702ri(str);
        if (xhaVarM6702ri != null) {
            return new C2013aw<>(new Callable<C2015co<xha>>() { // from class: com.bytedance.adsdk.lr.mj.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                public C2015co<xha> call() throws Exception {
                    return new C2015co<>(xhaVarM6702ri);
                }
            });
        }
        if (str != null) {
            Map<String, C2013aw<xha>> map = f5132ri;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C2013aw<xha> c2013aw = new C2013aw<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c2013aw.m6465ri(new InterfaceC2159sf<xha>() { // from class: com.bytedance.adsdk.lr.mj.2
                @Override // com.bytedance.adsdk.p065lr.InterfaceC2159sf
                /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo6534ri(xha xhaVar) {
                    C2125mj.f5132ri.remove(str);
                    atomicBoolean.set(true);
                    if (C2125mj.f5132ri.size() == 0) {
                        C2125mj.m7033lr(true);
                    }
                }
            });
            c2013aw.m6462ik(new InterfaceC2159sf<Throwable>() { // from class: com.bytedance.adsdk.lr.mj.3
                @Override // com.bytedance.adsdk.p065lr.InterfaceC2159sf
                /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public void mo6534ri(Throwable th) {
                    C2125mj.f5132ri.remove(str);
                    atomicBoolean.set(true);
                    if (C2125mj.f5132ri.size() == 0) {
                        C2125mj.m7033lr(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, C2013aw<xha>> map2 = f5132ri;
                map2.put(str, c2013aw);
                if (map2.size() == 1) {
                    m7033lr(false);
                }
            }
        }
        return c2013aw;
    }

    /* JADX INFO: renamed from: ri */
    public static C2015co<xha> m7040ri(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return m7031lr(context, zipInputStream, str);
        } finally {
            C2017di.m6550ri(zipInputStream);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2015co<xha> m7041ri(JsonReader jsonReader, String str) {
        return m7042ri(jsonReader, str, true);
    }

    /* JADX INFO: renamed from: ri */
    private static C2015co<xha> m7042ri(JsonReader jsonReader, String str, boolean z) {
        try {
            xha xhaVarM6684ri = wjv.m6684ri(jsonReader);
            C2055fi.m6701ri().m6703ri(str, xhaVarM6684ri);
            return new C2015co<>(xhaVarM6684ri);
        } catch (Exception e) {
            return new C2015co<>((Throwable) e);
        } finally {
            if (z) {
                m7046ri(jsonReader);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static C2015co<xha> m7043ri(InputStream inputStream, String str, boolean z) {
        try {
            return m7041ri(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C2017di.m6550ri(inputStream);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static C2127qt m7044ri(xha xhaVar, String str) {
        for (C2127qt c2127qt : xhaVar.slm().values()) {
            if (c2127qt.jbs().equals(str)) {
                return c2127qt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static void m7046ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m7048ri(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
