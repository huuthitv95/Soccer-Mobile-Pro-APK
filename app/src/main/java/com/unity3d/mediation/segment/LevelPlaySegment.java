package com.unity3d.mediation.segment;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C12317m4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlaySegment {
    public static final C14642a Companion = new C14642a(null);
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String SEGMENT_NAME = "segName";
    public static final String USER_CREATION_DATE = "ucd";

    /* JADX INFO: renamed from: h */
    private static final int f41501h = 999999;

    /* JADX INFO: renamed from: i */
    private static final double f41502i = 999999.99d;

    /* JADX INFO: renamed from: j */
    private static final int f41503j = 5;

    /* JADX INFO: renamed from: k */
    private static final String f41504k = "custom";

    /* JADX INFO: renamed from: c */
    private boolean f41507c;

    /* JADX INFO: renamed from: d */
    private String f41508d;

    /* JADX INFO: renamed from: g */
    private long f41511g;

    /* JADX INFO: renamed from: a */
    private final ArrayList<Pair<String, String>> f41505a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f41506b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    private int f41509e = -1;

    /* JADX INFO: renamed from: f */
    private double f41510f = -1.0d;

    /* JADX INFO: renamed from: com.unity3d.mediation.segment.LevelPlaySegment$a */
    public static final class C14642a {
        private C14642a() {
        }

        public /* synthetic */ C14642a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m43200a(String str) {
        if (str == null) {
            return false;
        }
        return new Regex("^[a-zA-Z0-9]*$").matches(str);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m43201a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    public final ArrayList<Pair<String, String>> getCustoms$mediationsdk_release() {
        return this.f41505a;
    }

    public final double getIapTotal() {
        return this.f41510f;
    }

    public final int getLevel() {
        return this.f41509e;
    }

    public final ArrayList<Pair<String, String>> getSegmentData() {
        IronLog.API.info("");
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f41509e != -1) {
            arrayList.add(new Pair<>("lvl", String.valueOf(this.f41509e)));
        }
        if (this.f41507c) {
            arrayList.add(new Pair<>("pay", String.valueOf(isPaying())));
        }
        if (this.f41510f != -1.0d) {
            arrayList.add(new Pair<>("iapt", String.valueOf(this.f41510f)));
        }
        if (this.f41511g != 0) {
            arrayList.add(new Pair<>("ucd", String.valueOf(this.f41511g)));
        }
        String str = this.f41508d;
        if (str != null && !TextUtils.isEmpty(str)) {
            arrayList.add(new Pair<>(SEGMENT_NAME, str));
        }
        ArrayList<Pair<String, String>> arrayList2 = this.f41505a;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList3.add(new Pair("custom_" + pair.getFirst(), pair.getSecond()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final String getSegmentName() {
        return this.f41508d;
    }

    public final long getUserCreationDate() {
        return this.f41511g;
    }

    public final boolean isPaying() {
        return this.f41506b.get();
    }

    public final void setCustom(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("");
        try {
            if (m43200a(key) && m43201a(key, 1, 32) && m43200a(value) && m43201a(value, 1, 32)) {
                if (this.f41505a.size() >= 5) {
                    this.f41505a.remove(0);
                }
                this.f41505a.add(new Pair<>(key, value));
                return;
            }
            IronLog.INTERNAL.warning(key + ", " + value + " must be alphanumeric and 1-32 in length");
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void setIapTotal(double d) {
        IronLog.API.info("");
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE <= d && d <= f41502i) {
            double d2 = 100;
            this.f41510f = Math.floor(d * d2) / d2;
            return;
        }
        IronLog.INTERNAL.warning(d + " must be between 0-999999.99");
    }

    public final void setLevel(int i) {
        IronLog.API.info("");
        if (1 <= i && i < 1000000) {
            this.f41509e = i;
            return;
        }
        IronLog.INTERNAL.warning(i + " must be between 1-999999");
    }

    public final void setPaying(boolean z) {
        IronLog.API.info("");
        this.f41507c = true;
        this.f41506b.set(z);
    }

    public final void setSegmentName(String str) {
        IronLog.API.info("");
        if (m43200a(str) && m43201a(str, 1, 32)) {
            this.f41508d = str;
            return;
        }
        IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j) {
        IronLog.API.info("");
        if (j > 0) {
            this.f41511g = j;
            return;
        }
        IronLog.INTERNAL.warning(j + " is an invalid timestamp");
    }

    public final JSONObject toJson() {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : getSegmentData()) {
            try {
                jSONObject.put(pair.component1(), pair.component2());
            } catch (JSONException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }
}
