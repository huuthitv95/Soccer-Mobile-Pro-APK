package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13207k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.cache.b */
/* JADX INFO: compiled from: CandidateEntity.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13000b {

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<CampaignEx> f35453a;

    /* JADX INFO: renamed from: b */
    private double f35454b;

    /* JADX INFO: renamed from: c */
    private String f35455c;

    /* JADX INFO: renamed from: d */
    private String f35456d;

    /* JADX INFO: renamed from: e */
    private int f35457e;

    /* JADX INFO: renamed from: f */
    private long f35458f;

    /* JADX INFO: renamed from: g */
    private int f35459g;

    /* JADX INFO: renamed from: h */
    private long f35460h;

    /* JADX INFO: renamed from: i */
    private String f35461i;

    /* JADX INFO: renamed from: j */
    private long f35462j;

    /* JADX INFO: renamed from: a */
    public void m36493a(long j) {
        this.f35462j = j;
    }

    /* JADX INFO: renamed from: b */
    public double m36496b() {
        return this.f35454b;
    }

    /* JADX INFO: renamed from: c */
    public long m36500c() {
        return this.f35462j;
    }

    /* JADX INFO: renamed from: d */
    public String m36503d() {
        return this.f35455c;
    }

    /* JADX INFO: renamed from: e */
    public String m36505e() {
        return this.f35456d;
    }

    /* JADX INFO: renamed from: f */
    public int m36506f() {
        return this.f35457e;
    }

    /* JADX INFO: renamed from: g */
    public int m36507g() {
        return this.f35459g;
    }

    /* JADX INFO: renamed from: h */
    public long m36508h() {
        return this.f35460h;
    }

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<CampaignEx> m36491a() {
        return this.f35453a;
    }

    /* JADX INFO: renamed from: b */
    public void m36499b(String str) {
        this.f35455c = str;
    }

    /* JADX INFO: renamed from: c */
    public void m36502c(String str) {
        this.f35456d = str;
    }

    /* JADX INFO: renamed from: d */
    public void m36504d(String str) {
        this.f35461i = str;
    }

    /* JADX INFO: renamed from: a */
    public void m36495a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f35453a = copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: b */
    public void m36497b(int i) {
        this.f35459g = i;
    }

    /* JADX INFO: renamed from: c */
    public void m36501c(long j) {
        this.f35460h = j;
    }

    /* JADX INFO: renamed from: a */
    public void m36494a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strM37712a = C13207k0.m37712a(str);
        if (TextUtils.isEmpty(strM37712a)) {
            return;
        }
        try {
            double d = Double.parseDouble(strM37712a);
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            this.f35454b = d;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36498b(long j) {
        this.f35458f = j;
    }

    /* JADX INFO: renamed from: a */
    public void m36492a(int i) {
        this.f35457e = i;
    }
}
