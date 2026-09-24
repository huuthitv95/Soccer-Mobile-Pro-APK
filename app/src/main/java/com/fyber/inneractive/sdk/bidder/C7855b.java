package com.fyber.inneractive.sdk.bidder;

import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.C7921g;
import com.fyber.inneractive.sdk.cache.session.C7924j;
import com.fyber.inneractive.sdk.cache.session.C7925k;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.AbstractC8044u;
import com.fyber.inneractive.sdk.config.C7965g;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8046v;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8047v0;
import com.fyber.inneractive.sdk.config.cellular.C7951a;
import com.fyber.inneractive.sdk.config.cellular.InterfaceC7958h;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.AbstractC7995g;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.ignite.C8252l;
import com.fyber.inneractive.sdk.protobuf.AbstractC9017t0;
import com.fyber.inneractive.sdk.protobuf.AbstractC9047z0;
import com.fyber.inneractive.sdk.protobuf.EnumC9042y0;
import com.fyber.inneractive.sdk.serverapi.AbstractC9113b;
import com.fyber.inneractive.sdk.serverapi.C9112a;
import com.fyber.inneractive.sdk.serverapi.C9114c;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9188s1;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C7855b implements InterfaceC7861e, InterfaceC8047v0, InterfaceC7958h {

    /* JADX INFO: renamed from: h */
    public static final C7855b f17518h = new C7855b();

    /* JADX INFO: renamed from: a */
    public final C7873k f17519a;

    /* JADX INFO: renamed from: b */
    public final C9114c f17520b;

    /* JADX INFO: renamed from: c */
    public final C7859d f17521c;

    /* JADX INFO: renamed from: d */
    public C7863f f17522d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f17523e = new AtomicReference(null);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f17524f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final Object f17525g = new Object();

    public C7855b() {
        C7951a c7951a;
        C9114c c9114c = new C9114c(C8006r.m20431a());
        this.f17520b = c9114c;
        C7859d c7859d = new C7859d(c9114c);
        this.f17521c = c7859d;
        this.f17519a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        iAConfigManager.f17691w.f17892e = this;
        if (iAConfigManager.f17688t.f17862b.m20446a(true, "bidding_token_wait_for_ua")) {
            C9188s1 c9188s1 = iAConfigManager.f17692x;
            c9188s1.m22017b();
            if (!c9188s1.f21488d.get()) {
                c9188s1.m22018c();
            }
            c7859d.f17540b = iAConfigManager.f17692x.m22016a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (c7951a = iAConfigManager.f17668L) != null) {
            try {
                c7951a.f17703c.add(this);
            } catch (Throwable th) {
                IAlog.m21944a("failed to add network observer", th, new Object[0]);
            }
        }
        C7863f c7863f = new C7863f(this);
        this.f17522d = c7863f;
        c7863f.m20344a();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.InterfaceC7958h
    /* JADX INFO: renamed from: a */
    public final void mo20337a(EnumC9134a1 enumC9134a1) {
        if (TextUtils.equals(this.f17521c.f17555q, enumC9134a1.m21955b())) {
            return;
        }
        this.f17521c.f17555q = enumC9134a1.m21955b();
        m20342d();
    }

    /* JADX INFO: renamed from: a */
    public final void m20338a(String str, UnitDisplayType unitDisplayType, EnumC7880n0 enumC7880n0) {
        ArrayList<C7921g> arrayList;
        int i;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        C7916e c7916e = iAConfigManager.f17691w.f17888a;
        if (c7916e != null) {
            C7925k c7925k = (C7925k) c7916e.f17596b.get(EnumC7919c.m20358a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (c7925k != null) {
                ArrayList arrayList2 = new ArrayList(c7925k);
                Collections.sort(arrayList2, new C7924j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i = Integer.parseInt(iAConfigManager.f17688t.f17862b.m20445a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i = 5;
            }
            int i2 = i >= 0 ? i : 5;
            if (i2 > 0 && arrayList != null && arrayList.size() >= i2) {
                EnumC7876l0 enumC7876l0 = str.equals("video") ? EnumC7876l0.VIDEO : !str.equals("display") ? EnumC7876l0.UNITCONTENTTYPEUNKNOWN : EnumC7876l0.DISPLAY;
                C7886q0 c7886q0NewBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                c7886q0NewBuilder.m21753c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) c7886q0NewBuilder.f21118b).setSubType(enumC7876l0);
                int i3 = 0;
                for (C7921g c7921g : arrayList) {
                    C7866g0 c7866g0NewBuilder = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i4 = c7921g.f17602b;
                    c7866g0NewBuilder.m21753c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) c7866g0NewBuilder.f21118b).setClicks(i4);
                    int i5 = c7921g.f17601a;
                    c7866g0NewBuilder.m21753c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) c7866g0NewBuilder.f21118b).setImpressions(i5);
                    if (str.equals("video") || enumC7880n0.equals(EnumC7880n0.REWARDED)) {
                        int i6 = c7921g.f17603c;
                        c7866g0NewBuilder.m21753c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) c7866g0NewBuilder.f21118b).setCompletions(i6);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) c7866g0NewBuilder.m21751a();
                    c7886q0NewBuilder.m21753c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) c7886q0NewBuilder.f21118b).addSessionDataItems(sessionData);
                    i3++;
                    if (i3 >= i2) {
                        break;
                    }
                }
                c7886q0NewBuilder.m21753c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) c7886q0NewBuilder.f21118b).setType(enumC7880n0);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) c7886q0NewBuilder.m21751a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            C7873k c7873k = this.f17519a;
            c7873k.m21753c();
            ((TokenParametersOuterClass$TokenParameters) c7873k.f21118b).addUserSessions(userSession);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final byte[] m20339a() {
        JSONArray jSONArrayM20428a;
        EnumC7880n0 enumC7880n0;
        byte b;
        byte b2;
        EnumC7892t0 enumC7892t0;
        EnumC7880n0 enumC7880n1;
        String str;
        C7873k c7873k = this.f17519a;
        c7873k.f21118b = (AbstractC9047z0) c7873k.f21118b.dynamicMethod(EnumC9042y0.NEW_MUTABLE_INSTANCE);
        C7873k c7873k2 = this.f17519a;
        this.f17521c.getClass();
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a = AbstractC7867h.m20346a("1.2");
        c7873k2.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k2.f21118b).setVersion(nullableStringM20346a);
        if (this.f17523e.get() != null) {
            this.f17521c.m20343a();
        }
        C7873k c7873k3 = this.f17519a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a2 = AbstractC7867h.m20346a(this.f17521c.f17540b);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setUserAgent(nullableStringM20346a2);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a3 = AbstractC7867h.m20346a(this.f17521c.f17541c);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setSdkVersion(nullableStringM20346a3);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a4 = AbstractC7867h.m20346a(this.f17521c.f17542d);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setBundleID(nullableStringM20346a4);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a5 = AbstractC7867h.m20346a(this.f17521c.f17543e);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setDeviceModel(nullableStringM20346a5);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a6 = AbstractC7867h.m20346a(this.f17521c.f17544f);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setAppVersion(nullableStringM20346a6);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a7 = AbstractC7867h.m20346a(C11744X3.f26142d);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setDeviceOS(nullableStringM20346a7);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32M20347a = AbstractC7867h.m20347a(Build.VERSION.SDK_INT);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setDeviceApi(nullableUInt32M20347a);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a8 = AbstractC7867h.m20346a(Build.VERSION.RELEASE);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setOsVersion(nullableStringM20346a8);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a9 = AbstractC7867h.m20346a(this.f17521c.f17545g);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setDeviceLanguage(nullableStringM20346a9);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a10 = AbstractC7867h.m20346a(this.f17521c.f17546h);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setCountryCode(nullableStringM20346a10);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a11 = AbstractC7867h.m20346a(this.f17521c.f17547i);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setCarrierName(nullableStringM20346a11);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a12 = AbstractC7867h.m20346a(this.f17521c.f17548j);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setMobileCountryCode(nullableStringM20346a12);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a13 = AbstractC7867h.m20346a(this.f17521c.f17549k);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setMobileNetworkCode(nullableStringM20346a13);
        Long l = this.f17521c.f17550l;
        C7896x c7896xNewBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l != null) {
            int iIntValue = l.intValue();
            c7896xNewBuilder.m21753c();
            ((TokenParametersOuterClass$TokenParameters.NullableSInt32) c7896xNewBuilder.f21118b).setData(iIntValue);
        }
        TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (TokenParametersOuterClass$TokenParameters.NullableSInt32) c7896xNewBuilder.m21751a();
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setOffsetFromGMT(nullableSInt32);
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a14 = AbstractC7867h.m20346a(iAConfigManager.f17659C.f17735g);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setUserID(nullableStringM20346a14);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32M20347a2 = AbstractC7867h.m20347a(this.f17521c.f17551m);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setDeviceWidth(nullableUInt32M20347a2);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32M20347a3 = AbstractC7867h.m20347a(this.f17521c.f17552n);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setDeviceHeight(nullableUInt32M20347a3);
        EnumC7885q enumC7885q = this.f17521c.f17553o;
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setFrameworkName(enumC7885q);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a15 = AbstractC7867h.m20346a(this.f17521c.f17554p);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setInputLanguages(nullableStringM20346a15);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a16 = AbstractC7867h.m20346a(this.f17521c.f17534H);
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setMediationType(nullableStringM20346a16);
        this.f17521c.getClass();
        C8252l c8252l = iAConfigManager.f17660D.f18422p;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a17 = AbstractC7867h.m20346a(c8252l != null ? c8252l.getOdt() : "");
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setOdt(nullableStringM20346a17);
        Integer numM21906a = AbstractC9113b.m21906a();
        C7898z c7898zNewBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (numM21906a != null) {
            int iIntValue2 = numM21906a.intValue();
            c7898zNewBuilder.m21753c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) c7898zNewBuilder.f21118b).setData(iIntValue2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) c7898zNewBuilder.m21751a();
        c7873k3.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k3.f21118b).setAdServicesVersion(nullableUInt32);
        C7965g c7965g = iAConfigManager.f17659C;
        if (c7965g != null) {
            C7873k c7873k4 = this.f17519a;
            if (c7965g.f17732d == null) {
                c7965g.f17733e = c7965g.m20410i();
            }
            if (AbstractC9174o.f21470a == null) {
                str = null;
            } else {
                str = c7965g.f17732d;
                if (str == null) {
                    str = c7965g.f17733e;
                }
            }
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a18 = AbstractC7867h.m20346a(str);
            c7873k4.m21753c();
            ((TokenParametersOuterClass$TokenParameters) c7873k4.f21118b).setGdprString(nullableStringM20346a18);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a = AbstractC7867h.m20345a(c7965g.m20405d());
            c7873k4.m21753c();
            ((TokenParametersOuterClass$TokenParameters) c7873k4.f21118b).setGdprConsent(nullableBoolM20345a);
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a19 = AbstractC7867h.m20346a(AbstractC9174o.f21470a == null ? null : c7965g.f17736h);
            c7873k4.m21753c();
            ((TokenParametersOuterClass$TokenParameters) c7873k4.f21118b).setCcpaString(nullableStringM20346a19);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a2 = AbstractC7867h.m20345a(AbstractC9174o.f21470a == null ? null : c7965g.f17737i);
            c7873k4.m21753c();
            ((TokenParametersOuterClass$TokenParameters) c7873k4.f21118b).setLgpdConsent(nullableBoolM20345a2);
            Boolean bool = c7965g.f17738j;
            if (bool != null && bool.booleanValue()) {
                C7873k c7873k5 = this.f17519a;
                TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a3 = AbstractC7867h.m20345a(bool);
                c7873k5.m21753c();
                ((TokenParametersOuterClass$TokenParameters) c7873k5.f21118b).setCoppaApplies(nullableBoolM20345a3);
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            C7873k c7873k6 = this.f17519a;
            C8046v c8046v = AbstractC8044u.f17878a.f17886b;
            boolean z = c8046v != null ? c8046v.f17883b : false;
            c7873k6.m21753c();
            ((TokenParametersOuterClass$TokenParameters) c7873k6.f21118b).setDnt(z);
        }
        C7873k c7873k7 = this.f17519a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a20 = AbstractC7867h.m20346a(this.f17521c.f17555q);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setNetwork(nullableStringM20346a20);
        EnumC7864f0 enumC7864f0 = this.f17521c.f17556r;
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setSecureContent(enumC7864f0);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a4 = AbstractC7867h.m20345a(this.f17521c.f17528B);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setBatteryCharging(nullableBoolM20345a4);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a5 = AbstractC7867h.m20345a(this.f17521c.f17557s);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setHeadsetPlugged(nullableBoolM20345a5);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a6 = AbstractC7867h.m20345a(this.f17521c.f17558t);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setBluetoothPlugged(nullableBoolM20345a6);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a7 = AbstractC7867h.m20345a(this.f17521c.f17559u);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setLowPowerMode(nullableBoolM20345a7);
        boolean z2 = this.f17521c.f17560v;
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setDarkMode(z2);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a8 = AbstractC7867h.m20345a(this.f17521c.f17561w);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setAirplaneMode(nullableBoolM20345a8);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a9 = AbstractC7867h.m20345a(this.f17521c.f17562x);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setDndMode(nullableBoolM20345a9);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a10 = AbstractC7867h.m20345a(this.f17521c.f17563y);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setIsRingMuted(nullableBoolM20345a10);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32M20347a4 = AbstractC7867h.m20347a(this.f17521c.f17564z);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setSessionDuration(nullableUInt32M20347a4);
        String str2 = this.f17521c.f17529C;
        C7898z c7898zNewBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str2)) {
            int i = Integer.parseInt(str2);
            c7898zNewBuilder2.m21753c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) c7898zNewBuilder2.f21118b).setData(i);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt33 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) c7898zNewBuilder2.m21751a();
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setBatteryLevel(nullableUInt33);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a11 = AbstractC7867h.m20345a(Boolean.valueOf(TextUtils.equals(iAConfigManager.f17691w.m20456a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setPriorSkip(nullableBoolM20345a11);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32M20347a5 = AbstractC7867h.m20347a(this.f17521c.f17530D);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setUserAge(nullableUInt32M20347a5);
        InneractiveUserConfig.Gender gender = this.f17521c.f17531E;
        EnumC7884p0 enumC7884p0 = gender == InneractiveUserConfig.Gender.FEMALE ? EnumC7884p0.FEMALE : gender == InneractiveUserConfig.Gender.MALE ? EnumC7884p0.MALE : EnumC7884p0.UNKNOWN;
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setUserGender(enumC7884p0);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a21 = AbstractC7867h.m20346a(this.f17521c.f17533G);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setZipCode(nullableStringM20346a21);
        boolean z3 = this.f17521c.f17532F;
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setMuteAudio(z3);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a12 = AbstractC7867h.m20345a(this.f17521c.f17538L);
        c7873k7.m21753c();
        ((TokenParametersOuterClass$TokenParameters) c7873k7.f21118b).setMediaMuted(nullableBoolM20345a12);
        C8046v c8046v2 = AbstractC8044u.f17878a.f17886b;
        if (c8046v2 != null ? c8046v2.f17884c : false) {
            C7873k c7873k8 = this.f17519a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a22 = AbstractC7867h.m20346a(this.f17521c.f17527A);
            c7873k8.m21753c();
            ((TokenParametersOuterClass$TokenParameters) c7873k8.f21118b).setAmazonId(nullableStringM20346a22);
        } else {
            C7873k c7873k9 = this.f17519a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a23 = AbstractC7867h.m20346a(this.f17521c.f17527A);
            c7873k9.m21753c();
            ((TokenParametersOuterClass$TokenParameters) c7873k9.f21118b).setAaid(nullableStringM20346a23);
        }
        UnitDisplayType[] unitDisplayTypeArrValues = UnitDisplayType.values();
        int length = unitDisplayTypeArrValues.length;
        int i2 = 0;
        while (true) {
            byte b3 = 2;
            if (i2 >= length) {
                C9114c c9114c = this.f17520b;
                c9114c.getClass();
                C8006r c8006rM20431a = C8006r.m20431a();
                c9114c.f21367a = c8006rM20431a;
                c8006rM20431a.m20434a(false, "");
                C8006r c8006r = this.f17520b.f21367a;
                if (c8006r != null) {
                    jSONArrayM20428a = AbstractC7995g.m20428a(c8006r.f17776b, true);
                    IAlog.m21945a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayM20428a);
                } else {
                    jSONArrayM20428a = null;
                }
                if (jSONArrayM20428a != null) {
                    for (int i3 = 0; i3 < jSONArrayM20428a.length(); i3++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayM20428a.optJSONObject(i3);
                        if (jSONObjectOptJSONObject != null) {
                            C7879n c7879nNewBuilder = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                            String strOptString = jSONObjectOptJSONObject.optString("id");
                            c7879nNewBuilder.m21753c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) c7879nNewBuilder.f21118b).setIdentifier(strOptString);
                            String strOptString2 = jSONObjectOptJSONObject.optString("v");
                            c7879nNewBuilder.m21753c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) c7879nNewBuilder.f21118b).setVariant(strOptString2);
                            C7873k c7873k10 = this.f17519a;
                            TokenParametersOuterClass$TokenParameters.Experiment experiment = (TokenParametersOuterClass$TokenParameters.Experiment) c7879nNewBuilder.m21751a();
                            c7873k10.m21753c();
                            ((TokenParametersOuterClass$TokenParameters) c7873k10.f21118b).addAbExperiments(experiment);
                        }
                    }
                }
                C7873k c7873k11 = this.f17519a;
                int i4 = AbstractC8013k.f17788a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.number");
                C7898z c7898zNewBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
                if (!TextUtils.isEmpty(property)) {
                    int i5 = Integer.parseInt(property);
                    c7898zNewBuilder3.m21753c();
                    ((TokenParametersOuterClass$TokenParameters.NullableUInt32) c7898zNewBuilder3.f21118b).setData(i5);
                }
                TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt34 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) c7898zNewBuilder3.m21751a();
                c7873k11.m21753c();
                ((TokenParametersOuterClass$TokenParameters) c7873k11.f21118b).setPortal(nullableUInt34);
                C7873k c7873k12 = this.f17519a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a24 = AbstractC7867h.m20346a(System.getProperty("ia.testEnvironmentConfiguration.response"));
                c7873k12.m21753c();
                ((TokenParametersOuterClass$TokenParameters) c7873k12.f21118b).setMockResponseId(nullableStringM20346a24);
                C7873k c7873k13 = this.f17519a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a25 = AbstractC7867h.m20346a(this.f17521c.f17535I);
                c7873k13.m21753c();
                ((TokenParametersOuterClass$TokenParameters) c7873k13.f21118b).setIgniteVersion(nullableStringM20346a25);
                C7873k c7873k14 = this.f17519a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringM20346a26 = AbstractC7867h.m20346a(this.f17521c.f17536J);
                c7873k14.m21753c();
                ((TokenParametersOuterClass$TokenParameters) c7873k14.f21118b).setIgnitePackageName(nullableStringM20346a26);
                if (this.f17521c.f17537K) {
                    C7873k c7873k15 = this.f17519a;
                    TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolM20345a13 = AbstractC7867h.m20345a(Boolean.TRUE);
                    c7873k15.m21753c();
                    ((TokenParametersOuterClass$TokenParameters) c7873k15.f21118b).setChildMode(nullableBoolM20345a13);
                }
                return ((TokenParametersOuterClass$TokenParameters) this.f17519a.m21751a()).toByteArray();
            }
            UnitDisplayType unitDisplayType = unitDisplayTypeArrValues[i2];
            if (!unitDisplayType.isDeprecated()) {
                int[] iArr = AbstractC7865g.f17566a;
                int i6 = iArr[unitDisplayType.ordinal()];
                if (i6 == 1) {
                    enumC7880n0 = EnumC7880n0.BANNER;
                } else if (i6 == 2) {
                    enumC7880n0 = EnumC7880n0.INTERSTITIAL;
                } else if (i6 == 3) {
                    enumC7880n0 = EnumC7880n0.REWARDED;
                } else if (i6 != 4) {
                    enumC7880n0 = i6 != 5 ? EnumC7880n0.UNITDISPLAYTYPEUNKNOWN : EnumC7880n0.TYPENATIVE;
                } else {
                    enumC7880n0 = EnumC7880n0.MRECT;
                }
                C9112a c9112a = AbstractC9113b.f21363a;
                IAConfigManager iAConfigManager2 = IAConfigManager.f17654M;
                String strM20456a = iAConfigManager2.f17691w.m20456a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!TextUtils.isEmpty(strM20456a) && strM20456a.contains(",")) {
                    strM20456a = strM20456a.split(",")[0];
                }
                if (!TextUtils.isEmpty(strM20456a)) {
                    C7873k c7873k16 = this.f17519a;
                    C7887r c7887rNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    c7887rNewBuilder.m21753c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) c7887rNewBuilder.f21118b).setAdomain(strM20456a);
                    c7887rNewBuilder.m21753c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) c7887rNewBuilder.f21118b).setType(enumC7880n0);
                    TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (TokenParametersOuterClass$TokenParameters.LastAdomain) c7887rNewBuilder.m21751a();
                    c7873k16.m21753c();
                    ((TokenParametersOuterClass$TokenParameters) c7873k16.f21118b).addLastAdomains(lastAdomain);
                }
                String strM20456a2 = iAConfigManager2.f17691w.m20456a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!TextUtils.isEmpty(strM20456a2)) {
                    C7873k c7873k17 = this.f17519a;
                    C7891t c7891tNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    c7891tNewBuilder.m21753c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) c7891tNewBuilder.f21118b).setLastBundle(strM20456a2);
                    c7891tNewBuilder.m21753c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) c7891tNewBuilder.f21118b).setType(enumC7880n0);
                    TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) c7891tNewBuilder.m21751a();
                    c7873k17.m21753c();
                    ((TokenParametersOuterClass$TokenParameters) c7873k17.f21118b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (TextUtils.equals(iAConfigManager2.f17691w.m20456a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    C7873k c7873k18 = this.f17519a;
                    int i7 = iArr[unitDisplayType.ordinal()];
                    if (i7 == 1) {
                        b = 3;
                        b2 = 4;
                        enumC7880n1 = EnumC7880n0.BANNER;
                    } else if (i7 != 2) {
                        b = 3;
                        if (i7 != 3) {
                            b2 = 4;
                            enumC7880n1 = i7 != 4 ? i7 != 5 ? EnumC7880n0.UNITDISPLAYTYPEUNKNOWN : EnumC7880n0.TYPENATIVE : EnumC7880n0.MRECT;
                        } else {
                            b2 = 4;
                            enumC7880n1 = EnumC7880n0.REWARDED;
                        }
                    } else {
                        b = 3;
                        b2 = 4;
                        enumC7880n1 = EnumC7880n0.INTERSTITIAL;
                    }
                    c7873k18.m21753c();
                    ((TokenParametersOuterClass$TokenParameters) c7873k18.f21118b).addPriorClicks(enumC7880n1);
                } else {
                    b = 3;
                    b2 = 4;
                }
                m20338a("display", unitDisplayType, enumC7880n0);
                if (unitDisplayType.isFullscreenUnit()) {
                    m20338a("video", unitDisplayType, enumC7880n0);
                    String strM20456a3 = iAConfigManager2.f17691w.m20456a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!TextUtils.isEmpty(strM20456a3)) {
                        C7873k c7873k19 = this.f17519a;
                        C7829a0 c7829a0NewBuilder = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        strM20456a3.getClass();
                        strM20456a3.hashCode();
                        switch (strM20456a3.hashCode()) {
                            case 49:
                                b3 = strM20456a3.equals("1") ? (byte) 0 : (byte) -1;
                                break;
                            case 50:
                                b3 = strM20456a3.equals("2") ? (byte) 1 : (byte) -1;
                                break;
                            case 51:
                                if (!strM20456a3.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                    b3 = -1;
                                }
                                break;
                            case 52:
                                b3 = strM20456a3.equals("4") ? b : (byte) -1;
                                break;
                            case 53:
                                b3 = strM20456a3.equals(CampaignEx.CLICKMODE_ON) ? b2 : (byte) -1;
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                                enumC7892t0 = EnumC7892t0.CTABUTTON;
                                break;
                            case 1:
                                enumC7892t0 = EnumC7892t0.COMPANION;
                                break;
                            case 2:
                                enumC7892t0 = EnumC7892t0.VIDEOVIEW;
                                break;
                            case 3:
                                enumC7892t0 = EnumC7892t0.APPINFO;
                                break;
                            case 4:
                                enumC7892t0 = EnumC7892t0.STOREPROMO;
                                break;
                            default:
                                enumC7892t0 = EnumC7892t0.NOCLICK;
                                break;
                        }
                        c7829a0NewBuilder.m21753c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) c7829a0NewBuilder.f21118b).setClickType(enumC7892t0);
                        c7829a0NewBuilder.m21753c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) c7829a0NewBuilder.f21118b).setType(enumC7880n0);
                        TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (TokenParametersOuterClass$TokenParameters.PriorVideoClickType) c7829a0NewBuilder.m21751a();
                        c7873k19.m21753c();
                        ((TokenParametersOuterClass$TokenParameters) c7873k19.f21118b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20340b() {
        byte[] byteArray;
        if (this.f17524f.compareAndSet(false, true)) {
            try {
                String strEncodeToString = Base64.encodeToString(m20339a(), 2);
                IAConfigManager iAConfigManager = IAConfigManager.f17654M;
                String str = iAConfigManager.f17680l;
                C8021o c8021o = iAConfigManager.f17688t.f17862b;
                String str2 = "token_size_limit";
                int iM20443a = c8021o.m20443a("token_size_limit", 4000, 1);
                if (!TextUtils.isEmpty(str)) {
                    str2 = "token_size_limit_" + str.toLowerCase(Locale.US);
                }
                TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParametersM21927a = iAConfigManager.f17664H.m21927a(c8021o.m20443a(str2, iM20443a, 1) - strEncodeToString.getBytes().length);
                if (tokenParametersOuterClass$TokenParametersM21927a == null) {
                    byteArray = null;
                } else {
                    C7873k c7873k = this.f17519a;
                    c7873k.m21753c();
                    AbstractC9017t0.m21748a(c7873k.f21118b, tokenParametersOuterClass$TokenParametersM21927a);
                    byteArray = ((TokenParametersOuterClass$TokenParameters) c7873k.m21751a()).toByteArray();
                }
                AtomicReference atomicReference = this.f17523e;
                if (byteArray != null) {
                    strEncodeToString = Base64.encodeToString(byteArray, 2);
                }
                atomicReference.set(strEncodeToString);
            } catch (Throwable th) {
                IAlog.m21946b("Failed to generate token with error: %s", th.getMessage());
            }
            this.f17524f.set(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20341c() {
        int currentInterruptionFilter = ((NotificationManager) AbstractC9174o.f21470a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.f17521c.f17562x;
        if (bool == null || bool.booleanValue() != z) {
            this.f17521c.f17562x = Boolean.valueOf(z);
            m20342d();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m20342d() {
        AbstractC9183r.f21477a.execute(new RunnableC7828a(this));
    }
}
