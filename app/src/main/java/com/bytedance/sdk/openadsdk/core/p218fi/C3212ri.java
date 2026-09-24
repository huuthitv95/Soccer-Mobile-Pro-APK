package com.bytedance.sdk.openadsdk.core.p218fi;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2743ri;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3114ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fi.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3212ri {

    /* JADX INFO: renamed from: ri */
    private final List<String> f10643ri = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: lr */
    private final C3114ik f10642lr = new C3114ik(5, 5, true);

    /* JADX INFO: renamed from: ik */
    private final ConcurrentHashMap<String, Long> f10641ik = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.fi.ri$ri */
    private static class ri {

        /* JADX INFO: renamed from: ri */
        private static final C3212ri f10653ri = new C3212ri();
    }

    /* JADX INFO: renamed from: ik */
    private boolean m13463ik(String str) {
        return !this.f10643ri.contains(str);
    }

    /* JADX INFO: renamed from: ri */
    public static C3212ri m13464ri() {
        return ri.f10653ri;
    }

    /* JADX INFO: renamed from: ri */
    private File m13465ri(Context context) {
        return xha.m10328lr(context, new File(CacheDirFactory.getRootDir()).getName() + "/music");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13467ri(final int i, final long j, final int i2, final String str) {
        C3521ka.m15952ri("music_preload_finish", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.fi.ri.3
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i);
                long j2 = j;
                if (j2 != -1) {
                    jSONObject.put("load_duration", j2);
                }
                C3531ka c3531kaM15980lr = C3531ka.m15967lr().m15985ri("music_preload_finish").m15980lr(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    c3531kaM15980lr.m15979lr(i2);
                    c3531kaM15980lr.m15971di(str);
                }
                c3531kaM15980lr.mo15966ri();
                return c3531kaM15980lr;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m13469ri(wjv wjvVar) {
        wjv.C3296ri c3296riSez;
        String strJbs;
        if (wjvVar == null || (c3296riSez = wjvVar.sez()) == null || (strJbs = c3296riSez.jbs()) == null || !strJbs.contains("music_url")) {
            return;
        }
        m13472ik();
        String strM14591lr = c3296riSez.m14591lr();
        if (TextUtils.isEmpty(strM14591lr)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e) {
                C2707ac.m10196ik("MusicCacheManager", e.getMessage());
            }
            m13467ri(0, -1L, 10001, "music url string is null");
            return;
        }
        File fileM13473lr = m13473lr(strM14591lr);
        if (fileM13473lr == null) {
            return;
        }
        fileM13473lr.getPath();
        if (m13471ri(fileM13473lr)) {
            Boolean bool = Boolean.TRUE;
            m13467ri(2, -1L, -1, null);
        } else {
            Boolean bool2 = Boolean.FALSE;
            m13470ri(wjvVar, strM14591lr, fileM13473lr);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13470ri(wjv wjvVar, String str, File file) {
        if (m13463ik(str)) {
            this.f10641ik.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            C2743ri c2743riM10411ka = C2751lr.m10463lr().m10466ik().m10411ka();
            c2743riM10411ka.m10365ik(str);
            c2743riM10411ka.m10404ri(file.getParent(), file.getName());
            c2743riM10411ka.m10367ka(str);
            this.f10643ri.add(str);
            c2743riM10411ka.m10403ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.fi.ri.1
                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                    c2739lr.m10356ik();
                    Integer.valueOf(c2739lr.m10359ri());
                    String strM10366ka = abstractC2740ik.m10366ka();
                    Long l = (Long) C3212ri.this.f10641ik.get(strM10366ka);
                    if (c2739lr.m10354di() && c2739lr.m10355fi() != null && c2739lr.m10355fi().exists()) {
                        c2739lr.m10355fi();
                        if (l != null) {
                            C3212ri.this.f10641ik.remove(strM10366ka);
                            C3212ri.this.m13467ri(1, SystemClock.elapsedRealtime() - l.longValue(), -1, null);
                        }
                        try {
                            xha.m10329lr(c2739lr.m10355fi());
                        } catch (IOException e) {
                            C2707ac.m10196ik("MusicCacheManager", e.getMessage());
                        }
                    }
                    if (c2739lr.m10354di() || l == null) {
                        return;
                    }
                    C3212ri.this.m13467ri(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                    Long l = (Long) C3212ri.this.f10641ik.get(abstractC2740ik.m10366ka());
                    if (l != null) {
                        C3212ri.this.m13467ri(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m13471ri(File file) {
        return file.exists() && file.length() != 0;
    }

    /* JADX INFO: renamed from: ik */
    public void m13472ik() {
        C3521ka.m15952ri("music_preload_start", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.fi.ri.2
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                C3531ka c3531kaM15985ri = C3531ka.m15967lr().m15985ri("music_preload_start");
                c3531kaM15985ri.mo15966ri();
                return c3531kaM15985ri;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public File m13473lr(String str) {
        String strM10220ri = C2717fi.m10220ri(str);
        if (strM10220ri == null) {
            return null;
        }
        File fileM13465ri = m13465ri(C3299nr.m14642ri());
        fileM13465ri.getAbsoluteFile();
        return new File(fileM13465ri, strM10220ri);
    }

    /* JADX INFO: renamed from: lr */
    public void m13474lr() {
        File fileM13465ri = m13465ri(C3299nr.m14642ri());
        fileM13465ri.getAbsolutePath();
        try {
            this.f10642lr.m15733ri(fileM13465ri);
        } catch (IOException e) {
            C2707ac.m10206ri("MusicCacheManager", "trimFileCache fail", e);
        }
    }

    /* JADX INFO: renamed from: ri */
    public InputStream m13475ri(String str) {
        File fileM13473lr = m13473lr(str);
        if (fileM13473lr == null || !m13471ri(fileM13473lr)) {
            return null;
        }
        try {
            return new FileInputStream(fileM13473lr);
        } catch (Exception e) {
            C2707ac.m10196ik("MusicCacheManager", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13476ri(C3289ri c3289ri) {
        List<wjv> listM14252ka = c3289ri.m14252ka();
        if (listM14252ka == null || listM14252ka.size() == 0) {
            return;
        }
        for (int i = 0; i < listM14252ka.size(); i++) {
            wjv wjvVar = listM14252ka.get(i);
            if (wjvVar != null) {
                m13469ri(wjvVar);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13477ri(final boolean z) {
        C3521ka.m15952ri("music_cache", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.fi.ri.4
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z);
                C3531ka c3531kaM15980lr = C3531ka.m15967lr().m15985ri("music_cache").m15980lr(jSONObject.toString());
                c3531kaM15980lr.mo15966ri();
                return c3531kaM15980lr;
            }
        });
    }
}
