package com.bytedance.sdk.openadsdk.p266uq.p268ri;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.ory;
import com.bytedance.sdk.component.utils.slm;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.component.xha.p170lr.C2743ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.jbs.C3390ka;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p266uq.p267lr.C3545ri;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.ironsource.C11540L6;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3549ik {

    /* JADX INFO: renamed from: ri */
    private static volatile C3549ik f13030ri;

    /* JADX INFO: renamed from: fi */
    private final Set<String> f13031fi = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: ik */
    private String f13032ik;

    /* JADX INFO: renamed from: ka */
    private String f13033ka;

    /* JADX INFO: renamed from: lr */
    private String f13034lr;

    /* JADX INFO: renamed from: di */
    private String m16245di() {
        if (TextUtils.isEmpty(this.f13033ka)) {
            String str = m16249ka() + File.separator + "pregames";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f13033ka = str;
        }
        return this.f13033ka;
    }

    /* JADX INFO: renamed from: fi */
    private String m16246fi() {
        if (TextUtils.isEmpty(this.f13032ik)) {
            String str = m16249ka() + File.separator + "common";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f13032ik = str;
        }
        return this.f13032ik;
    }

    /* JADX INFO: renamed from: ik */
    private static String m16247ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m16248ik() {
        dzy.m16409ri(new AbstractRunnableC2676ik("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.2
            @Override // java.lang.Runnable
            public void run() {
                C3545ri c3545riM16130lr = C3545ri.m16130lr(C3535ri.m16058lr("pag_plb_config", C11540L6.f24899B, ""));
                if (c3545riM16130lr != null) {
                    C3549ik.this.m16252ri(c3545riM16130lr, null, 0);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ka */
    private String m16249ka() {
        if (TextUtils.isEmpty(this.f13034lr)) {
            try {
                File fileM10330ri = xha.m10330ri(C3299nr.m14642ri(), C3299nr.m14642ri().getCacheDir(), "playable");
                if (!fileM10330ri.exists()) {
                    fileM10330ri.mkdirs();
                }
                this.f13034lr = fileM10330ri.getAbsolutePath();
            } catch (Throwable th) {
                C2707ac.m10196ik("PlayableResManager", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.f13034lr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m16250lr(final String str) {
        dzy.m16409ri(new AbstractRunnableC2676ik("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.4
            @Override // java.lang.Runnable
            public void run() {
                C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
                try {
                    c2742lrM10410ik.m10365ik(C3390ka.m15343ri(c2742lrM10410ik, str));
                    C2739lr c2739lrM10391ri = c2742lrM10410ik.m10391ri();
                    if (c2739lrM10391ri == null || !c2739lrM10391ri.m10354di()) {
                        return;
                    }
                    String strM10357ka = c2739lrM10391ri.m10357ka();
                    C3545ri c3545riM16130lr = C3545ri.m16130lr(strM10357ka);
                    C3535ri.m16075ri("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (c3545riM16130lr != null) {
                        C3545ri c3545riM16130lr2 = C3545ri.m16130lr(C3535ri.m16058lr("pag_plb_config", C11540L6.f24899B, ""));
                        if (c3545riM16130lr2 == null || !c3545riM16130lr.m16134ri().equals(c3545riM16130lr2.m16134ri())) {
                            C3535ri.m16077ri("pag_plb_config", C11540L6.f24899B, strM10357ka);
                            C3549ik.this.m16252ri(c3545riM16130lr, c3545riM16130lr2, 1);
                        }
                    }
                } catch (Exception e) {
                    C2707ac.m10196ik("PlayableResManager", e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static C3549ik m16251ri() {
        if (f13030ri == null) {
            synchronized (C3549ik.class) {
                if (f13030ri == null) {
                    f13030ri = new C3549ik();
                }
            }
        }
        return f13030ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public synchronized void m16252ri(C3545ri c3545ri, C3545ri c3545ri2, int i) {
        List<C3545ri.ri> listM16131ik = null;
        m16257ri(c3545ri.m16132lr(), c3545ri2 == null ? null : c3545ri2.m16132lr(), 1, i);
        List<C3545ri.ri> listM16131ik2 = c3545ri.m16131ik();
        if (c3545ri2 != null) {
            listM16131ik = c3545ri2.m16131ik();
        }
        m16257ri(listM16131ik2, listM16131ik, 2, i);
    }

    /* JADX INFO: renamed from: ri */
    private void m16256ri(final String str, final String str2, final String str3, final int i, final File file, final boolean z) {
        String strConcat;
        if (this.f13031fi.contains(str)) {
            return;
        }
        if (i == 2) {
            strConcat = str3 + ".zip";
        } else {
            strConcat = z ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.f13031fi.add(str);
        C2743ri c2743riM10411ka = C2751lr.m10463lr().m10466ik().m10411ka();
        c2743riM10411ka.m10365ik(str);
        c2743riM10411ka.m10404ri(str2, strConcat);
        final C2739lr c2739lrM10402ri = c2743riM10411ka.m10402ri();
        this.f13031fi.remove(str);
        if (c2739lrM10402ri != null && c2739lrM10402ri.m10354di() && c2739lrM10402ri.m10355fi() != null && c2739lrM10402ri.m10355fi().exists()) {
            if (i == 2) {
                dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("downloadZip") { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (z) {
                                file.delete();
                            }
                            String str4 = str2 + File.separator + str3;
                            ory.m10265ri(c2739lrM10402ri.m10355fi().getAbsolutePath(), str4);
                            File file2 = new File(str4);
                            File fileM12674ri = C3116ri.m12674ri(file2);
                            if (fileM12674ri != null && fileM12674ri.exists()) {
                                C3116ri.m12672ri().m12682ik().put(file2.getName(), fileM12674ri.getAbsolutePath());
                            }
                            C3116ri.m12671lr(file2);
                        } catch (Throwable th) {
                            C2707ac.m10197ik("PlayableResManager", "unzip error: ", th, "tp=", Integer.valueOf(i), ", url=", str);
                        }
                        try {
                            c2739lrM10402ri.m10355fi().delete();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            } else {
                if (z) {
                    file.delete();
                    c2739lrM10402ri.m10355fi().renameTo(file);
                    return;
                }
                return;
            }
        }
        File file2 = new File(str2 + File.separator + str3 + ".tmp");
        if (file2.exists()) {
            try {
                file2.delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m16257ri(List<C3545ri.ri> list, List<C3545ri.ri> list2, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strM16246fi = i == 1 ? m16246fi() : m16245di();
        for (C3545ri.ri riVar : list) {
            String strM16139ri = riVar.m16139ri();
            String strM10282ri = slm.m10282ri(strM16139ri);
            if (!TextUtils.isEmpty(strM10282ri)) {
                if (i == 1) {
                    strM10282ri = strM10282ri + m16247ik(strM16139ri);
                }
                String str = strM10282ri;
                File file = new File(strM16246fi, str);
                boolean zExists = file.exists();
                if (i2 == 1) {
                    if (zExists && list2 != null && list2.contains(riVar)) {
                        Integer.valueOf(i);
                        C3116ri.m12666ik(file);
                    } else {
                        int i3 = i;
                        m16256ri(strM16139ri, strM16246fi, str, i3, file, zExists);
                        i = i3;
                    }
                } else if (zExists) {
                    Integer.valueOf(i);
                } else {
                    int i4 = i;
                    m16256ri(strM16139ri, strM16246fi, str, i4, file, zExists);
                    i = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m16258lr() {
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri() || C3307lr.m14718ri().m14722fi()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - C3535ri.m16065ri("pag_plb_config", "last_update_time", 0L);
        final String strM16707ri = C3606fi.m16707ri("plb_res", "");
        long jM16703ri = C3606fi.m16703ri("plb_res_fetch_interval", Constants.ONE_HOUR);
        if (jM16703ri <= 0 || jM16703ri > 259200000) {
            jM16703ri = 3600000;
        }
        if (jCurrentTimeMillis < jM16703ri || TextUtils.isEmpty(strM16707ri)) {
            return;
        }
        int iM16703ri = C3606fi.m16703ri("plb_res_delay_fetch_time", 0);
        if (iM16703ri <= 0) {
            m16250lr(strM16707ri);
        } else {
            C3332vr.m14978lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.3
                @Override // java.lang.Runnable
                public void run() {
                    C3549ik.this.m16250lr(strM16707ri);
                }
            }, iM16703ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public WebResourceResponse m16259ri(String str) {
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri()) {
            return null;
        }
        String strM10282ri = slm.m10282ri(str);
        if (TextUtils.isEmpty(strM10282ri)) {
            return null;
        }
        File file = new File(m16246fi(), strM10282ri + m16247ik(str));
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, "UTF-8", new FileInputStream(file));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m16260ri(Map<String, String> map) {
        File[] fileArrListFiles;
        if (com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri()) {
            String strM16245di = m16245di();
            if (!TextUtils.isEmpty(strM16245di)) {
                File file = new File(strM16245di);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileM12674ri = C3116ri.m12674ri(file2);
                                if (fileM12674ri != null && fileM12674ri.exists()) {
                                    map.put(file2.getName(), fileM12674ri.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iM16703ri = C3606fi.m16703ri("plb_res_delay_fetch_time", 0);
            if (iM16703ri <= 0) {
                m16248ik();
            } else {
                C3332vr.m14978lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3549ik.this.m16248ik();
                    }
                }, iM16703ri);
            }
        }
    }
}
