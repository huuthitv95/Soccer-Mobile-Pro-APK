package com.bytedance.sdk.openadsdk.core.bgr.p196ik;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.p159ka.C2643ri;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.utils.C2726ri;
import com.bytedance.sdk.component.utils.ory;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2743ri;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3309ri;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3549ik;
import com.bytedance.sdk.openadsdk.p266uq.p268ri.C3550ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11341A5;
import com.tiktok.util.UrlConst;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3116ri {

    /* JADX INFO: renamed from: ri */
    private static volatile C3116ri f9955ri;

    /* JADX INFO: renamed from: lr */
    private String f9960lr;

    /* JADX INFO: renamed from: ik */
    private final Map<wjv, lr> f9958ik = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ka */
    private final Map<String, JSONObject> f9959ka = new ConcurrentHashMap();

    /* JADX INFO: renamed from: fi */
    private final AtomicBoolean f9957fi = new AtomicBoolean(false);

    /* JADX INFO: renamed from: di */
    private final Set<String> f9956di = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, C2743ri> xha = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: mj */
    private final Map<String, String> f9961mj = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ik.ri$lr */
    private static class lr {

        /* JADX INFO: renamed from: ik */
        long f9974ik;

        /* JADX INFO: renamed from: ka */
        long f9975ka;

        /* JADX INFO: renamed from: lr */
        long f9976lr;

        /* JADX INFO: renamed from: ri */
        long f9977ri;

        private lr() {
        }

        /* JADX INFO: renamed from: ik */
        public lr m12688ik(long j) {
            this.f9974ik = j;
            return this;
        }

        /* JADX INFO: renamed from: ka */
        public lr m12689ka(long j) {
            this.f9975ka = j;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public long m12690lr() {
            return this.f9975ka - this.f9974ik;
        }

        /* JADX INFO: renamed from: lr */
        public lr m12691lr(long j) {
            this.f9976lr = j;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public long m12692ri() {
            return this.f9976lr - this.f9977ri;
        }

        /* JADX INFO: renamed from: ri */
        public lr m12693ri(long j) {
            this.f9977ri = j;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ik.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11678ri(boolean z);
    }

    private C3116ri() {
    }

    /* JADX INFO: renamed from: fi */
    private String m12662fi() {
        if (TextUtils.isEmpty(this.f9960lr)) {
            try {
                File fileM10330ri = xha.m10330ri(C3299nr.m14642ri(), C3299nr.m14642ri().getCacheDir(), "playable");
                if (!fileM10330ri.exists()) {
                    fileM10330ri.mkdirs();
                }
                this.f9960lr = fileM10330ri.getAbsolutePath();
            } catch (Throwable th) {
                C2707ac.m10196ik("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.f9960lr;
    }

    /* JADX INFO: renamed from: fi */
    private boolean m12664fi(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    /* JADX INFO: renamed from: ik */
    public static void m12666ik(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public File m12667ka(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return m12664fi(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public String m12668ka() {
        File file = new File(m12662fi(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: lr */
    public static void m12671lr(File file) {
        m12666ik(file);
        try {
            C3304qt.m14669lr().m14679aw().m15733ri(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3116ri m12672ri() {
        if (f9955ri == null) {
            synchronized (C3116ri.class) {
                if (f9955ri == null) {
                    f9955ri = new C3116ri();
                }
            }
        }
        return f9955ri;
    }

    /* JADX INFO: renamed from: ri */
    public static File m12674ri(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return m12674ri(file3);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private String m12676ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit != null && strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            if (str2 != null && str2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(0, strArrSplit.length - 1);
            }
            String str3 = strArrSplit[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = strArrSplit[0];
            }
        }
        return str.replace("index.html", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public JSONObject m12678ri(File file, boolean z) {
        byte[] bArrM10327ka;
        try {
            if (!m12664fi(file) || (bArrM10327ka = xha.m10327ka(file)) == null || bArrM10327ka.length <= 0) {
                return null;
            }
            String strM10270ik = TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat") ? C2726ri.m10270ik(new String(bArrM10327ka)) : C2643ri.m9833lr(new String(bArrM10327ka), C3309ri.m14749lr());
            if (TextUtils.isEmpty(strM10270ik)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM10270ik);
            if (z && jSONObject.length() > 0) {
                this.f9959ka.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12679ri(final ri riVar, final boolean z) {
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ik.ri.3
            @Override // java.lang.Runnable
            public void run() {
                ri riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.mo11678ri(z);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private boolean m12681ri(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.f9959ka.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(C2717fi.m10219ri(file))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ik */
    public Map<String, String> m12682ik() {
        return this.f9961mj;
    }

    /* JADX INFO: renamed from: lr */
    public void m12683lr() {
        if (C3307lr.m14718ri().m14722fi() || this.f9957fi.get()) {
            return;
        }
        dzy.m16409ri(new AbstractRunnableC2676ik("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.bgr.ik.ri.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strM12668ka = C3116ri.this.m12668ka();
                    if (!TextUtils.isEmpty(strM12668ka)) {
                        File file = new File(strM12668ka);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileM12674ri = C3116ri.m12674ri(file2);
                                        if (fileM12674ri != null && fileM12674ri.exists()) {
                                            C3116ri.this.f9961mj.put(file2.getName(), fileM12674ri.getAbsolutePath());
                                        }
                                        C3116ri.this.m12678ri(C3116ri.this.m12667ka(fileM12674ri), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                C3549ik.m16251ri().m16260ri(C3116ri.this.f9961mj);
                C3116ri.this.f9957fi.set(true);
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public void m12684lr(wjv wjvVar) {
        if (wjvVar == null || wjvVar.m14389eu() == null || TextUtils.isEmpty(wjvVar.m14389eu().m6336aw()) || !C3606fi.m16710ri("can_cancel_playable", false)) {
            return;
        }
        C2743ri c2743ri = this.xha.get(wjvVar.m14389eu().m6336aw());
        if (c2743ri != null) {
            c2743ri.mo10369lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    public WebResourceResponse m12685ri(String str, String str2, String str3) {
        String mimeTypeFromExtension;
        File fileM12674ri;
        try {
            WebResourceResponse webResourceResponseM16259ri = C3549ik.m16251ri().m16259ri(str3);
            if (webResourceResponseM16259ri != null) {
                return webResourceResponseM16259ri;
            }
            if (this.f9957fi.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                try {
                    if ((str3.startsWith("http://") || str3.startsWith(UrlConst.HTTPS)) && str3.contains("?")) {
                        str3 = str3.split("\\?")[0];
                        if (str3.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                            str3 = str3.substring(0, str3.length() - 1);
                        }
                    }
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
                } catch (Throwable unused) {
                    mimeTypeFromExtension = null;
                }
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                String strM10220ri = C2717fi.m10220ri(str);
                if (TextUtils.isEmpty(strM10220ri)) {
                    return null;
                }
                String str4 = this.f9961mj.get(strM10220ri);
                if (TextUtils.isEmpty(str4)) {
                    fileM12674ri = m12674ri(new File(m12668ka(), strM10220ri));
                    if (fileM12674ri != null && fileM12674ri.exists()) {
                        this.f9961mj.put(strM10220ri, fileM12674ri.getAbsolutePath());
                    }
                } else {
                    fileM12674ri = new File(str4);
                }
                if (fileM12674ri != null && fileM12674ri.exists()) {
                    String strM12676ri = m12676ri(str2);
                    if (TextUtils.isEmpty(strM12676ri)) {
                        return null;
                    }
                    String strReplace = str3.replace(strM12676ri, "");
                    if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith(UrlConst.HTTPS) && !strReplace.startsWith("http://")) {
                        File file = new File(fileM12674ri, strReplace);
                        if (file.exists() && m12681ri(strM10220ri, strReplace, file) && file.getCanonicalPath().startsWith(fileM12674ri.getCanonicalPath())) {
                            return new WebResourceResponse(mimeTypeFromExtension, C11341A5.f23802O, new FileInputStream(file));
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C2707ac.m10206ri("PlayableCache", "playable intercept error: ", th);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m12686ri(final wjv wjvVar, final ri riVar) {
        File file;
        if (C3550ka.m16268ri().m16269lr() && wjvVar != null && C3279dw.m14086di(wjvVar) && wjvVar.m14388eb() != null && !TextUtils.isEmpty(wjvVar.m14388eb().getBidAdm())) {
            C3115lr.m12659ri(wjvVar, -705, "server bidding pre render");
            m12679ri(riVar, false);
            return;
        }
        if (wjvVar == null || wjvVar.m14389eu() == null || TextUtils.isEmpty(wjvVar.m14389eu().m6336aw())) {
            C3115lr.m12659ri(wjvVar, -701, (String) null);
            m12679ri(riVar, false);
            return;
        }
        final String strM6336aw = wjvVar.m14389eu().m6336aw();
        if (this.f9956di.contains(strM6336aw)) {
            return;
        }
        this.f9958ik.put(wjvVar, new lr().m12693ri(System.currentTimeMillis()));
        C3115lr.m12658ri(wjvVar);
        String strM10220ri = C2717fi.m10220ri(strM6336aw);
        final File file2 = new File(m12668ka(), strM10220ri);
        String str = this.f9961mj.get(strM10220ri);
        if (TextUtils.isEmpty(str)) {
            file = m12674ri(file2);
            if (file != null && file.exists()) {
                this.f9961mj.put(strM10220ri, file.getAbsolutePath());
            }
        } else {
            file = new File(str);
        }
        if (file != null && file.exists()) {
            C3115lr.m12659ri(wjvVar, -702, (String) null);
            m12666ik(file2);
            this.f9958ik.remove(wjvVar);
            m12679ri(riVar, true);
            return;
        }
        try {
            xha.m10326ik(file2);
        } catch (Throwable unused) {
        }
        this.f9956di.add(strM6336aw);
        File file3 = new File(m12662fi(), strM10220ri + ".zip");
        C2743ri c2743riM10411ka = C2751lr.m10463lr().m10466ik().m10411ka();
        this.xha.put(strM6336aw, c2743riM10411ka);
        c2743riM10411ka.m10365ik(strM6336aw);
        c2743riM10411ka.m10404ri(file3.getParent(), file3.getName());
        c2743riM10411ka.m10373ri(7);
        c2743riM10411ka.m10371lr("playable_download");
        c2743riM10411ka.m10403ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ik.ri.2
            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10425ri(AbstractC2740ik abstractC2740ik, final C2739lr c2739lr) {
                C3116ri.this.f9956di.remove(strM6336aw);
                C3116ri.this.xha.remove(strM6336aw);
                final lr lrVar = (lr) C3116ri.this.f9958ik.remove(wjvVar);
                if (lrVar != null) {
                    lrVar.m12691lr(System.currentTimeMillis());
                }
                if (c2739lr.m10354di() && c2739lr.m10355fi() != null && c2739lr.m10355fi().exists()) {
                    dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.bgr.ik.ri.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z;
                            long jM12692ri;
                            long jM12690lr;
                            try {
                                lr lrVar2 = lrVar;
                                if (lrVar2 != null) {
                                    lrVar2.m12688ik(System.currentTimeMillis());
                                }
                                ory.m10265ri(c2739lr.m10355fi().getAbsolutePath(), file2.getAbsolutePath());
                                lr lrVar3 = lrVar;
                                if (lrVar3 != null) {
                                    lrVar3.m12689ka(System.currentTimeMillis());
                                }
                                lr lrVar4 = lrVar;
                                if (lrVar4 != null) {
                                    jM12692ri = lrVar4.m12692ri();
                                    jM12690lr = lrVar.m12690lr();
                                } else {
                                    jM12692ri = 0;
                                    jM12690lr = 0;
                                }
                                C3115lr.m12660ri(wjvVar, jM12692ri, jM12690lr);
                                C3116ri.m12671lr(file2);
                                z = true;
                                try {
                                    File fileM12674ri = C3116ri.m12674ri(file2);
                                    if (fileM12674ri != null && fileM12674ri.exists()) {
                                        C3116ri.this.f9961mj.put(file2.getName(), fileM12674ri.getAbsolutePath());
                                    }
                                    C3116ri.this.m12678ri(C3116ri.this.m12667ka(fileM12674ri), true);
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable th) {
                                C2707ac.m10206ri("PlayableCache", "unzip error: ", th);
                                C3115lr.m12659ri(wjvVar, -704, th.getMessage());
                                z = false;
                            }
                            try {
                                c2739lr.m10355fi().delete();
                            } catch (Throwable unused3) {
                            }
                            C3116ri.this.m12679ri(riVar, z);
                        }
                    });
                } else {
                    C3115lr.m12659ri(wjvVar, c2739lr.m10359ri() != 0 ? c2739lr.m10359ri() : -700, (String) null);
                    C3116ri.this.m12679ri(riVar, false);
                }
            }

            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                C3116ri.this.f9956di.remove(strM6336aw);
                C3116ri.this.xha.remove(strM6336aw);
                C3116ri.this.f9958ik.remove(wjvVar);
                C3115lr.m12659ri(wjvVar, -700, iOException.getMessage());
                C3116ri.this.m12679ri(riVar, false);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public boolean m12687ri(wjv wjvVar) {
        if (this.f9957fi.get() && wjvVar != null && wjvVar.m14389eu() != null && wjvVar.m14389eu().m6336aw() != null) {
            try {
                if (!TextUtils.isEmpty(this.f9961mj.get(C2717fi.m10220ri(wjvVar.m14389eu().m6336aw())))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
