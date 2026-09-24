package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2947lr {

    /* JADX INFO: renamed from: di */
    private final Map<wjv, Long> f8844di = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: fi */
    private final String f8845fi;

    /* JADX INFO: renamed from: ik */
    private final Context f8846ik;

    /* JADX INFO: renamed from: ka */
    private final ri f8847ka;

    /* JADX INFO: renamed from: ri */
    private static final HashMap<String, C2947lr> f8843ri = new HashMap<>();

    /* JADX INFO: renamed from: lr */
    private static final HashMap<String, ri> f8842lr = new HashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.lr$ri */
    public static class ri {

        /* JADX INFO: renamed from: ri */
        protected final String f8854ri;
        private final HashSet<String> xha = new HashSet<>();

        /* JADX INFO: renamed from: lr */
        String f8853lr = "material_data";

        /* JADX INFO: renamed from: ik */
        String f8851ik = "has_played";

        /* JADX INFO: renamed from: ka */
        String f8852ka = "create_time";

        /* JADX INFO: renamed from: fi */
        String f8850fi = "in_use_process";

        /* JADX INFO: renamed from: di */
        String f8849di = "req_id";

        public ri(String str) {
            this.f8854ri = TextUtils.isEmpty(str) ? "" : str;
        }

        /* JADX INFO: renamed from: di */
        public void m11370di(String str) {
            try {
                C3535ri.m16077ri(mo11376ri(str), this.f8850fi, com.bytedance.sdk.component.utils.ihz.m10227lr(C3299nr.m14642ri()));
                this.xha.add(str);
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: renamed from: fi */
        public boolean m11371fi(String str) {
            try {
                return C3535ri.m16080ri(mo11376ri(str), this.f8851ik, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        /* JADX INFO: renamed from: ik */
        public String m11372ik(String str) {
            try {
                return C3535ri.m16058lr(mo11376ri(str), this.f8849di, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: ka */
        public long m11373ka(String str) {
            try {
                return C3535ri.m16065ri(mo11376ri(str), this.f8852ka, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        /* JADX INFO: renamed from: lr */
        public String mo11374lr(String str) {
            try {
                return C3535ri.m16058lr(mo11376ri(str), this.f8853lr, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: mj */
        public void m11375mj(String str) {
            try {
                C3535ri.m16071ri(mo11376ri(str));
                this.xha.remove(str);
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: renamed from: ri */
        protected String mo11376ri(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return this.f8854ri + "_cache_" + str;
        }

        /* JADX INFO: renamed from: ri */
        public void mo11377ri(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strMo11376ri = mo11376ri(codeId);
                C3535ri.m16073ri(strMo11376ri, this.f8851ik, Boolean.FALSE);
                C3535ri.m16075ri(strMo11376ri, this.f8852ka, Long.valueOf(System.currentTimeMillis()));
                C3535ri.m16077ri(strMo11376ri, this.f8853lr, str);
                C3535ri.m16077ri(strMo11376ri, this.f8850fi, "");
                C3535ri.m16077ri(strMo11376ri, this.f8849di, str2);
                this.xha.remove(codeId);
            } catch (Throwable unused) {
            }
        }

        public boolean xha(String str) {
            try {
                String strMo11376ri = mo11376ri(str);
                String strM16058lr = C3535ri.m16058lr(strMo11376ri, this.f8850fi, "");
                if (TextUtils.isEmpty(strM16058lr)) {
                    return false;
                }
                if (strM16058lr.equals(com.bytedance.sdk.component.utils.ihz.m10227lr(C3299nr.m14642ri())) && !this.xha.contains(str)) {
                    C3535ri.m16077ri(strMo11376ri, this.f8850fi, "");
                    return false;
                }
            } catch (Throwable unused) {
            }
            return true;
        }
    }

    private C2947lr(Context context, String str) {
        this.f8846ik = context;
        ri riVar = f8842lr.get(str);
        this.f8847ka = riVar == null ? new ri(str) : riVar;
        this.f8845fi = str;
    }

    /* JADX INFO: renamed from: lr */
    private String m11357lr() {
        return CacheDirFactory.getICacheDir(0).mo6274ri();
    }

    /* JADX INFO: renamed from: ri */
    public static C2947lr m11358ri(String str) {
        C2947lr c2947lr;
        HashMap<String, C2947lr> map = f8843ri;
        C2947lr c2947lr2 = map.get(str);
        if (c2947lr2 != null) {
            return c2947lr2;
        }
        synchronized (C2947lr.class) {
            c2947lr = map.get(str);
            if (c2947lr == null) {
                c2947lr = new C2947lr(C3299nr.m14642ri(), str);
                map.put(str, c2947lr);
            }
        }
        return c2947lr;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11360ri(String str, ri riVar) {
        f8842lr.put(str, riVar);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m11361ri(wjv wjvVar) {
        if (wjvVar != null) {
            return C3279dw.m14090ik(wjvVar) || wjvVar.m14389eu() != null;
        }
        return false;
    }

    /* JADX INFO: renamed from: ik */
    public void m11362ik(String str) {
        this.f8847ka.m11370di(str);
    }

    /* JADX INFO: renamed from: ka */
    public boolean m11363ka(String str) {
        return this.f8847ka.xha(str);
    }

    /* JADX INFO: renamed from: lr */
    public String m11364lr(String str) {
        try {
            String strMo11374lr = this.f8847ka.mo11374lr(str);
            if (TextUtils.isEmpty(strMo11374lr)) {
                return null;
            }
            return strMo11374lr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public String m11365ri(String str, long j) {
        long jM11373ka = this.f8847ka.m11373ka(str);
        boolean zM11371fi = this.f8847ka.m11371fi(str);
        if (System.currentTimeMillis() - jM11373ka >= j || zM11371fi) {
            return null;
        }
        return m11364lr(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m11366ri() {
        File[] fileArrListFiles;
        try {
            boolean zXha = C3304qt.xha(this.f8845fi);
            String str = zXha ? "files" : "shared_prefs";
            File file = Build.VERSION.SDK_INT >= 24 ? new File(this.f8846ik.getDataDir(), str) : new File(this.f8846ik.getDatabasePath("1").getParentFile().getParentFile(), str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.lr.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(C2947lr.this.f8845fi);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zXha) {
                        try {
                            com.bytedance.sdk.component.utils.xha.m10326ik(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String strReplace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.f8846ik.deleteSharedPreferences(strReplace);
                        } else {
                            this.f8846ik.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.xha.m10326ik(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(m11357lr());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.xha.m10326ik(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11367ri(AdSlot adSlot, C3289ri c3289ri) {
        wjv wjvVarM14248di;
        if ((c3289ri != null && c3289ri.m14248di() != null && c3289ri.m14248di().m14367bl()) || c3289ri == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (wjvVarM14248di = c3289ri.m14248di()) == null || wjvVarM14248di.m14573zm() == 2) {
            return;
        }
        try {
            this.f8847ka.mo11377ri(adSlot, c3289ri.m14267sf(), c3289ri.m14253lr());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11368ri(String str, wjv wjvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strM11372ik = this.f8847ka.m11372ik(str);
        String strM14424jf = wjvVar != null ? wjvVar.m14424jf() : "";
        if (TextUtils.isEmpty(strM11372ik) || TextUtils.isEmpty(strM14424jf) || strM11372ik.equals(strM14424jf)) {
            this.f8847ka.m11375mj(str);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11369ri(C3289ri c3289ri, boolean z) {
        if (c3289ri == null || !c3289ri.m14249fi()) {
            return false;
        }
        if (z) {
            Iterator<wjv> it = c3289ri.m14252ka().iterator();
            while (it.hasNext()) {
                if (!m11361ri(it.next())) {
                    it.remove();
                }
            }
        }
        return c3289ri.m14249fi();
    }
}
