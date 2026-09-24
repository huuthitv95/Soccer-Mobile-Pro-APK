package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* JADX INFO: renamed from: com.mbridge.msdk.click.retry.b */
/* JADX INFO: compiled from: RetryUrlRecordData.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12702b {

    /* JADX INFO: renamed from: k */
    public static int f33777k = 0;

    /* JADX INFO: renamed from: l */
    public static int f33778l = 1;

    /* JADX INFO: renamed from: a */
    private final String f33779a;

    /* JADX INFO: renamed from: b */
    private int f33780b;

    /* JADX INFO: renamed from: c */
    private final HashSet<String> f33781c = new HashSet<>();

    /* JADX INFO: renamed from: d */
    private final long f33782d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e */
    private CampaignEx f33783e;

    /* JADX INFO: renamed from: f */
    private String f33784f;

    /* JADX INFO: renamed from: g */
    private int f33785g;

    /* JADX INFO: renamed from: h */
    private boolean f33786h;

    /* JADX INFO: renamed from: i */
    private boolean f33787i;

    /* JADX INFO: renamed from: j */
    private int f33788j;

    public C12702b(String str, String str2) {
        this.f33779a = str;
        m34788a(str2);
    }

    /* JADX INFO: renamed from: a */
    public CampaignEx m34785a() {
        return this.f33783e;
    }

    /* JADX INFO: renamed from: a */
    public void m34786a(int i) {
        this.f33788j = i;
    }

    /* JADX INFO: renamed from: a */
    public void m34787a(CampaignEx campaignEx) {
        this.f33783e = campaignEx;
    }

    /* JADX INFO: renamed from: a */
    public void m34788a(String str) {
        this.f33780b++;
        this.f33781c.add(str);
    }

    /* JADX INFO: renamed from: a */
    public void m34789a(boolean z) {
        this.f33786h = z;
    }

    /* JADX INFO: renamed from: b */
    public HashSet<String> m34790b() {
        return this.f33781c;
    }

    /* JADX INFO: renamed from: b */
    public void m34791b(int i) {
        this.f33785g = i;
    }

    /* JADX INFO: renamed from: b */
    public void m34792b(String str) {
        this.f33784f = str;
    }

    /* JADX INFO: renamed from: b */
    public void m34793b(boolean z) {
        this.f33787i = z;
    }

    /* JADX INFO: renamed from: c */
    public long m34794c() {
        return this.f33782d;
    }

    /* JADX INFO: renamed from: d */
    public int m34795d() {
        return this.f33788j;
    }

    /* JADX INFO: renamed from: e */
    public int m34796e() {
        return this.f33780b;
    }

    /* JADX INFO: renamed from: f */
    public String m34797f() {
        return this.f33784f;
    }

    /* JADX INFO: renamed from: g */
    public String m34798g() {
        return this.f33779a;
    }

    /* JADX INFO: renamed from: h */
    public int m34799h() {
        return this.f33785g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m34800i() {
        return this.f33786h;
    }

    /* JADX INFO: renamed from: j */
    public boolean m34801j() {
        return this.f33787i;
    }
}
