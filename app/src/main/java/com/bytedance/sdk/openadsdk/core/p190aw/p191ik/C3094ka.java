package com.bytedance.sdk.openadsdk.core.p190aw.p191ik;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2743ri;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3280fi;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3098lr;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.AbstractC3105lr;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.p194ri.C3107fi;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3094ka {

    /* JADX INFO: renamed from: ri */
    public static final List<String> f9756ri = Arrays.asList("video/mp4", "video/3gpp");

    /* JADX INFO: renamed from: lr */
    private static final ConcurrentHashMap<String, Boolean> f9755lr = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: lr */
    private static double m12438lr(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals("video/mp4")) ? 1.5d : 1.0d;
        }
        str.equals("video/3gpp");
        return 1.0d;
    }

    /* JADX INFO: renamed from: lr */
    private static void m12439lr() {
        File[] fileArrListFiles;
        File fileM12446ri = m12446ri(C3299nr.m14642ri());
        if (fileM12446ri == null || (fileArrListFiles = fileM12446ri.listFiles()) == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i = 0; i < fileArrListFiles.length && i < length; i++) {
            File file = fileArrListFiles[i];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m12440lr(wjv wjvVar, File file, C3280fi.ri riVar, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C3107fi c3107fi = new C3107fi(C3299nr.m14642ri(), 0, 0);
        C3104ri c3104riMo12555ri = c3107fi.mo12555ri((String) null, file, new ArrayList());
        if (c3104riMo12555ri != null) {
            riVar.m14119ri(c3104riMo12555ri.m12546ri());
            riVar.m14120ri(c3104riMo12555ri.m12532co());
        }
        m12442lr(wjvVar, riVar.m14115ik(), true, j);
        m12453ri(wjvVar, "vast_url", c3104riMo12555ri, jElapsedRealtime, c3107fi.f9865di);
        m12439lr();
    }

    /* JADX INFO: renamed from: lr */
    public static void m12441lr(final wjv wjvVar, final String str, final C3104ri c3104ri, final long j, final AbstractC3105lr.ri riVar) {
        C3414ik.m15533ri(new AbstractRunnableC2676ik("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j);
                    C3104ri c3104ri2 = c3104ri;
                    String str2 = "load_vast_fail";
                    if (c3104ri2 == null) {
                        AbstractC3105lr.ri riVar2 = riVar;
                        if (riVar2 != null) {
                            jSONObject.put("error_code", riVar2.f9873ri);
                        }
                    } else if (TextUtils.isEmpty(c3104ri2.jbs()) || TextUtils.isEmpty(c3104ri.m12533di()) || c3104ri.m12544mj() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    C3414ik.m15522lr(wjvVar, str, str2, jSONObject);
                    C3104ri c3104ri3 = c3104ri;
                    if (c3104ri3 == null || c3104ri3.m12541lr() == null || !TextUtils.isEmpty(c3104ri.m12541lr().m12421fi())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    C3414ik.m15522lr(wjvVar, str, "load_vast_icon_fail", jSONObject2);
                    c3104ri.m12550ri((C3098lr) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m12442lr(wjv wjvVar, final String str, final boolean z, final long j) {
        C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, wjvVar.m14394fi(), "track_url_request_result", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.3
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put("duration", j);
                    jSONObject.put("success", z);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private static double m12443ri(int i) {
        int iMax = Math.max(i, 0);
        return (700 > iMax || iMax > 1500) ? Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ri */
    private static double m12444ri(int i, double d, int i2, int i3) {
        double dAbs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double dAbs2 = d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.abs(d - (i3 > 0 ? ((double) i2) / ((double) i3) : 0.0d)) : 0.0d;
        if (i > 0) {
            dAbs = Math.abs((i - i2) / i);
        }
        return dAbs2 + dAbs;
    }

    /* JADX INFO: renamed from: ri */
    public static double m12445ri(int i, double d, int i2, int i3, int i4, String str) {
        double dM12444ri = m12444ri(i, d, i2, i3);
        return m12438lr(str) * (1.0d / ((dM12444ri + 1.0d) + m12443ri(i4)));
    }

    /* JADX INFO: renamed from: ri */
    private static File m12446ri(Context context) {
        return xha.m10328lr(context, new File(CacheDirFactory.getRootDir()).getName() + "/vast");
    }

    /* JADX INFO: renamed from: ri */
    public static File m12447ri(String str) {
        String strM10220ri = C2717fi.m10220ri(str);
        if (strM10220ri == null) {
            return null;
        }
        return new File(m12446ri(C3299nr.m14642ri()), strM10220ri);
    }

    /* JADX INFO: renamed from: ri */
    public static void m12449ri(C3289ri c3289ri) {
        List<wjv> listM14252ka = c3289ri.m14252ka();
        if (listM14252ka != null) {
            Iterator<wjv> it = listM14252ka.iterator();
            while (it.hasNext()) {
                m12450ri(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m12450ri(wjv wjvVar) {
        C3280fi c3280fiYub;
        ArrayList<C3280fi.ri> arrayListM14114ri;
        wjv wjvVar2;
        if (wjvVar == null || !C3280fi.m14111ri(wjvVar) || (c3280fiYub = wjvVar.yub()) == null || (arrayListM14114ri = c3280fiYub.m14114ri()) == null || arrayListM14114ri.isEmpty()) {
            return;
        }
        for (C3280fi.ri riVar : arrayListM14114ri) {
            String strM14116ka = riVar.m14116ka();
            if (TextUtils.isEmpty(strM14116ka)) {
                wjvVar2 = wjvVar;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C3107fi c3107fi = new C3107fi(C3299nr.m14642ri(), 0, 0);
                C3104ri c3104riMo12555ri = c3107fi.mo12555ri(strM14116ka, (File) null, new ArrayList());
                if (c3104riMo12555ri != null) {
                    riVar.m14119ri(c3104riMo12555ri.m12546ri());
                    riVar.m14120ri(c3104riMo12555ri.m12532co());
                }
                wjvVar2 = wjvVar;
                m12453ri(wjvVar2, "vast_content", c3104riMo12555ri, jElapsedRealtime, c3107fi.f9865di);
            }
            m12451ri(wjvVar2, riVar);
            wjvVar = wjvVar2;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m12451ri(final wjv wjvVar, final C3280fi.ri riVar) {
        File fileM12447ri;
        String strM14115ik = riVar.m14115ik();
        if (TextUtils.isEmpty(strM14115ik)) {
            return;
        }
        final String str = strM14115ik + wjvVar.m14424jf();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f9755lr;
        if (concurrentHashMap.containsKey(str) || (fileM12447ri = m12447ri(str)) == null) {
            return;
        }
        if (fileM12447ri.exists() && fileM12447ri.length() > 0) {
            m12440lr(wjvVar, fileM12447ri, riVar, 0L);
            return;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C2743ri c2743riM10411ka = C2751lr.m10463lr().m10466ik().m10411ka();
        c2743riM10411ka.m10365ik(strM14115ik);
        c2743riM10411ka.m10404ri(fileM12447ri.getParent(), fileM12447ri.getName());
        c2743riM10411ka.m10367ka(strM14115ik);
        c2743riM10411ka.m10403ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.1
            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                if (c2739lr.m10354di() && c2739lr.m10355fi() != null && c2739lr.m10355fi().exists()) {
                    C3094ka.m12440lr(wjvVar, c2739lr.m10355fi(), riVar, SystemClock.elapsedRealtime() - jElapsedRealtime);
                } else {
                    C3094ka.m12442lr(wjvVar, riVar.m14115ik(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
                C3094ka.f9755lr.remove(str);
            }

            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                C3094ka.m12442lr(wjvVar, riVar.m14115ik(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                C3094ka.f9755lr.remove(str);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m12453ri(final wjv wjvVar, final String str, final C3104ri c3104ri, final long j, final AbstractC3105lr.ri riVar) {
        C3414ik.m15533ri(new AbstractRunnableC2676ik("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j);
                    jSONObject.put(TypedValues.TransitionType.S_FROM, str);
                    if (c3104ri != null) {
                        wjv wjvVar2 = wjvVar;
                        C3414ik.m15522lr(wjvVar2, wjvVar2.m14394fi(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    AbstractC3105lr.ri riVar2 = riVar;
                    if (riVar2 != null) {
                        jSONObject.put("error_code", riVar2.f9873ri);
                    }
                    wjv wjvVar3 = wjvVar;
                    C3414ik.m15522lr(wjvVar3, wjvVar3.m14394fi(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}
