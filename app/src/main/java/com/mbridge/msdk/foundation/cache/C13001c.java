package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.cache.c */
/* JADX INFO: compiled from: CandidateResult.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13001c {

    /* JADX INFO: renamed from: i */
    public static int f35463i = 1;

    /* JADX INFO: renamed from: j */
    public static int f35464j = 0;

    /* JADX INFO: renamed from: k */
    public static int f35465k = 3;

    /* JADX INFO: renamed from: l */
    public static int f35466l = 2;

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<CampaignEx> f35467a;

    /* JADX INFO: renamed from: b */
    private String f35468b;

    /* JADX INFO: renamed from: c */
    private int f35469c = 21;

    /* JADX INFO: renamed from: d */
    private int f35470d = f35464j;

    /* JADX INFO: renamed from: e */
    private ArrayList<String> f35471e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    private List<String> f35472f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private List<String> f35473g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private List<String> f35474h = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m36512a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f35467a = copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: b */
    public String m36513b() {
        List<String> list = this.f35474h;
        return list == null ? "" : list.toString();
    }

    /* JADX INFO: renamed from: c */
    public CopyOnWriteArrayList<CampaignEx> m36515c() {
        return this.f35467a;
    }

    /* JADX INFO: renamed from: d */
    public String m36517d() {
        List<String> list = this.f35473g;
        return list == null ? "" : list.toString();
    }

    /* JADX INFO: renamed from: e */
    public String m36519e() {
        return this.f35468b;
    }

    /* JADX INFO: renamed from: f */
    public String m36520f() {
        List<String> list = this.f35472f;
        return list == null ? "" : list.toString();
    }

    /* JADX INFO: renamed from: g */
    public int m36521g() {
        return this.f35470d;
    }

    /* JADX INFO: renamed from: a */
    public String m36509a() {
        ArrayList<String> arrayList = this.f35471e;
        return arrayList == null ? "" : arrayList.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m36516c(String str) {
        try {
            List<String> list = this.f35472f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36514b(String str) {
        try {
            List<String> list = this.f35473g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m36518d(String str) {
        this.f35468b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m36511a(String str) {
        try {
            ArrayList<String> arrayList = this.f35471e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36510a(int i) {
        this.f35470d = i;
    }
}
