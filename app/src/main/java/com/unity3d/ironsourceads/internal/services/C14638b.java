package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C11455Gb;
import com.ironsource.C12229h9;
import com.ironsource.C12317m4;
import com.ironsource.C12580w5;
import com.ironsource.EnumC12265j9;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC12201g;
import com.ironsource.InterfaceC12219h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterfaceC12502k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C14638b implements InterfaceC14637a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12201g f41417a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12219h f41418b;

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41419a;

        static {
            int[] iArr = new int[EnumC12265j9.values().length];
            try {
                iArr[EnumC12265j9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12265j9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41419a = iArr;
        }
    }

    public C14638b() {
        this(new InterfaceC12502k.a(), new InterfaceC12502k.b());
    }

    public C14638b(InterfaceC12201g actionIntentFactory, InterfaceC12219h activityIntentFactory) {
        Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        this.f41417a = actionIntentFactory;
        this.f41418b = activityIntentFactory;
    }

    /* JADX INFO: renamed from: a */
    private final Intent m43180a(C12229h9 c12229h9) throws JSONException {
        Intent intentMo31514a = this.f41417a.mo31514a();
        intentMo31514a.setPackage(c12229h9.m31620f());
        intentMo31514a.setData(Uri.parse(c12229h9.m31622h()));
        JSONObject jSONObjectM31619e = c12229h9.m31619e();
        if (jSONObjectM31619e != null) {
            Iterator<String> itKeys = jSONObjectM31619e.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object value = jSONObjectM31619e.get(next);
                if (value instanceof String) {
                    intentMo31514a.putExtra(next, (String) value);
                } else if (value instanceof Boolean) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentMo31514a.putExtra(next, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentMo31514a.putExtra(next, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentMo31514a.putExtra(next, ((Number) value).longValue());
                } else if (value instanceof Float) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentMo31514a.putExtra(next, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    intentMo31514a.putExtra(next, ((Number) value).doubleValue());
                } else {
                    intentMo31514a.putExtra(next, value.toString());
                }
            }
        }
        return intentMo31514a;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC14637a.a m43181a(Activity activity, Intent intent) {
        activity.startActivity(new InlineStoreActivity.C14636b(this.f41418b).m43172a(intent).m43171a(activity));
        m43183a(this, EnumC12598x5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC12265j9.APP_ACTIVITY, null, 4, null);
        return InterfaceC14637a.a.b.f41416a;
    }

    /* JADX INFO: renamed from: a */
    private final void m43182a(EnumC12598x5 enumC12598x5, EnumC12265j9 enumC12265j9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC12265j9.m31870b());
            C11455Gb.f24351s.m25905d().mo25850q().mo25281a(new C12580w5(enumC12598x5, new JSONObject(MapsKt.toMap(map))));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m43183a(C14638b c14638b, EnumC12598x5 enumC12598x5, EnumC12265j9 enumC12265j9, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        c14638b.m43182a(enumC12598x5, enumC12265j9, map);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m43184a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC14637a.a m43185b(Activity activity, Intent intent) {
        activity.startActivityForResult(intent, 794006778);
        m43183a(this, EnumC12598x5.INLINE_STORE_LAUNCHED, EnumC12265j9.DIRECT_INTENT, null, 4, null);
        return InterfaceC14637a.a.b.f41416a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.InterfaceC14637a
    /* JADX INFO: renamed from: a */
    public InterfaceC14637a.a mo43173a(Context context, C12229h9 request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            try {
                m43183a(this, EnumC12598x5.INLINE_STORE_REQUESTED, request.m31621g(), null, 4, null);
                if (TextUtils.isEmpty(request.m31622h())) {
                    m43182a(EnumC12598x5.INLINE_STORE_FAILED, request.m31621g(), MapsKt.mutableMapOf(TuplesKt.m43482to("reason", "storeUrl is empty")));
                    return new InterfaceC14637a.a.C15571a("storeUrl is empty");
                }
                if (!(context instanceof Activity)) {
                    m43182a(EnumC12598x5.INLINE_STORE_FAILED, request.m31621g(), MapsKt.mutableMapOf(TuplesKt.m43482to("reason", "context is not an Activity")));
                    return new InterfaceC14637a.a.C15571a("context is not an Activity");
                }
                Intent intentM43180a = m43180a(request);
                if (!m43184a(context, intentM43180a)) {
                    m43182a(EnumC12598x5.INLINE_STORE_FAILED, request.m31621g(), MapsKt.mutableMapOf(TuplesKt.m43482to("reason", "Failed to resolve for packageManager")));
                    return new InterfaceC14637a.a.C15571a("Failed to resolve for packageManager");
                }
                int i = a.f41419a[request.m31621g().ordinal()];
                if (i == 1) {
                    return m43185b((Activity) context, intentM43180a);
                }
                if (i == 2) {
                    return m43181a((Activity) context, intentM43180a);
                }
                throw new NoWhenBranchMatchedException();
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                C12317m4.m32153d().m32155a(exc);
                String str = "Failed to open inline store: " + exc.getMessage();
                IronLog.INTERNAL.error(exc.toString());
                m43182a(EnumC12598x5.INLINE_STORE_FAILED, request.m31621g(), MapsKt.mutableMapOf(TuplesKt.m43482to("reason", str)));
                return new InterfaceC14637a.a.C15571a(str);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.unity3d.ironsourceads.internal.services.InterfaceC14637a
    /* JADX INFO: renamed from: a */
    public InterfaceC14637a.a mo43174a(Context context, EnumC12265j9 strategy) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        try {
            m43183a(this, EnumC12598x5.INLINE_STORE_DESTROY_REQUESTED, strategy, null, 4, null);
            if (!(context instanceof Activity)) {
                m43182a(EnumC12598x5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.m43482to("reason", "context is not an Activity")));
                return new InterfaceC14637a.a.C15571a("context is not an Activity");
            }
            int i = a.f41419a[strategy.ordinal()];
            if (i == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            }
            intent.addFlags(603979776);
            intent.putExtra("destroy_inline_store", true);
            context.startActivity(intent);
            m43183a(this, EnumC12598x5.INLINE_STORE_DESTROY_LAUNCHED, strategy, null, 4, null);
            return InterfaceC14637a.a.b.f41416a;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            String str = "Failed to destroy inline store: " + e.getMessage();
            IronLog.INTERNAL.error(e.toString());
            m43182a(EnumC12598x5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.m43482to("reason", str)));
            return new InterfaceC14637a.a.C15571a(str);
        }
    }
}
