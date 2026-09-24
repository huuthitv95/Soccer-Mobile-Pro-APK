package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.vd */
/* JADX INFO: loaded from: classes6.dex */
public class C12570vd {

    /* JADX INFO: renamed from: a */
    private final ArrayList<String> f32609a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<String> f32610b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private final ArrayList<String> f32611c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    private final ArrayList<String> f32612d = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public ArrayList<String> m33959a() {
        return this.f32611c;
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<String> m33961b() {
        return this.f32610b;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<String> m33963c() {
        return this.f32612d;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<String> m33965d() {
        return this.f32609a;
    }

    /* JADX INFO: renamed from: a */
    public void m33960a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f32611c.add(str);
    }

    /* JADX INFO: renamed from: b */
    public void m33962b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f32610b.add(str);
    }

    /* JADX INFO: renamed from: c */
    public void m33964c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f32612d.add(str);
    }

    /* JADX INFO: renamed from: d */
    public void m33966d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f32609a.add(str);
    }
}
