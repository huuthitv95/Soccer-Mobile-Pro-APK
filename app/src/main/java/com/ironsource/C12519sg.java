package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sg */
/* JADX INFO: loaded from: classes6.dex */
public final class C12519sg {

    /* JADX INFO: renamed from: c */
    public static final a f32417c = new a(null);

    /* JADX INFO: renamed from: a */
    private final Double f32418a;

    /* JADX INFO: renamed from: b */
    private final Double f32419b;

    /* JADX INFO: renamed from: com.ironsource.sg$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final b m33694a() {
            return new b();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final C12519sg m33695b() {
            return m33694a().m33697a();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sg$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private Double f32420a;

        /* JADX INFO: renamed from: b */
        private Double f32421b;

        /* JADX INFO: renamed from: a */
        public final void m33698a(Double d) {
            this.f32421b = d;
        }

        /* JADX INFO: renamed from: b */
        public final void m33701b(Double d) {
            this.f32420a = d;
        }

        /* JADX INFO: renamed from: c */
        public final Double m33702c() {
            return this.f32420a;
        }

        /* JADX INFO: renamed from: a */
        public final b m33696a(double d) {
            this.f32421b = Double.valueOf(d);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final Double m33700b() {
            return this.f32421b;
        }

        /* JADX INFO: renamed from: a */
        public final C12519sg m33697a() {
            return new C12519sg(this, null);
        }

        /* JADX INFO: renamed from: b */
        public final b m33699b(double d) {
            this.f32420a = Double.valueOf(d);
            return this;
        }
    }

    public /* synthetic */ C12519sg(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final b m33689a() {
        return f32417c.m33694a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final C12519sg m33690b() {
        return f32417c.m33695b();
    }

    /* JADX INFO: renamed from: c */
    public final Double m33691c() {
        return this.f32419b;
    }

    /* JADX INFO: renamed from: d */
    public final Double m33692d() {
        return this.f32418a;
    }

    /* JADX INFO: renamed from: e */
    public final String m33693e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f32419b);
            jSONObject.put("floor", this.f32418a);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        return string;
    }

    public String toString() {
        return "WaterfallConfiguration" + m33693e();
    }

    private C12519sg(b bVar) {
        this.f32418a = bVar.m33702c();
        this.f32419b = bVar.m33700b();
    }
}
