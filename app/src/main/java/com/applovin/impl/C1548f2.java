package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.f2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1548f2 {

    /* JADX INFO: renamed from: A */
    public static final C1548f2 f1464A;

    /* JADX INFO: renamed from: A0 */
    public static final C1548f2 f1465A0;

    /* JADX INFO: renamed from: B */
    public static final C1548f2 f1466B;

    /* JADX INFO: renamed from: B0 */
    public static final C1548f2 f1467B0;

    /* JADX INFO: renamed from: C */
    public static final C1548f2 f1468C;

    /* JADX INFO: renamed from: C0 */
    public static final C1548f2 f1469C0;

    /* JADX INFO: renamed from: D */
    public static final C1548f2 f1470D;

    /* JADX INFO: renamed from: D0 */
    public static final C1548f2 f1471D0;

    /* JADX INFO: renamed from: E */
    public static final C1548f2 f1472E;

    /* JADX INFO: renamed from: E0 */
    public static final C1548f2 f1473E0;

    /* JADX INFO: renamed from: F */
    public static final C1548f2 f1474F;

    /* JADX INFO: renamed from: F0 */
    public static final C1548f2 f1475F0;

    /* JADX INFO: renamed from: G */
    public static final C1548f2 f1476G;

    /* JADX INFO: renamed from: G0 */
    public static final C1548f2 f1477G0;

    /* JADX INFO: renamed from: H */
    public static final C1548f2 f1478H;

    /* JADX INFO: renamed from: H0 */
    public static final C1548f2 f1479H0;

    /* JADX INFO: renamed from: I */
    public static final C1548f2 f1480I;

    /* JADX INFO: renamed from: I0 */
    public static final C1548f2 f1481I0;

    /* JADX INFO: renamed from: J */
    public static final C1548f2 f1482J;

    /* JADX INFO: renamed from: J0 */
    public static final C1548f2 f1483J0;

    /* JADX INFO: renamed from: K */
    public static final C1548f2 f1484K;

    /* JADX INFO: renamed from: K0 */
    public static final C1548f2 f1485K0;

    /* JADX INFO: renamed from: L */
    public static final C1548f2 f1486L;

    /* JADX INFO: renamed from: L0 */
    public static final C1548f2 f1487L0;

    /* JADX INFO: renamed from: M */
    public static final C1548f2 f1488M;

    /* JADX INFO: renamed from: M0 */
    public static final C1548f2 f1489M0;

    /* JADX INFO: renamed from: N */
    public static final C1548f2 f1490N;

    /* JADX INFO: renamed from: N0 */
    public static final C1548f2 f1491N0;

    /* JADX INFO: renamed from: O */
    public static final C1548f2 f1492O;

    /* JADX INFO: renamed from: O0 */
    public static final C1548f2 f1493O0;

    /* JADX INFO: renamed from: P */
    public static final C1548f2 f1494P;

    /* JADX INFO: renamed from: P0 */
    public static final C1548f2 f1495P0;

    /* JADX INFO: renamed from: Q */
    public static final C1548f2 f1496Q;

    /* JADX INFO: renamed from: Q0 */
    public static final C1548f2 f1497Q0;

    /* JADX INFO: renamed from: R */
    public static final C1548f2 f1498R;

    /* JADX INFO: renamed from: R0 */
    public static final C1548f2 f1499R0;

    /* JADX INFO: renamed from: S */
    public static final C1548f2 f1500S;

    /* JADX INFO: renamed from: S0 */
    public static final C1548f2 f1501S0;

    /* JADX INFO: renamed from: T */
    public static final C1548f2 f1502T;

    /* JADX INFO: renamed from: T0 */
    public static final C1548f2 f1503T0;

    /* JADX INFO: renamed from: U */
    public static final C1548f2 f1504U;

    /* JADX INFO: renamed from: U0 */
    public static final C1548f2 f1505U0;

    /* JADX INFO: renamed from: V */
    public static final C1548f2 f1506V;

    /* JADX INFO: renamed from: V0 */
    public static final C1548f2 f1507V0;

    /* JADX INFO: renamed from: W */
    public static final C1548f2 f1508W;

    /* JADX INFO: renamed from: W0 */
    public static final C1548f2 f1509W0;

    /* JADX INFO: renamed from: X */
    public static final C1548f2 f1510X;

    /* JADX INFO: renamed from: X0 */
    public static final C1548f2 f1511X0;

    /* JADX INFO: renamed from: Y */
    public static final C1548f2 f1512Y;

    /* JADX INFO: renamed from: Y0 */
    public static final C1548f2 f1513Y0;

    /* JADX INFO: renamed from: Z */
    public static final C1548f2 f1514Z;

    /* JADX INFO: renamed from: Z0 */
    public static final C1548f2 f1515Z0;

    /* JADX INFO: renamed from: a0 */
    public static final C1548f2 f1516a0;

    /* JADX INFO: renamed from: a1 */
    public static final C1548f2 f1517a1;

    /* JADX INFO: renamed from: b0 */
    public static final C1548f2 f1518b0;

    /* JADX INFO: renamed from: b1 */
    public static final C1548f2 f1519b1;

    /* JADX INFO: renamed from: c */
    private static JSONObject f1520c;

    /* JADX INFO: renamed from: c0 */
    public static final C1548f2 f1521c0;

    /* JADX INFO: renamed from: c1 */
    public static final C1548f2 f1522c1;

    /* JADX INFO: renamed from: d */
    public static final C1548f2 f1523d;

    /* JADX INFO: renamed from: d0 */
    public static final C1548f2 f1524d0;

    /* JADX INFO: renamed from: d1 */
    public static final C1548f2 f1525d1;

    /* JADX INFO: renamed from: e */
    public static final C1548f2 f1526e;

    /* JADX INFO: renamed from: e0 */
    public static final C1548f2 f1527e0;

    /* JADX INFO: renamed from: e1 */
    public static final C1548f2 f1528e1;

    /* JADX INFO: renamed from: f */
    public static final C1548f2 f1529f;

    /* JADX INFO: renamed from: f0 */
    public static final C1548f2 f1530f0;

    /* JADX INFO: renamed from: f1 */
    public static final C1548f2 f1531f1;

    /* JADX INFO: renamed from: g */
    public static final C1548f2 f1532g;

    /* JADX INFO: renamed from: g0 */
    public static final C1548f2 f1533g0;

    /* JADX INFO: renamed from: g1 */
    public static final C1548f2 f1534g1;

    /* JADX INFO: renamed from: h */
    public static final C1548f2 f1535h;

    /* JADX INFO: renamed from: h0 */
    public static final C1548f2 f1536h0;

    /* JADX INFO: renamed from: h1 */
    public static final C1548f2 f1537h1;

    /* JADX INFO: renamed from: i */
    public static final C1548f2 f1538i;

    /* JADX INFO: renamed from: i0 */
    public static final C1548f2 f1539i0;

    /* JADX INFO: renamed from: i1 */
    public static final C1548f2 f1540i1;

    /* JADX INFO: renamed from: j */
    public static final C1548f2 f1541j;

    /* JADX INFO: renamed from: j0 */
    public static final C1548f2 f1542j0;

    /* JADX INFO: renamed from: j1 */
    public static final C1548f2 f1543j1;

    /* JADX INFO: renamed from: k */
    public static final C1548f2 f1544k;

    /* JADX INFO: renamed from: k0 */
    public static final C1548f2 f1545k0;

    /* JADX INFO: renamed from: k1 */
    public static final C1548f2 f1546k1;

    /* JADX INFO: renamed from: l */
    public static final C1548f2 f1547l;

    /* JADX INFO: renamed from: l0 */
    public static final C1548f2 f1548l0;

    /* JADX INFO: renamed from: l1 */
    public static final C1548f2 f1549l1;

    /* JADX INFO: renamed from: m */
    public static final C1548f2 f1550m;

    /* JADX INFO: renamed from: m0 */
    public static final C1548f2 f1551m0;

    /* JADX INFO: renamed from: n */
    public static final C1548f2 f1552n;

    /* JADX INFO: renamed from: n0 */
    public static final C1548f2 f1553n0;

    /* JADX INFO: renamed from: o */
    public static final C1548f2 f1554o;

    /* JADX INFO: renamed from: o0 */
    public static final C1548f2 f1555o0;

    /* JADX INFO: renamed from: p */
    public static final C1548f2 f1556p;

    /* JADX INFO: renamed from: p0 */
    public static final C1548f2 f1557p0;

    /* JADX INFO: renamed from: q */
    public static final C1548f2 f1558q;

    /* JADX INFO: renamed from: q0 */
    public static final C1548f2 f1559q0;

    /* JADX INFO: renamed from: r */
    public static final C1548f2 f1560r;

    /* JADX INFO: renamed from: r0 */
    public static final C1548f2 f1561r0;

    /* JADX INFO: renamed from: s */
    public static final C1548f2 f1562s;

    /* JADX INFO: renamed from: s0 */
    public static final C1548f2 f1563s0;

    /* JADX INFO: renamed from: t */
    public static final C1548f2 f1564t;

    /* JADX INFO: renamed from: t0 */
    public static final C1548f2 f1565t0;

    /* JADX INFO: renamed from: u */
    public static final C1548f2 f1566u;

    /* JADX INFO: renamed from: u0 */
    public static final C1548f2 f1567u0;

    /* JADX INFO: renamed from: v */
    public static final C1548f2 f1568v;

    /* JADX INFO: renamed from: v0 */
    public static final C1548f2 f1569v0;

    /* JADX INFO: renamed from: w */
    public static final C1548f2 f1570w;

    /* JADX INFO: renamed from: w0 */
    public static final C1548f2 f1571w0;

    /* JADX INFO: renamed from: x */
    public static final C1548f2 f1572x;

    /* JADX INFO: renamed from: x0 */
    public static final C1548f2 f1573x0;

    /* JADX INFO: renamed from: y */
    public static final C1548f2 f1574y;

    /* JADX INFO: renamed from: y0 */
    public static final C1548f2 f1575y0;

    /* JADX INFO: renamed from: z */
    public static final C1548f2 f1576z;

    /* JADX INFO: renamed from: z0 */
    public static final C1548f2 f1577z0;

    /* JADX INFO: renamed from: a */
    private final String f1578a;

    /* JADX INFO: renamed from: b */
    private final b f1579b;

    /* JADX INFO: renamed from: com.applovin.impl.f2$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f1580a;

        static {
            int[] iArr = new int[b.values().length];
            f1580a = iArr;
            try {
                iArr[b.AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1580a[b.MEDIATED_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1580a[b.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1580a[b.USER_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.f2$b */
    public enum b {
        AD,
        MEDIATED_AD,
        ERROR,
        USER_SESSION
    }

    static {
        b bVar = b.ERROR;
        f1523d = new C1548f2(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE, bVar);
        b bVar2 = b.USER_SESSION;
        f1526e = new C1548f2("sdk_init", bVar2);
        f1529f = new C1548f2("generic_user_session_info", bVar2);
        f1532g = new C1548f2("fetch_basic_settings_started", bVar2);
        f1535h = new C1548f2("fetch_basic_settings_success", bVar2);
        f1538i = new C1548f2("fetch_basic_settings_failure", bVar2);
        f1541j = new C1548f2("pub_init_callback", bVar2);
        f1544k = new C1548f2("sdk_extra_parameter_set", bVar2);
        f1547l = new C1548f2("app_validation_success", bVar2);
        f1550m = new C1548f2("app_validation_failure", bVar2);
        f1552n = new C1548f2("consent_flow_started", bVar2);
        f1554o = new C1548f2("terms_and_privacy_policy_alert_shown", bVar2);
        f1556p = new C1548f2("terms_and_privacy_policy_alert_hidden", bVar2);
        f1558q = new C1548f2("cmp_load_started", bVar2);
        f1560r = new C1548f2("cmp_load_success", bVar2);
        f1562s = new C1548f2("cmp_load_failure", bVar2);
        f1564t = new C1548f2("cmp_show_attempted", bVar2);
        f1566u = new C1548f2("cmp_show_failure", bVar2);
        f1568v = new C1548f2("cmp_hidden", bVar2);
        f1570w = new C1548f2("consent_flow_completed", bVar2);
        b bVar3 = b.AD;
        f1572x = new C1548f2("ad_requested", bVar3);
        f1574y = new C1548f2("ad_request_success", bVar3);
        f1576z = new C1548f2("ad_request_failure", bVar3);
        f1464A = new C1548f2("ad_load_success", bVar3);
        f1466B = new C1548f2("ad_load_failure", bVar3);
        f1468C = new C1548f2("ad_display_attempted", bVar3);
        f1470D = new C1548f2("ad_displayed", bVar3);
        f1472E = new C1548f2("ad_reshown", bVar3);
        f1474F = new C1548f2("ad_display_failure", bVar3);
        f1476G = new C1548f2("ad_hidden", bVar3);
        f1478H = new C1548f2("reward_reporting_error", bVar3);
        f1480I = new C1548f2("reward_validation_error", bVar3);
        f1482J = new C1548f2("user_not_rewarded", bVar3);
        f1484K = new C1548f2("original_resource_urls_restored", bVar3);
        f1486L = new C1548f2("resource_load_started", bVar3);
        f1488M = new C1548f2("resource_retrieved_from_cache", bVar3);
        f1490N = new C1548f2("resource_load_success", bVar3);
        f1492O = new C1548f2("resource_load_failure", bVar3);
        f1494P = new C1548f2("resource_download_started", bVar3);
        f1496Q = new C1548f2("resource_stream_loaded", bVar3);
        f1498R = new C1548f2("resource_download_success", bVar3);
        f1500S = new C1548f2("resource_download_failure", bVar3);
        f1502T = new C1548f2("ad_persist_request", bVar3);
        f1504U = new C1548f2("ad_persist_success", bVar3);
        f1506V = new C1548f2("ad_persist_failure", bVar3);
        f1508W = new C1548f2("persisted_ad_requested", bVar3);
        f1510X = new C1548f2("persisted_ad_load_success", bVar3);
        f1512Y = new C1548f2("persisted_ad_load_failure", bVar3);
        f1514Z = new C1548f2("persisted_ad_expired", bVar3);
        f1516a0 = new C1548f2("custom_intent_launch_success", bVar3);
        f1518b0 = new C1548f2("custom_intent_launch_failure", bVar3);
        b bVar4 = b.MEDIATED_AD;
        f1521c0 = new C1548f2("adapter_init_started", bVar4);
        f1524d0 = new C1548f2("adapter_init_success", bVar4);
        f1527e0 = new C1548f2("adapter_init_failure", bVar4);
        f1530f0 = new C1548f2("signal_collection_success", bVar4);
        f1533g0 = new C1548f2("signal_collection_failure", bVar4);
        f1536h0 = new C1548f2("mediated_ad_requested", bVar4);
        f1539i0 = new C1548f2("mediated_ad_request_success", bVar4);
        f1542j0 = new C1548f2("mediated_ad_request_failure", bVar4);
        f1545k0 = new C1548f2("mediated_ad_load_started", bVar4);
        f1548l0 = new C1548f2("mediated_ad_load_success", bVar4);
        f1551m0 = new C1548f2("mediated_ad_load_failure", bVar4);
        f1553n0 = new C1548f2("waterfall_processing_complete", bVar4);
        f1555o0 = new C1548f2("mediated_ad_display_attempted", bVar4);
        f1557p0 = new C1548f2("mediated_ad_displayed", bVar4);
        f1559q0 = new C1548f2("mediated_ad_viewability_impression_called", bVar4);
        f1561r0 = new C1548f2("mediated_ad_display_failure", bVar4);
        f1563s0 = new C1548f2("mediated_ad_hidden", bVar4);
        f1565t0 = new C1548f2("mediated_ad_hidden_callback_not_called", bVar4);
        f1567u0 = new C1548f2("mediated_ad_reward_reporting_error", bVar4);
        f1569v0 = new C1548f2("mediated_ad_reward_validation_error", bVar4);
        f1571w0 = new C1548f2("user_not_rewarded_for_mediated_ad", bVar4);
        f1573x0 = new C1548f2("mediated_ad_extra_parameter_set", bVar4);
        f1575y0 = new C1548f2("mediated_ad_failover_missing_cached_ad", bVar4);
        f1577z0 = new C1548f2("mediated_ad_failover_attempted", bVar4);
        f1465A0 = new C1548f2("mediated_ad_failover_success", bVar4);
        f1467B0 = new C1548f2("mediated_ad_failover_failure", bVar4);
        f1469C0 = new C1548f2("missing_failover_ad_in_waterfall", bVar4);
        f1471D0 = new C1548f2("failover_ad_load_started", bVar4);
        f1473E0 = new C1548f2("failover_ad_load_success", bVar4);
        f1475F0 = new C1548f2("failover_ad_load_failure", bVar4);
        f1477G0 = new C1548f2("failover_ad_ecpm_below_floor", bVar4);
        f1479H0 = new C1548f2("failover_ad_expired_in_cache", bVar4);
        f1481I0 = new C1548f2("failover_ad_evicted_from_cache", bVar4);
        f1483J0 = new C1548f2("activity_destroyed_by_app_relaunch", bVar);
        f1485K0 = new C1548f2("activity_missing", bVar);
        f1487L0 = new C1548f2("ad_context_violation", bVar);
        f1489M0 = new C1548f2("anr", bVar);
        f1491N0 = new C1548f2("app_exit_info_stack_trace", bVar);
        f1493O0 = new C1548f2("app_killed_during_ad", bVar);
        f1495P0 = new C1548f2("app_killed_during_mediated_ad", bVar);
        f1497Q0 = new C1548f2("auto_redirect", bVar);
        f1499R0 = new C1548f2("black_view_detected", bVar);
        f1501S0 = new C1548f2("black_view", bVar);
        f1503T0 = new C1548f2("cache_error", bVar);
        f1505U0 = new C1548f2("caught_exception", bVar);
        f1507V0 = new C1548f2("consent_flow_error", bVar);
        f1509W0 = new C1548f2(AppMeasurement.CRASH_ORIGIN, bVar);
        f1511X0 = new C1548f2("file_error", bVar);
        f1513Y0 = new C1548f2("haptic_error", bVar);
        f1515Z0 = new C1548f2("integration_error", bVar);
        f1517a1 = new C1548f2("media_error", bVar);
        f1519b1 = new C1548f2("memory_leak", bVar);
        f1522c1 = new C1548f2("native_error", bVar);
        f1525d1 = new C1548f2("network_error", bVar);
        f1528e1 = new C1548f2("task_exception", bVar);
        f1531f1 = new C1548f2("task_latency_alert", bVar);
        f1534g1 = new C1548f2("template_error", bVar);
        f1537h1 = new C1548f2("unexpected_state", bVar);
        f1540i1 = new C1548f2("web_view_error", bVar);
        f1543j1 = new C1548f2("payload_decode_failure", bVar);
        f1546k1 = new C1548f2("request_encode_failure", bVar);
        f1549l1 = new C1548f2("response_decode_failure", bVar);
    }

    public C1548f2(String str, b bVar) {
        this.f1578a = str;
        this.f1579b = bVar;
    }

    /* JADX INFO: renamed from: a */
    private double m2566a(b bVar, C1748l c1748l) {
        float fFloatValue;
        int i = a.f1580a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            fFloatValue = ((Float) c1748l.m4801a(C1831z4.f3702E)).floatValue();
        } else if (i == 3) {
            fFloatValue = ((Float) c1748l.m4801a(C1831z4.f3710F)).floatValue();
        } else {
            if (i != 4) {
                return -1.0d;
            }
            fFloatValue = ((Float) c1748l.m4801a(C1831z4.f3718G)).floatValue();
        }
        return fFloatValue;
    }

    /* JADX INFO: renamed from: a */
    private double m2567a(String str, C1748l c1748l) {
        if (f1520c == null) {
            f1520c = JsonUtils.deserialize((String) c1748l.m4801a(C1831z4.f3694D));
        }
        Double d = JsonUtils.getDouble(f1520c, str, (Double) null);
        if (d != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    /* JADX INFO: renamed from: a */
    public double m2568a(C1748l c1748l) {
        if (AbstractC1701q7.m4117k(C1748l.m4756p())) {
            return 100.0d;
        }
        double dM2567a = m2567a(this.f1578a, c1748l);
        if (dM2567a >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return dM2567a;
        }
        double dM2566a = m2566a(this.f1579b, c1748l);
        return dM2566a >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dM2566a : ((Float) c1748l.m4801a(C1831z4.f3726H)).floatValue();
    }

    /* JADX INFO: renamed from: a */
    public b m2569a() {
        return this.f1579b;
    }

    /* JADX INFO: renamed from: b */
    public String m2570b() {
        return this.f1578a;
    }
}
