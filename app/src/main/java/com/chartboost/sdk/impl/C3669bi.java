package com.chartboost.sdk.impl;

import bolts.MeasurementEvent;
import com.chartboost.sdk.Mediation;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bi */
/* JADX INFO: loaded from: classes3.dex */
public final class C3669bi {

    /* JADX INFO: renamed from: a */
    public final Function0 f13592a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bi$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f13593b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke() {
            return new JSONObject();
        }
    }

    public C3669bi(Function0 jsonFactory) {
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.f13592a = jsonFactory;
    }

    public /* synthetic */ C3669bi(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f13593b : function0);
    }

    /* JADX INFO: renamed from: a */
    public final String m16939a(AbstractC3738ei event, C3750f7 environment) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environment, "environment");
        String string = m16943a(m16942a(m16941a(m16947c(m16948c(m16945b(m16946b((JSONObject) this.f13592a.invoke(), environment), event), environment), event), event), environment), environment, event.m17570a()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m16940a(C3750f7 c3750f7, String str) {
        Object objM44946constructorimpl;
        JSONObject jSONObject = (JSONObject) this.f13592a.invoke();
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put("device_battery_level", c3750f7.m17647i());
            jSONObject.put("device_charging_status", c3750f7.m17648j());
            jSONObject.put("device_language", c3750f7.m17652n());
            jSONObject.put("device_timezone", c3750f7.m17661w());
            jSONObject.put("device_volume", c3750f7.m17663y());
            jSONObject.put("device_mute", c3750f7.m17656r());
            jSONObject.put("device_audio_output", c3750f7.m17646h());
            jSONObject.put("device_storage", c3750f7.m17660v());
            jSONObject.put("device_low_memory_warning", c3750f7.m17653o());
            jSONObject.put("device_up_time", c3750f7.m17662x());
            jSONObject.put("chartboost_sdk_autocache_enabled", c3750f7.m17640b());
            jSONObject.put("chartboost_sdk_gdpr", c3750f7.m17643e());
            jSONObject.put("chartboost_sdk_ccpa", c3750f7.m17641c());
            jSONObject.put("chartboost_sdk_coppa", c3750f7.m17642d());
            jSONObject.put("chartboost_sdk_lgpd", c3750f7.m17644f());
            jSONObject.put("session_duration", c3750f7.m17634A());
            JSONObject jSONObjectPut = jSONObject.put("session_impression_count", m16944b(c3750f7, str));
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(jSONObject2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19410b("Cannot generate tracking body data: ", thM44949exceptionOrNullimpl);
        }
        Object obj = jSONObject;
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null) {
            obj = objM44946constructorimpl;
        }
        return (JSONObject) obj;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m16941a(JSONObject jSONObject, AbstractC3738ei abstractC3738ei) {
        Object objM44946constructorimpl;
        String strM19491b;
        String strM19490a;
        String strM19496g;
        JSONObject jSONObject2;
        C4076th.a aVarM19492c;
        JSONObject jSONObjectPut;
        try {
            Result.Companion companion = Result.INSTANCE;
            String lowerCase = abstractC3738ei.m17570a().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject.put("ad_type", lowerCase);
            C4076th c4076thM17585k = abstractC3738ei.m17585k();
            if (c4076thM17585k == null || (strM19491b = c4076thM17585k.m19491b()) == null) {
                strM19491b = "missing impression id";
            }
            jSONObject.put("ad_impression_id", strM19491b);
            C4076th c4076thM17585k2 = abstractC3738ei.m17585k();
            if (c4076thM17585k2 == null || (strM19490a = c4076thM17585k2.m19490a()) == null) {
                strM19490a = "missing creative id";
            }
            jSONObject.put("ad_creative_id", strM19490a);
            jSONObject.put("ad_location_id", abstractC3738ei.m17577c());
            C4076th c4076thM17585k3 = abstractC3738ei.m17585k();
            if (c4076thM17585k3 == null || (strM19496g = c4076thM17585k3.m19496g()) == null) {
                strM19496g = "";
            }
            jSONObject.put("template_url", strM19496g);
            C4076th c4076thM17585k4 = abstractC3738ei.m17585k();
            if (c4076thM17585k4 == null || (aVarM19492c = c4076thM17585k4.m19492c()) == null) {
                jSONObject2 = null;
            } else {
                jSONObject.put("ad_height", aVarM19492c.getHeight());
                jSONObjectPut = jSONObject.put("ad_width", aVarM19492c.getWidth());
            }
            if (jSONObject2 == null) {
                jSONObject2 = jSONObjectPut;
                jSONObject2 = jSONObject;
            }
            jSONObject2 = jSONObjectPut;
            objM44946constructorimpl = Result.m44946constructorimpl(jSONObject2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19410b("Cannot generate tracking body data: ", thM44949exceptionOrNullimpl);
        }
        Object obj = jSONObject;
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null) {
            obj = objM44946constructorimpl;
        }
        return (JSONObject) obj;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m16942a(JSONObject jSONObject, C3750f7 c3750f7) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put("device_id", c3750f7.m17651m());
            jSONObject.put("device_make", c3750f7.m17654p());
            jSONObject.put("device_model", c3750f7.m17655q());
            jSONObject.put("device_os_version", c3750f7.m17658t());
            jSONObject.put("device_platform", c3750f7.m17659u());
            jSONObject.put("device_country", c3750f7.m17650l());
            jSONObject.put("device_connection_type", c3750f7.m17649k());
            JSONObject jSONObjectPut = jSONObject.put("device_orientation", c3750f7.m17657s());
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(jSONObject2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19410b("Cannot generate tracking body data: ", thM44949exceptionOrNullimpl);
        }
        Object obj = jSONObject;
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null) {
            obj = objM44946constructorimpl;
        }
        return (JSONObject) obj;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m16943a(JSONObject jSONObject, C3750f7 c3750f7, String str) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObjectPut = jSONObject.put("payload", m16940a(c3750f7, str));
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(jSONObject2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19410b("Cannot generate tracking body data: ", thM44949exceptionOrNullimpl);
        }
        Object obj = jSONObject;
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null) {
            obj = objM44946constructorimpl;
        }
        return (JSONObject) obj;
    }

    /* JADX INFO: renamed from: b */
    public final int m16944b(C3750f7 c3750f7, String str) {
        if (Intrinsics.areEqual(str, AbstractC3628a0.b.f13429g.m16771b())) {
            return c3750f7.m17637D();
        }
        if (Intrinsics.areEqual(str, AbstractC3628a0.c.f13430g.m16771b())) {
            return c3750f7.m17638E();
        }
        if (Intrinsics.areEqual(str, AbstractC3628a0.a.f13428g.m16771b())) {
            return c3750f7.m17636C();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m16945b(JSONObject jSONObject, AbstractC3738ei abstractC3738ei) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, abstractC3738ei.m17580f().getValue());
            jSONObject.put("event_message", abstractC3738ei.m17579e());
            jSONObject.put("event_type", abstractC3738ei.m17586l().name());
            jSONObject.put("event_timestamp", abstractC3738ei.m17584j());
            JSONObject jSONObjectPut = jSONObject.put("event_latency", abstractC3738ei.m17575b());
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(jSONObject2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19410b("Cannot generate tracking body data: ", thM44949exceptionOrNullimpl);
        }
        Object obj = jSONObject;
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null) {
            obj = objM44946constructorimpl;
        }
        return (JSONObject) obj;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m16946b(JSONObject jSONObject, C3750f7 c3750f7) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put("app_id", c3750f7.m17639a());
            JSONObject jSONObjectPut = jSONObject.put("chartboost_sdk_version", c3750f7.m17645g());
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(jSONObject2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19410b("Cannot generate tracking body data: ", thM44949exceptionOrNullimpl);
        }
        Object obj = jSONObject;
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null) {
            obj = objM44946constructorimpl;
        }
        return (JSONObject) obj;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m16947c(JSONObject jSONObject, AbstractC3738ei abstractC3738ei) {
        Object objM44946constructorimpl;
        JSONObject jSONObject2;
        JSONObject jSONObjectPut;
        try {
            Result.Companion companion = Result.INSTANCE;
            Mediation mediationM17578d = abstractC3738ei.m17578d();
            if (mediationM17578d != null) {
                jSONObject.put("mediation_sdk", mediationM17578d.mediationType);
                jSONObject.put("mediation_sdk_version", mediationM17578d.libraryVersion);
                jSONObjectPut = jSONObject.put("mediation_sdk_adapter_version", mediationM17578d.adapterVersion);
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                jSONObject2 = jSONObjectPut;
                jSONObject2 = jSONObject;
            }
            jSONObject2 = jSONObjectPut;
            objM44946constructorimpl = Result.m44946constructorimpl(jSONObject2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19410b("Cannot generate tracking body data: ", thM44949exceptionOrNullimpl);
        }
        Object obj = jSONObject;
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null) {
            obj = objM44946constructorimpl;
        }
        return (JSONObject) obj;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m16948c(JSONObject jSONObject, C3750f7 c3750f7) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, c3750f7.m17635B());
            JSONObject jSONObjectPut = jSONObject.put("session_count", c3750f7.m17664z());
            JSONObject jSONObject2 = jSONObjectPut;
            if (jSONObjectPut == null) {
                jSONObject2 = jSONObject;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(jSONObject2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19410b("Cannot generate tracking body data: ", thM44949exceptionOrNullimpl);
        }
        Object obj = jSONObject;
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null) {
            obj = objM44946constructorimpl;
        }
        return (JSONObject) obj;
    }
}
