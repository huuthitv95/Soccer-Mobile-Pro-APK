package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.adexpress.p124ka.C2498ri;
import com.bytedance.sdk.component.p145fi.InterfaceC2622mj;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.C2947lr;
import com.bytedance.sdk.openadsdk.common.C2949nr;
import com.bytedance.sdk.openadsdk.component.p182fi.C2964ri;
import com.bytedance.sdk.openadsdk.component.p184ka.C2976ri;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3331uq;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p195fi.C3113ri;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.hcw;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.p172ac.C2752ri;
import com.bytedance.sdk.openadsdk.p172ac.p173ri.C2754lr;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import com.bytedance.sdk.openadsdk.p244lr.C3472lr;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3563bu;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2958di {

    /* JADX INFO: renamed from: lr */
    private static volatile C2958di f8901lr = null;

    /* JADX INFO: renamed from: ri */
    private static String f8902ri = "openad_image_cache";

    /* JADX INFO: renamed from: fi */
    private final Context f8904fi;

    /* JADX INFO: renamed from: ik */
    private final C3472lr f8905ik;

    /* JADX INFO: renamed from: ka */
    private final wjv<C3430ri> f8906ka;

    /* JADX INFO: renamed from: di */
    private final Map<String, AtomicInteger> f8903di = new ConcurrentHashMap();
    private final Map<String, String> xha = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.di$ik */
    public interface ik {
        /* JADX INFO: renamed from: ri */
        void mo11477ri(Object obj);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.di$lr */
    /* JADX INFO: loaded from: classes9.dex */
    interface lr {
        /* JADX INFO: renamed from: ri */
        void mo11473ri();

        /* JADX INFO: renamed from: ri */
        void mo11474ri(int i, String str);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.di$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11475ri();

        /* JADX INFO: renamed from: ri */
        void mo11476ri(C2754lr c2754lr);
    }

    private C2958di(Context context) {
        if (context != null) {
            this.f8904fi = context.getApplicationContext();
        } else {
            this.f8904fi = C3299nr.m14642ri();
        }
        this.f8905ik = new C3472lr(10, 8, true);
        this.f8906ka = C3299nr.m14638ik();
        f8902ri += "_p";
        C2947lr.m11360ri("tt_openad_materialMeta_new", new C2947lr.ri("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.di.1
            @Override // com.bytedance.sdk.openadsdk.common.C2947lr.ri
            /* JADX INFO: renamed from: lr */
            public String mo11374lr(String str) {
                return C3535ri.m16058lr("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2947lr.ri
            /* JADX INFO: renamed from: ri */
            protected String mo11376ri(String str) {
                return "tt_openad_materialMeta_new";
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2947lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11377ri(AdSlot adSlot, String str, String str2) {
                C3535ri.m16077ri("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m11444ik(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.f8903di.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.f8903di.put(adSlot.getCodeId(), atomicInteger);
    }

    /* JADX INFO: renamed from: ik */
    private void m11445ik(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final AdSlot adSlot, final hcw hcwVar, final C3289ri c3289ri) {
        if (C3087ri.m12350fi()) {
            m11467ri(wjvVar, adSlot, hcwVar, c3289ri);
        }
        m11468ri(wjvVar, hcwVar, new ri() { // from class: com.bytedance.sdk.openadsdk.component.di.8
            @Override // com.bytedance.sdk.openadsdk.component.C2958di.ri
            /* JADX INFO: renamed from: ri */
            public void mo11475ri() {
                C2958di.this.m11444ik(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.C2958di.ri
            /* JADX INFO: renamed from: ri */
            public void mo11476ri(C2754lr c2754lr) {
                if (C3087ri.m12350fi()) {
                    return;
                }
                C2958di.this.m11467ri(wjvVar, adSlot, hcwVar, c3289ri);
            }
        });
    }

    /* JADX INFO: renamed from: ka */
    private int m11446ka(AdSlot adSlot) {
        long jM16065ri = C3535ri.m16065ri("tt_openad", "material_expiration_time" + adSlot.getCodeId(), -1L);
        Integer.valueOf(jM16065ri == -1 ? 0 : 1);
        return jM16065ri == -1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: lr */
    private void m11447lr(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final AdSlot adSlot, final hcw hcwVar, final C3289ri c3289ri) {
        if (C3087ri.m12350fi()) {
            m11467ri(wjvVar, adSlot, hcwVar, c3289ri);
        }
        m11466ri(wjvVar, adSlot, hcwVar, new lr() { // from class: com.bytedance.sdk.openadsdk.component.di.7
            @Override // com.bytedance.sdk.openadsdk.component.C2958di.lr
            /* JADX INFO: renamed from: ri */
            public void mo11473ri() {
                if (C3087ri.m12350fi()) {
                    return;
                }
                C2958di.this.m11467ri(wjvVar, adSlot, hcwVar, c3289ri);
            }

            @Override // com.bytedance.sdk.openadsdk.component.C2958di.lr
            /* JADX INFO: renamed from: ri */
            public void mo11474ri(int i, String str) {
                C2958di.this.m11444ik(adSlot);
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    private void m11448lr(String str) {
        C3535ri.m16072ri("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)));
        C3535ri.m16072ri("tt_openad_materialMeta", "material".concat(String.valueOf(str)));
        C3535ri.m16072ri("tt_openad", "material_expiration_time".concat(String.valueOf(str)));
        C3535ri.m16072ri("tt_openad", "video_has_cached".concat(String.valueOf(str)));
        C3535ri.m16072ri("tt_openad", "image_has_cached".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: ri */
    public static C2958di m11449ri(Context context) {
        if (f8901lr == null) {
            synchronized (C2958di.class) {
                if (f8901lr == null) {
                    f8901lr = new C2958di(context);
                }
            }
        }
        return f8901lr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11452ri(C3289ri c3289ri, C3282ik c3282ik, AdSlot adSlot, hcw hcwVar) {
        C2976ri.m11564ri(hcwVar, 100, 1);
        if (c3289ri == null || c3289ri.m14252ka() == null || c3289ri.m14252ka().isEmpty()) {
            c3282ik.m14181ri(-3);
            c3282ik.m14175ik(2);
            C3282ik.m14172ri(c3282ik);
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = c3289ri.m14252ka().get(0);
        if (wjvVar == null) {
            return;
        }
        if (wjvVar.ory()) {
            m11467ri(wjvVar, adSlot, hcwVar, c3289ri);
        } else if (com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVar)) {
            m11447lr(wjvVar, adSlot, hcwVar, c3289ri);
        } else {
            m11445ik(wjvVar, adSlot, hcwVar, c3289ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m11453ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, ik ikVar) {
        m11454ri(wjvVar, ikVar, 0);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11454ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final ik ikVar, final int i) {
        String strM6357qt = wjvVar.m14389eu().m6357qt();
        if (TextUtils.isEmpty(strM6357qt)) {
            return;
        }
        InterfaceC2624qt interfaceC2624qtMo9654ka = C3491ka.m15834ri(strM6357qt).mo9660ri(wjvVar.m14389eu().m6345ik()).mo9655lr(wjvVar.m14389eu().m6351lr()).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri()));
        if (i <= 0 || Build.VERSION.SDK_INT < 26) {
            interfaceC2624qtMo9654ka.mo9652ik(1);
        } else {
            interfaceC2624qtMo9654ka.mo9652ik(2).mo9663ri(new InterfaceC2622mj() { // from class: com.bytedance.sdk.openadsdk.component.di.4
                @Override // com.bytedance.sdk.component.p145fi.InterfaceC2622mj
                /* JADX INFO: renamed from: ri */
                public Bitmap mo8253ri(Bitmap bitmap) {
                    return C2498ri.m8826ri(C3299nr.m14642ri(), bitmap, i);
                }
            });
        }
        interfaceC2624qtMo9654ka.mo9658ri(new C3492lr(wjvVar, strM6357qt, new slm() { // from class: com.bytedance.sdk.openadsdk.component.di.5
            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8254ri(int i2, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                ik ikVar2;
                if (interfaceC2630sf == null || interfaceC2630sf.mo9673lr() == null || interfaceC2630sf.mo9671ik() == null || (ikVar2 = ikVar) == null) {
                    return;
                }
                ikVar2.mo11477ri(interfaceC2630sf.mo9673lr());
            }
        }));
    }

    /* JADX INFO: renamed from: ik */
    public String m11455ik(int i) {
        String strM11364lr = C2947lr.m11358ri("tt_openad_materialMeta_new").m11364lr(String.valueOf(i));
        long jM16065ri = C3535ri.m16065ri("tt_openad", "material_expiration_time".concat(String.valueOf(i)), -1L);
        if (System.currentTimeMillis() / 1000 < jM16065ri) {
            return strM11364lr;
        }
        if (jM16065ri != -1) {
            m11462ri(i, (String) null);
            m11469ri(strM11364lr);
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public File m11456lr() {
        return com.bytedance.sdk.component.utils.xha.m10328lr(C3299nr.m14642ri(), new File(CacheDirFactory.getRootDir()).getName() + RemoteSettings.FORWARD_SLASH_STRING + f8902ri);
    }

    /* JADX INFO: renamed from: lr */
    public void m11457lr(int i) {
        C3535ri.m16073ri("tt_openad", "image_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: lr */
    public boolean m11458lr(AdSlot adSlot) {
        if (!C3087ri.m12350fi() && adSlot != null) {
            String codeId = adSlot.getCodeId();
            if (C3087ri.m12364ri(adSlot) && !TextUtils.isEmpty(codeId)) {
                boolean zContainsKey = this.xha.containsKey(codeId);
                Boolean.valueOf(zContainsKey);
                return zContainsKey;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public String m11459ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (wjvVar != null && wjvVar.m14389eu() != null && !TextUtils.isEmpty(wjvVar.m14389eu().m6364sf())) {
            String strM6364sf = wjvVar.m14389eu().m6364sf();
            String strBgr = wjvVar.m14389eu().bgr();
            if (TextUtils.isEmpty(strBgr)) {
                strBgr = C2717fi.m10220ri(strM6364sf);
            }
            File fileM12358ri = C3087ri.m12358ri(strBgr);
            if (fileM12358ri.exists() && fileM12358ri.isFile()) {
                return fileM12358ri.getAbsolutePath();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m11460ri() {
        File[] fileArrListFiles;
        try {
            C3535ri.m16071ri("tt_openad_materialMeta");
            C3535ri.m16071ri("tt_openad_materialMeta_new");
            C3535ri.m16071ri("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.di.3
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 == null) {
                        return false;
                    }
                    String name = file2.getName();
                    return name.contains(C2958di.f8902ri) || name.contains("openad_video_cache");
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    try {
                        com.bytedance.sdk.component.utils.xha.m10326ik(file2);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11461ri(int i) {
        C3535ri.m16073ri("tt_openad", "video_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ri */
    public void m11462ri(int i, String str) {
        String strValueOf = String.valueOf(i);
        if (C3087ri.m12350fi()) {
            C2949nr.m11382ri().m11396ri(strValueOf, str);
            return;
        }
        if (this.xha.size() == 0 || TextUtils.isEmpty(str) || !this.xha.containsKey(strValueOf)) {
            m11448lr(strValueOf);
        } else if (this.xha.containsValue(str)) {
            this.xha.remove(strValueOf);
            m11448lr(strValueOf);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11463ri(final AdSlot adSlot) {
        Objects.toString(adSlot);
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.f8903di.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        int iM11446ka = atomicInteger.get() + m11446ka(adSlot);
        if (!C2949nr.m11382ri().m11397ri(adSlot.getCodeId(), atomicInteger.get(), iM11446ka)) {
            Integer.valueOf(iM11446ka);
            Integer.valueOf(C3087ri.m12355mj());
            return;
        }
        atomicInteger.incrementAndGet();
        this.f8903di.put(adSlot.getCodeId(), atomicInteger);
        final hcw hcwVar = new hcw();
        hcwVar.m14160ri(C3582pv.m16567lr());
        if (Build.VERSION.SDK_INT >= 24) {
            hcwVar.m14153lr(C3087ri.m12353lr());
            hcwVar.m14152lr(C3087ri.m12351ik());
        }
        igq igqVar = new igq();
        igqVar.f11284sf = hcwVar;
        igqVar.f11279ka = 2;
        igqVar.jbs = 2;
        this.f8906ka.mo12638ri(adSlot, igqVar, 3, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.di.6
            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
                C2958di.this.m11444ik(adSlot);
                C2976ri.m11564ri(hcwVar, 100, 2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                C2958di.this.m11452ri(c3289ri, c3282ik, adSlot, hcwVar);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m11464ri(AdSlot adSlot, String str) {
        if (C3087ri.m12350fi() || adSlot == null || TextUtils.isEmpty(str)) {
            return;
        }
        String codeId = adSlot.getCodeId();
        boolean z = adSlot.getCacheScene() != 0;
        if (!C3087ri.m12364ri(adSlot) || z || TextUtils.isEmpty(codeId)) {
            return;
        }
        this.xha.put(codeId, str);
    }

    /* JADX INFO: renamed from: ri */
    public void m11465ri(final C2964ri c2964ri) {
        C3332vr.m14978lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.di.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVarM11507lr = c2964ri.m11507lr();
                    if (wjvVarM11507lr == null || com.bytedance.sdk.openadsdk.core.model.wjv.m14331di(wjvVarM11507lr) || wjvVarM11507lr.m14367bl()) {
                        return;
                    }
                    if (C3087ri.m12350fi()) {
                        C2949nr.m11382ri().m11395ri(wjvVarM11507lr, c2964ri.m11506ik());
                        return;
                    }
                    if (C2958di.this.m11458lr(wjvVarM11507lr.m14388eb())) {
                        return;
                    }
                    C2958di.this.m11464ri(wjvVarM11507lr.m14388eb(), wjvVarM11507lr.m14424jf());
                    C3535ri.m16075ri("tt_openad", "material_expiration_time" + c2964ri.m11508ri(), Long.valueOf(wjvVarM11507lr.cem()));
                    C2947lr.m11358ri("tt_openad_materialMeta_new").m11367ri(c2964ri.m11507lr().m14388eb(), c2964ri.m11506ik());
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m11466ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, final hcw hcwVar, final lr lrVar) {
        final C3582pv c3582pvM16567lr = C3582pv.m16567lr();
        final int iM14545ur = wjvVar.m14545ur();
        C1997lr c1997lrM14389eu = wjvVar.m14389eu();
        String strM6364sf = c1997lrM14389eu.m6364sf();
        String strBgr = c1997lrM14389eu.bgr();
        if (TextUtils.isEmpty(strBgr)) {
            strBgr = C2717fi.m10220ri(strM6364sf);
        }
        final File fileM12358ri = C3087ri.m12358ri(strBgr);
        if (fileM12358ri.exists()) {
            C3087ri.m12362ri(fileM12358ri);
            m11461ri(iM14545ur);
            long jM16570ka = c3582pvM16567lr.m16570ka();
            if (hcwVar != null) {
                hcwVar.m14159ri(jM16570ka);
                hcwVar.m14158ri(1);
            }
            lrVar.mo11473ri();
            m11453ri(wjvVar, (ik) null);
            return;
        }
        if (C3299nr.m14639ka().m14847fr(String.valueOf(iM14545ur)) && !C2724nr.m10256ka(C3299nr.m14642ri())) {
            lrVar.mo11474ri(100, "OnlyWifi");
            return;
        }
        C3126lr c3126lrM14345ri = com.bytedance.sdk.openadsdk.core.model.wjv.m14345ri(fileM12358ri.getParent(), wjvVar);
        c3126lrM14345ri.m6328ri("material_meta", wjvVar);
        c3126lrM14345ri.m6328ri("ad_slot", adSlot);
        C3113ri.m12651ri(c3126lrM14345ri, new InterfaceC1994ri.ri() { // from class: com.bytedance.sdk.openadsdk.component.di.9
            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
            /* JADX INFO: renamed from: lr */
            public void mo6288lr(C1996ik c1996ik, int i) {
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6289ri(C1996ik c1996ik, int i) {
                C2958di.this.m11461ri(iM14545ur);
                long jM16570ka2 = c3582pvM16567lr.m16570ka();
                C2976ri.m11562lr(wjvVar, jM16570ka2, true);
                hcw hcwVar2 = hcwVar;
                if (hcwVar2 != null) {
                    hcwVar2.m14159ri(jM16570ka2);
                    hcwVar.m14158ri(2);
                }
                lrVar.mo11473ri();
                C2958di.m11453ri(wjvVar, (ik) null);
            }

            @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo6290ri(C1996ik c1996ik, int i, String str) {
                long jM16570ka2 = c3582pvM16567lr.m16570ka();
                C2976ri.m11562lr(wjvVar, jM16570ka2, false);
                hcw hcwVar2 = hcwVar;
                if (hcwVar2 != null) {
                    hcwVar2.m14159ri(jM16570ka2);
                }
                lrVar.mo11474ri(i, str);
                try {
                    if (fileM12358ri.exists() && fileM12358ri.isFile()) {
                        com.bytedance.sdk.component.utils.xha.m10326ik(fileM12358ri);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m11467ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, hcw hcwVar, C3289ri c3289ri) {
        if (hcwVar != null) {
            wjvVar.m14415ik(hcwVar.m14156qt());
        }
        m11465ri(new C2964ri(wjvVar.m14545ur(), wjvVar, c3289ri));
        C2976ri.m11568ri(wjvVar, 1, hcwVar);
        m11444ik(adSlot);
    }

    /* JADX INFO: renamed from: ri */
    public void m11468ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final hcw hcwVar, final ri riVar) {
        final C3582pv c3582pvM16567lr = C3582pv.m16567lr();
        final int iM14545ur = wjvVar.m14545ur();
        C3286nr c3286nr = wjvVar.rbz().get(0);
        String strXha = c3286nr.xha();
        String strM14220ri = c3286nr.m14220ri();
        int iM14217lr = c3286nr.m14217lr();
        int iM14215ik = c3286nr.m14215ik();
        String strM10220ri = TextUtils.isEmpty(strXha) ? C2717fi.m10220ri(strM14220ri) : strXha;
        if (TextUtils.isEmpty(strM10220ri)) {
            if (riVar != null) {
                riVar.mo11475ri();
                return;
            }
            return;
        }
        File fileM12354lr = C3087ri.m12354lr(strM10220ri);
        if (!m11470ri(strM14220ri, strXha)) {
            C3563bu.m16375ri(new C2752ri(strM14220ri, c3286nr.xha()), iM14217lr, iM14215ik, new C3563bu.ri() { // from class: com.bytedance.sdk.openadsdk.component.di.10
                @Override // com.bytedance.sdk.openadsdk.utils.C3563bu.ri
                /* JADX INFO: renamed from: ri */
                public void mo11471ri() {
                    C2976ri.m11571ri(wjvVar, c3582pvM16567lr.m16570ka(), false);
                    riVar.mo11475ri();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.C3563bu.ri
                /* JADX INFO: renamed from: ri */
                public void mo11472ri(C2754lr c2754lr) {
                    if (!c2754lr.m10475fi()) {
                        C2976ri.m11571ri(wjvVar, c3582pvM16567lr.m16570ka(), false);
                        riVar.mo11475ri();
                        return;
                    }
                    C2958di.this.m11457lr(iM14545ur);
                    long jM16570ka = c3582pvM16567lr.m16570ka();
                    C2976ri.m11571ri(wjvVar, jM16570ka, true);
                    hcw hcwVar2 = hcwVar;
                    if (hcwVar2 != null) {
                        hcwVar2.m14159ri(jM16570ka);
                        hcwVar.m14158ri(2);
                    }
                    riVar.mo11476ri(c2754lr);
                }
            }, fileM12354lr.getParent());
            return;
        }
        m11457lr(iM14545ur);
        long jM16570ka = c3582pvM16567lr.m16570ka();
        if (hcwVar != null) {
            hcwVar.m14159ri(jM16570ka);
            hcwVar.m14158ri(1);
        }
        riVar.mo11476ri(null);
    }

    /* JADX INFO: renamed from: ri */
    public void m11469ri(final String str) {
        dzy.m16409ri(new AbstractRunnableC2676ik("opencache") { // from class: com.bytedance.sdk.openadsdk.component.di.2
            @Override // java.lang.Runnable
            public void run() {
                C3289ri c3289riM14245lr;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = C3299nr.m14638ik().mo12637ri(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (c3289riM14245lr = C3289ri.m14245lr(jSONObject)) == null || !c3289riM14245lr.m14249fi()) {
                        return;
                    }
                    C2976ri.m11565ri(c3289riM14245lr.m14248di());
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public boolean m11470ri(String str, String str2) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = C2717fi.m10220ri(str);
            }
            File fileM12354lr = C3087ri.m12354lr(str2);
            InputStream inputStreamM15836ri = C3491ka.m15836ri(str, str2);
            if (inputStreamM15836ri != null) {
                try {
                    inputStreamM15836ri.close();
                } catch (IOException e) {
                    C2707ac.m10196ik("TTAppOpenAdCacheManager", e.getMessage());
                }
                z = true;
            } else {
                z = false;
            }
            if (z || !(C3491ka.m15837ri(str, str2, fileM12354lr.getParent()) || new File(fileM12354lr.getPath()).exists())) {
                return z;
            }
            return true;
        } catch (Exception e2) {
            C2707ac.m10196ik("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }
}
