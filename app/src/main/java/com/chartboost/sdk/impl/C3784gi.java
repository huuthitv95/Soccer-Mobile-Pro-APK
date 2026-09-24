package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import bolts.MeasurementEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.gi */
/* JADX INFO: loaded from: classes3.dex */
public final class C3784gi {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f14334a;

    /* JADX INFO: renamed from: b */
    public final C3669bi f14335b;

    /* JADX INFO: renamed from: c */
    public final Function1 f14336c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.gi$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f14337b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new JSONObject(it);
        }
    }

    public C3784gi(SharedPreferences sharedPreferences, C3669bi trackingBodyBuilder, Function1 jsonFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(trackingBodyBuilder, "trackingBodyBuilder");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.f14334a = sharedPreferences;
        this.f14335b = trackingBodyBuilder;
        this.f14336c = jsonFactory;
    }

    public /* synthetic */ C3784gi(SharedPreferences sharedPreferences, C3669bi c3669bi, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, c3669bi, (i & 4) != 0 ? a.f14337b : function1);
    }

    /* JADX INFO: renamed from: a */
    public final String m17812a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY) + jSONObject.getLong("event_timestamp");
    }

    /* JADX INFO: renamed from: a */
    public final List m17813a() {
        try {
            List list = CollectionsKt.toList(this.f14334a.getAll().values());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object objInvoke = this.f14336c.invoke(String.valueOf(it.next()));
                this.f14334a.edit().clear().apply();
                arrayList.add((JSONObject) objInvoke);
            }
            return arrayList;
        } catch (Exception e) {
            C4048sb.m19408a("loadEventsAsJsonList error " + e, (Throwable) null, 2, (Object) null);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m17814a(List events, C3750f7 environmentData) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10));
            Iterator it = events.iterator();
            while (it.hasNext()) {
                arrayList.add((JSONObject) this.f14336c.invoke(this.f14335b.m16939a((AbstractC3738ei) it.next(), environmentData)));
            }
            return arrayList;
        } catch (Exception e) {
            C4048sb.m19408a("cacheEventToTrackingRequestBody error " + e, (Throwable) null, 2, (Object) null);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17815a(AbstractC3738ei event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            C4048sb.m19408a("clearEventFromStorage: " + event.m17580f().getValue(), (Throwable) null, 2, (Object) null);
            this.f14334a.edit().remove(event.m17580f().getValue()).apply();
        } catch (Exception e) {
            C4048sb.m19408a("clearEventFromStorage error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17816a(AbstractC3738ei event, C3750f7 environmentData) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        try {
            C4048sb.m19408a("forcePersistEvent: " + event.m17580f().getValue(), (Throwable) null, 2, (Object) null);
            this.f14334a.edit().putString(event.m17580f().getValue(), this.f14335b.m16939a(event, environmentData)).apply();
        } catch (Exception e) {
            C4048sb.m19408a("forcePersistEvent error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17817a(AbstractC3738ei event, C3750f7 environmentData, int i) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        if (this.f14334a.getAll().size() > i) {
            C4048sb.m19408a("Persistence limit reached. Drop old events!", (Throwable) null, 2, (Object) null);
            this.f14334a.edit().clear().apply();
        }
        try {
            this.f14334a.edit().putString(m17819b(event), this.f14335b.m16939a(event, environmentData)).apply();
        } catch (Exception e) {
            C4048sb.m19408a("cacheEventToTrackingRequestBodyAndSave error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17818a(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            for (JSONObject jSONObject : AbstractC3912m8.asList(jsonArray)) {
                this.f14334a.edit().putString(m17812a(jSONObject), jSONObject.toString()).apply();
            }
        } catch (Exception e) {
            C4048sb.m19408a("cacheEventToTrackingRequestBodyAndSave error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m17819b(AbstractC3738ei abstractC3738ei) {
        return abstractC3738ei.m17580f().getValue() + abstractC3738ei.m17583i();
    }
}
