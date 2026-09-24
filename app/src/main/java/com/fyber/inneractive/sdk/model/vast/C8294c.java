package com.fyber.inneractive.sdk.model.vast;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.response.InterfaceC9091i;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8294c implements InterfaceC9091i {

    /* JADX INFO: renamed from: a */
    public final EnumC8300i f18515a;

    /* JADX INFO: renamed from: b */
    public EnumC8302k f18516b;

    /* JADX INFO: renamed from: c */
    public final int f18517c;

    /* JADX INFO: renamed from: d */
    public final int f18518d;

    /* JADX INFO: renamed from: e */
    public final String f18519e;

    /* JADX INFO: renamed from: f */
    public String f18520f;

    /* JADX INFO: renamed from: g */
    public String f18521g;

    /* JADX INFO: renamed from: h */
    public final int f18522h;

    /* JADX INFO: renamed from: i */
    public final HashMap f18523i = new HashMap();

    public C8294c(EnumC8300i enumC8300i, int i, int i2, String str, int i3) {
        this.f18515a = enumC8300i;
        this.f18517c = i;
        this.f18518d = i2;
        this.f18519e = str;
        this.f18522h = i3;
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC9091i
    /* JADX INFO: renamed from: a */
    public final List mo20518a(EnumC8315x enumC8315x) {
        if (enumC8315x == null || this.f18523i.isEmpty()) {
            return null;
        }
        return (List) this.f18523i.get(enumC8315x);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m20700a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f18517c);
            jSONObject.put(CmcdData.Factory.STREAMING_FORMAT_HLS, this.f18518d);
            jSONObject.put("type", this.f18515a.toString());
            EnumC8302k enumC8302k = this.f18516b;
            jSONObject.put("creativeType", enumC8302k != null ? enumC8302k.mimeType : "none");
            jSONObject.put("content", this.f18520f);
            return jSONObject;
        } catch (JSONException e) {
            IAlog.m21945a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20701a(EnumC8315x enumC8315x, String str) {
        List arrayList = (List) this.f18523i.get(enumC8315x);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f18523i.put(enumC8315x, arrayList);
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.f18517c);
        sb.append(" h:");
        sb.append(this.f18518d);
        sb.append(" type:");
        sb.append(this.f18515a.toString());
        sb.append(" creativeType: ");
        EnumC8302k enumC8302k = this.f18516b;
        sb.append(enumC8302k != null ? enumC8302k.mimeType : "none");
        sb.append(" ctr:");
        sb.append(this.f18521g);
        sb.append(" events:");
        sb.append(this.f18523i);
        return sb.toString();
    }
}
