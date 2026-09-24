package com.bytedance.sdk.openadsdk.core.p190aw.p191ik;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.p193ri.EnumC3106ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.vungle.ads.internal.Constants;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3093ik {

    /* JADX INFO: renamed from: ka */
    private static boolean f9751ka;

    /* JADX INFO: renamed from: ri */
    private static SimpleDateFormat f9752ri;

    /* JADX INFO: renamed from: ik */
    private final Map<EnumC3095lr, String> f9753ik;

    /* JADX INFO: renamed from: lr */
    private final List<String> f9754lr;

    public C3093ik(List<String> list, wjv wjvVar) {
        int iLji;
        this.f9754lr = list;
        HashMap map = new HashMap();
        this.f9753ik = map;
        map.put(EnumC3095lr.CACHEBUSTING, m12430ik());
        map.put(EnumC3095lr.TIMESTAMP, m12431lr());
        map.put(EnumC3095lr.APPBUNDLE, C3299nr.m14642ri().getPackageName());
        map.put(EnumC3095lr.PLAYERSTATE, "");
        if (wjvVar != null && ((iLji = wjvVar.lji()) == 3 || iLji == 7 || iLji == 8)) {
            map.put(EnumC3095lr.PLAYERSTATE, Constants.TEMPLATE_TYPE_FULLSCREEN);
        }
        map.put(EnumC3095lr.SERVERSIDE, "0");
    }

    /* JADX INFO: renamed from: ik */
    private String m12430ik() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    /* JADX INFO: renamed from: lr */
    private String m12431lr() {
        if (f9752ri == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                f9752ri = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
            } else {
                f9752ri = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.getDefault());
                f9751ka = true;
            }
        }
        String str = f9752ri.format(new Date());
        if (!f9751ka) {
            return str;
        }
        int iM16443fr = C3571ig.m16443fr();
        if (iM16443fr < 0) {
            if (iM16443fr <= -10) {
                return str + iM16443fr;
            }
            return str + "-0" + (-iM16443fr);
        }
        if (iM16443fr < 10) {
            return str + "+0" + iM16443fr;
        }
        return str + "+" + iM16443fr;
    }

    /* JADX INFO: renamed from: lr */
    private String m12432lr(long j) {
        return String.format(Locale.getDefault(), "%02d:%02d:%02d.%03d", Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }

    /* JADX INFO: renamed from: lr */
    public C3093ik m12433lr(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.f9753ik.put(EnumC3095lr.ASSETURI, str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3093ik m12434ri(long j) {
        if (j >= 0) {
            String strM12432lr = m12432lr(j);
            if (!TextUtils.isEmpty(strM12432lr)) {
                this.f9753ik.put(EnumC3095lr.CONTENTPLAYHEAD, strM12432lr);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3093ik m12435ri(EnumC3106ri enumC3106ri) {
        if (enumC3106ri != null) {
            this.f9753ik.put(EnumC3095lr.ERRORCODE, enumC3106ri.m12559ri());
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3093ik m12436ri(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f9753ik.put(EnumC3095lr.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public List<String> m12437ri() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.f9754lr) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (EnumC3095lr enumC3095lr : EnumC3095lr.values()) {
                    String str = this.f9753ik.get(enumC3095lr);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = enumC3095lr == EnumC3095lr.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(enumC3095lr.name(), str) : strReplaceAll.replaceAll("\\[" + enumC3095lr.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }
}
