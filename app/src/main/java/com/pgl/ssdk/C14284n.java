package com.pgl.ssdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.pgl.ssdk.n */
/* JADX INFO: loaded from: classes7.dex */
public class C14284n {
    /* JADX INFO: renamed from: a */
    public static String m43094a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        List<String> listM43095b = m43095b(new ArrayList(new TreeSet(list)));
        return UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) "|", (Iterable) listM43095b.subList(0, Math.min(listM43095b.size(), 100)));
    }

    /* JADX INFO: renamed from: b */
    private static List<String> m43095b(List<String> list) {
        if (list != null && !list.isEmpty()) {
            String[] strArr = {"abc_", "$avd_hide_", "avd_hide_", "$avd_show_", "avd_show_", "m3_avd_", "$m3_avd_", "ic_mtrl_", "$mtrl_", "mtrl_", "btn_checkbox_", "bd_progress_", "bd_bg_", "btn_radio_", "pangle_", "anythink_", "mbridge_", "sig_", "klevin", "$applovin_", "applovin_", "ad_mob_", "admob_", "common_google_", "bigo_", "mobads_", "tapad_", "vivo_module_", "com_facebook_", "tt_", "audience_network.dex", "-journal"};
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                for (int i = 0; i < 32; i++) {
                    String str = strArr[i];
                    if (!TextUtils.isEmpty(str) && (next.startsWith(str) || next.endsWith(str))) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        return list;
    }
}
