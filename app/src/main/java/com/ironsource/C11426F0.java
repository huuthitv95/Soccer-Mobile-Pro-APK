package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.F0 */
/* JADX INFO: loaded from: classes6.dex */
public class C11426F0 {

    /* JADX INFO: renamed from: p */
    private static final int f24282p = -1;

    /* JADX INFO: renamed from: a */
    private final IronSource.EnumC12328a f24283a;

    /* JADX INFO: renamed from: b */
    private final b f24284b;

    /* JADX INFO: renamed from: c */
    private InterfaceC11408E0 f24285c;

    /* JADX INFO: renamed from: d */
    private final AbstractC12295l3 f24286d;

    /* JADX INFO: renamed from: e */
    public C11715V8 f24287e;

    /* JADX INFO: renamed from: f */
    public C12568vb f24288f;

    /* JADX INFO: renamed from: g */
    public C11688Tf f24289g;

    /* JADX INFO: renamed from: h */
    public C11674T1 f24290h;

    /* JADX INFO: renamed from: i */
    public C11587O f24291i;

    /* JADX INFO: renamed from: j */
    public C11756Xf f24292j;

    /* JADX INFO: renamed from: k */
    public C11600Oc f24293k;

    /* JADX INFO: renamed from: l */
    private Map<EnumC11372C0, a> f24294l;

    /* JADX INFO: renamed from: m */
    private Map<EnumC11372C0, a> f24295m;

    /* JADX INFO: renamed from: n */
    private Map<EnumC11372C0, a> f24296n;

    /* JADX INFO: renamed from: o */
    private Map<EnumC11372C0, a> f24297o;

    /* JADX INFO: renamed from: com.ironsource.F0$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private final int f24298a;

        /* JADX INFO: renamed from: b */
        private final int f24299b;

        public a(EnumC12598x5 enumC12598x5, EnumC12598x5 enumC12598x6) {
            if (enumC12598x5 != null) {
                this.f24298a = enumC12598x5.m34138b();
            } else {
                this.f24298a = -1;
            }
            if (enumC12598x6 != null) {
                this.f24299b = enumC12598x6.m34138b();
            } else {
                this.f24299b = -1;
            }
        }

        /* JADX INFO: renamed from: a */
        int m25754a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f24298a : this.f24299b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.F0$b */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public C11426F0(IronSource.EnumC12328a enumC12328a, b bVar, InterfaceC11408E0 interfaceC11408E0) {
        this(enumC12328a, bVar, interfaceC11408E0, m25745a(enumC12328a));
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC12295l3 m25745a(IronSource.EnumC12328a enumC12328a) {
        return enumC12328a.equals(IronSource.EnumC12328a.REWARDED_VIDEO) ? C11686Td.m27533i() : C11399D9.m25613i();
    }

    /* JADX INFO: renamed from: d */
    private void m25746d() {
        HashMap map = new HashMap();
        this.f24297o = map;
        map.put(EnumC11372C0.INIT_STARTED, new a(EnumC12598x5.NT_MANAGER_INIT_STARTED, null));
        this.f24297o.put(EnumC11372C0.INIT_ENDED, new a(EnumC12598x5.NT_MANAGER_INIT_ENDED, null));
        this.f24297o.put(EnumC11372C0.PLACEMENT_CAPPED, new a(EnumC12598x5.NT_PLACEMENT_CAPPED, null));
        this.f24297o.put(EnumC11372C0.AUCTION_REQUEST, new a(EnumC12598x5.NT_AUCTION_REQUEST, null));
        this.f24297o.put(EnumC11372C0.AUCTION_SUCCESS, new a(EnumC12598x5.NT_AUCTION_SUCCESS, null));
        Map<EnumC11372C0, a> map2 = this.f24297o;
        EnumC11372C0 enumC11372C0 = EnumC11372C0.AUCTION_FAILED;
        EnumC12598x5 enumC12598x5 = EnumC12598x5.NT_AUCTION_FAILED;
        map2.put(enumC11372C0, new a(enumC12598x5, null));
        this.f24297o.put(EnumC11372C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC12598x5, null));
        this.f24297o.put(EnumC11372C0.AUCTION_REQUEST_WATERFALL, new a(EnumC12598x5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.f24297o.put(EnumC11372C0.AUCTION_RESULT_WATERFALL, new a(EnumC12598x5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.f24297o.put(EnumC11372C0.INIT_SUCCESS, new a(null, null));
        this.f24297o.put(EnumC11372C0.INIT_FAILED, new a(null, null));
        this.f24297o.put(EnumC11372C0.AD_OPENED, new a(EnumC12598x5.NT_CALLBACK_SHOW, EnumC12598x5.NT_INSTANCE_SHOW));
        this.f24297o.put(EnumC11372C0.AD_CLICKED, new a(EnumC12598x5.NT_CALLBACK_CLICK, EnumC12598x5.NT_INSTANCE_CLICK));
        this.f24297o.put(EnumC11372C0.LOAD_AD, new a(EnumC12598x5.NT_LOAD, EnumC12598x5.NT_INSTANCE_LOAD));
        this.f24297o.put(EnumC11372C0.LOAD_AD_SUCCESS, new a(EnumC12598x5.NT_CALLBACK_LOAD_SUCCESS, EnumC12598x5.NT_INSTANCE_LOAD_SUCCESS));
        this.f24297o.put(EnumC11372C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC12598x5.NT_CALLBACK_LOAD_ERROR, EnumC12598x5.NT_INSTANCE_LOAD_ERROR));
        this.f24297o.put(EnumC11372C0.LOAD_AD_NO_FILL, new a(null, EnumC12598x5.NT_INSTANCE_LOAD_NO_FILL));
        this.f24297o.put(EnumC11372C0.AD_FORMAT_CAPPED, new a(EnumC12598x5.NT_AD_UNIT_CAPPED, null));
        Map<EnumC11372C0, a> map3 = this.f24297o;
        EnumC11372C0 enumC11372C1 = EnumC11372C0.COLLECT_TOKEN;
        EnumC12598x5 enumC12598x6 = EnumC12598x5.NT_COLLECT_TOKENS;
        EnumC12598x5 enumC12598x7 = EnumC12598x5.NT_INSTANCE_COLLECT_TOKEN;
        map3.put(enumC11372C1, new a(enumC12598x6, enumC12598x7));
        this.f24297o.put(EnumC11372C0.COLLECT_TOKENS_COMPLETED, new a(EnumC12598x5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.f24297o.put(EnumC11372C0.COLLECT_TOKENS_FAILED, new a(EnumC12598x5.NT_COLLECT_TOKENS_FAILED, null));
        this.f24297o.put(EnumC11372C0.INSTANCE_COLLECT_TOKEN, new a(enumC12598x7, null));
        Map<EnumC11372C0, a> map4 = this.f24297o;
        EnumC11372C0 enumC11372C2 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC12598x5 enumC12598x8 = EnumC12598x5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map4.put(enumC11372C2, new a(enumC12598x8, enumC12598x8));
        Map<EnumC11372C0, a> map5 = this.f24297o;
        EnumC11372C0 enumC11372C3 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC12598x5 enumC12598x9 = EnumC12598x5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map5.put(enumC11372C3, new a(enumC12598x9, enumC12598x9));
        Map<EnumC11372C0, a> map6 = this.f24297o;
        EnumC11372C0 enumC11372C4 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC12598x5 enumC12598x10 = EnumC12598x5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map6.put(enumC11372C4, new a(enumC12598x10, enumC12598x10));
        this.f24297o.put(EnumC11372C0.DESTROY_AD, new a(EnumC12598x5.NT_DESTROY, EnumC12598x5.NT_INSTANCE_DESTROY));
        this.f24297o.put(EnumC11372C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC12598x5.TROUBLESHOOTING_NT_ILR_REVENUE, null));
        Map<EnumC11372C0, a> map7 = this.f24297o;
        EnumC11372C0 enumC11372C5 = EnumC11372C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC12598x5 enumC12598x11 = EnumC12598x5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map7.put(enumC11372C5, new a(enumC12598x11, enumC12598x11));
        Map<EnumC11372C0, a> map8 = this.f24297o;
        EnumC11372C0 enumC11372C6 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC12598x5 enumC12598x12 = EnumC12598x5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map8.put(enumC11372C6, new a(enumC12598x12, enumC12598x12));
        Map<EnumC11372C0, a> map9 = this.f24297o;
        EnumC11372C0 enumC11372C7 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC12598x5 enumC12598x13 = EnumC12598x5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map9.put(enumC11372C7, new a(enumC12598x13, enumC12598x13));
        Map<EnumC11372C0, a> map10 = this.f24297o;
        EnumC11372C0 enumC11372C8 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC12598x5 enumC12598x14 = EnumC12598x5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map10.put(enumC11372C8, new a(enumC12598x14, enumC12598x14));
        Map<EnumC11372C0, a> map11 = this.f24297o;
        EnumC11372C0 enumC11372C9 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC12598x5 enumC12598x15 = EnumC12598x5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map11.put(enumC11372C9, new a(enumC12598x15, enumC12598x15));
        Map<EnumC11372C0, a> map12 = this.f24297o;
        EnumC11372C0 enumC11372C10 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC12598x5 enumC12598x16 = EnumC12598x5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map12.put(enumC11372C10, new a(enumC12598x16, enumC12598x16));
        Map<EnumC11372C0, a> map13 = this.f24297o;
        EnumC11372C0 enumC11372C11 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC12598x5 enumC12598x17 = EnumC12598x5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map13.put(enumC11372C11, new a(enumC12598x17, enumC12598x17));
        Map<EnumC11372C0, a> map14 = this.f24297o;
        EnumC11372C0 enumC11372C12 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC12598x5 enumC12598x18 = EnumC12598x5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map14.put(enumC11372C12, new a(enumC12598x18, enumC12598x18));
        Map<EnumC11372C0, a> map15 = this.f24297o;
        EnumC11372C0 enumC11372C13 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC12598x5 enumC12598x19 = EnumC12598x5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map15.put(enumC11372C13, new a(enumC12598x19, enumC12598x19));
        Map<EnumC11372C0, a> map16 = this.f24297o;
        EnumC11372C0 enumC11372C14 = EnumC11372C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC12598x5 enumC12598x20 = EnumC12598x5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map16.put(enumC11372C14, new a(enumC12598x20, enumC12598x20));
        Map<EnumC11372C0, a> map17 = this.f24297o;
        EnumC11372C0 enumC11372C15 = EnumC11372C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC12598x5 enumC12598x21 = EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(enumC11372C15, new a(enumC12598x21, enumC12598x21));
        Map<EnumC11372C0, a> map18 = this.f24297o;
        EnumC11372C0 enumC11372C16 = EnumC11372C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC12598x5 enumC12598x22 = EnumC12598x5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(enumC11372C16, new a(enumC12598x22, enumC12598x22));
        this.f24297o.put(EnumC11372C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC12598x5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    /* JADX INFO: renamed from: b */
    void m25750b() {
        m25751c();
        m25752e();
        m25747a();
        m25746d();
    }

    /* JADX INFO: renamed from: c */
    void m25751c() {
        HashMap map = new HashMap();
        this.f24294l = map;
        map.put(EnumC11372C0.INIT_STARTED, new a(EnumC12598x5.IS_MANAGER_INIT_STARTED, null));
        this.f24294l.put(EnumC11372C0.INIT_ENDED, new a(EnumC12598x5.IS_MANAGER_INIT_ENDED, null));
        this.f24294l.put(EnumC11372C0.SESSION_CAPPED, new a(null, EnumC12598x5.IS_CAP_SESSION));
        this.f24294l.put(EnumC11372C0.PLACEMENT_CAPPED, new a(EnumC12598x5.IS_CAP_PLACEMENT, null));
        this.f24294l.put(EnumC11372C0.CHECK_PLACEMENT_CAPPED, new a(EnumC12598x5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.f24294l.put(EnumC11372C0.AUCTION_REQUEST, new a(EnumC12598x5.IS_AUCTION_REQUEST, null));
        this.f24294l.put(EnumC11372C0.AUCTION_SUCCESS, new a(EnumC12598x5.IS_AUCTION_SUCCESS, null));
        Map<EnumC11372C0, a> map2 = this.f24294l;
        EnumC11372C0 enumC11372C0 = EnumC11372C0.AUCTION_FAILED;
        EnumC12598x5 enumC12598x5 = EnumC12598x5.IS_AUCTION_FAILED;
        map2.put(enumC11372C0, new a(enumC12598x5, null));
        this.f24294l.put(EnumC11372C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC12598x5, null));
        this.f24294l.put(EnumC11372C0.AUCTION_REQUEST_WATERFALL, new a(EnumC12598x5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.f24294l.put(EnumC11372C0.AUCTION_RESULT_WATERFALL, new a(EnumC12598x5.IS_RESULT_WATERFALL, null));
        this.f24294l.put(EnumC11372C0.INIT_SUCCESS, new a(null, null));
        this.f24294l.put(EnumC11372C0.INIT_FAILED, new a(null, null));
        this.f24294l.put(EnumC11372C0.AD_OPENED, new a(null, EnumC12598x5.IS_INSTANCE_OPENED));
        this.f24294l.put(EnumC11372C0.AD_CLOSED, new a(EnumC12598x5.IS_CALLBACK_AD_CLOSED, EnumC12598x5.IS_INSTANCE_CLOSED));
        this.f24294l.put(EnumC11372C0.AD_CLICKED, new a(EnumC12598x5.IS_CALLBACK_AD_CLICKED, EnumC12598x5.IS_INSTANCE_CLICKED));
        this.f24294l.put(EnumC11372C0.AD_INFO_CHANGED, new a(EnumC12598x5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.f24294l.put(EnumC11372C0.LOAD_AD, new a(EnumC12598x5.IS_LOAD_CALLED, EnumC12598x5.IS_INSTANCE_LOAD));
        this.f24294l.put(EnumC11372C0.LOAD_AD_SUCCESS, new a(EnumC12598x5.IS_CALLBACK_LOAD_SUCCESS, EnumC12598x5.IS_INSTANCE_LOAD_SUCCESS));
        this.f24294l.put(EnumC11372C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC12598x5.IS_CALLBACK_LOAD_ERROR, EnumC12598x5.IS_INSTANCE_LOAD_FAILED));
        this.f24294l.put(EnumC11372C0.LOAD_AD_NO_FILL, new a(null, EnumC12598x5.IS_INSTANCE_LOAD_NO_FILL));
        this.f24294l.put(EnumC11372C0.SHOW_AD, new a(EnumC12598x5.IS_SHOW_CALLED, EnumC12598x5.IS_INSTANCE_SHOW));
        this.f24294l.put(EnumC11372C0.SHOW_AD_FAILED, new a(EnumC12598x5.IS_CALLBACK_AD_SHOW_ERROR, EnumC12598x5.IS_INSTANCE_SHOW_FAILED));
        this.f24294l.put(EnumC11372C0.AD_FORMAT_CAPPED, new a(EnumC12598x5.IS_AD_FORMAT_CAPPED, null));
        this.f24294l.put(EnumC11372C0.AD_UNIT_CAPPED, new a(EnumC12598x5.IS_AD_UNIT_CAPPED, null));
        this.f24294l.put(EnumC11372C0.COLLECT_TOKEN, new a(EnumC12598x5.IS_COLLECT_TOKENS, null));
        this.f24294l.put(EnumC11372C0.COLLECT_TOKENS_COMPLETED, new a(EnumC12598x5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.f24294l.put(EnumC11372C0.COLLECT_TOKENS_FAILED, new a(EnumC12598x5.IS_COLLECT_TOKENS_FAILED, null));
        this.f24294l.put(EnumC11372C0.INSTANCE_COLLECT_TOKEN, new a(EnumC12598x5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.f24294l.put(EnumC11372C0.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(EnumC12598x5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.f24294l.put(EnumC11372C0.INSTANCE_COLLECT_TOKEN_FAILED, new a(EnumC12598x5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.f24294l.put(EnumC11372C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(EnumC12598x5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.f24294l.put(EnumC11372C0.AD_READY_TRUE, new a(EnumC12598x5.IS_CHECK_READY_TRUE, null));
        this.f24294l.put(EnumC11372C0.AD_READY_FALSE, new a(EnumC12598x5.IS_CHECK_READY_FALSE, null));
        this.f24294l.put(EnumC11372C0.OPERATIONAL_LOAD_AD, new a(EnumC12598x5.IS_OPERATIONAL_LOAD_AD, null));
        this.f24294l.put(EnumC11372C0.OPERATIONAL_LOAD_SUCCESS, new a(EnumC12598x5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.f24294l.put(EnumC11372C0.OPERATIONAL_LOAD_FAILED, new a(EnumC12598x5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.f24294l.put(EnumC11372C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC12598x5.IS_SET_CONFIGURATION, null));
        Map<EnumC11372C0, a> map3 = this.f24294l;
        EnumC11372C0 enumC11372C1 = EnumC11372C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC12598x5 enumC12598x6 = EnumC12598x5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map3.put(enumC11372C1, new a(enumC12598x6, enumC12598x6));
        Map<EnumC11372C0, a> map4 = this.f24294l;
        EnumC11372C0 enumC11372C2 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC12598x5 enumC12598x7 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map4.put(enumC11372C2, new a(enumC12598x7, enumC12598x7));
        Map<EnumC11372C0, a> map5 = this.f24294l;
        EnumC11372C0 enumC11372C3 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC12598x5 enumC12598x8 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map5.put(enumC11372C3, new a(enumC12598x8, enumC12598x8));
        Map<EnumC11372C0, a> map6 = this.f24294l;
        EnumC11372C0 enumC11372C4 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC12598x5 enumC12598x9 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map6.put(enumC11372C4, new a(enumC12598x9, enumC12598x9));
        Map<EnumC11372C0, a> map7 = this.f24294l;
        EnumC11372C0 enumC11372C5 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC12598x5 enumC12598x10 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map7.put(enumC11372C5, new a(enumC12598x10, enumC12598x10));
        Map<EnumC11372C0, a> map8 = this.f24294l;
        EnumC11372C0 enumC11372C6 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC12598x5 enumC12598x11 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map8.put(enumC11372C6, new a(enumC12598x11, enumC12598x11));
        Map<EnumC11372C0, a> map9 = this.f24294l;
        EnumC11372C0 enumC11372C7 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC12598x5 enumC12598x12 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map9.put(enumC11372C7, new a(enumC12598x12, enumC12598x12));
        Map<EnumC11372C0, a> map10 = this.f24294l;
        EnumC11372C0 enumC11372C8 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC12598x5 enumC12598x13 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map10.put(enumC11372C8, new a(enumC12598x13, enumC12598x13));
        Map<EnumC11372C0, a> map11 = this.f24294l;
        EnumC11372C0 enumC11372C9 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC12598x5 enumC12598x14 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map11.put(enumC11372C9, new a(enumC12598x14, enumC12598x14));
        Map<EnumC11372C0, a> map12 = this.f24294l;
        EnumC11372C0 enumC11372C10 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC12598x5 enumC12598x15 = EnumC12598x5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map12.put(enumC11372C10, new a(enumC12598x15, enumC12598x15));
        Map<EnumC11372C0, a> map13 = this.f24294l;
        EnumC11372C0 enumC11372C11 = EnumC11372C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC12598x5 enumC12598x16 = EnumC12598x5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map13.put(enumC11372C11, new a(enumC12598x16, enumC12598x16));
        Map<EnumC11372C0, a> map14 = this.f24294l;
        EnumC11372C0 enumC11372C12 = EnumC11372C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC12598x5 enumC12598x17 = EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map14.put(enumC11372C12, new a(enumC12598x17, enumC12598x17));
        Map<EnumC11372C0, a> map15 = this.f24294l;
        EnumC11372C0 enumC11372C13 = EnumC11372C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC12598x5 enumC12598x18 = EnumC12598x5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map15.put(enumC11372C13, new a(enumC12598x18, enumC12598x18));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC12598x5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        Map<EnumC11372C0, a> map16 = this.f24294l;
        EnumC11372C0 enumC11372C14 = EnumC11372C0.TROUBLESHOOT_AD_EXPIRED;
        EnumC12598x5 enumC12598x19 = EnumC12598x5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map16.put(enumC11372C14, new a(enumC12598x19, enumC12598x19));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_LOAD, new a(EnumC12598x5.TROUBLESHOOTING_IS_LOAD, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC12598x5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC12598x5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_LOAD_FAILED, new a(EnumC12598x5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_SHOW, new a(EnumC12598x5.TROUBLESHOOTING_IS_SHOW, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC12598x5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_SHOW_FAILED, new a(EnumC12598x5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        Map<EnumC11372C0, a> map17 = this.f24294l;
        EnumC11372C0 enumC11372C15 = EnumC11372C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC12598x5 enumC12598x20 = EnumC12598x5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map17.put(enumC11372C15, new a(enumC12598x20, enumC12598x20));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC12598x5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(EnumC12598x5.TROUBLESHOOTING_IS_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC12598x5.TROUBLESHOOTING_IS_ILR_REVENUE, null));
        this.f24294l.put(EnumC11372C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(EnumC12598x5.TROUBLESHOOT_IS_SHOW_RECOVERY_INITIATED, null));
    }

    /* JADX INFO: renamed from: e */
    void m25752e() {
        HashMap map = new HashMap();
        this.f24295m = map;
        map.put(EnumC11372C0.INIT_STARTED, new a(EnumC12598x5.RV_MANAGER_INIT_STARTED, null));
        this.f24295m.put(EnumC11372C0.INIT_ENDED, new a(EnumC12598x5.RV_MANAGER_INIT_ENDED, null));
        this.f24295m.put(EnumC11372C0.SESSION_CAPPED, new a(null, EnumC12598x5.RV_CAP_SESSION));
        this.f24295m.put(EnumC11372C0.PLACEMENT_CAPPED, new a(EnumC12598x5.RV_CAP_PLACEMENT, null));
        this.f24295m.put(EnumC11372C0.CHECK_PLACEMENT_CAPPED, new a(EnumC12598x5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.f24295m.put(EnumC11372C0.AUCTION_REQUEST, new a(EnumC12598x5.RV_AUCTION_REQUEST, null));
        this.f24295m.put(EnumC11372C0.AUCTION_SUCCESS, new a(EnumC12598x5.RV_AUCTION_SUCCESS, null));
        Map<EnumC11372C0, a> map2 = this.f24295m;
        EnumC11372C0 enumC11372C0 = EnumC11372C0.AUCTION_FAILED;
        EnumC12598x5 enumC12598x5 = EnumC12598x5.RV_AUCTION_FAILED;
        map2.put(enumC11372C0, new a(enumC12598x5, null));
        this.f24295m.put(EnumC11372C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC12598x5, null));
        this.f24295m.put(EnumC11372C0.AUCTION_REQUEST_WATERFALL, new a(EnumC12598x5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.f24295m.put(EnumC11372C0.AUCTION_RESULT_WATERFALL, new a(EnumC12598x5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.f24295m.put(EnumC11372C0.INIT_SUCCESS, new a(null, null));
        this.f24295m.put(EnumC11372C0.INIT_FAILED, new a(null, null));
        this.f24295m.put(EnumC11372C0.AD_VISIBLE, new a(null, EnumC12598x5.RV_INSTANCE_VISIBLE));
        this.f24295m.put(EnumC11372C0.AD_OPENED, new a(null, EnumC12598x5.RV_BUSINESS_INSTANCE_OPENED));
        this.f24295m.put(EnumC11372C0.AD_CLOSED, new a(null, EnumC12598x5.RV_INSTANCE_CLOSED));
        this.f24295m.put(EnumC11372C0.AD_STARTED, new a(null, EnumC12598x5.RV_INSTANCE_STARTED));
        this.f24295m.put(EnumC11372C0.AD_ENDED, new a(null, EnumC12598x5.RV_INSTANCE_ENDED));
        this.f24295m.put(EnumC11372C0.AD_CLICKED, new a(EnumC12598x5.RV_CALLBACK_AD_CLICKED, EnumC12598x5.RV_BUSINESS_INSTANCE_CLICKED));
        this.f24295m.put(EnumC11372C0.AD_INFO_CHANGED, new a(EnumC12598x5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.f24295m.put(EnumC11372C0.AD_REWARDED, new a(null, EnumC12598x5.RV_BUSINESS_INSTANCE_REWARDED));
        this.f24295m.put(EnumC11372C0.AD_AVAILABILITY_CHANGED_TRUE, new a(EnumC12598x5.RV_CALLBACK_AVAILABILITY_TRUE, EnumC12598x5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f24295m.put(EnumC11372C0.AD_AVAILABILITY_CHANGED_FALSE, new a(EnumC12598x5.RV_CALLBACK_AVAILABILITY_FALSE, EnumC12598x5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f24295m.put(EnumC11372C0.LOAD_AD, new a(EnumC12598x5.RV_BUSINESS_MEDIATION_LOAD, EnumC12598x5.RV_BUSINESS_INSTANCE_LOAD));
        this.f24295m.put(EnumC11372C0.LOAD_AD_SUCCESS, new a(EnumC12598x5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, EnumC12598x5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.f24295m.put(EnumC11372C0.LOAD_AD_FAILED, new a(null, EnumC12598x5.RV_INSTANCE_LOAD_FAILED));
        this.f24295m.put(EnumC11372C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC12598x5.RV_MEDIATION_LOAD_ERROR, EnumC12598x5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f24295m.put(EnumC11372C0.LOAD_AD_NO_FILL, new a(null, EnumC12598x5.RV_INSTANCE_LOAD_NO_FILL));
        this.f24295m.put(EnumC11372C0.SHOW_AD, new a(EnumC12598x5.RV_API_SHOW_CALLED, EnumC12598x5.RV_INSTANCE_SHOW));
        this.f24295m.put(EnumC11372C0.SHOW_AD_CHANCE, new a(null, EnumC12598x5.RV_INSTANCE_SHOW_CHANCE));
        this.f24295m.put(EnumC11372C0.SHOW_AD_FAILED, new a(EnumC12598x5.RV_CALLBACK_SHOW_FAILED, EnumC12598x5.RV_INSTANCE_SHOW_FAILED));
        this.f24295m.put(EnumC11372C0.AD_FORMAT_CAPPED, new a(EnumC12598x5.RV_AD_UNIT_CAPPED, null));
        this.f24295m.put(EnumC11372C0.COLLECT_TOKEN, new a(EnumC12598x5.RV_COLLECT_TOKENS, null));
        this.f24295m.put(EnumC11372C0.COLLECT_TOKENS_COMPLETED, new a(EnumC12598x5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.f24295m.put(EnumC11372C0.COLLECT_TOKENS_FAILED, new a(EnumC12598x5.RV_COLLECT_TOKENS_FAILED, null));
        this.f24295m.put(EnumC11372C0.INSTANCE_COLLECT_TOKEN, new a(EnumC12598x5.RV_INSTANCE_COLLECT_TOKEN, null));
        Map<EnumC11372C0, a> map3 = this.f24295m;
        EnumC11372C0 enumC11372C1 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC12598x5 enumC12598x6 = EnumC12598x5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(enumC11372C1, new a(enumC12598x6, enumC12598x6));
        Map<EnumC11372C0, a> map4 = this.f24295m;
        EnumC11372C0 enumC11372C2 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC12598x5 enumC12598x7 = EnumC12598x5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(enumC11372C2, new a(enumC12598x7, enumC12598x7));
        Map<EnumC11372C0, a> map5 = this.f24295m;
        EnumC11372C0 enumC11372C3 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC12598x5 enumC12598x8 = EnumC12598x5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(enumC11372C3, new a(enumC12598x8, enumC12598x8));
        this.f24295m.put(EnumC11372C0.AD_READY_TRUE, new a(EnumC12598x5.RV_CHECK_READY_TRUE, null));
        this.f24295m.put(EnumC11372C0.AD_READY_FALSE, new a(EnumC12598x5.RV_CHECK_READY_FALSE, null));
        this.f24295m.put(EnumC11372C0.OPERATIONAL_LOAD_AD, new a(EnumC12598x5.RV_OPERATIONAL_LOAD_AD, null));
        this.f24295m.put(EnumC11372C0.OPERATIONAL_LOAD_SUCCESS, new a(EnumC12598x5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.f24295m.put(EnumC11372C0.OPERATIONAL_LOAD_FAILED, new a(EnumC12598x5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.f24295m.put(EnumC11372C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC12598x5.RV_SET_CONFIGURATION, null));
        this.f24295m.put(EnumC11372C0.OPERATIONAL_GET_REWARD, new a(EnumC12598x5.RV_OPERATIONAL_GET_REWARD, null));
        Map<EnumC11372C0, a> map6 = this.f24295m;
        EnumC11372C0 enumC11372C4 = EnumC11372C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC12598x5 enumC12598x9 = EnumC12598x5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map6.put(enumC11372C4, new a(enumC12598x9, enumC12598x9));
        Map<EnumC11372C0, a> map7 = this.f24295m;
        EnumC11372C0 enumC11372C5 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC12598x5 enumC12598x10 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map7.put(enumC11372C5, new a(enumC12598x10, enumC12598x10));
        Map<EnumC11372C0, a> map8 = this.f24295m;
        EnumC11372C0 enumC11372C6 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC12598x5 enumC12598x11 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map8.put(enumC11372C6, new a(enumC12598x11, enumC12598x11));
        Map<EnumC11372C0, a> map9 = this.f24295m;
        EnumC11372C0 enumC11372C7 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC12598x5 enumC12598x12 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(enumC11372C7, new a(enumC12598x12, enumC12598x12));
        Map<EnumC11372C0, a> map10 = this.f24295m;
        EnumC11372C0 enumC11372C8 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC12598x5 enumC12598x13 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map10.put(enumC11372C8, new a(enumC12598x13, enumC12598x13));
        Map<EnumC11372C0, a> map11 = this.f24295m;
        EnumC11372C0 enumC11372C9 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC12598x5 enumC12598x14 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map11.put(enumC11372C9, new a(enumC12598x14, enumC12598x14));
        Map<EnumC11372C0, a> map12 = this.f24295m;
        EnumC11372C0 enumC11372C10 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC12598x5 enumC12598x15 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map12.put(enumC11372C10, new a(enumC12598x15, enumC12598x15));
        Map<EnumC11372C0, a> map13 = this.f24295m;
        EnumC11372C0 enumC11372C11 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        EnumC12598x5 enumC12598x16 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map13.put(enumC11372C11, new a(enumC12598x16, enumC12598x16));
        Map<EnumC11372C0, a> map14 = this.f24295m;
        EnumC11372C0 enumC11372C12 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC12598x5 enumC12598x17 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map14.put(enumC11372C12, new a(enumC12598x17, enumC12598x17));
        Map<EnumC11372C0, a> map15 = this.f24295m;
        EnumC11372C0 enumC11372C13 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        EnumC12598x5 enumC12598x18 = EnumC12598x5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map15.put(enumC11372C13, new a(enumC12598x18, enumC12598x18));
        Map<EnumC11372C0, a> map16 = this.f24295m;
        EnumC11372C0 enumC11372C14 = EnumC11372C0.TROUBLESHOOT_LOAD_FAILED;
        EnumC12598x5 enumC12598x19 = EnumC12598x5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map16.put(enumC11372C14, new a(enumC12598x19, enumC12598x19));
        Map<EnumC11372C0, a> map17 = this.f24295m;
        EnumC11372C0 enumC11372C15 = EnumC11372C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC12598x5 enumC12598x20 = EnumC12598x5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map17.put(enumC11372C15, new a(enumC12598x20, enumC12598x20));
        Map<EnumC11372C0, a> map18 = this.f24295m;
        EnumC11372C0 enumC11372C16 = EnumC11372C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC12598x5 enumC12598x21 = EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(enumC11372C16, new a(enumC12598x21, enumC12598x21));
        Map<EnumC11372C0, a> map19 = this.f24295m;
        EnumC11372C0 enumC11372C17 = EnumC11372C0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        EnumC12598x5 enumC12598x22 = EnumC12598x5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map19.put(enumC11372C17, new a(enumC12598x22, enumC12598x22));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC12598x5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        Map<EnumC11372C0, a> map20 = this.f24295m;
        EnumC11372C0 enumC11372C18 = EnumC11372C0.TROUBLESHOOT_AD_EXPIRED;
        EnumC12598x5 enumC12598x23 = EnumC12598x5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map20.put(enumC11372C18, new a(enumC12598x23, enumC12598x23));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_LOAD, new a(EnumC12598x5.TROUBLESHOOTING_RV_LOAD, null));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(EnumC12598x5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_LOAD_SUCCESS, new a(EnumC12598x5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_SHOW, new a(EnumC12598x5.TROUBLESHOOTING_RV_SHOW, null));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_SHOW_SUCCESS, new a(EnumC12598x5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_SHOW_FAILED, new a(EnumC12598x5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        Map<EnumC11372C0, a> map21 = this.f24295m;
        EnumC11372C0 enumC11372C19 = EnumC11372C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC12598x5 enumC12598x24 = EnumC12598x5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map21.put(enumC11372C19, new a(enumC12598x24, enumC12598x24));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_AD_INFO_CHANGED, new a(EnumC12598x5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new a(EnumC12598x5.TROUBLESHOOTING_RV_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC12598x5.TROUBLESHOOTING_RV_ILR_REVENUE, null));
        this.f24295m.put(EnumC11372C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new a(EnumC12598x5.TROUBLESHOOT_RV_SHOW_RECOVERY_INITIATED, null));
    }

    /* JADX INFO: renamed from: f */
    public void m25753f() {
        this.f24285c = null;
        this.f24289g = null;
        this.f24290h = null;
        this.f24287e = null;
        this.f24288f = null;
        this.f24291i = null;
        this.f24292j = null;
        this.f24293k = null;
    }

    public C11426F0(IronSource.EnumC12328a enumC12328a, b bVar, InterfaceC11408E0 interfaceC11408E0, AbstractC12295l3 abstractC12295l3) {
        this.f24283a = enumC12328a;
        this.f24284b = bVar;
        this.f24285c = interfaceC11408E0;
        this.f24286d = abstractC12295l3 == null ? m25745a(enumC12328a) : abstractC12295l3;
        m25750b();
        this.f24287e = new C11715V8(this);
        this.f24288f = new C12568vb(this);
        this.f24289g = new C11688Tf(this);
        this.f24290h = new C11674T1(this);
        this.f24291i = new C11587O(this);
        this.f24292j = new C11756Xf(this);
        this.f24293k = new C11600Oc(this);
    }

    /* JADX INFO: renamed from: a */
    protected void m25748a(EnumC11372C0 enumC11372C0, Map<String, Object> map) {
        m25749a(enumC11372C0, map, Calendar.getInstance().getTimeInMillis());
    }

    /* JADX INFO: renamed from: a */
    public void m25749a(EnumC11372C0 enumC11372C0, Map<String, Object> map, long j) {
        int iM25744a = m25744a(enumC11372C0);
        if (-1 == iM25744a) {
            return;
        }
        HashMap map2 = new HashMap();
        InterfaceC11408E0 interfaceC11408E0 = this.f24285c;
        if (interfaceC11408E0 != null) {
            map2.putAll(interfaceC11408E0.mo25594a(enumC11372C0));
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f24286d.mo25281a(new C12580w5(iM25744a, j, new JSONObject(map2)));
    }

    /* JADX INFO: renamed from: a */
    private int m25744a(EnumC11372C0 enumC11372C0) {
        try {
            if (IronSource.EnumC12328a.INTERSTITIAL.equals(this.f24283a) && this.f24294l.containsKey(enumC11372C0)) {
                return this.f24294l.get(enumC11372C0).m25754a(this.f24284b);
            }
            if (IronSource.EnumC12328a.REWARDED_VIDEO.equals(this.f24283a) && this.f24295m.containsKey(enumC11372C0)) {
                return this.f24295m.get(enumC11372C0).m25754a(this.f24284b);
            }
            if (IronSource.EnumC12328a.BANNER.equals(this.f24283a) && this.f24296n.containsKey(enumC11372C0)) {
                return this.f24296n.get(enumC11372C0).m25754a(this.f24284b);
            }
            if (IronSource.EnumC12328a.NATIVE_AD.equals(this.f24283a) && this.f24297o.containsKey(enumC11372C0)) {
                return this.f24297o.get(enumC11372C0).m25754a(this.f24284b);
            }
            return -1;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    void m25747a() {
        HashMap map = new HashMap();
        this.f24296n = map;
        map.put(EnumC11372C0.INIT_STARTED, new a(EnumC12598x5.BN_MANAGER_INIT_STARTED, null));
        this.f24296n.put(EnumC11372C0.INIT_ENDED, new a(EnumC12598x5.BN_MANAGER_INIT_ENDED, null));
        this.f24296n.put(EnumC11372C0.PLACEMENT_CAPPED, new a(EnumC12598x5.BN_PLACEMENT_CAPPED, null));
        this.f24296n.put(EnumC11372C0.AUCTION_REQUEST, new a(EnumC12598x5.BN_AUCTION_REQUEST, null));
        this.f24296n.put(EnumC11372C0.AUCTION_SUCCESS, new a(EnumC12598x5.BN_AUCTION_SUCCESS, null));
        Map<EnumC11372C0, a> map2 = this.f24296n;
        EnumC11372C0 enumC11372C0 = EnumC11372C0.AUCTION_FAILED;
        EnumC12598x5 enumC12598x5 = EnumC12598x5.BN_AUCTION_FAILED;
        map2.put(enumC11372C0, new a(enumC12598x5, null));
        this.f24296n.put(EnumC11372C0.AUCTION_FAILED_NO_CANDIDATES, new a(enumC12598x5, null));
        this.f24296n.put(EnumC11372C0.AUCTION_REQUEST_WATERFALL, new a(EnumC12598x5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.f24296n.put(EnumC11372C0.AUCTION_RESULT_WATERFALL, new a(EnumC12598x5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.f24296n.put(EnumC11372C0.INIT_SUCCESS, new a(null, null));
        this.f24296n.put(EnumC11372C0.INIT_FAILED, new a(null, null));
        this.f24296n.put(EnumC11372C0.AD_OPENED, new a(EnumC12598x5.BN_CALLBACK_SHOW, EnumC12598x5.BN_INSTANCE_SHOW));
        this.f24296n.put(EnumC11372C0.SHOW_AD_FAILED, new a(EnumC12598x5.BN_CALLBACK_SHOW_FAILED, EnumC12598x5.BN_INSTANCE_SHOW_FAILED));
        this.f24296n.put(EnumC11372C0.AD_CLICKED, new a(EnumC12598x5.BN_CALLBACK_CLICK, EnumC12598x5.BN_INSTANCE_CLICK));
        this.f24296n.put(EnumC11372C0.LOAD_AD, new a(EnumC12598x5.BN_LOAD, EnumC12598x5.BN_INSTANCE_LOAD));
        this.f24296n.put(EnumC11372C0.RELOAD_AD, new a(EnumC12598x5.BN_RELOAD, EnumC12598x5.BN_INSTANCE_RELOAD));
        this.f24296n.put(EnumC11372C0.LOAD_AD_SUCCESS, new a(EnumC12598x5.BN_CALLBACK_LOAD_SUCCESS, EnumC12598x5.BN_INSTANCE_LOAD_SUCCESS));
        this.f24296n.put(EnumC11372C0.RELOAD_AD_SUCCESS, new a(EnumC12598x5.BN_CALLBACK_RELOAD_SUCCESS, EnumC12598x5.BN_INSTANCE_RELOAD_SUCCESS));
        this.f24296n.put(EnumC11372C0.LOAD_AD_FAILED_WITH_REASON, new a(EnumC12598x5.BN_CALLBACK_LOAD_ERROR, EnumC12598x5.BN_INSTANCE_LOAD_ERROR));
        this.f24296n.put(EnumC11372C0.RELOAD_AD_FAILED_WITH_REASON, new a(EnumC12598x5.BN_CALLBACK_RELOAD_ERROR, EnumC12598x5.BN_INSTANCE_RELOAD_ERROR));
        this.f24296n.put(EnumC11372C0.LOAD_AD_NO_FILL, new a(null, EnumC12598x5.BN_INSTANCE_LOAD_NO_FILL));
        this.f24296n.put(EnumC11372C0.RELOAD_AD_NO_FILL, new a(null, EnumC12598x5.BN_INSTANCE_RELOAD_NO_FILL));
        this.f24296n.put(EnumC11372C0.AD_FORMAT_CAPPED, new a(EnumC12598x5.BN_AD_UNIT_CAPPED, null));
        this.f24296n.put(EnumC11372C0.COLLECT_TOKEN, new a(EnumC12598x5.BN_COLLECT_TOKENS, null));
        this.f24296n.put(EnumC11372C0.COLLECT_TOKENS_COMPLETED, new a(EnumC12598x5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.f24296n.put(EnumC11372C0.COLLECT_TOKENS_FAILED, new a(EnumC12598x5.BN_COLLECT_TOKENS_FAILED, null));
        this.f24296n.put(EnumC11372C0.INSTANCE_COLLECT_TOKEN, new a(EnumC12598x5.BN_INSTANCE_COLLECT_TOKEN, null));
        Map<EnumC11372C0, a> map3 = this.f24296n;
        EnumC11372C0 enumC11372C1 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        EnumC12598x5 enumC12598x6 = EnumC12598x5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(enumC11372C1, new a(enumC12598x6, enumC12598x6));
        Map<EnumC11372C0, a> map4 = this.f24296n;
        EnumC11372C0 enumC11372C2 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_FAILED;
        EnumC12598x5 enumC12598x7 = EnumC12598x5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(enumC11372C2, new a(enumC12598x7, enumC12598x7));
        Map<EnumC11372C0, a> map5 = this.f24296n;
        EnumC11372C0 enumC11372C3 = EnumC11372C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        EnumC12598x5 enumC12598x8 = EnumC12598x5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(enumC11372C3, new a(enumC12598x8, enumC12598x8));
        this.f24296n.put(EnumC11372C0.DESTROY_AD, new a(EnumC12598x5.BN_DESTROY, EnumC12598x5.BN_INSTANCE_DESTROY));
        this.f24296n.put(EnumC11372C0.SKIP_RELOAD_AD, new a(EnumC12598x5.BN_SKIP_RELOAD, null));
        this.f24296n.put(EnumC11372C0.AD_LEFT_APPLICATION, new a(EnumC12598x5.BN_CALLBACK_LEAVE_APP, EnumC12598x5.BN_INSTANCE_LEAVE_APP));
        this.f24296n.put(EnumC11372C0.AD_PRESENT_SCREEN, new a(EnumC12598x5.BN_CALLBACK_PRESENT_SCREEN, EnumC12598x5.BN_INSTANCE_PRESENT_SCREEN));
        this.f24296n.put(EnumC11372C0.AD_DISMISS_SCREEN, new a(EnumC12598x5.BN_CALLBACK_DISMISS_SCREEN, EnumC12598x5.BN_INSTANCE_DISMISS_SCREEN));
        this.f24296n.put(EnumC11372C0.AD_VIEW_BOUND, new a(EnumC12598x5.BN_BOUND, EnumC12598x5.BN_INSTANCE_BOUND));
        this.f24296n.put(EnumC11372C0.PAUSE_AD, new a(EnumC12598x5.BN_REFRESH_PAUSE, null));
        this.f24296n.put(EnumC11372C0.RESUME_AD, new a(EnumC12598x5.BN_REFRESH_RESUME, null));
        this.f24296n.put(EnumC11372C0.OPERATIONAL_SET_CONFIGURATIONS, new a(EnumC12598x5.BN_SET_CONFIGURATION, null));
        Map<EnumC11372C0, a> map6 = this.f24296n;
        EnumC11372C0 enumC11372C4 = EnumC11372C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        EnumC12598x5 enumC12598x9 = EnumC12598x5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map6.put(enumC11372C4, new a(enumC12598x9, enumC12598x9));
        Map<EnumC11372C0, a> map7 = this.f24296n;
        EnumC11372C0 enumC11372C5 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        EnumC12598x5 enumC12598x10 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map7.put(enumC11372C5, new a(enumC12598x10, enumC12598x10));
        Map<EnumC11372C0, a> map8 = this.f24296n;
        EnumC11372C0 enumC11372C6 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        EnumC12598x5 enumC12598x11 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map8.put(enumC11372C6, new a(enumC12598x11, enumC12598x11));
        Map<EnumC11372C0, a> map9 = this.f24296n;
        EnumC11372C0 enumC11372C7 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        EnumC12598x5 enumC12598x12 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(enumC11372C7, new a(enumC12598x12, enumC12598x12));
        Map<EnumC11372C0, a> map10 = this.f24296n;
        EnumC11372C0 enumC11372C8 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        EnumC12598x5 enumC12598x13 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map10.put(enumC11372C8, new a(enumC12598x13, enumC12598x13));
        Map<EnumC11372C0, a> map11 = this.f24296n;
        EnumC11372C0 enumC11372C9 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        EnumC12598x5 enumC12598x14 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map11.put(enumC11372C9, new a(enumC12598x14, enumC12598x14));
        Map<EnumC11372C0, a> map12 = this.f24296n;
        EnumC11372C0 enumC11372C10 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        EnumC12598x5 enumC12598x15 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map12.put(enumC11372C10, new a(enumC12598x15, enumC12598x15));
        Map<EnumC11372C0, a> map13 = this.f24296n;
        EnumC11372C0 enumC11372C11 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        EnumC12598x5 enumC12598x16 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map13.put(enumC11372C11, new a(enumC12598x16, enumC12598x16));
        Map<EnumC11372C0, a> map14 = this.f24296n;
        EnumC11372C0 enumC11372C12 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        EnumC12598x5 enumC12598x17 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map14.put(enumC11372C12, new a(enumC12598x17, enumC12598x17));
        Map<EnumC11372C0, a> map15 = this.f24296n;
        EnumC11372C0 enumC11372C13 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        EnumC12598x5 enumC12598x18 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map15.put(enumC11372C13, new a(enumC12598x18, enumC12598x18));
        Map<EnumC11372C0, a> map16 = this.f24296n;
        EnumC11372C0 enumC11372C14 = EnumC11372C0.TROUBLESHOOT_UNEXPECTED_OPENED;
        EnumC12598x5 enumC12598x19 = EnumC12598x5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map16.put(enumC11372C14, new a(enumC12598x19, enumC12598x19));
        Map<EnumC11372C0, a> map17 = this.f24296n;
        EnumC11372C0 enumC11372C15 = EnumC11372C0.TROUBLESHOOT_INTERNAL_ERROR;
        EnumC12598x5 enumC12598x20 = EnumC12598x5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map17.put(enumC11372C15, new a(enumC12598x20, enumC12598x20));
        Map<EnumC11372C0, a> map18 = this.f24296n;
        EnumC11372C0 enumC11372C16 = EnumC11372C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        EnumC12598x5 enumC12598x21 = EnumC12598x5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map18.put(enumC11372C16, new a(enumC12598x21, enumC12598x21));
        Map<EnumC11372C0, a> map19 = this.f24296n;
        EnumC11372C0 enumC11372C17 = EnumC11372C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        EnumC12598x5 enumC12598x22 = EnumC12598x5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map19.put(enumC11372C17, new a(enumC12598x22, enumC12598x22));
        this.f24296n.put(EnumC11372C0.TROUBLESHOOT_NOTIFICATION_ERROR, new a(EnumC12598x5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.f24296n.put(EnumC11372C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(EnumC12598x5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.f24296n.put(EnumC11372C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(EnumC12598x5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.f24296n.put(EnumC11372C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(EnumC12598x5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.f24296n.put(EnumC11372C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(EnumC12598x5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        Map<EnumC11372C0, a> map20 = this.f24296n;
        EnumC11372C0 enumC11372C18 = EnumC11372C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        EnumC12598x5 enumC12598x23 = EnumC12598x5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map20.put(enumC11372C18, new a(enumC12598x23, enumC12598x23));
        Map<EnumC11372C0, a> map21 = this.f24296n;
        EnumC11372C0 enumC11372C19 = EnumC11372C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        EnumC12598x5 enumC12598x24 = EnumC12598x5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map21.put(enumC11372C19, new a(enumC12598x24, enumC12598x24));
        Map<EnumC11372C0, a> map22 = this.f24296n;
        EnumC11372C0 enumC11372C20 = EnumC11372C0.TROUBLESHOOT_ILLEGAL_STATE;
        EnumC12598x5 enumC12598x25 = EnumC12598x5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map22.put(enumC11372C20, new a(enumC12598x25, enumC12598x25));
        this.f24296n.put(EnumC11372C0.TROUBLESHOOT_RELOAD, new a(EnumC12598x5.TROUBLESHOOTING_BN_RELOAD, null));
        Map<EnumC11372C0, a> map23 = this.f24296n;
        EnumC11372C0 enumC11372C21 = EnumC11372C0.TROUBLESHOOT_LOAD_SKIPPED;
        EnumC12598x5 enumC12598x26 = EnumC12598x5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map23.put(enumC11372C21, new a(enumC12598x26, enumC12598x26));
        this.f24296n.put(EnumC11372C0.TROUBLESHOOT_ILR_REVENUE, new a(EnumC12598x5.TROUBLESHOOTING_BN_ILR_REVENUE, null));
    }
}
