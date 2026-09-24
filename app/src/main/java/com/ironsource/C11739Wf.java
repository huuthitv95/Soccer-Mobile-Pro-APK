package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Wf */
/* JADX INFO: loaded from: classes6.dex */
public class C11739Wf {

    /* JADX INFO: renamed from: b */
    private NetworkSettings f26106b;

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f26105a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private JSONObject f26107c = null;

    /* JADX INFO: renamed from: d */
    private boolean f26108d = true;

    C11739Wf() {
    }

    /* JADX INFO: renamed from: a */
    public void m27840a(NetworkSettings networkSettings) {
        this.f26106b = networkSettings;
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m27844b() {
        return this.f26107c;
    }

    /* JADX INFO: renamed from: c */
    public NetworkSettings m27845c() {
        return this.f26106b;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<String> m27846d() {
        return this.f26105a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m27847e() {
        return this.f26108d;
    }

    /* JADX INFO: renamed from: a */
    public void m27841a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f26105a.add(str);
    }

    /* JADX INFO: renamed from: a */
    public void m27842a(JSONObject jSONObject) {
        this.f26107c = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m27843a(boolean z) {
        this.f26108d = z;
    }

    /* JADX INFO: renamed from: a */
    public static C11739Wf m27839a() {
        return new C11739Wf();
    }
}
