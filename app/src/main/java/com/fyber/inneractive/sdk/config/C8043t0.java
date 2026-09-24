package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC9140c1;
import com.fyber.inneractive.sdk.util.InterfaceC9137b1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.t0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8043t0 implements InterfaceC9137b1 {

    /* JADX INFO: renamed from: a */
    public Boolean f17867a;

    /* JADX INFO: renamed from: b */
    public Integer f17868b;

    /* JADX INFO: renamed from: c */
    public Integer f17869c;

    /* JADX INFO: renamed from: d */
    public Boolean f17870d;

    /* JADX INFO: renamed from: e */
    public Orientation f17871e;

    /* JADX INFO: renamed from: f */
    public Integer f17872f;

    /* JADX INFO: renamed from: g */
    public Integer f17873g;

    /* JADX INFO: renamed from: h */
    public Skip f17874h;

    /* JADX INFO: renamed from: i */
    public TapAction f17875i;

    /* JADX INFO: renamed from: j */
    public UnitDisplayType f17876j;

    /* JADX INFO: renamed from: k */
    public List f17877k;

    public C8043t0() {
        Boolean bool = Boolean.TRUE;
        this.f17867a = bool;
        this.f17868b = 5000;
        this.f17869c = 0;
        this.f17870d = bool;
        this.f17872f = 0;
        this.f17873g = 2048;
        this.f17874h = Skip.fromValue(0);
        this.f17877k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9137b1
    /* JADX INFO: renamed from: a */
    public final JSONObject mo20439a() {
        JSONObject jSONObject = new JSONObject();
        AbstractC9140c1.m21959a(jSONObject, "autoPlay", this.f17867a);
        AbstractC9140c1.m21959a(jSONObject, "maxBitrate", this.f17868b);
        AbstractC9140c1.m21959a(jSONObject, "minBitrate", this.f17869c);
        AbstractC9140c1.m21959a(jSONObject, "muted", this.f17870d);
        AbstractC9140c1.m21959a(jSONObject, "orientation", this.f17871e);
        AbstractC9140c1.m21959a(jSONObject, "padding", this.f17872f);
        AbstractC9140c1.m21959a(jSONObject, "pivotBitrate", this.f17873g);
        AbstractC9140c1.m21959a(jSONObject, "skip", this.f17874h);
        AbstractC9140c1.m21959a(jSONObject, "tapAction", this.f17875i);
        AbstractC9140c1.m21959a(jSONObject, "unitDisplayType", this.f17876j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f17877k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        AbstractC9140c1.m21959a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
