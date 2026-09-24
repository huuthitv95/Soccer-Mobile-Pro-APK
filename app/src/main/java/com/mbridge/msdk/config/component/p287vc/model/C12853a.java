package com.mbridge.msdk.config.component.p287vc.model;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.vc.model.a */
/* JADX INFO: compiled from: RenderViewModel.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12853a {

    /* JADX INFO: renamed from: a */
    private String f34460a;

    /* JADX INFO: renamed from: b */
    private int f34461b;

    /* JADX INFO: renamed from: c */
    private int f34462c;

    /* JADX INFO: renamed from: d */
    private int f34463d;

    /* JADX INFO: renamed from: e */
    private int f34464e;

    /* JADX INFO: renamed from: f */
    private int f34465f;

    /* JADX INFO: renamed from: g */
    private int f34466g;

    public C12853a(Map<String, Object> map) {
        m35829a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m35829a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get(C12770c.m35209b(StatisticData.ERROR_CODE_NOT_FOUND));
                if (obj != null) {
                    m35828a(String.valueOf(obj));
                }
                Object obj2 = map.get(C12770c.m35209b("155"));
                if (obj2 != null) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        m35831b(Integer.valueOf(strValueOf).intValue());
                    }
                }
                Object obj3 = map.get(C12770c.m35209b("154"));
                if (obj3 != null) {
                    String strValueOf2 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        m35833c(Integer.valueOf(strValueOf2).intValue());
                    }
                }
                Object obj4 = map.get(C12770c.m35209b("157"));
                if (obj4 != null) {
                    String strValueOf3 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        m35839f(Integer.valueOf(strValueOf3).intValue());
                    }
                }
                Object obj5 = map.get(C12770c.m35209b("158"));
                if (obj5 != null) {
                    String strValueOf4 = String.valueOf(obj5);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        m35827a(Integer.valueOf(strValueOf4).intValue());
                    }
                }
                Object obj6 = map.get(C12770c.m35209b("156"));
                int iM37728G = C13211m0.m37728G(C13008c.m36588n().m36542d());
                if (obj6 != null) {
                    String strValueOf5 = String.valueOf(obj6);
                    if (TextUtils.isEmpty(strValueOf5) || strValueOf5.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                        m35835d(iM37728G);
                    } else {
                        m35835d(Integer.parseInt(strValueOf5));
                    }
                } else {
                    m35835d(iM37728G);
                }
                Object obj7 = map.get(C12770c.m35209b("198"));
                if (obj7 != null) {
                    String strValueOf6 = String.valueOf(obj7);
                    if (TextUtils.isEmpty(strValueOf6) || strValueOf6.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                        return;
                    }
                    m35837e(Integer.parseInt(strValueOf6));
                }
            } catch (Exception e) {
                C13219q0.m37816b("RenderViewModel", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m35831b(int i) {
        this.f34461b = i;
    }

    /* JADX INFO: renamed from: c */
    public int m35832c() {
        return this.f34461b;
    }

    /* JADX INFO: renamed from: d */
    public int m35834d() {
        return this.f34462c;
    }

    /* JADX INFO: renamed from: e */
    public int m35836e() {
        return this.f34465f;
    }

    /* JADX INFO: renamed from: f */
    public void m35839f(int i) {
        this.f34463d = i;
    }

    /* JADX INFO: renamed from: g */
    public int m35840g() {
        return this.f34463d;
    }

    /* JADX INFO: renamed from: b */
    public int m35830b() {
        return this.f34464e;
    }

    /* JADX INFO: renamed from: c */
    public void m35833c(int i) {
        this.f34462c = i;
    }

    /* JADX INFO: renamed from: d */
    public void m35835d(int i) {
        this.f34465f = i;
    }

    /* JADX INFO: renamed from: e */
    public void m35837e(int i) {
        this.f34466g = i;
    }

    /* JADX INFO: renamed from: f */
    public int m35838f() {
        return this.f34466g;
    }

    /* JADX INFO: renamed from: a */
    public String m35826a() {
        return this.f34460a;
    }

    /* JADX INFO: renamed from: a */
    public void m35828a(String str) {
        this.f34460a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m35827a(int i) {
        this.f34464e = i;
    }
}
