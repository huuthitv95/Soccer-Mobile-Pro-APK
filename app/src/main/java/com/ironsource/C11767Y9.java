package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Y9 */
/* JADX INFO: loaded from: classes6.dex */
public class C11767Y9 {

    /* JADX INFO: renamed from: m */
    public static final String f26621m = "age";

    /* JADX INFO: renamed from: n */
    public static final String f26622n = "gen";

    /* JADX INFO: renamed from: o */
    public static final String f26623o = "lvl";

    /* JADX INFO: renamed from: p */
    public static final String f26624p = "pay";

    /* JADX INFO: renamed from: q */
    public static final String f26625q = "iapt";

    /* JADX INFO: renamed from: r */
    public static final String f26626r = "ucd";

    /* JADX INFO: renamed from: s */
    private static final String f26627s = "segName";

    /* JADX INFO: renamed from: a */
    private String f26628a;

    /* JADX INFO: renamed from: g */
    private String f26634g;

    /* JADX INFO: renamed from: b */
    private int f26629b = 999999;

    /* JADX INFO: renamed from: c */
    private double f26630c = 999999.99d;

    /* JADX INFO: renamed from: d */
    private final String f26631d = "custom";

    /* JADX INFO: renamed from: e */
    private final int f26632e = 5;

    /* JADX INFO: renamed from: f */
    private int f26633f = -1;

    /* JADX INFO: renamed from: h */
    private int f26635h = -1;

    /* JADX INFO: renamed from: i */
    private AtomicBoolean f26636i = null;

    /* JADX INFO: renamed from: j */
    private double f26637j = -1.0d;

    /* JADX INFO: renamed from: k */
    private long f26638k = 0;

    /* JADX INFO: renamed from: l */
    private ArrayList<Pair<String, String>> f26639l = new ArrayList<>();

    @Deprecated
    /* JADX INFO: renamed from: a */
    public int m28021a() {
        return this.f26633f;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public String m28028b() {
        return this.f26634g;
    }

    /* JADX INFO: renamed from: c */
    public double m28029c() {
        return this.f26637j;
    }

    /* JADX INFO: renamed from: d */
    public AtomicBoolean m28030d() {
        return this.f26636i;
    }

    /* JADX INFO: renamed from: e */
    public int m28031e() {
        return this.f26635h;
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<Pair<String, String>> m28032f() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f26633f != -1) {
            arrayList.add(new Pair<>("age", this.f26633f + ""));
        }
        if (!TextUtils.isEmpty(this.f26634g)) {
            arrayList.add(new Pair<>(f26622n, this.f26634g));
        }
        if (this.f26635h != -1) {
            arrayList.add(new Pair<>("lvl", this.f26635h + ""));
        }
        if (this.f26636i != null) {
            arrayList.add(new Pair<>("pay", this.f26636i + ""));
        }
        if (this.f26637j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.f26637j + ""));
        }
        if (this.f26638k != 0) {
            arrayList.add(new Pair<>("ucd", this.f26638k + ""));
        }
        if (!TextUtils.isEmpty(this.f26628a)) {
            arrayList.add(new Pair<>("segName", this.f26628a));
        }
        arrayList.addAll(this.f26639l);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public String m28033g() {
        return this.f26628a;
    }

    /* JADX INFO: renamed from: h */
    public long m28034h() {
        return this.f26638k;
    }

    /* JADX INFO: renamed from: i */
    public JSONObject m28035i() {
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : m28032f()) {
            try {
                jSONObject.put((String) pair.first, pair.second);
            } catch (JSONException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    private boolean m28020b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* JADX INFO: renamed from: a */
    public void m28023a(int i) {
        if (i > 0 && i < this.f26629b) {
            this.f26635h = i;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i + " ) level must be between 1-" + this.f26629b, 2);
    }

    /* JADX INFO: renamed from: a */
    public void m28027a(boolean z) {
        if (this.f26636i == null) {
            this.f26636i = new AtomicBoolean();
        }
        this.f26636i.set(z);
    }

    /* JADX INFO: renamed from: a */
    public void m28022a(double d) {
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < this.f26630c) {
            this.f26637j = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f26630c, 2);
    }

    /* JADX INFO: renamed from: a */
    public void m28024a(long j) {
        if (j > 0) {
            this.f26638k = j;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }

    /* JADX INFO: renamed from: a */
    public void m28025a(String str) {
        if (m28020b(str) && m28019a(str, 1, 32)) {
            this.f26628a = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    /* JADX INFO: renamed from: a */
    public void m28026a(String str, String str2) {
        try {
            if (m28020b(str) && m28020b(str2) && m28019a(str, 1, 32) && m28019a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f26639l.size() >= 5) {
                    this.f26639l.remove(0);
                }
                this.f26639l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m28019a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }
}
