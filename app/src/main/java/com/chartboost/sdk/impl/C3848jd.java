package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.jd */
/* JADX INFO: loaded from: classes3.dex */
public final class C3848jd {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3945ni f14908a;

    /* JADX INFO: renamed from: b */
    public final C4077ti f14909b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4199z8 f14910c;

    /* JADX INFO: renamed from: d */
    public float f14911d;

    /* JADX INFO: renamed from: e */
    public InterfaceC3868ka f14912e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14913a;

        static {
            int[] iArr = new int[EnumC3871kd.values().length];
            try {
                iArr[EnumC3871kd.GET_PARAMETERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3871kd.GET_MAX_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3871kd.GET_SCREEN_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3871kd.GET_CURRENT_POSITION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3871kd.GET_DEFAULT_POSITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3871kd.GET_ORIENTATION_PROPERTIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3871kd.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3871kd.CLOSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC3871kd.SKIPPED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC3871kd.VIDEO_COMPLETED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC3871kd.VIDEO_RESUMED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC3871kd.VIDEO_PAUSED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC3871kd.VIDEO_REPLAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC3871kd.CURRENT_VIDEO_DURATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC3871kd.TOTAL_VIDEO_DURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC3871kd.SHOW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC3871kd.ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC3871kd.WARNING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC3871kd.DEBUG.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC3871kd.TRACKING.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC3871kd.OPEN_URL.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC3871kd.SET_ORIENTATION_PROPERTIES.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC3871kd.REWARD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC3871kd.REWARDED_VIDEO_COMPLETED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC3871kd.PLAY_VIDEO.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC3871kd.PAUSE_VIDEO.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC3871kd.CLOSE_VIDEO.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC3871kd.MUTE_VIDEO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC3871kd.UNMUTE_VIDEO.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC3871kd.OM_MEASUREMENT_RESOURCES.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[EnumC3871kd.START.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[EnumC3871kd.BUFFER_START.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[EnumC3871kd.BUFFER_END.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[EnumC3871kd.VIDEO_FINISHED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[EnumC3871kd.VIDEO_STARTED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[EnumC3871kd.ON_FOREGROUND.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[EnumC3871kd.VIDEO_ENDED.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[EnumC3871kd.VIDEO_FAILED.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[EnumC3871kd.PLAYBACK_TIME.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[EnumC3871kd.ON_BACKGROUND.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            f14913a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$a0 */
    public static final class a0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a0 f14914b = new a0();

        public a0() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18247a() {
            C4048sb.m19411b("Video replay command is run", (Throwable) null, 2, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18247a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18248a() {
            Unit unit;
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18390u();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in template show", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18248a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$b0 */
    public static final class b0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14917c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(JSONObject jSONObject) {
            super(0);
            this.f14917c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18249a() {
            C3848jd.this.m18229a(this.f14917c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18249a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14919c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f14919c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18250a() {
            C3848jd.this.m18234c(this.f14919c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18250a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$c0 */
    public static final class c0 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(JSONObject jSONObject) {
            super(0);
            this.f14921c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18251a() {
            C3848jd.this.m18244i(this.f14921c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18251a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject) {
            super(0);
            this.f14923c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18252a() {
            C3848jd.this.m18246k(this.f14923c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18252a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$e */
    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14925c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject) {
            super(0);
            this.f14925c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18253a() {
            C3848jd.this.m18232b(this.f14925c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18253a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$f */
    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14927c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONObject jSONObject) {
            super(0);
            this.f14927c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18254a() {
            C3848jd.this.m18245j(this.f14927c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18254a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$g */
    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14929c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(0);
            this.f14929c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18255a() {
            C3848jd.this.m18238e(this.f14929c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18255a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$h */
    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14931c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(JSONObject jSONObject) {
            super(0);
            this.f14931c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18256a() {
            C3848jd.this.m18243h(this.f14931c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18256a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$i */
    public static final class i extends Lambda implements Function0 {
        public i() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18257a() {
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18363A();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18257a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$j */
    public static final class j extends Lambda implements Function0 {
        public j() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18258a() {
            Unit unit;
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18387q();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in template rewarded video completed", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18258a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$k */
    public static final class k extends Lambda implements Function0 {
        public k() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18259a() {
            Unit unit;
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18391v();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in template play video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18259a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$l */
    public static final class l extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14936c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(JSONObject jSONObject) {
            super(0);
            this.f14936c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18260a() {
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18375b(C3848jd.this.f14909b.m19503b(this.f14936c));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18260a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$m */
    public static final class m extends Lambda implements Function0 {
        public m() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18261a() {
            Unit unit;
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18385k();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in template pause video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18261a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$n */
    public static final class n extends Lambda implements Function0 {
        public n() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18262a() {
            Unit unit;
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18393z();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in template close video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18262a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$o */
    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18263a() {
            Unit unit;
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18381f();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in template mute video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18263a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$p */
    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18264a() {
            Unit unit;
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18373b();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in template unmute video", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18264a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$q */
    public static final class q extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(JSONObject jSONObject) {
            super(0);
            this.f14942c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18265a() {
            C3848jd.this.m18240f(this.f14942c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18265a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$r */
    public static final class r extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f14944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(JSONObject jSONObject) {
            super(0);
            this.f14944c = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public final void m18266a() {
            C3848jd.this.m18242g(this.f14944c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18266a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$s */
    public static final class s extends Lambda implements Function0 {
        public s() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18267a() {
            C3848jd.this.m18233c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18267a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$t */
    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18268a() {
            C3848jd.this.m18231b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18268a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$u */
    public static final class u extends Lambda implements Function0 {
        public u() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18269a() {
            C3848jd.this.m18235d();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18269a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$v */
    public static final class v extends Lambda implements Function0 {
        public v() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18270a() {
            Unit unit;
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18389t();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in template close", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18270a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$w */
    public static final class w extends Lambda implements Function0 {
        public w() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18271a() {
            InterfaceC3868ka interfaceC3868ka = C3848jd.this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18369a(EnumC4012qj.SKIP);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18271a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$x */
    public static final class x extends Lambda implements Function0 {
        public x() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18272a() {
            C3848jd.this.m18241g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18272a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$y */
    public static final class y extends Lambda implements Function0 {
        public y() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18273a() {
            C3848jd.this.m18239f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18273a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jd$z */
    public static final class z extends Lambda implements Function0 {
        public z() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18274a() {
            C3848jd.this.m18237e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m18274a();
            return Unit.INSTANCE;
        }
    }

    public C3848jd(InterfaceC3945ni uiPost, C4077ti urlParser) {
        Intrinsics.checkNotNullParameter(uiPost, "uiPost");
        Intrinsics.checkNotNullParameter(urlParser, "urlParser");
        this.f14908a = uiPost;
        this.f14909b = urlParser;
    }

    /* JADX INFO: renamed from: a */
    public final String m18224a(JSONObject jSONObject, EnumC3871kd enumC3871kd) {
        String strMo18384j;
        String strMo18382h;
        String strMo18364B;
        String strMo18388s;
        String strMo18392w;
        String strMo18365C;
        switch (a.f14913a[enumC3871kd.ordinal()]) {
            case 1:
                C4048sb.m19408a("JavaScript to native " + enumC3871kd.m18416c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                InterfaceC3868ka interfaceC3868ka = this.f14912e;
                return (interfaceC3868ka == null || (strMo18384j = interfaceC3868ka.mo18384j()) == null) ? "" : strMo18384j;
            case 2:
                C4048sb.m19408a("JavaScript to native " + enumC3871kd.m18416c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                InterfaceC3868ka interfaceC3868ka2 = this.f14912e;
                return (interfaceC3868ka2 == null || (strMo18382h = interfaceC3868ka2.mo18382h()) == null) ? "" : strMo18382h;
            case 3:
                C4048sb.m19408a("JavaScript to native " + enumC3871kd.m18416c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                InterfaceC3868ka interfaceC3868ka3 = this.f14912e;
                return (interfaceC3868ka3 == null || (strMo18364B = interfaceC3868ka3.mo18364B()) == null) ? "" : strMo18364B;
            case 4:
                C4048sb.m19408a("JavaScript to native " + enumC3871kd.m18416c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                InterfaceC3868ka interfaceC3868ka4 = this.f14912e;
                return (interfaceC3868ka4 == null || (strMo18388s = interfaceC3868ka4.mo18388s()) == null) ? "" : strMo18388s;
            case 5:
                C4048sb.m19408a("JavaScript to native " + enumC3871kd.m18416c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                InterfaceC3868ka interfaceC3868ka5 = this.f14912e;
                return (interfaceC3868ka5 == null || (strMo18392w = interfaceC3868ka5.mo18392w()) == null) ? "" : strMo18392w;
            case 6:
                C4048sb.m19408a("JavaScript to native " + enumC3871kd.m18416c() + " callback triggered.", (Throwable) null, 2, (Object) null);
                InterfaceC3868ka interfaceC3868ka6 = this.f14912e;
                return (interfaceC3868ka6 == null || (strMo18365C = interfaceC3868ka6.mo18365C()) == null) ? "" : strMo18365C;
            case 7:
                this.f14908a.mo18805a(new l(jSONObject));
                return "Native function successfully called.";
            case 8:
                this.f14908a.mo18805a(new v());
                return "Native function successfully called.";
            case 9:
                this.f14908a.mo18805a(new w());
                return "Native function successfully called.";
            case 10:
                this.f14908a.mo18805a(new x());
                return "Native function successfully called.";
            case 11:
                this.f14908a.mo18805a(new y());
                return "Native function successfully called.";
            case 12:
                this.f14908a.mo18805a(new z());
                return "Native function successfully called.";
            case 13:
                this.f14908a.mo18805a(a0.f14914b);
                return "Native function successfully called.";
            case 14:
                this.f14908a.mo18805a(new b0(jSONObject));
                return "Native function successfully called.";
            case 15:
                this.f14908a.mo18805a(new c0(jSONObject));
                return "Native function successfully called.";
            case 16:
                this.f14908a.mo18805a(new b());
                return "Native function successfully called.";
            case 17:
                this.f14908a.mo18805a(new c(jSONObject));
                return "Native function successfully called.";
            case 18:
                this.f14908a.mo18805a(new d(jSONObject));
                return "Native function successfully called.";
            case 19:
                this.f14908a.mo18805a(new e(jSONObject));
                return "Native function successfully called.";
            case 20:
                this.f14908a.mo18805a(new f(jSONObject));
                return "Native function successfully called.";
            case 21:
                this.f14908a.mo18805a(new g(jSONObject));
                return "Native function successfully called.";
            case 22:
                this.f14908a.mo18805a(new h(jSONObject));
                return "Native function successfully called.";
            case 23:
                this.f14908a.mo18805a(new i());
                return "Native function successfully called.";
            case 24:
                this.f14908a.mo18805a(new j());
                return "Native function successfully called.";
            case 25:
                this.f14908a.mo18805a(new k());
                return "Native function successfully called.";
            case 26:
                this.f14908a.mo18805a(new m());
                return "Native function successfully called.";
            case 27:
                this.f14908a.mo18805a(new n());
                return "Native function successfully called.";
            case 28:
                this.f14908a.mo18805a(new o());
                return "Native function successfully called.";
            case 29:
                this.f14908a.mo18805a(new p());
                return "Native function successfully called.";
            case 30:
                this.f14908a.mo18805a(new q(jSONObject));
                return "Native function successfully called.";
            case 31:
                this.f14908a.mo18805a(new r(jSONObject));
                return "Native function successfully called.";
            case 32:
                this.f14908a.mo18805a(new s());
                return "Native function successfully called.";
            case 33:
                this.f14908a.mo18805a(new t());
                return "Native function successfully called.";
            case 34:
                this.f14908a.mo18805a(new u());
                return "Native function successfully called.";
            default:
                return "Native function successfully called.";
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18225a(JSONObject jSONObject, String functionName) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        EnumC3871kd enumC3871kdM18417a = EnumC3871kd.f15094c.m18417a(functionName);
        if (enumC3871kdM18417a == null) {
            C4048sb.m19417e("Native event unknown: " + functionName, null, 2, null);
            return "Function name not recognized.";
        }
        C4048sb.m19408a("TEMPLATE EVENT: " + enumC3871kdM18417a.m18416c(), (Throwable) null, 2, (Object) null);
        return m18224a(jSONObject, enumC3871kdM18417a);
    }

    /* JADX INFO: renamed from: a */
    public final void m18226a() {
        this.f14912e = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m18227a(InterfaceC3868ka impressionInterface) {
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        this.f14912e = impressionInterface;
    }

    /* JADX INFO: renamed from: a */
    public final void m18228a(InterfaceC4199z8 interfaceC4199z8) {
        this.f14910c = interfaceC4199z8;
    }

    /* JADX INFO: renamed from: a */
    public final void m18229a(JSONObject jSONObject) {
        float f2;
        Unit unit;
        if (jSONObject != null) {
            try {
                f2 = (float) jSONObject.getDouble("duration");
            } catch (Exception e2) {
                m18246k(new JSONObject().put("message", "Parsing exception unknown field for current player duration: " + e2));
                return;
            }
        } else {
            f2 = 0.0f;
        }
        if (f2 > 0.0f) {
            float f3 = f2 * 1000;
            C4048sb.m19408a("######### JS->Native Video current player duration: " + f3, (Throwable) null, 2, (Object) null);
            InterfaceC3868ka interfaceC3868ka = this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18366a(f3);
                interfaceC3868ka.mo18367a(this.f14911d, f3);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in currentVideoDuration", (Throwable) null, 2, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m18230b(JSONObject jSONObject, String str) {
        String string = jSONObject != null ? jSONObject.getString("message") : null;
        if (string == null) {
            string = "";
        }
        C4048sb.m19408a(str + string, (Throwable) null, 2, (Object) null);
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m18231b() {
        Unit unit;
        try {
            InterfaceC3868ka interfaceC3868ka = this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18369a(EnumC4012qj.BUFFER_END);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in runBufferEnd", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            C4048sb.m19410b("Invalid buffer end command", e2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18232b(JSONObject jSONObject) {
        try {
            C4048sb.m19408a("Debug message: " + m18230b(jSONObject, "JS->Native Debug message: "), (Throwable) null, 2, (Object) null);
        } catch (Exception e2) {
            C4048sb.m19410b("Exception occurred while parsing the message for webview debug track event", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18233c() {
        Unit unit;
        try {
            InterfaceC3868ka interfaceC3868ka = this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18369a(EnumC4012qj.BUFFER_START);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in runBufferStart", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            C4048sb.m19410b("Invalid bufer start command", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18234c(JSONObject jSONObject) {
        C4048sb.m19408a("Javascript Error occurred " + jSONObject, (Throwable) null, 2, (Object) null);
        m18236d(jSONObject);
        try {
            InterfaceC3868ka interfaceC3868ka = this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18383i();
                if (interfaceC3868ka.mo18378d(m18230b(jSONObject, "JS->Native Error message: ")) != null) {
                    return;
                }
            }
            C4048sb.m19408a("Impression interface is missing in error", (Throwable) null, 2, (Object) null);
            Unit unit = Unit.INSTANCE;
        } catch (Exception unused) {
            C4048sb.m19411b("Error message is empty", (Throwable) null, 2, (Object) null);
            InterfaceC3868ka interfaceC3868ka2 = this.f14912e;
            if (interfaceC3868ka2 != null) {
                interfaceC3868ka2.mo18378d("");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18235d() {
        Unit unit;
        try {
            InterfaceC3868ka interfaceC3868ka = this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18369a(EnumC4012qj.COMPLETED);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in runVideoFinished", (Throwable) null, 2, (Object) null);
            }
        } catch (Exception e2) {
            C4048sb.m19410b("Invalid buffer end command", e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18236d(JSONObject jSONObject) {
        String strOptString;
        if (C3851jg.f14967a.m18286d() && jSONObject != null && (strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE)) != null && Intrinsics.areEqual(strOptString, "crash sdk")) {
            throw new RuntimeException("test crash");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18237e() {
        Unit unit;
        InterfaceC3868ka interfaceC3868ka = this.f14912e;
        if (interfaceC3868ka != null) {
            interfaceC3868ka.mo18370a(EnumC4029re.PAUSED);
            interfaceC3868ka.mo18369a(EnumC4012qj.PAUSE);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Impression interface is missing in runVideoResumedCommand", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18238e(JSONObject jSONObject) {
        Unit unit;
        try {
            InterfaceC3868ka interfaceC3868ka = this.f14912e;
            if (interfaceC3868ka != null) {
                interfaceC3868ka.mo18376c(this.f14909b.m19503b(jSONObject));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19408a("Impression interface is missing in openUrl", (Throwable) null, 2, (Object) null);
            }
        } catch (ActivityNotFoundException e2) {
            C4048sb.m19410b("ActivityNotFoundException occured when opening a url in a browser", e2);
        } catch (Exception e3) {
            C4048sb.m19410b("Exception while opening a browser view with MRAID url", e3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18239f() {
        Unit unit;
        InterfaceC3868ka interfaceC3868ka = this.f14912e;
        if (interfaceC3868ka != null) {
            interfaceC3868ka.mo18369a(EnumC4012qj.RESUME);
            interfaceC3868ka.mo18370a(EnumC4029re.PLAYING);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Impression interface is missing in runVideoResumedCommand", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX INFO: renamed from: f */
    public final void m18240f(JSONObject jSONObject) {
        List list;
        Unit unit;
        Unit unit2;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("resources");
                if (string != null) {
                    if (string.length() == 0) {
                        list = CollectionsKt.emptyList();
                    } else {
                        List<JSONObject> listAsList = AbstractC3912m8.asList(new JSONArray(string));
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsList, 10));
                        for (JSONObject jSONObject2 : listAsList) {
                            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(jSONObject2.getString("vendorKey"), new URL(jSONObject2.getString("url")), jSONObject2.getString("params")));
                        }
                        list = CollectionsKt.toList(arrayList);
                    }
                    int iOptInt = jSONObject.optInt("skipOffset");
                    InterfaceC3868ka interfaceC3868ka = this.f14912e;
                    if (interfaceC3868ka != null) {
                        interfaceC3868ka.mo18371a(list, Integer.valueOf(iOptInt));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        C4048sb.m19408a("Impression interface is missing in runOmResources", (Throwable) null, 2, (Object) null);
                    }
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
            } catch (Exception e2) {
                C4048sb.m19410b("Invalid om resources command", e2);
                return;
            }
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            C4048sb.m19411b("Invalid om resources command: missing json", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18241g() {
        Unit unit;
        InterfaceC4199z8 interfaceC4199z8 = this.f14910c;
        if (interfaceC4199z8 != null) {
            interfaceC4199z8.onHideCustomView();
        }
        InterfaceC3868ka interfaceC3868ka = this.f14912e;
        if (interfaceC3868ka != null) {
            interfaceC3868ka.mo18370a(EnumC4029re.IDLE);
            interfaceC3868ka.mo18386l();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Impression interface is missing in videoCompleted", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18242g(JSONObject jSONObject) {
        Unit unit;
        double dOptDouble = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (jSONObject != null) {
            try {
                dOptDouble = jSONObject.optDouble("duration", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            } catch (Exception e2) {
                C4048sb.m19410b("Invalid start command", e2);
                return;
            }
        }
        this.f14911d = (float) dOptDouble;
        InterfaceC3868ka interfaceC3868ka = this.f14912e;
        if (interfaceC3868ka != null) {
            interfaceC3868ka.mo18369a(EnumC4012qj.START);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Impression interface is missing in runStart", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m18243h(JSONObject jSONObject) {
        Unit unit;
        boolean zOptBoolean = true;
        if (jSONObject != null) {
            try {
                zOptBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            } catch (Exception unused) {
                C4048sb.m19411b("Invalid set orientation command", (Throwable) null, 2, (Object) null);
                return;
            }
        }
        String str = "none";
        String strOptString = jSONObject != null ? jSONObject.optString("forceOrientation", "none") : null;
        if (strOptString != null) {
            str = strOptString;
        }
        InterfaceC3868ka interfaceC3868ka = this.f14912e;
        if (interfaceC3868ka != null) {
            interfaceC3868ka.mo18372a(zOptBoolean, str);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Impression interface is missing in setOrientation", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m18244i(JSONObject jSONObject) {
        float fOptDouble;
        Unit unit;
        if (jSONObject != null) {
            try {
                fOptDouble = (float) jSONObject.optDouble("duration", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            } catch (Exception e2) {
                m18246k(new JSONObject().put("message", "Parsing exception unknown field for total player duration: " + e2));
                return;
            }
        } else {
            fOptDouble = 0.0f;
        }
        float f2 = fOptDouble * 1000;
        C4048sb.m19408a("######### JS->Native Video total player duration" + f2, (Throwable) null, 2, (Object) null);
        this.f14911d = f2;
        InterfaceC3868ka interfaceC3868ka = this.f14912e;
        if (interfaceC3868ka != null) {
            interfaceC3868ka.mo18374b(f2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19408a("Impression interface is missing in totalVideoDuration", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX INFO: renamed from: j */
    public final void m18245j(JSONObject jSONObject) {
        Unit unit;
        Unit unit2;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(NotificationCompat.CATEGORY_EVENT);
                if (string != null) {
                    InterfaceC3868ka interfaceC3868ka = this.f14912e;
                    if (interfaceC3868ka != null) {
                        interfaceC3868ka.mo18380e(string);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        C4048sb.m19408a("JS->Native Track VAST event message: " + string, (Throwable) null, 2, (Object) null);
                    }
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
            } catch (Exception e2) {
                C4048sb.m19410b("Exception while parsing webview VAST tracking", e2);
                return;
            }
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            C4048sb.m19411b("Tracking command received but event is missing!", (Throwable) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18246k(JSONObject jSONObject) {
        String string;
        C4048sb.m19408a("Javascript warning occurred", (Throwable) null, 2, (Object) null);
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("message");
            } catch (Exception unused) {
                InterfaceC3868ka interfaceC3868ka = this.f14912e;
                if (interfaceC3868ka != null) {
                    interfaceC3868ka.mo18377c("Warning message is empty");
                    return;
                }
                return;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "Missing message argument";
        }
        C4048sb.m19408a("JS->Native Warning message: " + string, (Throwable) null, 2, (Object) null);
        InterfaceC3868ka interfaceC3868ka2 = this.f14912e;
        if (interfaceC3868ka2 != null) {
            interfaceC3868ka2.mo18377c(string);
        }
    }
}
